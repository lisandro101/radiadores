/*
 * Personal.java
 *
 * Created on 25 de octubre de 2008, 20:02
 */

package radiadores.igu;

/**
 *
 * @author  stafoxter
 */
public class Personal extends javax.swing.JPanel {

    /** Creates new form Personal */
    public Personal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModifiar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pEmpleado = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbMail = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbFechaNacimiento = new javax.swing.JLabel();
        lbFechaIngreso = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        dpFechaNacimiento = new org.jdesktop.swingx.JXDatePicker();
        dpFechaIngreso = new org.jdesktop.swingx.JXDatePicker();
        lbCargo = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        btCargo = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        btBuscar.setText("Buscar");

        btAgregar.setText("Agregar");

        btModifiar.setText("Modificar");
        btModifiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifiarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotonesLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btModifiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModifiar)
                    .addComponent(btBuscar)
                    .addComponent(btAgregar)
                    .addComponent(btEliminar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

        lbTelefono.setText("Teléfono:");

        lbMail.setText("Mail:");

        lbDireccion.setText("Dirección:");

        lbFechaNacimiento.setText("Fecha Nacimiento:");

        lbFechaIngreso.setText("Fecha Ingreso:");

        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        lbCargo.setText("Cargo:");

        tfCargo.setEditable(false);
        tfCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCargoActionPerformed(evt);
            }
        });

        btCargo.setText("Asignar Cargo");
        btCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Estado:");

        javax.swing.GroupLayout pEmpleadoLayout = new javax.swing.GroupLayout(pEmpleado);
        pEmpleado.setLayout(pEmpleadoLayout);
        pEmpleadoLayout.setHorizontalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFechaIngreso)
                            .addComponent(lbFechaNacimiento))
                        .addGap(8, 8, 8)
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(lbNombre)
                            .addComponent(lbTelefono)
                            .addComponent(lbMail)
                            .addComponent(lbDireccion)
                            .addComponent(jLabel1)
                            .addComponent(lbCargo))
                        .addGap(50, 50, 50)
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCargo)
                            .addComponent(tfTelefono)
                            .addComponent(tfMail)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(tfNombre)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23)
                .addComponent(btCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        pEmpleadoLayout.setVerticalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMail)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCargo)
                    .addComponent(btCargo)
                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaNacimiento)
                    .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaIngreso)
                    .addComponent(dpFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfTelefonoActionPerformed

private void btModifiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifiarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModifiarActionPerformed

private void tfCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCargoActionPerformed
    FrameCargo fcargo = new FrameCargo();
}//GEN-LAST:event_tfCargoActionPerformed

private void btCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCargo;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModifiar;
    private org.jdesktop.swingx.JXDatePicker dpFechaIngreso;
    private org.jdesktop.swingx.JXDatePicker dpFechaNacimiento;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbFechaIngreso;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pEmpleado;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

}
