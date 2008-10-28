/*
 * PanelProveedor.java
 *
 * Created on 25 de octubre de 2008, 18:44
 */

package radiadores.igu;

import radiadores.Util;
import radiadores.entidades.Proveedor;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  Lisandro
 */
public class PanelProveedor extends javax.swing.JPanel {

    
    Proveedor proveedor;
    /** Creates new form PanelProveedor */
    public PanelProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfContacto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        dpInicioActividades = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        jLabel1.setText("Nombre");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Contacto");

        jLabel3.setText("Telefono");

        jLabel4.setText("e-mail");

        jLabel5.setText("Direccion");

        jLabel6.setText("Inicio Actividades ");

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCamposLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(tfContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62)
                        .addComponent(tfMail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(dpInicioActividades, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addGap(257, 257, 257))
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6))
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(dpInicioActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        pBotones.add(btBuscar);

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        pBotones.add(btAgregar);

        btModificar.setText("Modificar");
        pBotones.add(btModificar);

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        pBotones.add(btEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfNombreActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     
     PanelBuscarProveedor buscarProv = new PanelBuscarProveedor(this);   
     buscarProv.setModal(true);
     buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    FachadaPersistencia.getInstancia().grabar(crearProveedor(), true);
    Util.getInstancia().limpiarCampos(pCampos);
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    proveedor.setBorrado(true);
    FachadaPersistencia.getInstancia().actualizar(proveedor, true);
    Util.getInstancia().limpiarCampos(pCampos);
}//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private org.jdesktop.swingx.JXDatePicker dpInicioActividades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCampos;
    private javax.swing.JTextField tfContacto;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

    private Proveedor crearProveedor(){
        Proveedor prov = new Proveedor();
        
        prov.setNombreProveedor(tfNombre.getText());
        prov.setNombreContacto(tfContacto.getText());
        prov.setTelefono(tfTelefono.getText());
        prov.setMail(tfMail.getText());
        prov.setDireccion(tfDireccion.getText());
        prov.setFechaInicioActividad(dpInicioActividades.getDate());
        
        proveedor=prov;
        return prov;
    }
    
    private void cargarPantallaProveedor(Proveedor prov){
        tfNombre.setText(prov.getNombreProveedor());
        tfContacto.setText(prov.getNombreContacto());
        tfTelefono.setText(prov.getTelefono());
        tfMail.setText(prov.getMail());
        tfDireccion.setText(prov.getDireccion());
        dpInicioActividades.setDate(prov.getFechaInicioActividad());
        
    }
    
    public void setProveedor(Proveedor prov){
        proveedor=prov;
        cargarPantallaProveedor(prov);
    }
    
}
