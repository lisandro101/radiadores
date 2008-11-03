/*
 * PantallaPrincipal.java
 *
 * Created on 25 de octubre de 2008, 18:13
 */

package radiadores.igu;

import javax.swing.JOptionPane;



/**
 *
 * @author  stafoxter
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    private static final long serialVersionUID = 0;
    /** Creates new form PantallaPrincipal */
    public PantallaPrincipal() {
        initComponents();
        inicializar();
    }
    
    private void inicializar(){
        jTabbedPane1.add("   Materia Prima   ", new PanelMateriaPrima());
        jTabbedPane1.add("Producto Componente", new PanelProductoComponente());
        jTabbedPane1.add("Producto Terminado ", new PanelProductoTerminado());
        jTabbedPane1.add("     Personal      ", new PanelEmpleado());
        jTabbedPane1.add("   Orden Compra    ", new PanelOrdenCompra());
        jTabbedPane1.add(" Orden Producción  ", new PanelOrdenProduccion());
        jTabbedPane1.add("    Maquinaria     ", new PanelMaquina());
        jTabbedPane1.add("     Proveedor     ", new PanelProveedor());
        jTabbedPane1.add("    Estructura     ", new PanelEstructuraDeProducto());
        jTabbedPane1.add("       Ruta        ", new PanelRutaFabricacion());
        jTabbedPane1.add("  Centro Trabajo   ", new PanelCentroTrabajo());
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Fabrica Radiadores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    salir();
}//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    
    private void salir() {
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea salir?", "Salir",
                JOptionPane.YES_NO_OPTION);
        
        if(opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
