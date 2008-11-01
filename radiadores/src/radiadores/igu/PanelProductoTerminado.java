/*
 * PanelProductoTerminado.java
 *
 * Created on 30 de octubre de 2008, 21:50
 */

package radiadores.igu;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import radiadores.Util;
import radiadores.entidades.ProductoTerminado;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  stafoxter
 */
public class PanelProductoTerminado extends javax.swing.JPanel {

    private ProductoTerminado productoTerminado;
    /** Creates new form PanelProductoTerminado */
    public PanelProductoTerminado() {
        initComponents();
        inicializarBotones();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBotones = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pCampos = new javax.swing.JPanel();
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
        tfPrecioVenta = new javax.swing.JTextField();
        lbPrecioVenta = new javax.swing.JLabel();

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
                .addContainerGap(88, Short.MAX_VALUE))
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        lbCostoAlmacenamiento.setText("Costo Almacenamiento:");

        lbCostoEmision.setText("Costo Emisión:");

        lbCostoUnitOmision.setText("Costo Unitario Omisión:");

        lbDescripcion.setText("Descripción:");

        lbCondEmbalaje.setText("Condiciones Embalaje:");

        lbTamanioLoteEstandar.setText("Tamaño Lote Estandar:");

        lbStock.setText("Stock:");

        lbPrecioVenta.setText("Precio Venta:");

        javax.swing.GroupLayout pProductoTerminado2Layout = new javax.swing.GroupLayout(pProductoTerminado2);
        pProductoTerminado2.setLayout(pProductoTerminado2Layout);
        pProductoTerminado2Layout.setHorizontalGroup(
            pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminado2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrecioVenta)
                    .addComponent(lbCostoAlmacenamiento)
                    .addComponent(lbCostoEmision)
                    .addComponent(lbCostoUnitOmision)
                    .addComponent(lbDescripcion)
                    .addComponent(lbTamanioLoteEstandar)
                    .addComponent(lbCondEmbalaje)
                    .addComponent(lbStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPrecioVenta)
                    .addComponent(tfDescripcion)
                    .addComponent(tfStock)
                    .addComponent(tfCostoAlmacenamiento)
                    .addComponent(tfCostoEmision)
                    .addComponent(tfCostoUnitOmision)
                    .addComponent(tfTamanioLoteEstandar)
                    .addComponent(tfCondEmbalaje, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        pProductoTerminado2Layout.setVerticalGroup(
            pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pProductoTerminado2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioVenta)
                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout pCamposLayout = new javax.swing.GroupLayout(pCampos);
        pCampos.setLayout(pCamposLayout);
        pCamposLayout.setHorizontalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProductoTerminado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pProductoTerminado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCamposLayout.setVerticalGroup(
            pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pProductoTerminado2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pProductoTerminado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCampos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     PanelBuscarProductoGral buscarProv = new PanelBuscarProductoGral(this);   
     buscarProv.setModal(true);
     buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed

    if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        productoTerminado= crearProductoTerminado();
        if(ValidacionBuscar.getInstancia().productoTerminadoEstaCargadoEnBD(productoTerminado)){
            JOptionPane.showMessageDialog(this, "El Producto ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().grabar(productoTerminado, true);
            Util.getInstancia().limpiarCampos(this);
            
            productoTerminado=null;
        }
    }
  
}//GEN-LAST:event_btAgregarActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarProductoTerminado();
        FachadaPersistencia.getInstancia().actualizar(productoTerminado, true);
        Util.getInstancia().limpiarCampos(this);
        productoTerminado=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar el Producto Terminado?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        productoTerminado.setBorrado(true);
        FachadaPersistencia.getInstancia().actualizar(productoTerminado, true);
        Util.getInstancia().limpiarCampos(this);
        productoTerminado=null;
        inicializarBotones();
    }   
}//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbEstado;
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
    private javax.swing.JPanel pCampos;
    private javax.swing.JPanel pProductoTerminado1;
    private javax.swing.JPanel pProductoTerminado2;
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
        productoTerminado = new ProductoTerminado();
        
        productoTerminado.setCodigo(tfCodigo.getText());
        productoTerminado.setNombre(tfNombre.getText());
        productoTerminado.setCategoria(cbCategoria.getSelectedItem().toString());
        productoTerminado.setEstado(cbEstado.getSelectedItem().toString());
        productoTerminado.setNumeroPlano(tfNroPlano.getText());
        productoTerminado.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        productoTerminado.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        productoTerminado.setUnidadMedida(tfUnidadMedida.getText());
        productoTerminado.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        productoTerminado.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        productoTerminado.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        productoTerminado.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        productoTerminado.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        productoTerminado.setStock(Double.parseDouble(tfStock.getText()));
        productoTerminado.setDescripcion(tfDescripcion.getText());
        
        productoTerminado.setPrecioVenta(Double.parseDouble(tfPrecioVenta.getText()));
        
        return productoTerminado;
    }
    
    public void setComponente(ProductoTerminado prod){
        productoTerminado=prod;
        cargarPantallaProductoTerminado(prod);
        
    }
    
    private void actualizarProductoTerminado(){
        
        productoTerminado.setCodigo(tfCodigo.getText());
        productoTerminado.setNombre(tfNombre.getText());
        productoTerminado.setCategoria(cbCategoria.getSelectedItem().toString());
        productoTerminado.setEstado(cbEstado.getSelectedItem().toString());
        productoTerminado.setNumeroPlano(tfNroPlano.getText());
        productoTerminado.setPrecioBase(Double.parseDouble(tfPrecioBase.getText()));
        productoTerminado.setPesoUnidad(Double.parseDouble(tfPesoUnidad.getText()));
        productoTerminado.setUnidadMedida(tfUnidadMedida.getText());
        productoTerminado.setCostoAlmacenamiento(Double.parseDouble(tfCostoAlmacenamiento.getText()));
        productoTerminado.setCostoEmision(Double.parseDouble(tfCostoEmision.getText()));
        productoTerminado.setCostoUnitarioOmision(Double.parseDouble(tfCostoUnitOmision.getText()));
        productoTerminado.setTamanioLoteEstandar(Double.parseDouble(tfTamanioLoteEstandar.getText()));
        productoTerminado.setCondicionesEmbalaje(tfCondEmbalaje.getText());
        productoTerminado.setStock(Double.parseDouble(tfStock.getText()));
        productoTerminado.setDescripcion(tfDescripcion.getText());
        
        productoTerminado.setPrecioVenta(Double.parseDouble(tfPrecioVenta.getText()));
        
    }
    
    private void cargarPantallaProductoTerminado(ProductoTerminado prod){
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
        tfPrecioVenta.setText(String.valueOf(prod.getPrecioVenta()));
    }
    
    private void inicializarBotones(){
        btAgregar.setEnabled(true);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }
}
