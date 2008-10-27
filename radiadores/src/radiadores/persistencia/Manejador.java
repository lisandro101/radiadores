package radiadores.persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Clase que contiene un manejador de persistencia
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
class Manejador {
    
    private EntityManager em;
    
    Manejador(EntityManager em) {
        this.em = em;
    }
    
    void grabar(Object obj, boolean transaccion) {
        if(transaccion) {
            comenzarTransaccion();
            em.persist(obj);
            finalizarTransaccion();
        } else {
            em.persist(obj);
        }
    }
    
    <T> T actualizar(T obj, boolean transaccion) {
        T result = null;
        
        if(transaccion) {
            comenzarTransaccion();
            em.merge(obj);
            finalizarTransaccion();
        } else {
            em.merge(obj);
        }
        
        return result;
    }
    
    <T> T buscar(Class<T> clase, Object id) {
        return em.find(clase, id);
    }
    
    <T> List<T> buscar(Class<T> clase, String query) {
        return buscar(clase, em.createQuery(query));
    }
    
    <T> List<T> buscar(Class<T> clase, Query query) {
        List<T> result = null;
        List tmp = query.getResultList();
        
        if(tmp != null) {
            result = new ArrayList<T>();
            
            for (Object object : tmp) {
                result.add(clase.cast(object));
            }
        }
        
        return result;
    }
    
    Query crearConsulta(String query) {
        return em.createQuery(query);
    }
    
    private void comenzarTransaccion() {
        if(em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        
        em.getTransaction().begin();
    }
    
    private void finalizarTransaccion() {
        em.getTransaction().commit();
    }
}