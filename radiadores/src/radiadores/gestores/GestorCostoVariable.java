/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import radiadores.entidades.CostoFijo;
import radiadores.entidades.CostoVariable;
import radiadores.entidades.NodoRuta;
import radiadores.entidades.ProductoTerminado;
import radiadores.entidades.RutaFabricacion;
import radiadores.igu.model.CostoFijoTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class GestorCostoVariable {
    
    private static GestorCostoVariable instancia;
    
    public synchronized static GestorCostoVariable getInstancia(){
        if (instancia == null){
            instancia = new GestorCostoVariable();
        }
        return instancia;            
    }
    private GestorCostoVariable(){
        
    }

    public double calcularCostoVariable(){
        double resultado=0.0;
        List<CostoVariable> costos = new ArrayList<CostoVariable>();
        
//        if(tm != null){
//            for (CostoFijo costoFijo : costos) {
//                if(costoFijo.isVigente()){
//                    resultado += costoFijo.getImporte();
//                }
//            }    
//        }
        return resultado;
    }
    
    
    private double calcularCostoMO(ProductoTerminado productoTerminado){
        RutaFabricacion ruta;
        double resultado=0.0;
        List<NodoRuta> nodos;
        
        Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from RutaFabricacion a where a.productoTerminado= :terminado and a.borrado=false" );
        consulta.setParameter("terminado", productoTerminado);
        
        List<RutaFabricacion> rutasFabricacion = FachadaPersistencia.getInstancia().buscar(RutaFabricacion.class, consulta);
        
        if(rutasFabricacion.size()>=1){
            ruta= rutasFabricacion.get(0);   
            nodos= ruta.getNodosRuta();
            
            for (NodoRuta nodoRuta : nodos) {
                //nodoRuta.
            }
            
        }
        return resultado;
    }
    
    
    private double calcularCostoMateriales(ProductoTerminado productoTerminado){
        return 0.0;
    }
}
