package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import radiadores.entidades.Componente;
import radiadores.entidades.NodoRuta;
import radiadores.entidades.ProductoTerminado;
import radiadores.entidades.RutaFabricacion;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.interfaces.iBuscaProductoGeneral;
import radiadores.igu.model.RutaListModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;
import radiadores.utils.Util;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelRutaFabricacion extends javax.swing.JPanel implements iBuscaProductoGeneral, IValidable{
    
    private static final long serialVersionUID = 1L;

    private RutaListModel nodosListModel; 
    private RutaFabricacion rutaFabricacion;
    private ProductoTerminado productoTerminado;
    private List<Component> componentesObligatorios;
    
    /** Creates new form PanelRutaFabricacion */
    public PanelRutaFabricacion() {
        initComponents();
        inicializar();
    }

    private void actualizarRuta() {
        rutaFabricacion.setNombre(tfNombre.getText());
        rutaFabricacion.setCodigo(tfCodigo.getText());
        rutaFabricacion.setNodosRuta(nodosListModel.getElementos()); 
        rutaFabricacion.setDescripcion(tfDescripcion.getText().trim());
        rutaFabricacion.setProductoTerminado(productoTerminado);
    }

    private RutaFabricacion crearRutaTrabajo() {
        RutaFabricacion ruta = new RutaFabricacion();
        
        ruta.setCodigo(tfCodigo.getText());
        ruta.setNombre(tfNombre.getText());
        ruta.setDescripcion(tfNombre.getText());
        ruta.setNodosRuta(nodosListModel.getElementos());
        ruta.setProductoTerminado(productoTerminado);
        
        return ruta;
    }
    
    private void inicializar() {
        rutaFabricacion = new RutaFabricacion();
        nodosListModel = new RutaListModel();
        jlDetalleRuta.setModel(nodosListModel);
        inicializarBotones();
        componentesObligatorios = Arrays.asList((Component)tfCodigo);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlDetalleRuta = new org.jdesktop.swingx.JXList();
        jPanel2 = new javax.swing.JPanel();
        btAgregarNodo = new javax.swing.JButton();
        btEliminarNodo = new javax.swing.JButton();
        jpRuta = new javax.swing.JPanel();
        tfNombre = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btBuscarRuta = new javax.swing.JButton();
        btAgregarRuta = new javax.swing.JButton();
        btModificarRuta = new javax.swing.JButton();
        btEliminarRuta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbProducto = new javax.swing.JLabel();
        tfProducto = new javax.swing.JTextField();
        btBuscarProducto = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlDetalleRuta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlDetalleRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlDetalleRutaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlDetalleRuta);

        btAgregarNodo.setText("Agregar");
        btAgregarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarNodoActionPerformed(evt);
            }
        });
        jPanel2.add(btAgregarNodo);

        btEliminarNodo.setText("Eliminar");
        btEliminarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarNodoActionPerformed(evt);
            }
        });
        jPanel2.add(btEliminarNodo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        lbNombre.setText("Nombre");

        lbDescripcion.setText("Descripcion");

        lbCodigo.setText("Codigo");

        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpRutaLayout = new javax.swing.GroupLayout(jpRuta);
        jpRuta.setLayout(jpRutaLayout);
        jpRutaLayout.setHorizontalGroup(
            jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(lbNombre))
                .addGap(10, 10, 10)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpRutaLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpRutaLayout.setVerticalGroup(
            jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btBuscarRuta.setText("Buscar");
        jPanel4.add(btBuscarRuta);

        btAgregarRuta.setText("Agregar");
        btAgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarRutaActionPerformed(evt);
            }
        });
        jPanel4.add(btAgregarRuta);

        btModificarRuta.setText("Modificar");
        btModificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarRutaActionPerformed(evt);
            }
        });
        jPanel4.add(btModificarRuta);

        btEliminarRuta.setText("Eliminar");
        btEliminarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarRutaActionPerformed(evt);
            }
        });
        jPanel4.add(btEliminarRuta);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbProducto.setText("Producto");

        tfProducto.setEditable(false);

        btBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radiadores/images/lupa (3).jpg"))); // NOI18N
        btBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbProducto)
                    .addComponent(btBuscarProducto)
                    .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btEliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarNodoActionPerformed
    if (jlDetalleRuta.getSelectedIndex() != -1){
        nodosListModel.eliminarElemento(jlDetalleRuta.getSelectedIndex());
    }    
}//GEN-LAST:event_btEliminarNodoActionPerformed

