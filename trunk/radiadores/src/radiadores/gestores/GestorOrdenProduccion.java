/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.entidades.DetalleOrdenProduccion;
import radiadores.entidades.EstructuraDeProducto;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.OrdenProduccion;
import radiadores.entidades.OrdenProduccion.EstadoOrdenProd;
import radiadores.entidades.ParteDeEstructura;
import radiadores.entidades.ProductoComponente;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author stafoxter
 */
public class GestorOrdenProduccion {
    private EstructuraDeProducto estructura;
    
    private static GestorOrdenProduccion instancia;
    
    public synchronized static GestorOrdenProduccion getInstancia(){
        if (instancia == null){
            instancia = new GestorOrdenProduccion();
        }
        return instancia;            
    }
    private GestorOrdenProduccion(){
        
    }
    
    public void procesarOrden(OrdenProduccion orden){
        if(existenMateriales(orden)){ 
            restarMateriales(orden);
            orden.setEstado(EstadoOrdenProd.PROCESANDO);
        }else{
            orden.setEstado(EstadoOrdenProd.SUSPENDIDO);
        }
    }
    
    public boolean anularOrden(OrdenProduccion orden){
        if(orden.getEstado()==EstadoOrdenProd.SUSPENDIDO){
            orden.setEstado(EstadoOrdenProd.ANULADO);
            return true;
        }
        return false;
    }
    
    public boolean terminarOrden(OrdenProduccion orden){
        if(orden.getEstado()==EstadoOrdenProd.PROCESANDO){
            orden.setEstado(EstadoOrdenProd.TERMINADO);
            return true;
        }
        return false;
    }
    
    
    private boolean existenMateriales(OrdenProduccion orden){
//        EstructuraDeProducto estructura;
        double cantStock;
        double cantNecesaria;
        
        Query consulta;
        
        for (DetalleOrdenProduccion detalle : orden.getDetallesOrdenProduccion()) {
            consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from EstructuraDeProducto a where a.productoTerminado = :producto and a.borrado=false");
            consulta.setParameter("producto",detalle.getProductoTerminado());    
            List<EstructuraDeProducto> estructuras= FachadaPersistencia.getInstancia().buscar(EstructuraDeProducto.class, consulta);
            
            if(estructuras.size()==0){
                JOptionPane.showMessageDialog(null, "No exite estructura para el producto: "+detalle.getProductoTerminado().getNombre()+
                        " de la Orden de Producción: "+orden.getNroOrdenProduccion());
            }else{
                estructura= estructuras.get(0);
                for (ParteDeEstructura parte : estructura.getPartes()) {
                    cantStock= parte.getComponente().getStock();
                    cantNecesaria= parte.getCantidad()*detalle.getCantidad();
                    
                    if((cantStock-cantNecesaria) < 0 ){
                        return false;
                    }
                 }
             }
        }
        
        return true;
    }
    
        private void restarMateriales(OrdenProduccion orden){
//        EstructuraDeProducto estructura;
        double cantStock;
        double cantNecesaria;
        
//        Query consulta;
//        
        for (DetalleOrdenProduccion detalle : orden.getDetallesOrdenProduccion()) {
//            consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from EstructuraDeProducto a where a.productoTerminado = :producto and a.borrado=false");
//            consulta.setParameter("producto",detalle.getProductoTerminado());    
//            List<EstructuraDeProducto> estructuras= FachadaPersistencia.getInstancia().buscar(EstructuraDeProducto.class, consulta);
//            
//            if(estructuras.size()==0){
//                JOptionPane.showMessageDialog(null, "No exite estructura para el producto: "+detalle.getProductoTerminado().getNombre()+
//                        " de la Orden de Producción: "+orden.getNroOrdenProduccion());
//            }else{
//                estructura= estructuras.get(0);
                for (ParteDeEstructura parte : estructura.getPartes()) {
                    cantStock= parte.getComponente().getStock();
                    cantNecesaria= parte.getCantidad()*detalle.getCantidad();
                    
                    cantStock= cantStock-cantNecesaria;
                    parte.getComponente().setStock(cantStock);
                    
                    if(parte.getComponente().getTipo()=='M'){
                        FachadaPersistencia.getInstancia().actualizar((MateriaPrima)parte.getComponente(), true);
                    }else{
                        FachadaPersistencia.getInstancia().actualizar((ProductoComponente)parte.getComponente(), true);
                    }
                    
                 }
             }
//        }

    }

 
}
