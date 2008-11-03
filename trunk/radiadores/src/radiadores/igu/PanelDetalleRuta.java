/*
 * PanelDetalleRuta.java
 *
 * Created on 26 de octubre de 2008, 22:01
 */

package radiadores.igu;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import radiadores.entidades.CentroDeTrabajo;
import radiadores.entidades.Componente;
import radiadores.entidades.Empleado;
import radiadores.entidades.HoraLaboral;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.NodoRuta;
import radiadores.entidades.ParteDeNodo;
import radiadores.entidades.ProductoComponente;
import radiadores.igu.buscar.PanelBuscarEmpleado;
import radiadores.igu.buscar.PanelBuscarCentroTrabajo;
import radiadores.igu.buscar.PanelBuscarProductoGral;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.ComponenteDetalleRutaTableModel;
import radiadores.igu.model.EmpleadoDetalleRutaTableModel;

/**
 *
 * @author  Lisandro
 */
public class PanelDetalleRuta extends javax.swing.JDialog implements iBuscaCentroTrabajo{

    private static final long serialVersionUID = 1L;
    
    private EmpleadoDetalleRutaTableModel tmEmpleado;
    private ComponenteDetalleRutaTableModel tmComponente;
    private List<ProductoComponente> productosComponentes;  //ver
    private List<MateriaPrima> materiasPrimas;              //ver
    private Empleado empleado;
    private ParteDeNodo parteDeNodo;
    private NodoRuta nodoRuta;
    private List<HoraLaboral> horasLaborales;
    private HoraLaboral horaLaboral;
    private Componente componente;
    private CentroDeTrabajo centroTrabajo;
    
    private List<ParteDeNodo> partesDeNodos;
    


    /** Creates new form PanelDetalleRuta */
    public PanelDetalleRuta() {
        initComponents();
        inicializar();
    }
    
    private void inicializar(){
        horasLaborales= new ArrayList<HoraLaboral>();
        tmEmpleado = new EmpleadoDetalleRutaTableModel(0);
        
        partesDeNodos = new ArrayList<ParteDeNodo>();
        tmComponente = new ComponenteDetalleRutaTableModel(0);
        
        jtEmpleado.setModel(tmEmpleado);
        jtComponente.setModel(tmComponente);
        jtEmpleado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
    }
    public PanelDetalleRuta(String centroTrabajo) {
        initComponents();
        tfCentroTrabajo.setText(centroTrabajo);
        tfCentroTrabajo.setEnabled(false);
        btBuscarCentroTrabajo.setVisible(false);
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
        lbCentroTrabajo = new javax.swing.JLabel();
        tfCentroTrabajo = new javax.swing.JTextField();
        btBuscarCentroTrabajo = new javax.swing.JButton();
        pEmpleado = new javax.swing.JPanel();
        lbEmpleado = new javax.swing.JLabel();
        tfEmpleado = new javax.swing.JTextField();
        btBuscarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleado = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        btAgregarEmpleado = new javax.swing.JButton();
        btBuscarEliminar = new javax.swing.JButton();
        lbHoras = new javax.swing.JLabel();
        tfHoras = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbComponente = new javax.swing.JLabel();
        tfComponente = new javax.swing.JTextField();
        btBuscarComponente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtComponente = new org.jdesktop.swingx.JXTable();
        jPanel5 = new javax.swing.JPanel();
        btAgregarComponente = new javax.swing.JButton();
        btEliminarComponente = new javax.swing.JButton();
        lbCantidad = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCentroTrabajo.setText("Centro de Trabajo");

        tfCentroTrabajo.setEditable(false);

        btBuscarCentroTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radiadores/images/lupa (3).jpg"))); // NOI18N
        btBuscarCentroTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCentroTrabajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCentroTrabajo)
                .addGap(18, 18, 18)
                .addComponent(tfCentroTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarCentroTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCentroTrabajo)
                    .addComponent(tfCentroTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCentroTrabajo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados"));

        lbEmpleado.setText("Nombre");

        tfEmpleado.setEditable(false);

        btBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radiadores/images/lupa (3).jpg"))); // NOI18N
        btBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEmpleadoActionPerformed(evt);
            }
        });

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
                "Empleado", "Cargo", "Horas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtEmpleado);

        btAgregarEmpleado.setText("Agregar");
        btAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btAgregarEmpleado);

        btBuscarEliminar.setText("Eliminar");
        btBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btBuscarEliminar);

        lbHoras.setText("Horas");

        javax.swing.GroupLayout pEmpleadoLayout = new javax.swing.GroupLayout(pEmpleado);
        pEmpleado.setLayout(pEmpleadoLayout);
        pEmpleadoLayout.setHorizontalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpleadoLayout.createSequentialGroup()
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(tfEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pEmpleadoLayout.setVerticalGroup(
            pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbEmpleado)
                    .addComponent(lbHoras)
                    .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarEmpleado)
                    .addComponent(tfEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Componentes"));

        lbComponente.setText("Nombre");

        tfComponente.setEditable(false);

        btBuscarComponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/radiadores/images/lupa (3).jpg"))); // NOI18N
        btBuscarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarComponenteActionPerformed(evt);
            }
        });

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
                false, false, false
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

        lbCantidad.setText("Cantidad");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbComponente)
                        .addGap(18, 18, 18)
                        .addComponent(tfComponente, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbComponente)
                    .addComponent(lbCantidad)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarComponente)
                    .addComponent(tfComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAceptar.setText("Aceptar");
        jPanel6.add(btAceptar);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(btCancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEliminarActionPerformed
    int filaSeleccionada = jtEmpleado.convertRowIndexToModel(jtEmpleado.getSelectedRow());
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Empleado");
    }else{
        tmEmpleado.eliminarFila(filaSeleccionada);
        
    }
}//GEN-LAST:event_btBuscarEliminarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    this.dispose();
}//GEN-LAST:event_btCancelarActionPerformed

