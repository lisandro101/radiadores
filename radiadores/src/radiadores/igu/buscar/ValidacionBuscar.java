/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu.buscar;

import java.util.List;
import javax.swing.JOptionPane;
import radiadores.entidades.Proveedor;
import radiadores.igu.model.ProveedorTableModel;

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
    
    
    public boolean proveedorEstaCargado(ProveedorTableModel tm, Proveedor proveedor){
        boolean resultado= false;
        List<Proveedor> proveedores= tm.getFilas();
        
        for (int i = 0; i < proveedores.size(); i++) {
            if(proveedores.get(i).getNombreProveedor().equals(proveedor.getNombreProveedor())){
                resultado=true;
                
            }
        }
        return resultado;
    }
    
}
