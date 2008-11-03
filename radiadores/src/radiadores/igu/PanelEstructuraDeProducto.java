package radiadores.igu;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import radiadores.entidades.Componente;
import radiadores.entidades.EstructuraDeProducto;
import radiadores.entidades.ParteDeEstructura;
import radiadores.entidades.ProductoTerminado;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.PanelBuscarProductoGral.Tipo;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.ComponenteEstructuraTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;
import radiadores.utils.Util;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelEstructuraDeProducto extends javax.swing.JPanel implements IValidable {
    private static final long serialVersionUID = 1L;
    
    private ComponenteEstructuraTableModel tmComponente;
    private List<ParteDeEstructura> partesDeEstructuras;
    private ParteDeEstructura parteDeEstructura;
    private ProductoTerminado productoTerminado;
    private Componente componente;
    private EstructuraDeProducto estructuraDeProducto;
    private List<Component> componentesObligatorios;
    
    /** Creates new form PanelEstructuraDeProducto */
    public PanelEstructuraDeProducto() {
        initComponents();
        inicializar();
    }

    
    private void inicializar(){
        partesDeEstructuras = new ArrayList<ParteDeEstructura>();
        tmComponente = new ComponenteEstructuraTableModel(0);

        jtComponente.setModel(tmComponente);
        jtComponente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        componentesObligatorios = Arrays.asList((Component)tfCodigo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pProductoTerminado = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        btBuscarProdTerminado = new javax.swing.JButton();
        pTablaComponentes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtComponente = new org.jdesktop.swingx.JXTable();
        jPanel5 = new javax.swing.JPanel();
        btAgregarComponente = new javax.swing.JButton();
        btEliminarComponente = new javax.swing.JButton();
        lbComponente = new javax.swing.JLabel();
        tfComponente = new javax.swing.JTextField();
        btBuscarComponente = new javax.swing.JButton();
        lbCantidad = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        pBotones = new javax.swing.JPanel();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        pProductoTerminado.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto Terminado"));

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

        tfCodigo.setEnabled(false);

        tfNombre.setEnabled(false);

        btBuscarProdTerminado.setText("Buscar");
        btBuscarProdTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarProdTerminadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pProductoTerminadoLayout = new javax.swing.GroupLayout(pProductoTerminado);
        pProductoTerminado.setLayout(pProductoTerminadoLayout);
        pProductoTerminadoLayout.setHorizontalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductoTerminadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btBuscarProdTerminado)
                .addContainerGap())
        );
        pProductoTerminadoLayout.setVerticalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(btBuscarProdTerminado)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pTablaComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Componentes"));

        jtComponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Componente", "Unidad Medida", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtComponente);

        btAgregarComponente.setText("Agregar");
        btAgregarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarComponenteActionPerformed(evt);
            }
        });
        jPanel5.add(btAgregarComponente);

        btEliminarComponente.setText("Eliminar");
        btEliminarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarComponenteActionPerformed(evt);
            }
        });
        jPanel5.add(btEliminarComponente);

        lbComponente.setText("Nombre");

        tfComponente.setEditable(false);

        btBuscarComponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radiadores/images/lupa (3).jpg"))); // NOI18N
        btBuscarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarComponenteActionPerformed(evt);
            }
        });

        lbCantidad.setText("Cantidad");

        javax.swing.GroupLayout pTablaComponentesLayout = new javax.swing.GroupLayout(pTablaComponentes);
        pTablaComponentes.setLayout(pTablaComponentesLayout);
        pTablaComponentesLayout.setHorizontalGroup(
            pTablaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pTablaComponentesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbComponente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfComponente, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btBuscarComponente)
                .addGap(33, 33, 33)
                .addComponent(lbCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTablaComponentesLayout.setVerticalGroup(
            pTablaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbComponente)
                    .addComponent(lbCantidad)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarComponente)
                    .addComponent(tfComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTablaComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pProductoTerminado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pTablaComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    estructuraDeProducto = crearEstructuraProducto();
    if(ValidacionBuscar.getInstancia().estaDuplicado(estructuraDeProducto)){
        JOptionPane.showMessageDialog(this, "Existen campos vacios");
    }else{
        if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
            JOptionPane.showMessageDialog(this, "Existen campos vacios");
        }else{
   
            FachadaPersistencia.getInstancia().grabar(estructuraDeProducto, true);
            FachadaPersistencia.getInstancia().actualizar(estructuraDeProducto, true);
            Util.getInstancia().limpiarCampos(this);
            estructuraDeProducto=null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarEstructuraProducto();
        FachadaPersistencia.getInstancia().actualizar(estructuraDeProducto, true);
        Util.getInstancia().limpiarCampos(this);
        estructuraDeProducto=null;            
        //inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar la Estructura?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        estructuraDeProducto.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(estructuraDeProducto, true);
        Util.getInstancia().limpiarCampos(this);
        estructuraDeProducto=null;
        //inicializarBotones();
    }   
}//GEN-LAST:event_btEliminarActionPerformed

