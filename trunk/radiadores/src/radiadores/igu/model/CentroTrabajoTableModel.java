/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import radiadores.entidades.CentroDeTrabajo;

/**
 *
 * @author stafoxter
 */

public class CentroTrabajoTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    private static final String[] NOMBRE_COLUMNAS = {"Nombre", "Codigo"};
    private static final boolean[] COLUMNAS_EDITABLES = {false, false};
    private static final Class[] CLASE_COLUMNAS =
        {String.class, String.class};
    
    private List<CentroDeTrabajo> centro;

    /**
     * Constructor
     * 
     * @param filas Cantidad de filas iniciales
     */
    public CentroTrabajoTableModel(int filas) {
        this.centro = new ArrayList<CentroDeTrabajo>(filas > 0 ? filas : 0);
    }
    
    /**
     * Constructor
     * 
     */
    public CentroTrabajoTableModel() {
        this.centro = new ArrayList<CentroDeTrabajo>(0);
    }
    
    /**
     * Devuelve el nombre de la columna
     * 
     * @param columna Indice de la columna
     * @return El nombre de la columna
     */
    @Override
    public String getColumnName(int columna) {
        return NOMBRE_COLUMNAS[columna];
    }
    
    /**
     * Devuelve la clase de la columna indicada
     * 
     * @param columna Indice de la columna de la que se quiere averiguar la clase
     * @return La clase de la columna indicada
     */
    @Override
    public Class<?> getColumnClass(int columna) {
        return CLASE_COLUMNAS[columna];
    }

    /**
     * Devuelve si la celda es o no editable
     * 
     * @param fila Indice de la fila
     * @param columna Indice de la columna
     * @return True si la celda es editable
     */
    @Override
    public boolean isCellEditable(int fila, int columna) {
        return COLUMNAS_EDITABLES[columna];
    }
    
    /**
     * Devuelve la cantidad de filas
     * 
     * @return La cantidad de filas
     */
    @Override
    public int getRowCount() {
        return centro.size();
    }

    /**
     * Devuelve la cantidad de columnas
     * 
     * @return La cantidad de columnas
     */
    @Override
    public int getColumnCount() {
        return NOMBRE_COLUMNAS.length;
    }

    /**
     * Devuelve el valor de la celda indicada
     * 
     * @param fila Indice de la fila
     * @param columna Indice de la columna
     * @return Devuelve el valor de la celda indicada
     */
    @Override
    public Object getValueAt(int fila, int columna) {
        Object resultado = null;
        
        switch(columna) {
            case 0:
                resultado = centro.get(fila).getNombre();
                break;
            case 1:
                resultado = centro.get(fila).getCodigo();
                break;
        }
        return resultado;
    }
    
    /**
     * Agrega Proveedor al modelo
     * 
     * @param proveedor Proveedor a agregar

     */
    public void agregarFila(CentroDeTrabajo _centro) {
        centro.add( _centro);
        
        fireTableRowsInserted(centro.size(), centro.size());
    }
    
    /**
     * Limita la cantidad de elementos del modelo al indicado
     * 
     * @param cantidad Cantidad a la que se quiere limitar el numero de filas
     */
    public void limitarCantidad(int cantidad) {
        int cantidadAnterior = centro.size();
        
        centro = centro.subList(0, cantidad);
        
        fireTableRowsDeleted(cantidad, cantidadAnterior);
    }
    
    /**
     * Devuelve todas las filas del modelo
     * 
     * @return Todas las filas del modelo
     */
    public List<CentroDeTrabajo> getFilas() {
        return centro;
    }
    
    public CentroDeTrabajo getFila(int indice){
        return centro.get(indice);
        
    }
    
    public void eliminarFila(int indice){        
        centro.remove(indice);
        fireTableRowsDeleted(indice, indice);       
    }
    
    public void limpiarTableModel(){        
        fireTableRowsDeleted(0, centro.size());
        centro.clear();
    }
    
    public void imprimirModel(){
        
        for (int i = 0; i < centro.size(); i++) {
            System.out.println(centro.get(i).getNombre()+"    "+
                    centro.get(i).getCodigo()+"    "+ 
                    centro.get(i).getId());   
        }
        System.out.println("\n");
    }
    
}