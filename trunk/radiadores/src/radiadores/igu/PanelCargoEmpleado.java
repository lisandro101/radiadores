/*
 * PanelCargoEmpleado.java
 *
 * Created on 26 de octubre de 2008, 20:04
 */

package radiadores.igu;

import radiadores.entidades.Cargo;

/**
 *
 * @author  stafoxter
 */
public class PanelCargoEmpleado extends javax.swing.JDialog {

    private PanelEmpleado empleado;
    private Cargo cargo;
    
    /** Creates new form PanelCargoEmpleado */
    public PanelCargoEmpleado(PanelEmpleado emp) {
        initComponents();
        empleado= emp;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCargos = new org.jdesktop.swingx.JXTable();
        lbCargos = new javax.swing.JLabel();
        btAceptarBuscar = new javax.swing.JButton();
        tfNombreCargo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pABMCargo = new javax.swing.JPanel();
        lbHorasLaborales = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbPrecioHora = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfHorasLaborales = new javax.swing.JTextField();
        tfPrecioHora = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btAgregar = new javax.swing.JButton();
        btModifiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pBotones = new javax.swing.JPanel();
        btAceptarGral = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Cargo");

        pTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cargo"));

        tCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio Hora", "Horas Laborales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCargos);

        lbCargos.setText("Nombre Cargo:");

        btAceptarBuscar.setText("Aceptar");
        btAceptarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarBuscarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addGroup(pTablaLayout.createSequentialGroup()
                                .addComponent(lbCargos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombreCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar))))
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btAceptarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCargos)
                    .addComponent(btBuscar)
                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btAceptarBuscar)
                .addContainerGap())
        );

        pABMCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ABM"));

        lbHorasLaborales.setText("Horas Laborales:");

        lbCodigo.setText("Código:");

        lbPrecioHora.setText("Precio Hora:");

        lbNombre.setText("Nombre:");

        lbEstado.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo", "Eliminado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        btAgregar.setText("Agregar");
        jPanel1.add(btAgregar);

        btModifiar.setText("Modificar");
        btModifiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifiarActionPerformed(evt);
            }
        });
        jPanel1.add(btModifiar);

        jButton1.setText("Eliminar");
        jPanel1.add(jButton1);

        javax.swing.GroupLayout pABMCargoLayout = new javax.swing.GroupLayout(pABMCargo);
        pABMCargo.setLayout(pABMCargoLayout);
        pABMCargoLayout.setHorizontalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecioHora)
                            .addComponent(lbNombre)
                            .addComponent(lbCodigo))
                        .addGap(26, 26, 26)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tfPrecioHora, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHorasLaborales)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado, 0, 172, Short.MAX_VALUE)
                            .addComponent(tfHorasLaborales, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                .addGap(146, 146, 146))
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        pABMCargoLayout.setVerticalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioHora)
                    .addComponent(tfPrecioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHorasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHorasLaborales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btAceptarGral.setText("Aceptar");
        btAceptarGral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarGralActionPerformed(evt);
            }
        });
        pBotones.add(btAceptarGral);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        pBotones.add(btCerrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pABMCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pABMCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cbEstadoActionPerformed

private void btModifiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifiarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModifiarActionPerformed

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
    dispose();
}//GEN-LAST:event_btCerrarActionPerformed

private void btAceptarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarBuscarActionPerformed
    
    //Se debe inicializar la variable cargo con los datos de la pantalla o
    //resultados de la busqueda
    
    empleado.setCargoEmpleado(cargo);
    
}//GEN-LAST:event_btAceptarBuscarActionPerformed

private void btAceptarGralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarGralActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btAceptarGralActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarBuscar;
    private javax.swing.JButton btAceptarGral;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btModifiar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargos;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbHorasLaborales;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecioHora;
    private javax.swing.JPanel pABMCargo;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pTabla;
    private org.jdesktop.swingx.JXTable tCargos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfHorasLaborales;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreCargo;
    private javax.swing.JTextField tfPrecioHora;
    // End of variables declaration//GEN-END:variables

}
