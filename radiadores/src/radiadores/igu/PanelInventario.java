package radiadores.igu;

import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import radiadores.entidades.Componente;
import radiadores.gestores.GestorInventario;
import radiadores.igu.buscar.PanelBuscarComponente;
import radiadores.utils.*;

/**
 *
 * @author  Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelInventario extends javax.swing.JDialog implements IValidable {
    private static final long serialVersionUID = 1L;

    private Componente componente;
    GestorInventario gestor;

    /** Creates new form PanelCargoEmpleado */
    public PanelInventario() {
        initComponents();
        inicializar();
        btCalcular.setEnabled(false);
    }

    private void inicializar() {
        gestor = GestorInventario.getInstancia();
        lbModelo.setVisible(false);
        tfModelo.setVisible(false);
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgModelo = new javax.swing.ButtonGroup();
        pTabla = new javax.swing.JPanel();
        pProductoTerminado = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfCodigoArticulo = new javax.swing.JTextField();
        tfNombreArticulo = new javax.swing.JTextField();
        btBuscarComponente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rgModelo = new org.jdesktop.swingx.JXRadioGroup();
        rbLoteFijo = new javax.swing.JRadioButton();
        rbIntervaloFijo = new javax.swing.JRadioButton();
        pCampos = new javax.swing.JPanel();
        lbCodigo1 = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbCostoAlmacenamiento = new javax.swing.JLabel();
        lbCostoUnitario = new javax.swing.JLabel();
        lbPesoPorUnid = new javax.swing.JLabel();
        lbPrecioBase = new javax.swing.JLabel();
        lbTamanioLoteEstandar = new javax.swing.JLabel();
        lbUnidadMedida = new javax.swing.JLabel();
        tfNumeroDePedidos = new javax.swing.JTextField();
        tfTiempoEntrePedidos = new javax.swing.JTextField();
        tfCostoAlmacenamiento = new javax.swing.JTextField();
        tfCostoPedido = new javax.swing.JTextField();
        tfLoteOptimo = new javax.swing.JTextField();
        tfCOstoUnitario = new javax.swing.JTextField();
        tfDemandaAnual = new javax.swing.JTextField();
        lbDescripcion = new javax.swing.JLabel();
        tfStockDeSeguridad = new javax.swing.JTextField();
        lbModelo = new javax.swing.JLabel();
        tfCostoTotal = new javax.swing.JTextField();
        lbStock = new javax.swing.JLabel();
        tfCGI = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        pBotones = new javax.swing.JPanel();
        btCalcular = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto Equilibrio");

        pTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pProductoTerminado.setBorder(javax.swing.BorderFactory.createTitledBorder("Artículo"));

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

        tfCodigoArticulo.setEnabled(false);

        tfNombreArticulo.setEnabled(false);

        btBuscarComponente.setText("Buscar");
        btBuscarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarComponenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pProductoTerminadoLayout = new javax.swing.GroupLayout(pProductoTerminado);
        pProductoTerminado.setLayout(pProductoTerminadoLayout);
        pProductoTerminadoLayout.setHorizontalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfNombreArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                        .addComponent(tfCodigoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarComponente)))
                .addContainerGap())
        );
        pProductoTerminadoLayout.setVerticalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCodigo)
                    .addComponent(btBuscarComponente)
                    .addComponent(tfCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));

        rgModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));
        rgModelo.setLayout(new java.awt.FlowLayout());

        bgModelo.add(rbLoteFijo);
        rbLoteFijo.setText("Lote Fijo");
        rbLoteFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLoteFijoActionPerformed(evt);
            }
        });
        rgModelo.add(rbLoteFijo);

        bgModelo.add(rbIntervaloFijo);
        rbIntervaloFijo.setText("Intervalo Fijo");
        rbIntervaloFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntervaloFijoActionPerformed(evt);
            }
        });
        rgModelo.add(rbIntervaloFijo);

        lbCodigo1.setText("Demanda Anual:");

        lbNombre1.setText("Costo Unitario");

        lbCostoAlmacenamiento.setText("Costo Almacenamiento:");

        lbCostoUnitario.setText("Costo Pedido:");

        lbPesoPorUnid.setText("Lote Óptimo:");

        lbPrecioBase.setText("Tiempo entre Pedidos:");

        lbTamanioLoteEstandar.setText("Numero de Pedidos:");

        lbUnidadMedida.setText("C.G.I.:");

        tfNumeroDePedidos.setEditable(false);

        tfTiempoEntrePedidos.setEditable(false);

        tfCostoAlmacenamiento.setEditable(false);

        tfCostoPedido.setEditable(false);

        tfLoteOptimo.setEditable(false);

        tfCOstoUnitario.setEditable(false);

        tfDemandaAnual.setEditable(false);

        lbDescripcion.setText("Stock de Seguridad:");

        tfStockDeSeguridad.setEditable(false);

        lbModelo.setText("Máximo de Inventario:");

        tfCostoTotal.setEditable(false);

        lbStock.setText("Costo Total:");

        tfCGI.setEditable(false);

        tfModelo.setEditable(false);

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCostoAlmacenamiento)
                    .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbPesoPorUnid)
                        .addComponent(lbUnidadMedida)
                        .addComponent(lbNombre1)
                        .addComponent(lbCodigo1)
                        .addComponent(lbTamanioLoteEstandar)
                        .addComponent(lbPrecioBase)
                        .addComponent(lbStock)
                        .addComponent(lbDescripcion)
                        .addComponent(lbModelo)
                        .addComponent(lbCostoUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfCGI, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfStockDeSeguridad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfTiempoEntrePedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfNumeroDePedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfLoteOptimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfCostoPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfCOstoUnitario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfDemandaAnual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(tfCostoTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addContainerGap())
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCodigo1)
                    .addComponent(tfDemandaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbNombre1)
                    .addComponent(tfCOstoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCostoAlmacenamiento)
                    .addComponent(tfCostoAlmacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfCostoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCostoUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbPesoPorUnid)
                    .addComponent(tfLoteOptimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbTamanioLoteEstandar)
                    .addComponent(tfNumeroDePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbPrecioBase)
                    .addComponent(tfTiempoEntrePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUnidadMedida)
                    .addComponent(tfCGI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbStock)
                    .addComponent(tfCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfStockDeSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rgModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rgModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });
        pBotones.add(btCalcular);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        pBotones.add(btCerrar);

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        pBotones.add(btLimpiar);

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pProductoTerminado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(pTablaLayout.createSequentialGroup()
                .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
    dispose();
}//GEN-LAST:event_btCerrarActionPerformed

