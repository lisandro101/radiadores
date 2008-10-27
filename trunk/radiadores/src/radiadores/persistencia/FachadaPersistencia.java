package radiadores.persistencia;

import java.util.List;
import javax.persistence.Query;

/**
 * Fachada para acceder a los métodos de la persistencia
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
public class FachadaPersistencia {
    private static FachadaPersistencia instancia;
    
    private FachadaPersistencia() {
    }
    
    /**
     * Devuelve una instancia de la clase
     * 
     * @return Una instancia de la clase
     */
    public static synchronized FachadaPersistencia getInstancia() {
        if(instancia == null) {
            instancia = new FachadaPersistencia();
        }
        
        return instancia;
    }
    
    public void grabar(Object obj, boolean transaccion) {
        FabricaManejadores.getInstancia().getManejador().grabar(obj, transaccion);
    }
    
    public <T> T actualizar(T obj, boolean transaccion) {
        return FabricaManejadores.getInstancia().getManejador().actualizar(
                obj, transaccion);
    }
    
    public <T> T buscar(Class<T> clase, Object id) {
        return FabricaManejadores.getInstancia().getManejador().buscar(
                clase, id);
    }
    
    public <T> List<T> buscar(Class<T> clase, String query) {
        return FabricaManejadores.getInstancia().getManejador().buscar(
                clase, query);
    }
    
    public <T> List<T> buscar(Class<T> clase, Query query) {
        return FabricaManejadores.getInstancia().getManejador().buscar(
                clase, query);
    }
    
    public Query crearConsulta(String query) {
        return FabricaManejadores.getInstancia().getManejador().crearConsulta(
                query);
    }
    
    public void comenzarTransaccion() {
        FabricaManejadores.getInstancia().getManejador().comenzarTransaccion();
    }
    
    public void finalizarTransaccion() {
        FabricaManejadores.getInstancia().getManejador().finalizarTransaccion();
    }
}