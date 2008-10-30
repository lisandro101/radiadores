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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXTable;
import radiadores.entidades.Maquina;
import radiadores.entidades.Proveedor;
import radiadores.igu.model.MaquinaTableModel;
import radiadores.igu.model.ProveedorTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class ValidacionBuscar {

    private static ValidacionBuscar instancia;
    
    public static ValidacionBuscar getInstancia(){
        if (instancia == null){
            instancia = new ValidacionBuscar();
        }
        return instancia;            
    }
    
    
    public boolean proveedorEstaCargadoEnTabla(ProveedorTableModel tm, Proveedor proveedor){
        boolean resultado= false;
        List<Proveedor> proveedores= tm.getFilas();
        
        for (int i = 0; i < proveedores.size(); i++) {
            if(proveedores.get(i).getNombreProveedor().equals(proveedor.getNombreProveedor())){
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
    
    
    public boolean proveedorEstaCargadoEnBD(Proveedor proveedor){
        boolean resultado=false;
        List<Proveedor> proveedores;
        
        proveedores= FachadaPersistencia.getInstancia().buscar(Proveedor.class, "Select c from Proveedor c");
        
        for (int i = 0; i < proveedores.size(); i++) {
            if(proveedor.getNombreProveedor().equals(proveedores.get(i).getNombreProveedor())){
                resultado=true;
            }   
        }    
        return  resultado;
    }
    
    public boolean maquinaEstaCargadaEnBD(Maquina maquina){ //TODO Hacer este metodo generico para cualquier clase
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
    
    public boolean existenCamposVacios(Container contenedor) {
        boolean resultado=false;
        Component[] componentes = contenedor.getComponents();
        
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                if(((JTextField) componentes[i]).getText().equals("")){
                    resultado=true;
                }
            }else if (componentes[i] instanceof JComboBox) {
                if(((JComboBox) componentes[i]).getToolTipText().equals("")){
                    resultado=true;
                }
            }
            else if(componentes[i] instanceof JXDatePicker){
                if(((JXDatePicker) componentes[i]).getDate()==null){
                    resultado=true;
                }
            }
        }
        return resultado;
    }
}