private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
    if (bgModelo.getSelection() != null) {
        tfDemandaAnual.setText(String.valueOf(componente.getDemandaAnual()));
        tfCOstoUnitario.setText(String.valueOf(componente.getCostoUnitario()));
        tfCostoAlmacenamiento.setText(String.valueOf(componente.getCostoAlmacenamiento()));
        tfCostoPedido.setText(String.valueOf(componente.getCostoPedido()));
        tfLoteOptimo.setText(String.valueOf(gestor.calcularLoteOptimo(componente)));
        tfNumeroDePedidos.setText(String.valueOf(gestor.calcularNumeroDePedido(componente)));
        tfTiempoEntrePedidos.setText(String.valueOf(gestor.calcularTiempoEntrePedidos(componente)));
        tfCGI.setText(String.valueOf(gestor.calcularCGI(componente)));
        tfCostoTotal.setText(String.valueOf(gestor.calcularCostoTotal(componente)));
        tfStockDeSeguridad.setText(String.valueOf(gestor.calcularStockDeSeguridad(componente)));
        if(rbIntervaloFijo.isSelected()) {
            tfModelo.setText(String.valueOf(gestor.calcularMaximoDeInventario(componente)));
        }
        else {
            tfModelo.setText(String.valueOf(gestor.calcularPuntoDePedido(componente)));
        }
    }
    else {
            JOptionPane.showMessageDialog(this, "Debe elegir un modelo de inventario.");
        }

}//GEN-LAST:event_btCalcularActionPerformed

private void btBuscarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarComponenteActionPerformed
    componente = PanelBuscarComponente.obtenerComponente();
        if(componente != null) {
                tfCodigoArticulo.setText(componente.getCodigo());
                tfNombreArticulo.setText(componente.getNombre());
                btCalcular.setEnabled(true);
        }
}//GEN-LAST:event_btBuscarComponenteActionPerformed

private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
     radiadores.utils.Util.getInstancia().limpiarCampos(this);
     bgModelo.clearSelection();
     lbModelo.setVisible(false);
     tfModelo.setVisible(false);
     componente = null;
     btCalcular.setEnabled(false);
}//GEN-LAST:event_btLimpiarActionPerformed

private void rbLoteFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLoteFijoActionPerformed
         lbModelo.setText("Punto de Pedido:");
         tfModelo.setText("");
         lbModelo.setVisible(true);
         tfModelo.setVisible(true);
         radiadores.utils.Util.getInstancia().limpiarCampos(this);
}//GEN-LAST:event_rbLoteFijoActionPerformed

private void rbIntervaloFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntervaloFijoActionPerformed
         lbModelo.setText("Máximo de Inventario:");
         tfModelo.setText("");
         lbModelo.setVisible(true);
         tfModelo.setVisible(true);
         radiadores.utils.Util.getInstancia().limpiarCampos(this);
}//GEN-LAST:event_rbIntervaloFijoActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgModelo;
    private javax.swing.JButton btBuscarComponente;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbCostoAlmacenamiento;
    private javax.swing.JLabel lbCostoUnitario;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbPesoPorUnid;
    private javax.swing.JLabel lbPrecioBase;
    private javax.swing.JLabel lbStock;
    private javax.swing.JLabel lbTamanioLoteEstandar;
    private javax.swing.JLabel lbUnidadMedida;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pProductoTerminado;
    private javax.swing.JPanel pTabla;
    private javax.swing.JRadioButton rbIntervaloFijo;
    private javax.swing.JRadioButton rbLoteFijo;
    private org.jdesktop.swingx.JXRadioGroup rgModelo;
    private javax.swing.JTextField tfCGI;
    private javax.swing.JTextField tfCOstoUnitario;
    private javax.swing.JTextField tfCodigoArticulo;
    private javax.swing.JTextField tfCostoAlmacenamiento;
    private javax.swing.JTextField tfCostoPedido;
    private javax.swing.JTextField tfCostoTotal;
    private javax.swing.JTextField tfDemandaAnual;
    private javax.swing.JTextField tfLoteOptimo;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNombreArticulo;
    private javax.swing.JTextField tfNumeroDePedidos;
    private javax.swing.JTextField tfStockDeSeguridad;
    private javax.swing.JTextField tfTiempoEntrePedidos;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<Component> getComponentesObligatorios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }   
}
