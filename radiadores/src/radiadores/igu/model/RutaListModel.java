/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import radiadores.entidades.NodoRuta;

/**
 *
 * @author Lisandro
 */
public class RutaListModel extends AbstractListModel{
    
    private static final long serialVersionUID = 1L;
    private List<NodoRuta> nodos;

   /**
     * Constructor por defecto
     * 
     */
    public RutaListModel() {
        this.nodos = new ArrayList<NodoRuta>(0);
    }
    
   /**
     * Constructor
     * 
     * @param elementos Cantidad de elementos iniciales
     */
    public RutaListModel(int elementos) {
        this.nodos = new ArrayList<NodoRuta>(elementos > 0 ? elementos : 0);
    }

   /**
     * Devuelve la cantidad elementos
     * 
     * @return Cantidad de elementos
     */
    public int getSize() {
        return nodos.size();
    }

   /**
     * Devuelve el valor del elemento indicado
     * 
     * @param index Indice de elementos
     * @return Devuelve el valor del elemento indicado
     */
    public Object getElementAt(int index) {
        Object resultado = null;
        resultado = nodos.get(index).getCentroTrabajo().getNombre();
        
        return resultado;
    }
    
   /**
     * Agrega una instancia de NodoRuta al modelo
     * 
     * @param nodo NodoRuta a agregar

     */
    public void agregarElemento(NodoRuta nodo) {
        nodos.add(nodo);
        fireIntervalAdded(this, nodos.size(), nodos.size());
    }
    
   /**
     * Limita la cantidad de elementos del modelo al indicado
     * 
     * @param cantidad Cantidad a la que se quiere limitar el numero de filas
     */
    public void limitarCantidad(int cantidad) {
        int cantidadAnterior = nodos.size();
        
        nodos = nodos.subList(0, cantidad);
        
        fireIntervalRemoved(this, cantidad, cantidadAnterior);
    }
    
   /**
     * Devuelve todos los elementos del modelo
     * 
     * @return Todos los elementos del modelo
     */
    public List<NodoRuta> getElementos() {     
        
        return new ArrayList<NodoRuta>(nodos);
    }
    
   /**
     * Elimina un elemento del modelo
     * 
     * @param indice Indice del elemento a eliminar
     */    
    public void eliminarElemento(int indice){        
        nodos.remove(indice);
        fireIntervalRemoved(this, indice, indice);       
    }

}
