/*
 * MateriaPrima.java
 *
 * Created on 25 de octubre de 2008, 18:18
 */

package radiadores.igu;

/**
 *
 * @author  stafoxter
 */
public class MateriaPrima extends javax.swing.JPanel {

    /** Creates new form MateriaPrima */
    public MateriaPrima() {
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

        pTablaProveedores = new javax.swing.JPanel();
        lbProveedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModifiar = new javax.swing.JButton();

        lbProveedor.setText("Proveedores:");

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jXTable1);

        btAsignarProveedor.setText("Asignar Proveedor");

        btEliminar.setText("Eliminar");

        javax.swing.GroupLayout pTablaProveedoresLayout = new javax.swing.GroupLayout(pTablaProveedores);
        pTablaProveedores.setLayout(pTablaProveedoresLayout);
        pTablaProveedoresLayout.setHorizontalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addGroup(pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbProveedor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btAsignarProveedor)
                        .addGap(40, 40, 40)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAsignarProveedor)
                    .addComponent(btEliminar))
                .addContainerGap(108, Short.MAX_VALUE))
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

        jLabel1.setText("Estado:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vigente", "Eliminado" }));

        javax.swing.GroupLayout pMateriaPrimaLayout = new javax.swing.GroupLayout(pMateriaPrima);
        pMateriaPrima.setLayout(pMateriaPrimaLayout);
        pMateriaPrimaLayout.setHorizontalGroup(
            pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMateriaPrimaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDescripcion)
                    .addComponent(tfUnidadMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(52, 52, 52))
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
                    .addGroup(pMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfTamanioLoteEstandar)
                        .addComponent(tfPrecioBase)
                        .addComponent(tfCostoAlmacenamiento)
                        .addComponent(tfCostoUnitPorOmision)
                        .addComponent(tfPrecioPorUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addComponent(tfNombre)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addContainerGap(51, Short.MAX_VALUE)))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addContainerGap(93, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfCostoAlmacenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCostoAlmacenamientoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfCostoAlmacenamientoActionPerformed

private void btModifiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifiarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModifiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAsignarProveedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModifiar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCostoAlmacenamiento;
    private javax.swing.JLabel lbCostoUnitPorOmision;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPesoPorUnid;
    private javax.swing.JLabel lbPrecioBase;
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pMateriaPrima;
    private javax.swing.JPanel pTablaProveedores;
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

}