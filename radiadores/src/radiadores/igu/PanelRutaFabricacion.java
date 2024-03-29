package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import radiadores.entidades.Componente;
import radiadores.entidades.HoraLaboral;
import radiadores.entidades.NodoRuta;
import radiadores.entidades.ParteDeNodo;
import radiadores.entidades.ProductoTerminado;
import radiadores.entidades.RutaFabricacion;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.PanelBuscarRuta;
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
        ruta.setDescripcion(tfDescripcion.getText());
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
        btLimpiar = new javax.swing.JButton();
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(lbNombre)
                    .addComponent(lbDescripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpRutaLayout.setVerticalGroup(
            jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRutaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btBuscarRuta.setText("Buscar");
        btBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarRutaActionPerformed(evt);
            }
        });
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

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btLimpiar);

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
                .addComponent(tfProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(lbProducto)
                .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btBuscarProducto))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jpRuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btEliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarNodoActionPerformed
    //TODO Cuando se eliminan nodos de una ruta cargada tendria q refrescarlo en a BD desp de mostrar una advertencia
    if (jlDetalleRuta.getSelectedIndex() != -1){
        nodosListModel.eliminarElemento(jlDetalleRuta.getSelectedIndex());
    }    
}//GEN-LAST:event_btEliminarNodoActionPerformed

private void btModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarRutaActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea guardar los cambios?", "Aceptar", JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarRuta();
        persistirRuta();
        Util.getInstancia().limpiarCampos(this);
        rutaFabricacion = null;
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarRutaActionPerformed

private void persistirRuta() {
    //Actualizo las horas y los materiales, y por cascadeo se crean los nodos y las rutas. Esto es xq las relaciones estan al revéz.
    if (rutaFabricacion.getNodosRuta().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No ha definido nodos en la ruta.");
        }
    else {
        FachadaPersistencia.getInstancia().comenzarTransaccion();
            for (NodoRuta nodo: rutaFabricacion.getNodosRuta()) {
                nodo.setRutaFabricacion(rutaFabricacion);
                for (HoraLaboral hora : nodo.getHorasTrabajadas()) {
                    hora.setNodoRuta(nodo);
                    FachadaPersistencia.getInstancia().actualizar(hora, false);
                }
                for (ParteDeNodo pn : nodo.getMateriales()) {
                    pn.setNodoRuta(nodo);
                    FachadaPersistencia.getInstancia().actualizar(pn, false);
                }
            }
        FachadaPersistencia.getInstancia().finalizarTransaccion();

        Util.getInstancia().limpiarCampos(this);
        rutaFabricacion = null;
    }


}

private void jlDetalleRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDetalleRutaMouseClicked
    if (evt.getClickCount() == 2) {
        int indice = jlDetalleRuta.convertIndexToModel(jlDetalleRuta.getSelectedIndex());
        NodoRuta nodoRuta = PanelDetalleRuta.obtenerNodo(productoTerminado, nodosListModel.getNodo(indice));
        
        nodosListModel.agregarElemento(nodoRuta);
    }
}//GEN-LAST:event_jlDetalleRutaMouseClicked

private void btAgregarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarNodoActionPerformed
    //TODO Cuando se agregan nodos de una ruta cargada tendria q refrescarlo en a BD desp de mostrar una advertencia
    if (!tfNombre.getText().trim().equals("") && !tfCodigo.getText().trim().equals("") && productoTerminado != null){
        NodoRuta nodoRuta = PanelDetalleRuta.obtenerNodo(productoTerminado); 
        if(nodoRuta != null) {
                nodosListModel.agregarElemento(nodoRuta);
        }
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
            persistirRuta(); 
        }
    }
}//GEN-LAST:event_btAgregarRutaActionPerformed

private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
    btAgregarNodo.setEnabled(true);
    btAgregarRuta.setEnabled(true);
    btBuscarProducto.setEnabled(true);
}//GEN-LAST:event_tfNombreKeyTyped

private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
    btAgregarNodo.setEnabled(true);
    btAgregarRuta.setEnabled(true);
    btBuscarProducto.setEnabled(true);
}//GEN-LAST:event_tfCodigoKeyTyped

private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed

}//GEN-LAST:event_tfNombreActionPerformed

private void btBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProductoActionPerformed
    PanelBuscarProductoGral buscarProd = new PanelBuscarProductoGral(this);   
    buscarProd.setModal(true);
    buscarProd.setVisible(true);
}//GEN-LAST:event_btBuscarProductoActionPerformed

private void btEliminarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarRutaActionPerformed
    if (ValidacionEliminar.getInstancia().rutaEstaRelacionada(rutaFabricacion)) {
            JOptionPane.showMessageDialog(this, "No puede eliminar la Ruta, el producto se encuentra en producción. ");
        }
    else {
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar la maquina?", "Aceptar", JOptionPane.YES_NO_OPTION);

        if(opcion == JOptionPane.YES_OPTION) {
            FachadaPersistencia.getInstancia().borrar(rutaFabricacion, true);
            Util.getInstancia().limpiarCampos(this);
            rutaFabricacion = null;
            inicializarBotones();
        }
    }
}//GEN-LAST:event_btEliminarRutaActionPerformed

private void btBuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarRutaActionPerformed
    PanelBuscarRuta buscarRuta = new PanelBuscarRuta(this);
    buscarRuta.setModal(true);
    buscarRuta.setVisible(true);
}//GEN-LAST:event_btBuscarRutaActionPerformed

private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
    Util.getInstancia().limpiarCampos(this);
    rutaFabricacion = null;
    inicializarBotones();
}//GEN-LAST:event_btLimpiarActionPerformed

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
    btBuscarProducto.setEnabled(false);
 }

    public void setRuta(RutaFabricacion resultado) {
        rutaFabricacion = resultado;
        productoTerminado = resultado.getProductoTerminado();
        
        cargarPantallaRuta(rutaFabricacion);

    }
    
    private void cargarPantallaRuta(RutaFabricacion ruta) {
        tfNombre.setText(ruta.getNombre());
        tfCodigo.setText(ruta.getCodigo());
        tfDescripcion.setText(ruta.getDescripcion());
        tfProducto.setText(ruta.getProductoTerminado().getNombre());
        nodosListModel.reiniciar();
        nodosListModel.agregarElementos(ruta.getNodosRuta());
        
        
        btAgregarNodo.setEnabled(true);
        btAgregarRuta.setEnabled(false);
        btModificarRuta.setEnabled(true);
        btEliminarRuta.setEnabled(true);
        btEliminarNodo.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarNodo;
    private javax.swing.JButton btAgregarRuta;
    private javax.swing.JButton btBuscarProducto;
    private javax.swing.JButton btBuscarRuta;
    private javax.swing.JButton btEliminarNodo;
    private javax.swing.JButton btEliminarRuta;
    private javax.swing.JButton btLimpiar;
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
        rutaFabricacion.setProductoTerminado(productoTerminado);
        tfProducto.setText(productoTerminado.getNombre());
    }
    
     @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }

    public RutaFabricacion getRutaFabricacion() {
        return rutaFabricacion;
    }

    public ProductoTerminado getProductoTerminado() {
        
        return productoTerminado;
    }

    
     
}
