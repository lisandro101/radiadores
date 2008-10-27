/*
 * PanelMateriaPrima.java
 *
 * Created on 25 de octubre de 2008, 18:18
 */

package radiadores.igu;

import radiadores.entidades.MateriaPrima;
import radiadores.igu.model.ProveedorTableModel;

/**
 *
 * @author  stafoxter
 */
public class PanelMateriaPrima extends javax.swing.JPanel {

    private ProveedorTableModel tm;
    /** Creates new form PanelMateriaPrima */
    public PanelMateriaPrima() {
        initComponents();
        inicializar();
        
    }

    private void inicializar() {
        tm = new ProveedorTableModel(0);
        tProveedor.setModel(tm);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTablaProveedores = new javax.swing.JPanel();
        lbProveedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedor = new org.jdesktop.swingx.JXTable();
        jPanel1 = new javax.swing.JPanel();
        btAsignarProveedor = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pMateriaPrima = new javax.swing.JPanel();
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
        tfPrecioPorUnidad = new javax.swing.JTextField();
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
        btModifiar = new javax.swing.JButton();

        lbProveedor.setText("Proveedores:");

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

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar);

        javax.swing.GroupLayout pTablaProveedoresLayout = new javax.swing.GroupLayout(pTablaProveedores);
        pTablaProveedores.setLayout(pTablaProveedoresLayout);
        pTablaProveedoresLayout.setHorizontalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(lbProveedor)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

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

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vigente", "No vigente" }));

        javax.swing.GroupLayout pMateriaPrimaLayout = new javax.swing.GroupLayout(pMateriaPrima);
        pMateriaPrima.setLayout(pMateriaPrimaLayout);
        pMateriaPrimaLayout.setHorizontalGroup(
            pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(lbEstado))
                .addGap(81, 81, 81)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstado, 0, 199, Short.MAX_VALUE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(tfUnidadMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCodigo)
                                .addComponent(lbNombre)
                                .addComponent(lbCostoAlmacenamiento)
                                .addComponent(lbCostoUnitPorOmision)
                                .addComponent(lbPesoPorUnid)
                                .addComponent(lbPrecioBase)
                                .addComponent(lbTamanioLoteEstandar)
                                .addComponent(lbUnidadMedida))
                            .addGap(9, 9, 9)
                            .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(tfPrecioPorUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(tfCostoUnitPorOmision, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(tfPrecioBase, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGap(51, 51, 51)))
        );
        pMateriaPrimaLayout.setVerticalGroup(
            pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(tfUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodigo)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNombre)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCostoAlmacenamiento)
                        .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCostoUnitPorOmision)
                        .addComponent(tfCostoUnitPorOmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPesoPorUnid)
                        .addComponent(tfPrecioPorUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPrecioBase)
                        .addComponent(tfPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTamanioLoteEstandar)
                        .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addComponent(lbUnidadMedida)
                    .addContainerGap(104, Short.MAX_VALUE)))
        );

        btBuscar.setText("Buscar");
        pBotones.add(btBuscar);

        btAgregar.setText("Agregar");
        pBotones.add(btAgregar);

        btModifiar.setText("Modificar");
        btModifiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifiarActionPerformed(evt);
            }
        });
        pBotones.add(btModifiar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfCostoAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCostoAlmacenamientoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfCostoAlmacenamientoActionPerformed

private void btModifiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifiarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModifiarActionPerformed

private void btAsignarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarProveedorActionPerformed
    PanelBuscarProveedor buscarProv = new PanelBuscarProveedor(tm);   
    buscarProv.setModal(true);
    buscarProv.setVisible(true);
            
}//GEN-LAST:event_btAsignarProveedorActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    //int indice = tProveedor.getSelectedRow();
    tm.eliminarFila(tProveedor.getSelectedRow());
    tm.imprimirModel();
}//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAsignarProveedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModifiar;
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
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pMateriaPrima;
    private javax.swing.JPanel pTablaProveedores;
    private org.jdesktop.swingx.JXTable tProveedor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCostoAlmacenamiento;
    private javax.swing.JTextField tfCostoUnitPorOmision;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecioBase;
    private javax.swing.JTextField tfPrecioPorUnidad;
    private javax.swing.JTextField tfTamanioLoteEstandar;
    private javax.swing.JTextField tfUnidadMedida;
    // End of variables declaration//GEN-END:variables

    private MateriaPrima crearMateriaPrima(){
        MateriaPrima mat = new MateriaPrima();

        mat.setCodigo(tfCodigo.getText());
        mat.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));        
        mat.setCostoUnitarioPorOmision(Double.parseDouble(tfCostoUnitPorOmision.getText()));
        mat.setDescripcion(tfDescripcion.getText());
        mat.setNombreMateriaPrima(tfNombre.getText());
        mat.setPesoPorUnidad(Double.parseDouble(tfPrecioPorUnidad.getText()));
        mat.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        mat.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        mat.setUnidadMedida(tfUnidadMedida.getText());
        mat.setProveedores(tm.getFilas());  
        mat.setEstado(cbEstado.getSelectedItem().toString());
        
        return mat;
    }
}
