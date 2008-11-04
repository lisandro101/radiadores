package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.Cargo;
import radiadores.entidades.Empleado;
import radiadores.igu.buscar.PanelBuscarEmpleado;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelEmpleado extends javax.swing.JPanel implements IValidable {
    private static final long serialVersionUID = 1L;
    
    private Empleado empleado;
    private Cargo cargo;
    private List<Component> componentesObligatorios;
    
    /** Creates new form PanelEmpleado */
    public PanelEmpleado() {
        initComponents();
        inicializarBotones();
        componentesObligatorios = Arrays.asList((Component)tfCodigo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
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
        cbEstado = new javax.swing.JComboBox();
        lbEstado = new javax.swing.JLabel();

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
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        pBotones.add(btModificar);

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        pBotones.add(btEliminar);

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

        dpFechaNacimiento.setFormats("dd/MM/yy");

        dpFechaIngreso.setFormats("dd/MM/yy");

        lbCargo.setText("Cargo:");

        tfCargo.setEditable(false);
        tfCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCargoActionPerformed(evt);
            }
        });

        btCargo.setText("Asignar");
        btCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargoActionPerformed(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Suspendido", "Inactivo" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        lbEstado.setText("Estado:");

        javax.swing.GroupLayout pEmpleadoLayout = new javax.swing.GroupLayout(pEmpleado);
        pEmpleado.setLayout(pEmpleadoLayout);
        pEmpleadoLayout.setHorizontalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addGap(59, 59, 59)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(55, 55, 55)
                        .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefono)
                            .addComponent(lbMail))
                        .addGap(49, 49, 49)
                        .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMail, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbDireccion)
                        .addGap(49, 49, 49)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbCargo)
                        .addGap(63, 63, 63)
                        .addComponent(tfCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCargo))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbFechaNacimiento)
                        .addGap(8, 8, 8)
                        .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbFechaIngreso)
                        .addGap(23, 23, 23)
                        .addComponent(dpFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(pEmpleadoLayout.createSequentialGroup()
                        .addComponent(lbEstado)
                        .addGap(59, 59, 59)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pEmpleadoLayout.setVerticalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMail)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCargo)
                    .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaNacimiento)
                    .addComponent(dpFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaIngreso)
                    .addComponent(dpFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addComponent(pEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfTelefonoActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarEmpleado();
        FachadaPersistencia.getInstancia().actualizar(empleado, true);
        Util.getInstancia().limpiarCampos(this);
        empleado=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void tfCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCargoActionPerformed
    
}//GEN-LAST:event_tfCargoActionPerformed

private void btCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargoActionPerformed
    PanelCargoEmpleado fcargo = new PanelCargoEmpleado(this);
    fcargo.setModal(true);
    fcargo.setVisible(true);
  
}//GEN-LAST:event_btCargoActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        empleado= crearEmpleado();
        if(ValidacionBuscar.getInstancia().estaDuplicado(empleado)){
            JOptionPane.showMessageDialog(this, "El Empleado ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().grabar(empleado, true);
            Util.getInstancia().limpiarCampos(this);
            empleado=null;
        }
    }
    
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar al Empleado?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        empleado.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(empleado, true);
        Util.getInstancia().limpiarCampos(this);
        empleado=null;
        inicializarBotones();
    }
    
}//GEN-LAST:event_btEliminarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     PanelBuscarEmpleado buscar = new PanelBuscarEmpleado(this);   
     buscar.setModal(true);
     buscar.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cbEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCargo;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbEstado;
    private org.jdesktop.swingx.JXDatePicker dpFechaIngreso;
    private org.jdesktop.swingx.JXDatePicker dpFechaNacimiento;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEstado;
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

    public void setCargoEmpleado(Cargo cargo){
        this.cargo= cargo; 
        tfCargo.setText(cargo.getNombre());
    }
    
    
    private Empleado crearEmpleado(){
        empleado = new Empleado();
        
        if(cargo == null){
            JOptionPane.showMessageDialog(this, "No se ha asiganado un cargo");
        }else {
            empleado.setCodigo(tfCodigo.getText());
            empleado.setNombre(tfNombre.getText());
            empleado.setTelefono(tfTelefono.getText());
            empleado.setMail(tfMail.getText());
            empleado.setDireccion(tfDireccion.getText());
            empleado.setEstado(cbEstado.getSelectedItem().toString());
            empleado.setCargo(cargo);
            empleado.setFechaNacimiento(dpFechaNacimiento.getDate());
            empleado.setFechaIngreso(dpFechaIngreso.getDate());
        }
        return empleado;
    }
    
    public void setEmpleado(Empleado emp){
        empleado=emp;
        cargarPantallaEmpleado(emp);
        
    }
    private void cargarPantallaEmpleado(Empleado emp){
        tfCodigo.setText(emp.getCodigo());
        tfNombre.setText(emp.getNombre());
        tfDireccion.setText(emp.getDireccion());
        tfMail.setText(emp.getMail());
        tfTelefono.setText(emp.getTelefono());
        tfCargo.setText(emp.getCargo().getNombre());
        cbEstado.setToolTipText(emp.getEstado());
        dpFechaIngreso.setDate(emp.getFechaIngreso());
        dpFechaNacimiento.setDate(emp.getFechaNacimiento());
    }
    
    private void actualizarEmpleado(){
        empleado.setCodigo(tfCodigo.getText());
        empleado.setNombre(tfNombre.getText());
        empleado.setTelefono(tfTelefono.getText());
        empleado.setMail(tfMail.getText());
        empleado.setDireccion(tfDireccion.getText());
        empleado.setEstado(cbEstado.getSelectedItem().toString());
        empleado.setCargo(cargo);
        empleado.setFechaNacimiento(dpFechaNacimiento.getDate());
        empleado.setFechaIngreso(dpFechaIngreso.getDate());
    }
    
    private void inicializarBotones(){
        btAgregar.setEnabled(true);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }

    @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }
}
