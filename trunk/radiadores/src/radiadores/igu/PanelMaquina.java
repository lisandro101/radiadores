/*
 * PanelMaquina.java
 *
 * Created on 25 de octubre de 2008, 20:17
 */

package radiadores.igu;

import radiadores.igu.buscar.PanelBuscarMaquina;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.Edificio;
import radiadores.entidades.Maquina;
import radiadores.entidades.Sector;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  Lisandro
 */
public class PanelMaquina extends javax.swing.JPanel {

    Maquina maquina;
    
    /** Creates new form PanelMaquina */
    public PanelMaquina() {
        initComponents();
        inicializarBotones();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCampos = new javax.swing.JPanel();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        dpFechaDeFabricacion = new org.jdesktop.swingx.JXDatePicker();
        lbFechaFabricacion = new javax.swing.JLabel();
        lbFechaMantenimiento = new javax.swing.JLabel();
        dpProximoMantenimiento = new org.jdesktop.swingx.JXDatePicker();
        lbEdificio = new javax.swing.JLabel();
        cbEdificio = new javax.swing.JComboBox();
        lbSector = new javax.swing.JLabel();
        cbSector = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });

        lbCodigo.setText("Codigo :");

        lbNombre.setText("Nombre :");

        lbFechaFabricacion.setText("Fecha de Fabricacion :");

        lbFechaMantenimiento.setText("Proximo Mantenimiento :");

        lbEdificio.setText("Edificio:");

        cbEdificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa Central", "Deposito" }));

        lbSector.setText("Sector:");

        cbSector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1A", "2A", "3G", "7G" }));

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCamposLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(lbNombre)
                    .addComponent(lbEdificio)
                    .addComponent(lbSector)
                    .addComponent(lbFechaFabricacion)
                    .addComponent(lbFechaMantenimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(cbEdificio, 0, 186, Short.MAX_VALUE)
                    .addComponent(cbSector, 0, 186, Short.MAX_VALUE)
                    .addComponent(dpFechaDeFabricacion, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(dpProximoMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(228, 228, 228))
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEdificio)
                    .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSector)
                    .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaFabricacion)
                    .addComponent(dpFechaDeFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaMantenimiento)
                    .addComponent(dpProximoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btBuscar);

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btAgregar);

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btModificar);

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addComponent(pCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     PanelBuscarMaquina buscarMaquina = new PanelBuscarMaquina(this);   
     buscarMaquina.setModal(true);
     buscarMaquina.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(tfCodigo.getText().equals("") || tfNombre.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Existen campos obligatorios sin completar.");
    }else{
        maquina = crearMaquinaria();
        if(ValidacionBuscar.getInstancia().estaDuplicado(maquina)){
            JOptionPane.showMessageDialog(this, "La maquina ya se encuentra registrada en el sistema.");
        }else{
            FachadaPersistencia.getInstancia().grabar(crearMaquinaria(), true);
            Util.getInstancia().limpiarCampos(this);
            maquina = null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar la maquina?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        maquina.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(maquina, true);
        Util.getInstancia().limpiarCampos(this);
        maquina = null;
        inicializarBotones();
    }
    
    
}//GEN-LAST:event_btEliminarActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea guardar los cambios?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarMaquina();
        FachadaPersistencia.getInstancia().actualizar(maquina, true);
        Util.getInstancia().limpiarCampos(this);
        maquina = null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
    
}//GEN-LAST:event_tfCodigoActionPerformed

private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

}//GEN-LAST:event_tfNombreActionPerformed

private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
    if (!btModificar.isEnabled()){
        btAgregar.setEnabled(true);
    }
}//GEN-LAST:event_tfCodigoKeyTyped

private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
   if (!btModificar.isEnabled()){
        btAgregar.setEnabled(true);
    }
}//GEN-LAST:event_tfNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbEdificio;
    private javax.swing.JComboBox cbSector;
    private org.jdesktop.swingx.JXDatePicker dpFechaDeFabricacion;
    private org.jdesktop.swingx.JXDatePicker dpProximoMantenimiento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEdificio;
    private javax.swing.JLabel lbFechaFabricacion;
    private javax.swing.JLabel lbFechaMantenimiento;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSector;
    private javax.swing.JPanel pCampos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    private Maquina crearMaquinaria(){
        Maquina maqui = new Maquina();
        
        //Estos dos objetos deben ser reemplazados cuando se creen las respectivas 
        //ventanas de ABM y busqueda
        Edificio edificio = new Edificio();
        Sector sector = new Sector();
        
        edificio.setNombre(cbEdificio.getSelectedItem().toString());
        sector.setCodigo(cbSector.getSelectedItem().toString());
        
        //******************************
               
        
        maqui.setCodigo(tfCodigo.getText());
        maqui.setNombre(tfNombre.getText());
        maqui.setEdificio(edificio);
        maqui.setSector(sector);
        maqui.setFechaDeFabricacion(dpFechaDeFabricacion.getDate());
        maqui.setProximoMantenimiento(dpProximoMantenimiento.getDate());
        
        return maqui;
    }
    
    private void cargarPantallaMaquina(Maquina _maquina){
        tfNombre.setText(_maquina.getNombre());
        tfCodigo.setText(_maquina.getCodigo());
        dpFechaDeFabricacion.setDate(_maquina.getFechaDeFabricacion());
        dpProximoMantenimiento.setDate(_maquina.getProximoMantenimiento());
        
        btAgregar.setEnabled(false);
        btModificar.setEnabled(true);
        btEliminar.setEnabled(true);
    }
    
    public void setMaquina(Maquina _maquina){
        maquina = _maquina;
        cargarPantallaMaquina(_maquina);
    }
    
    private void inicializarBotones(){
        btAgregar.setEnabled(false);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }
    
    private void actualizarMaquina(){   
        maquina.setNombre(tfNombre.getText());
        maquina.setCodigo(tfCodigo.getText());
        maquina.setEdificio((Edificio) cbEdificio.getSelectedItem()); //TODO revizar actualizaciones de Edificio my Sector
        maquina.setSector((Sector) cbSector.getSelectedItem());
        maquina.setFechaDeFabricacion(dpFechaDeFabricacion.getDate());
        maquina.setProximoMantenimiento(dpProximoMantenimiento.getDate()); 
    }
}
