/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;


import java.util.List;
import javax.persistence.Query;
import radiadores.entidades.Componente;
import radiadores.entidades.CostoFijo;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.OrdenCompra;
import radiadores.entidades.ProductoComponente;
import radiadores.entidades.Proveedor;
import radiadores.igu.model.CostoFijoTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class GestorCostoFijo {
    
    private static GestorCostoFijo instancia;
    
    public synchronized static GestorCostoFijo getInstancia(){
        if (instancia == null){
            instancia = new GestorCostoFijo();
        }
        return instancia;            
    }
    private GestorCostoFijo(){
        
    }

    public double calcularTotalCostoFijo(CostoFijoTableModel tm){
        double resultado=0.0;
        List<CostoFijo> costos = tm.getFilas();
        
        if(tm != null){
            for (CostoFijo costoFijo : costos) {
                if(costoFijo.isVigente()){
                    resultado += costoFijo.getImporte();
                }
            }    
        }
        return resultado;
    }
    
    
    public double calcularTotalCostoFijo(){
        List<CostoFijo> costos;
        double resultado=0.0;
        
        Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from CostoFijo a where a.borrado=false" );

        costos = FachadaPersistencia.getInstancia().buscar(CostoFijo.class, consulta);
        if(costos.size()>=1){
            for (CostoFijo costoFijo : costos) {
                if(costoFijo.isVigente()){
                    resultado += costoFijo.getImporte();
                }
            }    
        }
        return resultado;
    }
    
}