private void btModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarRutaActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea guardar los cambios?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarRuta();
        FachadaPersistencia.getInstancia().actualizar(rutaFabricacion, true);
        Util.getInstancia().limpiarCampos(this);
        rutaFabricacion = null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarRutaActionPerformed

private void jlDetalleRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleRutaMouseClicked
    if (evt.getClickCount() == 2) { 
        PanelDetalleRuta detalleRuta = new PanelDetalleRuta((String)jlDetalleRuta.getSelectedValue());
        detalleRuta.setModal(true);
        detalleRuta.setVisible(true);
    }
}//GEN-LAST:event_jlDetalleRutaMouseClicked

private void btAgregarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarNodoActionPerformed
    if (!tfNombre.getText().trim().equals("") && !tfCodigo.getText().trim().equals("")){
        PanelDetalleRuta detalleRuta = new PanelDetalleRuta(this);
        detalleRuta.setModal(true);
        detalleRuta.setVisible(true);
    }
    else {
        JOptionPane.showMessageDialog(this, "No ha definido una ruta valida.");
    }
}//GEN-LAST:event_btAgregarNodoActionPerformed

private void btAgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarRutaActionPerformed
    if(tfCodigo.getText().trim().equals("") || tfNombre.getText().trim().equals("") || tfProducto.getText().trim().equals("")){
        JOptionPane.showMessageDialog(this, "Existen campos obligatorios sin completar.");
    }else{
        rutaFabricacion = crearRutaTrabajo();
        if(ValidacionBuscar.getInstancia().estaDuplicado(rutaFabricacion)){
            JOptionPane.showMessageDialog(this, "La Ruta de Trabajo ya se encuentra cargada en el sistema.");
        }else{       
            FachadaPersistencia.getInstancia().actualizar(rutaFabricacion, true);
            Util.getInstancia().limpiarCampos(this);
            rutaFabricacion = null;
        }
    }
}//GEN-LAST:event_btAgregarRutaActionPerformed

private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
    btAgregarNodo.setEnabled(true);
    btAgregarRuta.setEnabled(true);
}//GEN-LAST:event_tfNombreKeyTyped

private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
    btAgregarNodo.setEnabled(true);
    btAgregarRuta.setEnabled(true);
}//GEN-LAST:event_tfCodigoKeyTyped

private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

}//GEN-LAST:event_tfNombreActionPerformed

private void btBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProductoActionPerformed
    PanelBuscarProductoGral buscarProd = new PanelBuscarProductoGral(this);   
    buscarProd.setModal(true);
    buscarProd.setVisible(true);
}//GEN-LAST:event_btBuscarProductoActionPerformed

private void btEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarRutaActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar la maquina?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        rutaFabricacion.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(rutaFabricacion, true);
        Util.getInstancia().limpiarCampos(this);
        rutaFabricacion = null;
        inicializarBotones();
    }
}//GEN-LAST:event_btEliminarRutaActionPerformed

public void setNodoRuta(NodoRuta nodo){
    nodo.setRutaFabricacion(rutaFabricacion);
    nodosListModel.agregarElemento(nodo);
}

private void inicializarBotones(){
    btAgregarNodo.setEnabled(false);
    btAgregarRuta.setEnabled(false);
    btEliminarNodo.setEnabled(false);
    btEliminarRuta.setEnabled(false);
    btModificarRuta.setEnabled(false);
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarNodo;
    private javax.swing.JButton btAgregarRuta;
    private javax.swing.JButton btBuscarProducto;
    private javax.swing.JButton btBuscarRuta;
    private javax.swing.JButton btEliminarNodo;
    private javax.swing.JButton btEliminarRuta;
    private javax.swing.JButton btModificarRuta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXList jlDetalleRuta;
    private javax.swing.JPanel jpRuta;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProducto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setComponente(Componente comp) {
        productoTerminado = (ProductoTerminado) comp;
        tfProducto.setText(comp.getNombre());
    }
    
     @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }

}
