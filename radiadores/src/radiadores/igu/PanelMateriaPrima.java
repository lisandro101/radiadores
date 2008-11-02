/*
 * PanelMateriaPrima.java
 *
 * Created on 25 de octubre de 2008, 18:18
 */

package radiadores.igu;

import radiadores.igu.buscar.PanelBuscarProveedor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.MateriaPrima.Estado;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.ProveedorTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  stafoxter
 */
public class PanelMateriaPrima extends javax.swing.JPanel {

    private ProveedorTableModel tm;
    private MateriaPrima materiaPrima;
    /** Creates new form PanelMateriaPrima */
    public PanelMateriaPrima() {
        initComponents();
        inicializar();
        inicializarBotones();
        
    }

    private void inicializar() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel(Estado.values());
        cbEstado.setModel(dcm);   
        
        tm = new ProveedorTableModel(0);
        tProveedor.setModel(tm);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCampos = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbCostoAlmacenamiento = new javax.swing.JLabel();
        lbCostoUnitPorOmision = new javax.swing.JLabel();
        lbPesoPorUnid = new javax.swing.JLabel();
        lbPrecioBase = new javax.swing.JLabel();
        lbTamanioLoteEstandar = new javax.swing.JLabel();
        lbUnidadMedida = new javax.swing.JLabel();
        tfTamanioLoteEstandar = new javax.swing.JTextField();
        tfPrecioBase = new javax.swing.JTextField();
        tfCostoAlmacenamiento = new javax.swing.JTextField();
        tfCostoUnitPorOmision = new javax.swing.JTextField();
        tfPesoPorUnidad = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfUnidadMedida = new javax.swing.JTextField();
        lbDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pTablaProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedor = new org.jdesktop.swingx.JXTable();
        jPanel1 = new javax.swing.JPanel();
        btAsignarProveedor = new javax.swing.JButton();
        btEliminarProveedor = new javax.swing.JButton();

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

        lbCostoAlmacenamiento.setText("Costo Almecenamiento:");

        lbCostoUnitPorOmision.setText("Costo Unitario Por Omisión:");

        lbPesoPorUnid.setText("Peso por Unidad:");

        lbPrecioBase.setText("Precio Base:");

        lbTamanioLoteEstandar.setText("Tamaño Lote Estandar:");

        lbUnidadMedida.setText("Unidad medida:");

        tfCostoAlmacenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCostoAlmacenamientoActionPerformed(evt);
            }
        });

        lbDescripcion.setText("Descripción:");

        lbEstado.setText("Estado:");

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCostoAlmacenamiento)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPesoPorUnid)
                            .addComponent(lbCostoUnitPorOmision)
                            .addComponent(lbEstado)
                            .addComponent(lbDescripcion)
                            .addComponent(lbUnidadMedida)
                            .addComponent(lbNombre)
                            .addComponent(lbCodigo)
                            .addComponent(lbTamanioLoteEstandar)
                            .addComponent(lbPrecioBase))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDescripcion)
                            .addComponent(tfUnidadMedida)
                            .addComponent(tfPrecioBase)
                            .addComponent(tfTamanioLoteEstandar)
                            .addComponent(tfPesoPorUnidad)
                            .addComponent(tfCostoUnitPorOmision)
                            .addComponent(tfCostoAlmacenamiento)
                            .addComponent(tfNombre)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCostoAlmacenamiento)
                    .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCostoUnitPorOmision)
                    .addComponent(tfCostoUnitPorOmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesoPorUnid)
                    .addComponent(tfPesoPorUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTamanioLoteEstandar)
                    .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioBase)
                    .addComponent(tfPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUnidadMedida)
                    .addComponent(tfUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
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

        pTablaProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));

        tProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Teléfono", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tProveedor);

        btAsignarProveedor.setText("Asignar Proveedor");
        btAsignarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btAsignarProveedor);

        btEliminarProveedor.setText("Eliminar");
        btEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminarProveedor);

        javax.swing.GroupLayout pTablaProveedoresLayout = new javax.swing.GroupLayout(pTablaProveedores);
        pTablaProveedores.setLayout(pTablaProveedoresLayout);
        pTablaProveedoresLayout.setHorizontalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pCampos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfCostoAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCostoAlmacenamientoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfCostoAlmacenamientoActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed

    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarMateriaPrima();
        FachadaPersistencia.getInstancia().actualizar(materiaPrima, true);
        Util.getInstancia().limpiarCampos(this);
        materiaPrima=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btAsignarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarProveedorActionPerformed
    PanelBuscarProveedor buscarProv = new PanelBuscarProveedor(tm);   
    buscarProv.setModal(true);
    buscarProv.setVisible(true);
            
}//GEN-LAST:event_btAsignarProveedorActionPerformed

