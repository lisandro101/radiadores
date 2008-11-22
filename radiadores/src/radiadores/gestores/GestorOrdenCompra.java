/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.entidades.DetalleOrdenCompra;
import radiadores.entidades.DetalleOrdenProduccion;
import radiadores.entidades.EstructuraDeProducto;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.OrdenCompra;
import radiadores.entidades.OrdenCompra.EstadoOrdenCompra;
import radiadores.entidades.OrdenProduccion;
import radiadores.entidades.OrdenProduccion.EstadoOrdenProd;
import radiadores.entidades.ParteDeEstructura;
import radiadores.entidades.ProductoComponente;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class GestorOrdenCompra {
    private EstructuraDeProducto estructura;
    
    private static GestorOrdenCompra instancia;
    
    public synchronized static GestorOrdenCompra getInstancia(){
        if (instancia == null){
            instancia = new GestorOrdenCompra();
        }
        return instancia;            
    }
    private GestorOrdenCompra(){
        
    }
    
    public void procesarOrden(OrdenCompra orden){
        orden.setEstado(EstadoOrdenCompra.PENDIENTE);
    }
    
    public boolean anularOrden(OrdenCompra orden){
        if(orden.getEstado()==EstadoOrdenCompra.PENDIENTE){
            orden.setEstado(EstadoOrdenCompra.ANULADO);
            return true;
        }
        return false;
    }
    
    public boolean terminarOrden(OrdenCompra orden){
        if(orden.getEstado()==EstadoOrdenCompra.PENDIENTE){
            sumarMateriales(orden);
            orden.setEstado(EstadoOrdenCompra.TERMINADO);
            return true;
        }
        return false;
    }
    
    
    private void sumarMateriales(OrdenCompra orden){

        double cantStock;
        double cantNueva;
        MateriaPrima materiaPrima;
        ProductoComponente productoComponente;
        
        for (DetalleOrdenCompra detalle : orden.getDetallesOrdenCompra()) {
            //cantNueva= detalle.getComponente().getStock();
            cantNueva= detalle.getCantidad();
//            System.out.println("nombre componente: "+ detalle.getComponente().getNombre());
//            System.out.println("nueva cantidad de materia prima: " +cantNueva);
            if(detalle.getComponente().getTipo()=='M'){
                materiaPrima =  FachadaPersistencia.getInstancia().buscar(MateriaPrima.class, (Object)detalle.getComponente().getId());
                cantStock= materiaPrima.getStock()+ cantNueva;
                materiaPrima.setStock(cantStock);
                FachadaPersistencia.getInstancia().actualizar(materiaPrima, true);
                
            }else{
                productoComponente = FachadaPersistencia.getInstancia().buscar(ProductoComponente.class, (Object)detalle.getComponente().getId());
                cantStock= productoComponente.getStock() + cantNueva;
                productoComponente.setStock(cantStock);
                FachadaPersistencia.getInstancia().actualizar(productoComponente, true);
            }
        } 
    }
    
    
    public String obtenerNroOrden() {
        int ultimaOrden;
        OrdenCompra orden = FachadaPersistencia.getInstancia().obtenerPrimero(OrdenCompra.class, "SELECT o FROM OrdenCompra o ORDER BY o.nroOrdenCompra DESC");

        ultimaOrden = orden != null ? orden.getNroOrdenCompra() : 0;
        
        return Integer.toString(ultimaOrden + 1);
    }
//    private void sumarMateriales(OrdenCompra orden){
//
//        double cantStock;
//        double cantNecesaria;
//        
//        for (DetalleOrdenProduccion detalle : orden.getDetallesOrdenProduccion()) {
//
//                for (ParteDeEstructura parte : estructura.getPartes()) {
//                    cantStock= parte.getComponente().getStock();
//                    cantNecesaria= parte.getCantidad()*detalle.getCantidad();
//                    
//                    cantStock= cantStock-cantNecesaria;
//                    parte.getComponente().setStock(cantStock);
//                    
//                    if(parte.getComponente().getTipo()=='M'){
//                        FachadaPersistencia.getInstancia().actualizar((MateriaPrima)parte.getComponente(), true);
//                    }else{
//                        FachadaPersistencia.getInstancia().actualizar((ProductoComponente)parte.getComponente(), true);
//                    }
//                    
//                 }
//             }
//    }

 
}