private void btBuscarCentroTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCentroTrabajoActionPerformed
        PanelBuscarCentroTrabajo buscarCentroTrabajo = new PanelBuscarCentroTrabajo(this);
        buscarCentroTrabajo.setModal(true);
        buscarCentroTrabajo.setVisible(true);
}//GEN-LAST:event_btBuscarCentroTrabajoActionPerformed

private void btBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEmpleadoActionPerformed
        PanelBuscarEmpleado buscarEmpleado = new PanelBuscarEmpleado(this);
        buscarEmpleado.setModal(true); 
        buscarEmpleado.setVisible(true);
}//GEN-LAST:event_btBuscarEmpleadoActionPerformed

private void btBuscarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarComponenteActionPerformed
        PanelBuscarProductoGral buscarComponente = new PanelBuscarProductoGral(this);
        buscarComponente.setModal(true); 
        buscarComponente.setVisible(true);
}//GEN-LAST:event_btBuscarComponenteActionPerformed

private void btAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarEmpleadoActionPerformed
        
        if(empleado == null || tfHoras.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Existen campos vacios");
        }else{
            horaLaboral= new HoraLaboral();
            horaLaboral.setCantidad(Integer.parseInt(tfHoras.getText()));
            horaLaboral.setEmpleado(empleado);
            
            if(ValidacionBuscar.getInstancia().empleadoEstaCargadoEnTabla(tmEmpleado, horaLaboral)){
                    JOptionPane.showMessageDialog(this, "El Empleado ya se encuentra asignado");
            }else{
                tmEmpleado.agregarFila(horaLaboral);      
            }
        }
}//GEN-LAST:event_btAgregarEmpleadoActionPerformed

private void btAgregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarComponenteActionPerformed
        if(componente == null || tfCantidad.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Existen campos vacios");
        }else{
            parteDeNodo= new ParteDeNodo();
            parteDeNodo.setCantidad(Double.parseDouble(tfCantidad.getText()));
            parteDeNodo.setComponente(componente);
            
            if(ValidacionBuscar.getInstancia().parteNodoEstaCargadaEnTabla(tmComponente, componente)){
                    JOptionPane.showMessageDialog(this, "El Componente ya se encuentra asignado");
            }else{
                tmComponente.agregarFila(parteDeNodo);      
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btAgregarComponente;
    private javax.swing.JButton btAgregarEmpleado;
    private javax.swing.JButton btBuscarCentroTrabajo;
    private javax.swing.JButton btBuscarComponente;
    private javax.swing.JButton btBuscarEliminar;
    private javax.swing.JButton btBuscarEmpleado;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEliminarComponente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTable jtComponente;
    private org.jdesktop.swingx.JXTable jtEmpleado;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCentroTrabajo;
    private javax.swing.JLabel lbComponente;
    private javax.swing.JLabel lbEmpleado;
    private javax.swing.JLabel lbHoras;
    private javax.swing.JPanel pEmpleado;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCentroTrabajo;
    private javax.swing.JTextField tfComponente;
    private javax.swing.JTextField tfEmpleado;
    private javax.swing.JTextField tfHoras;
    // End of variables declaration//GEN-END:variables

    public void setEmpleado(Empleado emp){
        empleado =  emp;
        tfEmpleado.setText(emp.getNombre());
    }
//    public void agregarMateriaPrima(MateriaPrima mat){
//        materiasPrimas.add(mat);
//    }
//    public void agregarProductoComponente(ProductoComponente prod){
//        productosComponentes.add(prod);
//        
//        
//    }
    public void setComponente(Componente comp){
        componente= comp;
        tfComponente.setText(comp.getNombre());
    }
    
    public ComponenteDetalleRutaTableModel getTableModelComponente(){
        return tmComponente;
    }

    public void setCentroTrabajo(CentroDeTrabajo ct) {
        centroTrabajo = ct;
        tfCentroTrabajo.setText(ct.getNombre());
    }
}
