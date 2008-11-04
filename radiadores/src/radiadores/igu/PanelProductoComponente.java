package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import radiadores.igu.buscar.PanelBuscarProveedor;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.ProductoComponente;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.ProveedorTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelProductoComponente extends javax.swing.JPanel implements IValidable {

    private static final long serialVersionUID = 1L;
    
    private ProductoComponente productoComponente;
    private List<Component> componentesObligatorios;
    
    private ProveedorTableModel tm;
    /** Creates new form PanelProductoComponente */
    public PanelProductoComponente() {
        initComponents();
        inicializar();
        inicializarBotones();
    }

    private void inicializar() {
        tm = new ProveedorTableModel(0);
        tProveedor.setModel(tm);
        componentesObligatorios = Arrays.asList((Component)tfCodigo);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoProd = new javax.swing.ButtonGroup();
        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pCampos = new javax.swing.JPanel();
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
        pTablaProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedor = new org.jdesktop.swingx.JXTable();
        jPanel2 = new javax.swing.JPanel();
        btAsignarProveedor = new javax.swing.JButton();
        btEliminarProv = new javax.swing.JButton();

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
                    .addComponent(lbTamanioLoteEstandar)
                    .addComponent(lbCondEmbalaje)
                    .addComponent(lbStock)
                    .addComponent(lbCostoUnitOmision)
                    .addComponent(lbDescripcion)
                    .addComponent(lbCostoAlmacenamiento)
                    .addComponent(lbCostoEmision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfCostoEmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfCostoUnitOmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfTamanioLoteEstandar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfCondEmbalaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(60, 60, 60))
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
                .addContainerGap(81, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProductoTerminado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pProductoTerminado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(pProductoTerminado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pCamposLayout.createSequentialGroup()
                        .addComponent(pProductoTerminado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaProveedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
                    .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed

    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarProductoComponente();
        FachadaPersistencia.getInstancia().actualizar(productoComponente, true);
        Util.getInstancia().limpiarCampos(this);
        productoComponente=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btAsignarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsignarProveedorActionPerformed
    PanelBuscarProveedor panelProv =new PanelBuscarProveedor(tm);
    panelProv.setModal(true);
    panelProv.setVisible(true);
    
}//GEN-LAST:event_btAsignarProveedorActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed

    if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        productoComponente= crearProductoComponente();
        if(ValidacionBuscar.getInstancia().estaDuplicado(productoComponente)){
            JOptionPane.showMessageDialog(this, "El producto componente ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().actualizar(productoComponente, true);
            Util.getInstancia().limpiarCampos(this);
            
            productoComponente=null;
        }
    }
    
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProvActionPerformed
        int filaSeleccionada = tProveedor.convertRowIndexToModel(tProveedor.getSelectedRow());
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Proveedor");
    }else{
        tm.eliminarFila(filaSeleccionada);
        tm.imprimirModel();
    }
}//GEN-LAST:event_btEliminarProvActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     PanelBuscarProductoGral buscarProv = new PanelBuscarProductoGral(this);   
     buscarProv.setModal(true);
     buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar el Producto Componente?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        productoComponente.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(productoComponente, true);
        Util.getInstancia().limpiarCampos(this);
        productoComponente=null;
        inicializarBotones();
    }    
}//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoProd;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAsignarProveedor;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarProv;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbEstado;
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
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pProductoTerminado1;
    private javax.swing.JPanel pProductoTerminado2;
    private javax.swing.JPanel pTablaProveedores;
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
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfTamanioLoteEstandar;
    private javax.swing.JTextField tfUnidadMedida;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    private ProductoComponente crearProductoComponente(){
        productoComponente = new ProductoComponente();
        
        productoComponente.setCodigo(tfCodigo.getText());
        productoComponente.setNombre(tfNombre.getText());
        productoComponente.setCategoria(cbCategoria.getSelectedItem().toString());
        productoComponente.setEstado(cbEstado.getSelectedItem().toString());
        productoComponente.setNumeroPlano(tfNroPlano.getText());
        productoComponente.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        productoComponente.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        productoComponente.setUnidadMedida(tfUnidadMedida.getText());
        productoComponente.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        productoComponente.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        productoComponente.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        productoComponente.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        productoComponente.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        productoComponente.setStock(Double.parseDouble(tfStock.getText()));
        productoComponente.setDescripcion(tfDescripcion.getText());
        
        productoComponente.setProveedores(tm.getFilas());
        
        return productoComponente;
    }
    
    public void setComponente(ProductoComponente prod){
        productoComponente=prod;
        cargarPantallaProductoComponente(prod);
        
    }
    
    
    
    private void actualizarProductoComponente(){
        
        productoComponente.setCodigo(tfCodigo.getText());
        productoComponente.setNombre(tfNombre.getText());
        productoComponente.setCategoria(cbCategoria.getSelectedItem().toString());
        productoComponente.setEstado(cbEstado.getSelectedItem().toString());
        productoComponente.setNumeroPlano(tfNroPlano.getText());
        productoComponente.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        productoComponente.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        productoComponente.setUnidadMedida(tfUnidadMedida.getText());
        productoComponente.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        productoComponente.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        productoComponente.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        productoComponente.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        productoComponente.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        productoComponente.setStock(Double.parseDouble(tfStock.getText()));
        productoComponente.setDescripcion(tfDescripcion.getText());
        
        productoComponente.setProveedores(tm.getFilas());
        
    }
    
    
    private void cargarPantallaProductoComponente(ProductoComponente prod){
        tfCodigo.setText(prod.getCodigo());
        tfNombre.setText(prod.getNombre());
        cbCategoria.setToolTipText(prod.getCategoria());
        cbEstado.setToolTipText(prod.getEstado());
        tfNroPlano.setText(prod.getNumeroPlano());
        tfPrecioBase.setText(String.valueOf(prod.getPrecioBase())); 
        tfPesoUnidad.setText(String.valueOf(prod.getPesoUnidad()));
        tfUnidadMedida.setText(prod.getUnidadMedida());
        tfCostoAlmacenamiento.setText(String.valueOf(prod.getCostoAlmacenamiento()));
        tfCostoEmision.setText(String.valueOf(prod.getCostoEmision()));
        tfCostoUnitOmision.setText(String.valueOf(prod.getCostoUnitarioOmision()));
        tfTamanioLoteEstandar.setText(String.valueOf(prod.getTamanioLoteEstandar()));
        tfCondEmbalaje.setText(prod.getCondicionesEmbalaje());
        tfStock.setText(String.valueOf(prod.getStock()));
        tfDescripcion.setText(prod.getDescripcion());
        
        for (int i = 0; i < prod.getProveedores().size(); i++) {
            tm.agregarFila(prod.getProveedores().get(i));        
        }
        
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