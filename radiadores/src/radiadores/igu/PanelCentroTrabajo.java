/*
 * PanelCentroTrabajo.java
 *
 * Created on 26 de octubre de 2008, 18:13
 */

package radiadores.igu;

import javax.swing.JOptionPane;
import radiadores.entidades.CentroDeTrabajo;
import radiadores.igu.buscar.PanelBuscarCentroTrabajo;
import radiadores.igu.buscar.PanelBuscarMaquina;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.MaquinaTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.Util;

/**
 *
 * @author  Lisandro
 */
public class PanelCentroTrabajo extends javax.swing.JPanel {
    
    private MaquinaTableModel tmMaquina;
    private CentroDeTrabajo centroDeTrabajo;

    /** Creates new form PanelCentroTrabajo */
    public PanelCentroTrabajo() {
        initComponents();
        inicializar();
    }
    
    private void inicializar() {      
        tmMaquina = new MaquinaTableModel();
        jtMaquina.setModel(tmMaquina);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCentroTrabajo = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfDescripcion = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaquina = new org.jdesktop.swingx.JXTable();
        jPanel4 = new javax.swing.JPanel();
        btAgregarMaquina = new javax.swing.JButton();
        btEliminarMaquina = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        lbNombre.setText("Nombre");

        lbDescripcion.setText("Descripcion");

        lbCodigo.setText("Codigo");

        javax.swing.GroupLayout pCentroTrabajoLayout = new javax.swing.GroupLayout(pCentroTrabajo);
        pCentroTrabajo.setLayout(pCentroTrabajoLayout);
        pCentroTrabajoLayout.setHorizontalGroup(
            pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(lbNombre)
                    .addComponent(lbCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCentroTrabajoLayout.setVerticalGroup(
            pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroTrabajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Maquinaria"));

        jtMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jtMaquina);

        btAgregarMaquina.setText("Agregar");
        btAgregarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarMaquinaActionPerformed(evt);
            }
        });
        jPanel4.add(btAgregarMaquina);

        btEliminarMaquina.setText("Eliminar");
        btEliminarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarMaquinaActionPerformed(evt);
            }
        });
        jPanel4.add(btEliminarMaquina);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(btBuscar);

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        jPanel5.add(btAgregar);

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel5.add(btModificar);

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                    .addComponent(pCentroTrabajo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCentroTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btEliminarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarMaquinaActionPerformed
    int filaSeleccionada = jtMaquina.getSelectedRow();
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna Maquina");
    }else{
        tmMaquina.eliminarFila(filaSeleccionada);
    }
}//GEN-LAST:event_btEliminarMaquinaActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea guardar los cambios?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarCentroTrabajo();
        FachadaPersistencia.getInstancia().actualizar(centroDeTrabajo, true);
        Util.getInstancia().limpiarCampos(pCentroTrabajo);
        centroDeTrabajo = null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btEliminarActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
     if(tfCodigo.getText().equals("") || tfNombre.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Existen campos obligatorios sin completar.");
    }else{
        centroDeTrabajo = crearCentroTrabajo();
        if(ValidacionBuscar.getInstancia().centroEstaCargadoEnBD(centroDeTrabajo)){
            JOptionPane.showMessageDialog(this, "El Centro de Trabajo ya se encuentra cargado en el sistema.");
        }else{
            FachadaPersistencia.getInstancia().grabar(crearCentroTrabajo(), true);
            Util.getInstancia().limpiarCampos(pCentroTrabajo);
            centroDeTrabajo = null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btAgregarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarMaquinaActionPerformed
    PanelBuscarMaquina buscarMaquina = new PanelBuscarMaquina(tmMaquina);   
    buscarMaquina.setModal(true);
    buscarMaquina.setVisible(true);
}//GEN-LAST:event_btAgregarMaquinaActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    PanelBuscarCentroTrabajo buscarCentroTrabajo = new PanelBuscarCentroTrabajo(this);   
    buscarCentroTrabajo.setModal(true);
    buscarCentroTrabajo.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

 private CentroDeTrabajo crearCentroTrabajo(){
        CentroDeTrabajo centro = new CentroDeTrabajo();
        
        centro.setCodigo(tfCodigo.getText());
        centro.setNombre(tfNombre.getText());
        centro.setDescripcion(tfNombre.getText());
        centro.setMaquinas(tmMaquina.getFilas());
        
        return centro;
    }
 
 private void actualizarCentroTrabajo(){   
        centroDeTrabajo.setNombre(tfNombre.getText());
        centroDeTrabajo.setCodigo(tfCodigo.getText());
        centroDeTrabajo.setDescripcion(tfDescripcion.getText());
        centroDeTrabajo.setMaquinas(((MaquinaTableModel)jtMaquina.getModel()).getFilas());
        
    }

 private void inicializarBotones(){
        btAgregar.setEnabled(false);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
 }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAgregarMaquina;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarMaquina;
    private javax.swing.JButton btModificar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jtMaquina;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pCentroTrabajo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