private void btEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProveedorActionPerformed
    int filaSeleccionada = tProveedor.convertRowIndexToModel(tProveedor.getSelectedRow());
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Proveedor");
    }else{
        tm.eliminarFila(filaSeleccionada);
    }
}//GEN-LAST:event_btEliminarProveedorActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        materiaPrima= crearMateriaPrima();
        if(ValidacionBuscar.getInstancia().materiaPrimaEstaCargadoEnBD(materiaPrima)){
            JOptionPane.showMessageDialog(this, "La materia prima ya se encuentra registrada");
        }else{
            FachadaPersistencia.getInstancia().grabar(materiaPrima, true);
            Util.getInstancia().limpiarCampos(this);
            
            materiaPrima = null;
        }
    }
    
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar la Materia Prima?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        materiaPrima.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(materiaPrima, true);
        Util.getInstancia().limpiarCampos(this);
        materiaPrima = null;
        inicializarBotones();
    }
}//GEN-LAST:event_btEliminarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     PanelBuscarProductoGral buscarProv = new PanelBuscarProductoGral(this);   
     buscarProv.setModal(true);
     buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAsignarProveedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarProveedor;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCostoAlmacenamiento;
    private javax.swing.JLabel lbCostoUnitPorOmision;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPesoPorUnid;
    private javax.swing.JLabel lbPrecioBase;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pTablaProveedores;
    private org.jdesktop.swingx.JXTable tProveedor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCostoAlmacenamiento;
    private javax.swing.JTextField tfCostoUnitPorOmision;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPesoPorUnidad;
    private javax.swing.JTextField tfPrecioBase;
    private javax.swing.JTextField tfTamanioLoteEstandar;
    private javax.swing.JTextField tfUnidadMedida;
    // End of variables declaration//GEN-END:variables

    private MateriaPrima crearMateriaPrima(){
        materiaPrima = new MateriaPrima();

        materiaPrima.setCodigo(tfCodigo.getText());
        materiaPrima.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));        
        materiaPrima.setCostoUnitarioPorOmision(Double.parseDouble(tfCostoUnitPorOmision.getText()));
        materiaPrima.setDescripcion(tfDescripcion.getText());
        materiaPrima.setNombre(tfNombre.getText());
        materiaPrima.setPesoPorUnidad(Double.parseDouble(tfPesoPorUnidad.getText()));
        materiaPrima.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        materiaPrima.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        materiaPrima.setUnidadMedida(tfUnidadMedida.getText());
        materiaPrima.setProveedores(tm.getFilas());  
        materiaPrima.setEstado((Estado)cbEstado.getSelectedItem());
        
        return materiaPrima;
    }
    
    private void cargarPantallaMateriaPrima(MateriaPrima mat){
        tfCodigo.setText(mat.getCodigo());
        tfCostoAlmacenamiento.setText(String.valueOf(mat.getCostoAlmacenamiento()));
        tfCostoUnitPorOmision.setText(String.valueOf(mat.getCostoUnitarioPorOmision()));
        tfDescripcion.setText(mat.getDescripcion());
        tfNombre.setText(mat.getNombre());
        tfPesoPorUnidad.setText(String.valueOf(mat.getPesoPorUnidad()));
        tfPrecioBase.setText(String.valueOf(mat.getPrecioBase()));
        tfTamanioLoteEstandar.setText(String.valueOf(mat.getTamanioLoteEstandar()));
        tfUnidadMedida.setText(mat.getUnidadMedida());
        
        tm.agregarFilas(mat.getProveedores());
        
        cbEstado.setSelectedItem(mat.getEstado());
        
        materiaPrima=mat;
    }
    
    public void setComponente(MateriaPrima mat){
        materiaPrima=mat;
        cargarPantallaMateriaPrima(mat);
        
    }
     
    private void actualizarMateriaPrima(){
        
        materiaPrima.setCodigo(tfCodigo.getText());
        materiaPrima.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));        
        materiaPrima.setCostoUnitarioPorOmision(Double.parseDouble(tfCostoUnitPorOmision.getText()));
        materiaPrima.setDescripcion(tfDescripcion.getText());
        materiaPrima.setNombre(tfNombre.getText());
        materiaPrima.setPesoPorUnidad(Double.parseDouble(tfPesoPorUnidad.getText()));
        materiaPrima.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        materiaPrima.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        materiaPrima.setUnidadMedida(tfUnidadMedida.getText());
        materiaPrima.setProveedores(tm.getFilas());  
        materiaPrima.setEstado((Estado)cbEstado.getSelectedItem());
        
    }
    private void inicializarBotones(){
        btAgregar.setEnabled(true);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }
    
}