private void btBuscarProdTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProdTerminadoActionPerformed
     PanelBuscarProductoGral buscarProv = new PanelBuscarProductoGral(this, Tipo.PANEL_ESTRUCTURA);   
     buscarProv.setModal(true);
     buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarProdTerminadoActionPerformed

private void btAgregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarComponenteActionPerformed
        if(componente == null || tfCantidad.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Existen campos vacios");
        }else{
            parteDeEstructura = new ParteDeEstructura();
            parteDeEstructura.setCantidad(Double.parseDouble(tfCantidad.getText()));
            parteDeEstructura.setComponente(componente);
            
            if(ValidacionBuscar.getInstancia().parteNodoEstructuraEstaCargadaEnTabla(tmComponente, componente)){
                    JOptionPane.showMessageDialog(this, "El Componente ya se encuentra asignado");
            }else{
                
                tmComponente.agregarFila(parteDeEstructura);
                
            }
        }
}//GEN-LAST:event_btAgregarComponenteActionPerformed

private void btEliminarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarComponenteActionPerformed
int filaSeleccionada = jtComponente.convertRowIndexToModel(jtComponente.getSelectedRow());
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Componente");
    }else{
        tmComponente.eliminarFila(filaSeleccionada);
        
    }
}//GEN-LAST:event_btEliminarComponenteActionPerformed

private void btBuscarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarComponenteActionPerformed
        PanelBuscarProductoGral buscarComponente = new PanelBuscarProductoGral(this, Tipo.PANEL_DETALLE_ESTRUCTURA);
        buscarComponente.setModal(true); 
        buscarComponente.setVisible(true);
}//GEN-LAST:event_btBuscarComponenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAgregarComponente;
    private javax.swing.JButton btBuscarComponente;
    private javax.swing.JButton btBuscarProdTerminado;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarComponente;
    private javax.swing.JButton btModificar;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTable jtComponente;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbComponente;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pProductoTerminado;
    private javax.swing.JPanel pTablaComponentes;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComponente;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    public void setProductoTerminado(ProductoTerminado prod){
        Util.getInstancia().limpiarCampos(this);
        productoTerminado=prod;
        tfCodigo.setText(productoTerminado.getCodigo());
        tfNombre.setText(productoTerminado.getNombre()); 
        
    }
    public void setEstructura(EstructuraDeProducto estructura){
        Util.getInstancia().limpiarCampos(this);
        estructuraDeProducto= estructura;
        productoTerminado = estructura.getProductoTerminado();
        partesDeEstructuras= estructura.getPartes();
        
        tfCodigo.setText(productoTerminado.getCodigo());
        tfNombre.setText(productoTerminado.getNombre()); 
        tmComponente.agregarFilas(partesDeEstructuras);
        
    }
    
    
    public void setComponente(Componente con){
        componente=con;
        tfComponente.setText(componente.getNombre());
        tfCantidad.setText("");
    }
    
    public ComponenteEstructuraTableModel getTableModelComponente(){
        return tmComponente;
    }

    private EstructuraDeProducto crearEstructuraProducto(){
        estructuraDeProducto = new EstructuraDeProducto();
        
        partesDeEstructuras= tmComponente.getFilas();
        
        for (ParteDeEstructura parteDeEstructura1 : partesDeEstructuras) {
                parteDeEstructura1.setEstructura(estructuraDeProducto);
        }
        estructuraDeProducto.setPartes(partesDeEstructuras);
        estructuraDeProducto.setProductoTerminado(productoTerminado);
        return estructuraDeProducto;
    }
    private void actualizarEstructuraProducto(){
        partesDeEstructuras= tmComponente.getFilas();
        
        for (ParteDeEstructura parteDeEstructura1 : partesDeEstructuras) {
                parteDeEstructura1.setEstructura(estructuraDeProducto);
        }
        estructuraDeProducto.setPartes(partesDeEstructuras);
        estructuraDeProducto.setProductoTerminado(productoTerminado);
    }

    @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }
}
