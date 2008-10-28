/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.igu.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import radiadores.entidades.Maquina;

/**
 *
 * @author stafoxter
 */

public class MaquinaTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    private static final String[] NOMBRE_COLUMNAS = {"Nombre", "Codigo", "Ubicacion"};
    private static final boolean[] COLUMNAS_EDITABLES = {false, false, false};
    private static final Class[] CLASE_COLUMNAS =
        {String.class, String.class, String.class};
    
    private List<Maquina> maquina;

    /**
     * Constructor
     * 
     * @param filas Cantidad de filas iniciales
     */
    public MaquinaTableModel(int filas) {
        this.maquina = new ArrayList<Maquina>(filas > 0 ? filas : 0);
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
        return maquina.size();
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
                resultado = maquina.get(fila).getNombre();
                break;
            case 1:
                resultado = maquina.get(fila).getCodigo();
                break;
            case 2:
                resultado = maquina.get(fila).getId(); //TODO getUbicacion
                break;
        }
        return resultado;
    }
    
    /**
     * Agrega Proveedor al modelo
     * 
     * @param proveedor Proveedor a agregar

     */
    public void agregarFila(Maquina _maquina) {
        maquina.add(_maquina);
        
        fireTableRowsInserted(maquina.size(), maquina.size());
    }
    
    /**
     * Limita la cantidad de elementos del modelo al indicado
     * 
     * @param cantidad Cantidad a la que se quiere limitar el numero de filas
     */
    public void limitarCantidad(int cantidad) {
        int cantidadAnterior = maquina.size();
        
        maquina = maquina.subList(0, cantidad);
        
        fireTableRowsDeleted(cantidad, cantidadAnterior);
    }
    
    /**
     * Devuelve todas las filas del modelo
     * 
     * @return Todas las filas del modelo
     */
    public List<Maquina> getFilas() {
        return maquina;
    }
    
    public Maquina getFila(int indice){
        return maquina.get(indice);
        
    }
    
    public void eliminarFila(int indice){        
        maquina.remove(indice);
        fireTableRowsDeleted(indice, indice);       
    }
    
    public void limpiarTableModel(){        
        fireTableRowsDeleted(0, maquina.size());
        maquina.clear();
    }
    
    public void imprimirModel(){
        
        for (int i = 0; i < maquina.size(); i++) {
            System.out.println(maquina.get(i).getNombre()+"    "+
                    maquina.get(i).getCodigo()+"    "+ 
                    maquina.get(i).getId()); //TODO getUbicacion     
        }
        System.out.println("\n");
    }
    
}