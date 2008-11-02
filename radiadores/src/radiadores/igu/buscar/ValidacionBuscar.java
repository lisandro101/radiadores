/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu.buscar;

import java.awt.Component;
import java.awt.Container;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXList;
import org.jdesktop.swingx.JXTable;
import radiadores.entidades.Cargo;
import radiadores.entidades.CentroDeTrabajo;
import radiadores.entidades.Componente;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.ProductoComponente;
import radiadores.entidades.ProductoTerminado;
import radiadores.entidades.Maquina;
import radiadores.entidades.Proveedor;
import radiadores.igu.model.CentroTrabajoTableModel;
import radiadores.igu.model.IModeloReiniciable;
import radiadores.igu.model.ProductoGralTableModel;
import radiadores.igu.model.MaquinaTableModel;
import radiadores.igu.model.ProveedorTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.persistencia.IPersistente;

/**
 *
 * @author stafoxter
 */
public class ValidacionBuscar {

    private static ValidacionBuscar instancia;
    
    public synchronized static ValidacionBuscar getInstancia(){
        if (instancia == null){
            instancia = new ValidacionBuscar();
        }
        return instancia;            
    }
    private ValidacionBuscar(){
        
    }
    
    public boolean proveedorEstaCargadoEnTabla(ProveedorTableModel tm, Proveedor proveedor){
        boolean resultado= false;
        List<Proveedor> proveedores= tm.getFilas();
        
        for (int i = 0; i < proveedores.size(); i++) {
            if(proveedores.get(i).getNombre().equals(proveedor.getNombre())){
                resultado=true;
                
            }
        }
        return resultado;
    }
    

    public boolean componenteEstaCargadoEnTabla(ProductoGralTableModel tm, Componente valor){
        boolean resultado= false;
        List<Componente> componentes= tm.getFilas();
        
        for (int i = 0; i < componentes.size(); i++) {
            if(componentes.get(i).getNombre().equals(valor.getNombre())){
                resultado=true;
                
            }
        }
        return resultado;
    }

    public boolean maquinaEstaCargadaEnTabla(MaquinaTableModel tm, Maquina maquina){
        boolean resultado = false;
        List<Maquina> maquinas= tm.getFilas();
        
        for (int i = 0; i < maquinas.size(); i++) {
            if(maquinas.get(i).getNombre().equals(maquina.getNombre())){
                resultado = true;
            }
        }
        
        return resultado;
    }

