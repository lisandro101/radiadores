/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.entidades.Componente;
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
import radiadores.entidades.ProductoTerminado;
import radiadores.igu.model.OrdenCompraTableModel;
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
            FachadaPersistencia.getInstancia().actualizar(orden, true);
            return true;
        }
        return false;
    }
    
    public boolean terminarOrden(OrdenCompra orden){
        if(orden.getEstado()==EstadoOrdenCompra.PENDIENTE){
            sumarMateriales(orden);
            orden.setEstado(EstadoOrdenCompra.TERMINADO);
            FachadaPersistencia.getInstancia().actualizar(orden, true);
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
            cantNueva= detalle.getCantidad();
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

    public void generarOrdenAutomatica(OrdenCompraTableModel tm){
        Query consulta;
        List<Componente> componentes;
        double stockAntiguo;
        double stockReservaAntiguo;
        double stockNecesario;
        double cantEnOrdenProdSuspendida;
        double cantEnOrdenCompraPendiente;
                
        consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Componente a where  a.borrado=false and a.tipo IN (M, C)");
        componentes= FachadaPersistencia.getInstancia().buscar(Componente.class, consulta);     
        
        for (Componente componente : componentes) {
            stockAntiguo= componente.getStock();
            //stockReservaAntiguo= componente.getStockReserva();
            stockReservaAntiguo= 50.666;
            
            
            
            
            
            
            //stockNecesario= stockAntiguo - ordenesProduccionSuspendidas + oredenesCompraPendientes;
            stockNecesario=25.666;
            
            if(stockReservaAntiguo>stockNecesario){
                stockNecesario= stockReservaAntiguo;
            }
            
            DetalleOrdenCompra detalle = new DetalleOrdenCompra();
            detalle.setComponente(componente);
            detalle.setCantidad(stockNecesario);     
            tm.agregarFila(detalle);
        }
    }

 
    private double calcularOrdenProdSuspendida(Componente componente){
        double resultado=0;
        
        Query consulta;
        List<Componente> componentes;
        List<ParteDeEstructura> partes;
        ProductoTerminado productoTerminado;
        List<DetalleOrdenProduccion> detallesOrdenProduccionTemp;
        List<DetalleOrdenProduccion> detallesOrdenProduccion = new ArrayList<DetalleOrdenProduccion>();
        
        consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from ParteDeEstructura a where a.componente= :comp and  a.borrado=false");
        consulta.setParameter("comp", componente);
        partes= FachadaPersistencia.getInstancia().buscar(ParteDeEstructura.class, consulta);
        
        for (ParteDeEstructura parteDeEstructura : partes) {
            productoTerminado= parteDeEstructura.getEstructura().getProductoTerminado();
            
            consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from DetalleOrdenProduccion a where a.productoTerminado= :termiando and  a.borrado=false");
            consulta.setParameter("terminado", productoTerminado);
            detallesOrdenProduccionTemp= FachadaPersistencia.getInstancia().buscar(DetalleOrdenProduccion.class, consulta);
            
            for (DetalleOrdenProduccion detalleOrdenProduccion : detallesOrdenProduccionTemp) {
                if(detalleOrdenProduccion.getOrdenProduccion().getEstado()== EstadoOrdenProd.SUSPENDIDO){
                    detallesOrdenProduccion.add(detalleOrdenProduccion);
                } 
            }
            
            
            
        }
        
        componentes= FachadaPersistencia.getInstancia().buscar(Componente.class, consulta);  
        
        
        return resultado;
    }
}
