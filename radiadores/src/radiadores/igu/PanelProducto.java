/*
 * PanelProducto.java
 *
 * Created on 26 de octubre de 2008, 12:03
 */

package radiadores.igu;

import javax.swing.JOptionPane;
import radiadores.entidades.ProductoComponente;
import radiadores.entidades.ProductoTerminado;
import radiadores.igu.model.ProveedorTableModel;

/**
 *
 * @author  stafoxter
 */
public class PanelProducto extends javax.swing.JPanel {

    private ProveedorTableModel tm;
    /** Creates new form PanelProducto */
    public PanelProducto() {
        initComponents();
        pTablaProveedores.setVisible(false);
        inicializar();
    }

    private void inicializar() {
        tm = new ProveedorTableModel(0);
        tProveedor.setModel(tm);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoProd = new javax.swing.ButtonGroup();
        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModifiar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pProductoTerminado2 = new javax.swing.JPanel();
        lbCostoAlmacenamiento = new javax.swing.JLabel();
        lbCostoEmision = new javax.swing.JLabel();
        lbCostoUnitOmision = new javax.swing.JLabel();
        tfCostoAlmacenamiento = new javax.swing.JTextField();
        tfCostoEmision = new javax.swing.JTextField();
        tfCostoUnitOmision = new javax.swing.JTextField();
        lbDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        lbCondEmbalaje = new javax.swing.JLabel();
        lbTamanioLoteEstandar = new javax.swing.JLabel();
        tfTamanioLoteEstandar = new javax.swing.JTextField();
        tfCondEmbalaje = new javax.swing.JTextField();
        lbStock = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        pProductoTerminado1 = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbNroPlano = new javax.swing.JLabel();
        lbPrecioBase = new javax.swing.JLabel();
        lbPesoUnidad = new javax.swing.JLabel();
        lbUnidadMedida = new javax.swing.JLabel();
        tfPesoUnidad = new javax.swing.JTextField();
        tfPrecioBase = new javax.swing.JTextField();
        tfNroPlano = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfUnidadMedida = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox();
        cbCategoria = new javax.swing.JComboBox();
        rbProdTerminado = new javax.swing.JRadioButton();
        rbProdComponente = new javax.swing.JRadioButton();
        pProductoTerminado = new javax.swing.JPanel();
        lbPrecioVenta = new javax.swing.JLabel();
        tfPrecioVenta = new javax.swing.JTextField();
        pTablaProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedor = new org.jdesktop.swingx.JXTable();
        jPanel2 = new javax.swing.JPanel();
        btAsignarProveedor = new javax.swing.JButton();
        btEliminarProv = new javax.swing.JButton();

        btBuscar.setText("Buscar");
        pBotones.add(btBuscar);

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        pBotones.add(btAgregar);

        btModifiar.setText("Modificar");
        btModifiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifiarActionPerformed(evt);
            }
        });
        pBotones.add(btModifiar);

        btEliminar.setText("Eliminar");
        pBotones.add(btEliminar);

        lbCostoAlmacenamiento.setText("Costo Almacenamiento:");

        lbCostoEmision.setText("Costo Emisión:");

        lbCostoUnitOmision.setText("Costo Unitario Omisión:");

        lbDescripcion.setText("Descripción:");

        lbCondEmbalaje.setText("Condiciones Embalaje:");

        lbTamanioLoteEstandar.setText("Tamaño Lote Estandar:");

        lbStock.setText("Stock:");

        javax.swing.GroupLayout pProductoTerminado2Layout = new javax.swing.GroupLayout(pProductoTerminado2);
        pProductoTerminado2.setLayout(pProductoTerminado2Layout);
        pProductoTerminado2Layout.setHorizontalGroup(
            pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminado2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProductoTerminado2Layout.createSequentialGroup()
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCostoAlmacenamiento)
                            .addComponent(lbCostoEmision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCostoEmision)
                            .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(pProductoTerminado2Layout.createSequentialGroup()
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCostoUnitOmision)
                            .addComponent(lbDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(tfCostoUnitOmision, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(pProductoTerminado2Layout.createSequentialGroup()
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTamanioLoteEstandar)
                            .addComponent(lbCondEmbalaje)
                            .addComponent(lbStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(tfCondEmbalaje, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(tfStock, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        pProductoTerminado2Layout.setVerticalGroup(
            pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductoTerminado2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCostoAlmacenamiento)
                    .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCostoEmision)
                    .addComponent(tfCostoEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCostoUnitOmision)
                    .addComponent(tfCostoUnitOmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTamanioLoteEstandar)
                    .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCondEmbalaje)
                    .addComponent(tfCondEmbalaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStock)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

        lbCategoria.setText("Categoria:");

        lbEstado.setText("Estado:");

        lbNroPlano.setText("Nro Plano:");

        lbPrecioBase.setText("Precio Base:");

        lbPesoUnidad.setText("Peso Unidad:");

        lbUnidadMedida.setText("Unidad Medida:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Suspendido", "Inactivo" }));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Curva A", "Curva B", "Curva C" }));

        javax.swing.GroupLayout pProductoTerminado1Layout = new javax.swing.GroupLayout(pProductoTerminado1);
        pProductoTerminado1.setLayout(pProductoTerminado1Layout);
        pProductoTerminado1Layout.setHorizontalGroup(
            pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductoTerminado1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pProductoTerminado1Layout.createSequentialGroup()
                        .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(lbNombre)
                            .addComponent(lbCategoria)
                            .addComponent(lbEstado)
                            .addComponent(lbNroPlano)
                            .addComponent(lbPrecioBase)
                            .addComponent(lbPesoUnidad))
                        .addGap(20, 20, 20))
                    .addGroup(pProductoTerminado1Layout.createSequentialGroup()
                        .addComponent(lbUnidadMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUnidadMedida)
                    .addComponent(tfPesoUnidad)
                    .addComponent(tfPrecioBase)
                    .addComponent(tfNroPlano)
                    .addComponent(tfNombre)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        pProductoTerminado1Layout.setVerticalGroup(
            pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminado1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNroPlano)
                    .addComponent(tfNroPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioBase)
                    .addComponent(tfPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesoUnidad)
                    .addComponent(tfPesoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUnidadMedida)
                    .addComponent(tfUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgTipoProd.add(rbProdTerminado);
        rbProdTerminado.setSelected(true);
        rbProdTerminado.setText("Producto Terminado");
        rbProdTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdTerminadoActionPerformed(evt);
            }
        });

        bgTipoProd.add(rbProdComponente);
        rbProdComponente.setText("Producto Componente");
        rbProdComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdComponenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pProductoTerminado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(rbProdTerminado)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pProductoTerminado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rbProdComponente)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProdComponente)
                    .addComponent(rbProdTerminado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pProductoTerminado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pProductoTerminado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbPrecioVenta.setText("Precio Venta:");

        javax.swing.GroupLayout pProductoTerminadoLayout = new javax.swing.GroupLayout(pProductoTerminado);
        pProductoTerminado.setLayout(pProductoTerminadoLayout);
        pProductoTerminadoLayout.setHorizontalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbPrecioVenta)
                .addGap(18, 18, 18)
                .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        pProductoTerminadoLayout.setVerticalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioVenta)
                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pTablaProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));

        tProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tProveedor.setEditable(false);
        jScrollPane1.setViewportView(tProveedor);

        btAsignarProveedor.setText("Asignar Proveedor");
        btAsignarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsignarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btAsignarProveedor);

        btEliminarProv.setText("Eliminar");
        btEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarProvActionPerformed(evt);
            }
        });
        jPanel2.add(btEliminarProv);

        javax.swing.GroupLayout pTablaProveedoresLayout = new javax.swing.GroupLayout(pTablaProveedores);
        pTablaProveedores.setLayout(pTablaProveedoresLayout);
        pTablaProveedoresLayout.setHorizontalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaProveedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btModifiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifiarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModifiarActionPerformed

