/*
 * PanelRutaFabricacion.java
 *
 * Created on 26 de octubre de 2008, 19:05
 */

package radiadores.igu;

import java.util.List;
import radiadores.entidades.CentroDeTrabajo;
import radiadores.entidades.NodoRuta;
import radiadores.igu.model.RutaListModel;

/**
 *
 * @author  Lisandro
 */
public class PanelRutaFabricacion extends javax.swing.JPanel {

    private RutaListModel listModel; 
    private List<NodoRuta> nodos;
    
    /** Creates new form PanelRutaFabricacion */
    public PanelRutaFabricacion() {
        initComponents();
        inicializar();
    }
    
    private void inicializar() {
        listModel = new RutaListModel();
        jlDetalleRuta.setModel(listModel);
        
        
        /*
         <<<<<<< Solo por propósitos de testeo >>>>>>>
         */
        for (int i = 0; i < 4; i++) {
            CentroDeTrabajo ct = new CentroDeTrabajo();
            ct.setNombre("Mierda"+Math.random());
            NodoRuta nr = new NodoRuta();
            nr.setCentroTrabajo(ct);
            listModel.agregarElemento(nr);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlDetalleRuta = new org.jdesktop.swingx.JXList();
        jPanel2 = new javax.swing.JPanel();
        btAgregarNodo = new javax.swing.JButton();
        btEliminarNodo = new javax.swing.JButton();
        jpRuta = new javax.swing.JPanel();
        tfNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btBuscarRuta = new javax.swing.JButton();
        btAgregarRuta = new javax.swing.JButton();
        btModificarRuta = new javax.swing.JButton();
        btEliminarRuta = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlDetalleRuta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlDetalleRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlDetalleRutaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlDetalleRuta);

        btAgregarNodo.setText("Agregar");
        btAgregarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarNodoActionPerformed(evt);
            }
        });
        jPanel2.add(btAgregarNodo);

        btEliminarNodo.setText("Eliminar");
        btEliminarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarNodoActionPerformed(evt);
            }
        });
        jPanel2.add(btEliminarNodo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbNombre.setText("Nombre");

        lbDescripcion.setText("Descripcion");

        lbCodigo.setText("Codigo");

        javax.swing.GroupLayout jpRutaLayout = new javax.swing.GroupLayout(jpRuta);
        jpRuta.setLayout(jpRutaLayout);
        jpRutaLayout.setHorizontalGroup(
            jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(lbNombre))
                .addGap(10, 10, 10)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpRutaLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRutaLayout.setVerticalGroup(
            jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btBuscarRuta.setText("Buscar");
        jPanel4.add(btBuscarRuta);

        btAgregarRuta.setText("Agregar");
        jPanel4.add(btAgregarRuta);

        btModificarRuta.setText("Modificar");
        btModificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarRutaActionPerformed(evt);
            }
        });
        jPanel4.add(btModificarRuta);

        btEliminarRuta.setText("Eliminar");
        jPanel4.add(btEliminarRuta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btEliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarNodoActionPerformed
    if (jlDetalleRuta.getSelectedIndex() != -1){
        listModel.eliminarElemento(jlDetalleRuta.getSelectedIndex());
    }    
}//GEN-LAST:event_btEliminarNodoActionPerformed

private void btModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarRutaActionPerformed
    
    
    
}//GEN-LAST:event_btModificarRutaActionPerformed

private void jlDetalleRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleRutaMouseClicked
    if (evt.getClickCount() == 2) { 
        PanelDetalleRuta detalleRuta = new PanelDetalleRuta((String)jlDetalleRuta.getSelectedValue());
        detalleRuta.setModal(true);
        detalleRuta.setVisible(true);
    }
}//GEN-LAST:event_jlDetalleRutaMouseClicked

private void btAgregarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarNodoActionPerformed

        PanelDetalleRuta detalleRuta = new PanelDetalleRuta();
        detalleRuta.setModal(true);
        detalleRuta.setVisible(true);
}//GEN-LAST:event_btAgregarNodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarNodo;
    private javax.swing.JButton btAgregarRuta;
    private javax.swing.JButton btBuscarRuta;
    private javax.swing.JButton btEliminarNodo;
    private javax.swing.JButton btEliminarRuta;
    private javax.swing.JButton btModificarRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXList jlDetalleRuta;
    private javax.swing.JPanel jpRuta;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
