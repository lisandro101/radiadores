package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import radiadores.utils.IValidable;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelOrdenProduccion extends javax.swing.JPanel implements IValidable {

    private static final long serialVersionUID = 1L;
    
    private List<Component> componentesObligatorios;
    
    /** Creates new form OrdenCompra */
    public PanelOrdenProduccion() {
        initComponents();
        componentesObligatorios = Arrays.asList((Component)jdFecha);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdFecha = new org.jdesktop.swingx.JXDatePicker();
        lbFecha = new javax.swing.JLabel();
        lbFechaEntrega = new javax.swing.JLabel();
        jdFechaEntrega = new org.jdesktop.swingx.JXDatePicker();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducto = new org.jdesktop.swingx.JXTable();
        jPanel5 = new javax.swing.JPanel();
        lbProducto = new javax.swing.JLabel();
        tfProducto = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btBuscarProducto = new javax.swing.JButton();
        btAgregarProducto = new javax.swing.JButton();
        btModificarProducto = new javax.swing.JButton();
        btEliminarProducto = new javax.swing.JButton();
        spCantidad = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        btBuscarOrdenProduccion = new javax.swing.JButton();
        btProcesarOrdenProduccion = new javax.swing.JButton();
        btModificarOrdenProduccion = new javax.swing.JButton();
        btAnularOrdenProduccion = new javax.swing.JButton();
        btImprimirOrdenProduccion = new javax.swing.JButton();

        jdFecha.setDate(new Date());
        jdFecha.setFormats("dd/MM/yy");

        lbFecha.setText("Fecha");

        lbFechaEntrega.setText("Fecha de Entrega");

        jdFechaEntrega.setFormats("dd/MM/yy");

        lbNumero.setText("Numero");

        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });

        lbCliente.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbFechaEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFecha)
                        .addComponent(lbNumero)
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente)
                        .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFechaEntrega)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtProducto);

        lbProducto.setText("Producto");

        tfProducto.setEditable(false);
        tfProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProductoActionPerformed(evt);
            }
        });

        tfCantidad.setText("Cantidad");

        btBuscarProducto.setText("Buscar");
        btBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btBuscarProducto);

        btAgregarProducto.setText("Agregar");
        btAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btAgregarProducto);

        btModificarProducto.setText("Modificar");
        btModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btModificarProducto);

        btEliminarProducto.setText("Eliminar");
        btEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btEliminarProducto);

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbProducto))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCantidad)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        btBuscarOrdenProduccion.setText("Buscar");
        jPanel4.add(btBuscarOrdenProduccion);

        btProcesarOrdenProduccion.setText("Procesar");
        jPanel4.add(btProcesarOrdenProduccion);

        btModificarOrdenProduccion.setText("Modificar");
        btModificarOrdenProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarOrdenProduccionActionPerformed(evt);
            }
        });
        jPanel4.add(btModificarOrdenProduccion);

        btAnularOrdenProduccion.setText("Anular");
        btAnularOrdenProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularOrdenProduccionActionPerformed(evt);
            }
        });
        jPanel4.add(btAnularOrdenProduccion);

        btImprimirOrdenProduccion.setText("Imprimir");
        btImprimirOrdenProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirOrdenProduccionActionPerformed(evt);
            }
        });
        jPanel4.add(btImprimirOrdenProduccion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfNumeroActionPerformed

private void btModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarProductoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModificarProductoActionPerformed

private void btEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProductoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btEliminarProductoActionPerformed

private void btModificarOrdenProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarOrdenProduccionActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btModificarOrdenProduccionActionPerformed

private void btAnularOrdenProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularOrdenProduccionActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btAnularOrdenProduccionActionPerformed

private void btImprimirOrdenProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirOrdenProduccionActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btImprimirOrdenProduccionActionPerformed

private void tfProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProductoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfProductoActionPerformed

private void btBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProductoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btBuscarProductoActionPerformed

private void btAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarProductoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btAgregarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarProducto;
    private javax.swing.JButton btAnularOrdenProduccion;
    private javax.swing.JButton btBuscarOrdenProduccion;
    private javax.swing.JButton btBuscarProducto;
    private javax.swing.JButton btEliminarProducto;
    private javax.swing.JButton btImprimirOrdenProduccion;
    private javax.swing.JButton btModificarOrdenProduccion;
    private javax.swing.JButton btModificarProducto;
    private javax.swing.JButton btProcesarOrdenProduccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jdFecha;
    private org.jdesktop.swingx.JXDatePicker jdFechaEntrega;
    private org.jdesktop.swingx.JXTable jtProducto;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFechaEntrega;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JLabel tfCantidad;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfProducto;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }
}