package radiadores.igu;

import java.awt.Component;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.CostoFijo;
import radiadores.gestores.GestorCostoFijo;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.CostoFijoTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;

/**
 *
 * @author  Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelCostoFijo extends javax.swing.JDialog implements IValidable {
    private static final long serialVersionUID = 1L;

    private CostoFijoTableModel tmBuscar;
    
    private CostoFijo costoFijo;
    private List<CostoFijo> costosFijos;

    /** Creates new form PanelCargoEmpleado */
    public PanelCostoFijo() {
        initComponents();
        inicializar();
        inicializarBotones();
    }

    private void inicializar() {
        tmBuscar = new CostoFijoTableModel(0);
        tCargos.setModel(tmBuscar);
        
    }
    
    private void inicializarBotones(){
        btAgregar.setEnabled(true);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }
    
    private void pantallaCargadaBotones(){
        btAgregar.setEnabled(false);
        btModificar.setEnabled(true);
        btEliminar.setEnabled(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCargos = new org.jdesktop.swingx.JXTable();
        lbCargos = new javax.swing.JLabel();
        tfCosto = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        pABMCargo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbConcepto = new javax.swing.JLabel();
        tfConcepto = new javax.swing.JTextField();
        tfImporte = new javax.swing.JTextField();
        lbImporte = new javax.swing.JLabel();
        cbVigente = new javax.swing.JCheckBox();
        pBotones = new javax.swing.JPanel();
        btAceptarBuscar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Costo Fijo");

        pTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Costo Fijo"));

        tCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Concepto", "Importe", "Vigente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCargosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCargos);

        lbCargos.setText("Costo:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        lbTotal.setText("Subtotal:");

        tfTotal.setEditable(false);

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                        .addComponent(lbCargos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                        .addComponent(lbTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCargos)
                    .addComponent(btBuscar)
                    .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pABMCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ABM"));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btAgregar);

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btModificar);

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar);

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpiar);

        lbConcepto.setText("Concepto:");

        lbImporte.setText("Importe:");

        cbVigente.setText("Vigente    ");
        cbVigente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        cbVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVigenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbConcepto)
                            .addComponent(lbImporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfConcepto)
                            .addComponent(tfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbVigente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConcepto)
                    .addComponent(tfConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbImporte)
                    .addComponent(tfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVigente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pABMCargoLayout = new javax.swing.GroupLayout(pABMCargo);
        pABMCargo.setLayout(pABMCargoLayout);
        pABMCargoLayout.setHorizontalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pABMCargoLayout.setVerticalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btAceptarBuscar.setText("Calcular Total");
        btAceptarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarBuscarActionPerformed(evt);
            }
        });
        pBotones.add(btAceptarBuscar);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        pBotones.add(btCerrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
            .addComponent(pTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pABMCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pABMCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
 int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarCostoFijo();
        FachadaPersistencia.getInstancia().actualizar(costoFijo, true);
        Util.getInstancia().limpiarCampos(this);
        costoFijo=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
    dispose();
}//GEN-LAST:event_btCerrarActionPerformed

private void btAceptarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarBuscarActionPerformed
    tfTotal.setText(String.valueOf(GestorCostoFijo.getInstancia().calcularTotalCostoFijo(tmBuscar) ));

}//GEN-LAST:event_btAceptarBuscarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     
    buscarCostoFijo();
}//GEN-LAST:event_btBuscarActionPerformed

private void buscarCostoFijo(){
    tmBuscar.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from CostoFijo a where (a.concepto) LIKE :valor and a.borrado=false" );
    consulta.setParameter("valor", "%"+tfCosto.getText()+"%");
     
    costosFijos= FachadaPersistencia.getInstancia().buscar(CostoFijo.class, consulta);

    for (CostoFijo costoFijo1 : costosFijos) {
        tmBuscar.agregarFila(costoFijo1);
    }
} 
        

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(ValidacionBuscar.getInstancia().existenCamposVacios(pABMCargo)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        costoFijo = crearCostoFijo();
        if(ValidacionBuscar.getInstancia().estaDuplicado(costoFijo)){
            JOptionPane.showMessageDialog(this, "El Costo ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().grabar(costoFijo, true);
            Util.getInstancia().limpiarCampos(this);
            
            buscarCostoFijo();
            
            costoFijo = null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    

    int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea eliminar el Costo?", "Aceptar",
                JOptionPane.YES_NO_OPTION);

    if(opcion == JOptionPane.YES_OPTION) {
        FachadaPersistencia.getInstancia().borrar(costoFijo, true);
        Util.getInstancia().limpiarCampos(this);
        costoFijo=null;
        inicializarBotones();
    }
    
}//GEN-LAST:event_btEliminarActionPerformed

private void tCargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCargosMouseClicked
    int indice = tCargos.getSelectedRow();
    CostoFijo resultado;
 
    if(indice >= 0 ){
        indice = tCargos.convertRowIndexToModel(indice);
        resultado=tmBuscar.getFila(indice);
            cargarPantallaCostoFijo(resultado);
        
    }
}//GEN-LAST:event_tCargosMouseClicked

private void cbVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVigenteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cbVigenteActionPerformed

private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
    Util.getInstancia().limpiarCampos(this);
    costoFijo=null;
    inicializarBotones();
}//GEN-LAST:event_btLimpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarBuscar;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btModificar;
    private javax.swing.JCheckBox cbVigente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargos;
    private javax.swing.JLabel lbConcepto;
    private javax.swing.JLabel lbImporte;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pABMCargo;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pTabla;
    private org.jdesktop.swingx.JXTable tCargos;
    private javax.swing.JTextField tfConcepto;
    private javax.swing.JTextField tfCosto;
    private javax.swing.JTextField tfImporte;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

    private CostoFijo crearCostoFijo(){
        costoFijo = new CostoFijo();
        
        costoFijo.setConcepto(tfConcepto.getText());
        costoFijo.setImporte(Double.parseDouble(tfImporte.getText()));
        costoFijo.setVigente(cbVigente.isSelected());
        costoFijo.setBorrado(false);
        
        return costoFijo;
    }
    
    private void cargarPantallaCostoFijo(CostoFijo costo){
        costoFijo = costo;
        tfConcepto.setText(costo.getConcepto());
        tfImporte.setText(String.valueOf(costo.getImporte()));
        cbVigente.setSelected(costo.isVigente());
        
        pantallaCargadaBotones();
    }
    

    
    private void actualizarCostoFijo(){
        costoFijo.setConcepto(tfConcepto.getText());
        costoFijo.setImporte(Double.parseDouble(tfImporte.getText()));
        costoFijo.setVigente(cbVigente.isSelected());
        
    }

    @Override
    public List<Component> getComponentesObligatorios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
