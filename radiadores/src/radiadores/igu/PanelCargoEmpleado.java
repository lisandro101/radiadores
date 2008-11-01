/*
 * PanelCargoEmpleado.java
 *
 * Created on 26 de octubre de 2008, 20:04
 */

package radiadores.igu;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.Cargo;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.CargoEmpleadoTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  stafoxter
 */
public class PanelCargoEmpleado extends javax.swing.JDialog {

    private CargoEmpleadoTableModel tmBuscar;
    private PanelEmpleado panelEmpleado;
    private Cargo cargo;
    private List<Cargo> cargosResul;
    /** Creates new form PanelCargoEmpleado */
    public PanelCargoEmpleado(PanelEmpleado emp) {
        initComponents();
        panelEmpleado= emp;
        inicializar();
        inicializarBotones();
    }

    private void inicializar() {
        tmBuscar = new CargoEmpleadoTableModel(0);
        tCargos.setModel(tmBuscar);
  
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
        tfNombreCargo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pABMCargo = new javax.swing.JPanel();
        lbHorasLaborales = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbPrecioHora = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfHorasLaborales = new javax.swing.JTextField();
        tfPrecioHora = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        pBotones = new javax.swing.JPanel();
        btAceptarBuscar = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Cargo");

        pTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cargo"));

        tCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio Hora", "Horas Laborales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCargos);

        lbCargos.setText("Nombre Cargo:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addComponent(lbCargos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)))
                .addGap(28, 28, 28))
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCargos)
                    .addComponent(btBuscar)
                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pABMCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ABM"));

        lbHorasLaborales.setText("Horas Laborales:");

        lbCodigo.setText("Código:");

        lbPrecioHora.setText("Precio Hora:");

        lbNombre.setText("Nombre:");

        tfCodigo.setEditable(false);

        lbEstado.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo", "Eliminado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pABMCargoLayout = new javax.swing.GroupLayout(pABMCargo);
        pABMCargo.setLayout(pABMCargoLayout);
        pABMCargoLayout.setHorizontalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecioHora)
                            .addComponent(lbNombre)
                            .addComponent(lbCodigo))
                        .addGap(26, 26, 26)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(tfPrecioHora, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHorasLaborales)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado, 0, 172, Short.MAX_VALUE)
                            .addComponent(tfHorasLaborales, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                .addGap(146, 146, 146))
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );
        pABMCargoLayout.setVerticalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioHora)
                    .addComponent(tfPrecioHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHorasLaborales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHorasLaborales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btAceptarBuscar.setText("Aceptar");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pABMCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pABMCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cbEstadoActionPerformed

private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
 int opcion = JOptionPane.showConfirmDialog(this,
                "¿Seguro desea guardar los cambios?", "Aceptar",
                JOptionPane.YES_NO_OPTION);
        
    if(opcion == JOptionPane.YES_OPTION) {
        actualizarCargoEmpleado();
        FachadaPersistencia.getInstancia().actualizar(cargo, true);
        Util.getInstancia().limpiarCampos(this);
        cargo=null;            
        inicializarBotones();
    }
}//GEN-LAST:event_btModificarActionPerformed

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
    dispose();
}//GEN-LAST:event_btCerrarActionPerformed

private void btAceptarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarBuscarActionPerformed
    
    int indice = tCargos.convertRowIndexToModel(tCargos.getSelectedRow());
    
    if(indice == -1){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Proveedor");
    }else{
        cargo = tmBuscar.getFila(indice);
        panelEmpleado.setCargoEmpleado(cargo);
        cargarPantallaCargo(cargo);
        
        dispose();
        
    }
   
}//GEN-LAST:event_btAceptarBuscarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
     
    tmBuscar.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Cargo a where (a.nombreCargo) LIKE :valor and a.borrado=false" );
    consulta.setParameter("valor", "%"+tfNombreCargo.getText()+"%");
     
    cargosResul= FachadaPersistencia.getInstancia().buscar(Cargo.class, consulta);

    
    for (int i = 0; i < cargosResul.size(); i++) {
        tmBuscar.agregarFila(cargosResul.get(i));
    }
}//GEN-LAST:event_btBuscarActionPerformed

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(ValidacionBuscar.getInstancia().existenCamposVacios(this)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        cargo= crearCargo();
        if(ValidacionBuscar.getInstancia().cargoEmpleadoEstaCargadoEnBD(cargo)){
            JOptionPane.showMessageDialog(this, "El Cargo ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().grabar(cargo, true);
            Util.getInstancia().limpiarCampos(this);
            
            cargo=null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    cargo.setBorrado(true);
    FachadaPersistencia.getInstancia().actualizar(cargo, true);
}//GEN-LAST:event_btEliminarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarBuscar;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargos;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbHorasLaborales;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecioHora;
    private javax.swing.JPanel pABMCargo;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pTabla;
    private org.jdesktop.swingx.JXTable tCargos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfHorasLaborales;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombreCargo;
    private javax.swing.JTextField tfPrecioHora;
    // End of variables declaration//GEN-END:variables

    private Cargo crearCargo(){
        cargo = new Cargo();
        
        cargo.setNombre(tfNombre.getText());
        cargo.setValorHora(Double.parseDouble(tfPrecioHora.getText()));
        cargo.setHorasPorMes(Integer.parseInt(tfHorasLaborales.getText()));
        
        
        return cargo;
    }
    
    private void cargarPantallaCargo(Cargo cargo){
        
        tfNombre.setText(cargo.getNombre());
        tfPrecioHora.setText(String.valueOf(cargo.getValorHora()));
        tfHorasLaborales.setText(String.valueOf(cargo.getHorasPorMes()));
                
    }
    
    
    private void inicializarBotones(){
        btAgregar.setEnabled(true);
        btEliminar.setEnabled(false);
        btModificar.setEnabled(false);
    }
    
    private void actualizarCargoEmpleado(){
        cargo.setNombre(tfNombre.getText());
        cargo.setValorHora(Double.parseDouble(tfPrecioHora.getText()));
        cargo.setHorasPorMes(Integer.parseInt(tfHorasLaborales.getText()));
        
    }
}