    @Deprecated
    public boolean proveedorEstaCargadoEnBD(Proveedor proveedor){
        boolean resultado=false;
        List<Proveedor> proveedores;
        
        proveedores= FachadaPersistencia.getInstancia().buscar(Proveedor.class, "Select c from Proveedor c");
        
        for (int i = 0; i < proveedores.size(); i++) {
            if(proveedor.getNombre().equals(proveedores.get(i).getNombre())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
    

    @Deprecated
    public boolean productoComponenteEstaCargadoEnBD(ProductoComponente prod){
        boolean resultado=false;
        List<ProductoComponente> productos;
        
        productos= FachadaPersistencia.getInstancia().buscar(ProductoComponente.class, "Select c from ProductoComponente c");
        
        for (int i = 0; i < productos.size(); i++) {
            if(prod.getNombre().equals(productos.get(i).getNombre())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
    @Deprecated
    public boolean productoTerminadoEstaCargadoEnBD(ProductoTerminado prod){
        boolean resultado=false;
        List<ProductoTerminado> productos;
        
        productos= FachadaPersistencia.getInstancia().buscar(ProductoTerminado.class, "Select c from ProductoTerminado c");
        
        for (int i = 0; i < productos.size(); i++) {
            if(prod.getNombre().equals(productos.get(i).getNombre())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
    @Deprecated
    public boolean materiaPrimaEstaCargadoEnBD(MateriaPrima prod){
        boolean resultado=false;
        List<MateriaPrima> productos;
        
        productos= FachadaPersistencia.getInstancia().buscar(MateriaPrima.class, "Select c from MateriaPrima c");
        
        for (int i = 0; i < productos.size(); i++) {
            if(prod.getNombre().equals(productos.get(i).getNombre())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
    @Deprecated
    public boolean cargoEmpleadoEstaCargadoEnBD(Cargo prod){
        boolean resultado=false;
        List<Cargo> cargos;
        
        cargos= FachadaPersistencia.getInstancia().buscar(Cargo.class, "Select c from Cargo c");
        
        for (int i = 0; i < cargos.size(); i++) {
            if(prod.getNombre().equals(cargos.get(i).getNombre())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
            


    @Deprecated
    public boolean maquinaEstaCargadaEnBD(Maquina maquina){
        boolean resultado = false;
        List<Maquina> maquinas;
        
        maquinas = FachadaPersistencia.getInstancia().buscar(Maquina.class, "Select c from Maquina c");
        
        for (int i = 0; i < maquinas.size(); i++) {
            if(maquina.getNombre().equals(maquinas.get(i).getNombre())){
                resultado = true;
            }   
        }    
        
        return  resultado;
    }
    
    @SuppressWarnings({"unchecked", "unchecked"})
    public boolean estaDuplicado(IPersistente obj) {
        boolean resultado = false;
        
        if(obj != null && obj.getCamposUnicos().size() > 0) {
            Class clase = obj.getClass();
            String nombre = clase.getSimpleName();
            String nombreCorto = nombre.length() > 0 ?
                Character.toString(nombre.charAt(0)).toLowerCase() : "x";
            String consulta = "SELECT " + nombreCorto + " FROM " + nombre +
                    " " + nombreCorto + " WHERE";
            List<String> campos = obj.getCamposUnicos();
            
            for (int i = 0; i < campos.size(); i++) {
                String campo = campos.get(i);
                consulta += (i == 0 ? " " : " OR ") + nombreCorto + "." +
                        campo + " = :" + campo;
            }
            
            Query query = FachadaPersistencia.getInstancia().crearConsulta(
                    consulta);
            
            for (String campo : campos) {
                String nombreGetter = campo.length() > 0 ? "get" +
                    Character.toString(campo.charAt(0)).toUpperCase() +
                    campo.substring(1) : null;
                
                if(nombreGetter != null) {
                    try {
                        Object valor = clase.getMethod(nombreGetter).invoke(obj);
                        query.setParameter(campo, valor);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
            
            List resultadosBusqueda = FachadaPersistencia.getInstancia().
                    buscar(clase, query);
            
            resultado = resultadosBusqueda != null &&
                    resultadosBusqueda.size() > 0;
        }
        
        return resultado;
    }


    public boolean existenCamposVacios(Container contenedor) {
        boolean resultado=false;
        for (Component componente : contenedor.getComponents()) {
            if (componente instanceof JTextField) {
                if(((JTextField)componente).getText().trim().equals("")){
                    resultado=true;
                }
            } else if (componente instanceof JComboBox) {
                if(((JComboBox) componente).getSelectedIndex()==-1){
                    resultado=true;
                }
            } else if (componente instanceof JXDatePicker) {
                if(((JXDatePicker) componente).getDate()==null){
                    resultado=true;
                }          
            } else if (componente instanceof JXTable) {
                if(((JXTable)componente).getModel().getRowCount()==0){
                    resultado=true;
                }
            } else if (componente instanceof JXList) {
                if(((JXList)componente).getModel().getSize()==0){
                    resultado=true;
                }
            } else if (componente instanceof Container) {
                existenCamposVacios((Container)componente);
            }
        }
        return resultado;
    }
    
    public boolean centroEstaCargadoEnTabla(CentroTrabajoTableModel tm, CentroDeTrabajo centro){
        boolean resultado= false;
        List<CentroDeTrabajo> centros = tm.getFilas();
        
        for (CentroDeTrabajo cent : centros) {
            if(cent.getNombre().equals(centro.getNombre())){
                resultado = true;
            }
        }
        
        return resultado;
    }

@Deprecated
public boolean centroEstaCargadoEnBD(CentroDeTrabajo centroDeTrabajo) {
        boolean resultado = false;
        List<CentroDeTrabajo> centros;
        
        centros = FachadaPersistencia.getInstancia().buscar(CentroDeTrabajo.class, "Select c from CentroDeTrabajo c");
        
        for (CentroDeTrabajo centro : centros) {
            if(centroDeTrabajo.getNombre().equals(centro.getNombre())){
                resultado = true;
            }
        }
            
        return  resultado;
    }

}