private void btAsignarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarProveedorActionPerformed
    PanelBuscarProveedor panelProv =new PanelBuscarProveedor(tm);
    panelProv.setModal(true);
    panelProv.setVisible(true);
    
}//GEN-LAST:event_btAsignarProveedorActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(rbProdTerminado.isSelected()){
        ProductoTerminado productoTerminado = crearProductoTerminado();
        
    }else{
        ProductoComponente productoComponente = crearProductoComponente();
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void rbProdTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdTerminadoActionPerformed
    if(rbProdTerminado.isSelected()){
        pTablaProveedores.setVisible(false);
        pProductoTerminado.setVisible(true);
    }
}//GEN-LAST:event_rbProdTerminadoActionPerformed

private void rbProdComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdComponenteActionPerformed
    if(rbProdComponente.isSelected()){
        pTablaProveedores.setVisible(true);
        pProductoTerminado.setVisible(false); 
    }
}//GEN-LAST:event_rbProdComponenteActionPerformed

private void btEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProvActionPerformed
        int filaSeleccionada = tProveedor.getSelectedRow();
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Proveedor");
    }else{
        tm.eliminarFila(filaSeleccionada);
        tm.imprimirModel();
    }
}//GEN-LAST:event_btEliminarProvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoProd;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAsignarProveedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarProv;
    private javax.swing.JButton btModifiar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCondEmbalaje;
    private javax.swing.JLabel lbCostoAlmacenamiento;
    private javax.swing.JLabel lbCostoEmision;
    private javax.swing.JLabel lbCostoUnitOmision;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNroPlano;
    private javax.swing.JLabel lbPesoUnidad;
    private javax.swing.JLabel lbPrecioBase;
    private javax.swing.JLabel lbPrecioVenta;
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pProductoTerminado;
    private javax.swing.JPanel pProductoTerminado1;
    private javax.swing.JPanel pProductoTerminado2;
    private javax.swing.JPanel pTablaProveedores;
    private javax.swing.JRadioButton rbProdComponente;
    private javax.swing.JRadioButton rbProdTerminado;
    private org.jdesktop.swingx.JXTable tProveedor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCondEmbalaje;
    private javax.swing.JTextField tfCostoAlmacenamiento;
    private javax.swing.JTextField tfCostoEmision;
    private javax.swing.JTextField tfCostoUnitOmision;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNroPlano;
    private javax.swing.JTextField tfPesoUnidad;
    private javax.swing.JTextField tfPrecioBase;
    private javax.swing.JTextField tfPrecioVenta;
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfTamanioLoteEstandar;
    private javax.swing.JTextField tfUnidadMedida;
    // End of variables declaration//GEN-END:variables

    
    private ProductoTerminado crearProductoTerminado(){
        ProductoTerminado prod = new ProductoTerminado();
        
        prod.setCodigo(tfCodigo.getText());
        prod.setNombre(tfNombre.getText());
        prod.setCategoria(cbCategoria.getSelectedItem().toString());
        prod.setEstado(cbEstado.getSelectedItem().toString());
        prod.setNumeroPlano(tfNroPlano.getText());
        prod.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        prod.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        prod.setUnidadMedida(tfUnidadMedida.getText());
        prod.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        prod.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        prod.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        prod.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        prod.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        prod.setStock(Double.parseDouble(tfStock.getText()));
        prod.setDescripcion(tfDescripcion.getText());
        
        prod.setPrecioVenta(Double.parseDouble(tfPrecioVenta.getText()));
        
        return prod;
    }
    
    
    private ProductoComponente crearProductoComponente(){
        ProductoComponente prod = new ProductoComponente();
        
        prod.setCodigo(tfCodigo.getText());
        prod.setNombre(tfNombre.getText());
        prod.setCategoria(cbCategoria.getSelectedItem().toString());
        prod.setEstado(cbEstado.getSelectedItem().toString());
        prod.setNumeroPlano(tfNroPlano.getText());
        prod.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        prod.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        prod.setUnidadMedida(tfUnidadMedida.getText());
        prod.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        prod.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        prod.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        prod.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        prod.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        prod.setStock(Double.parseDouble(tfStock.getText()));
        prod.setDescripcion(tfDescripcion.getText());
        
        prod.setProveedores(tm.getFilas());
        
        return prod;
    }
}
