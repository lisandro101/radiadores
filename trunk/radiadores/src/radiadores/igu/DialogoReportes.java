/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DialogoReportes.java
 *
 * Created on 27-nov-2008, 18:25:28
 */

package radiadores.igu;

import javax.swing.DefaultComboBoxModel;
import net.sf.jasperreports.engine.JasperPrint;
import radiadores.reportes.GestorReportes;
import radiadores.reportes.TipoReporte;

/**
 *
 * @author franco
 */
public class DialogoReportes extends javax.swing.JDialog {

    private GestorReportes gestorReportes;

    /** Creates new form DialogoReportes */
    public DialogoReportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializar();
    }

    private void inicializar() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(
                TipoReporte.values());

        gestorReportes = new GestorReportes();

        dcm.insertElementAt("Seleccionar ...", 0);
        dcm.setSelectedItem("Seleccionar ...");
        
        cbTipo.setModel(dcm);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visorReportes = new radiadores.reportes.VisorReportes();
        lblTipo = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        btGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");

        lblTipo.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btGenerar.setText("Generar");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(visorReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                        .addComponent(btGenerar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visorReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed
        if(cbTipo.getSelectedIndex() > 0) {
            JasperPrint jp = gestorReportes.generar(
                    (TipoReporte)cbTipo.getSelectedItem());

            visorReportes.cargarReporte(jp);
        }
}//GEN-LAST:event_btGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel lblTipo;
    private radiadores.reportes.VisorReportes visorReportes;
    // End of variables declaration//GEN-END:variables

}
