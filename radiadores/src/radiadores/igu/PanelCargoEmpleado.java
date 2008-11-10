package radiadores.igu;

import java.awt.Component;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import radiadores.utils.Util;
import radiadores.entidades.Cargo;
import radiadores.igu.buscar.ValidacionBuscar;
import radiadores.igu.model.CargoEmpleadoTableModel;
import radiadores.persistencia.FachadaPersistencia;
import radiadores.utils.IValidable;

/**
 *
 * @author  Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelCargoEmpleado extends javax.swing.JDialog implements IValidable {
    private static final long serialVersionUID = 1L;

    private CargoEmpleadoTableModel tmBuscar;
    private PanelEmpleado panelEmpleado;
    private Cargo cargo;
    private List<Cargo> cargosResul;
    private List<Component> componentesObligatorios;
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
        //componentesObligatorios = Arrays.asList((Component)tfCodigo);
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
        tfNombreCargo = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        pABMCargo = new javax.swing.JPanel();
        lbHorasLaborales = new javax.swing.JLabel();
        lbPrecioHora = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfHorasLaborales = new javax.swing.JTextField();
        tfPrecioHora = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
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
        tCargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCargosMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addComponent(lbCargos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)))
                .addContainerGap())
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCargos)
                    .addComponent(btBuscar)
                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        pABMCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("ABM"));

        lbHorasLaborales.setText("Horas Laborales:");

        lbPrecioHora.setText("Precio Hora:");

        lbNombre.setText("Nombre:");

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
                .addContainerGap()
                .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecioHora)
                            .addComponent(lbNombre))
                        .addGap(26, 26, 26)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(tfPrecioHora, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)))
                    .addGroup(pABMCargoLayout.createSequentialGroup()
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHorasLaborales)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado, 0, 479, Short.MAX_VALUE)
                            .addComponent(tfHorasLaborales, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addContainerGap())
        );
        pABMCargoLayout.setVerticalGroup(
            pABMCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pABMCargoLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(pABMCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pABMCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
     
    buscarCargo();
}//GEN-LAST:event_btBuscarActionPerformed

private void buscarCargo(){
    tmBuscar.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Cargo a where (a.nombre) LIKE :valor and a.borrado=false" );
    consulta.setParameter("valor", "%"+tfNombreCargo.getText()+"%");
     
    cargosResul= FachadaPersistencia.getInstancia().buscar(Cargo.class, consulta);

    
    for (int i = 0; i < cargosResul.size(); i++) {
        tmBuscar.agregarFila(cargosResul.get(i));
    }
} 
        

private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
    if(ValidacionBuscar.getInstancia().existenCamposVacios(pABMCargo)){
        JOptionPane.showMessageDialog(this, "Existen campos sin completar");
    }else{
        cargo = crearCargo();
        if(ValidacionBuscar.getInstancia().estaDuplicado(cargo)){
            JOptionPane.showMessageDialog(this, "El Cargo ya se encuentra registrado");
        }else{
            FachadaPersistencia.getInstancia().grabar(cargo, true);
            Util.getInstancia().limpiarCampos(this);
            
            buscarCargo();
            
            cargo = null;
        }
    }
}//GEN-LAST:event_btAgregarActionPerformed

private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    
    if(cargo != null && ValidacionEliminar.getInstancia().cargoEstaRelacionado(cargo)) {
        JOptionPane.showMessageDialog(this, "No puede eliminar el cargo " +
                "que tiene Personal asignado");
    }else {
        int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Seguro desea eliminar el Cargo?", "Aceptar",
                    JOptionPane.YES_NO_OPTION);

        if(opcion == JOptionPane.YES_OPTION) {
            FachadaPersistencia.getInstancia().borrar(cargo, true);
            Util.getInstancia().limpiarCampos(this);
            cargo=null;
            inicializarBotones();
        }
    }
}//GEN-LAST:event_btEliminarActionPerformed

private void tCargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCargosMouseClicked
    int indice = tCargos.getSelectedRow();
    Cargo resultado;
 
    if(indice >= 0 ){
        indice = tCargos.convertRowIndexToModel(indice);
        resultado=tmBuscar.getFila(indice);
            cargarPantallaCargo(resultado);
        
    }
}//GEN-LAST:event_tCargosMouseClicked

    

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
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbHorasLaborales;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecioHora;
    private javax.swing.JPanel pABMCargo;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pTabla;
    private org.jdesktop.swingx.JXTable tCargos;
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
    
    private void cargarPantallaCargo(Cargo cargo1){
        cargo= cargo1;
        tfNombre.setText(cargo1.getNombre());
        tfPrecioHora.setText(String.valueOf(cargo1.getValorHora()));
        tfHorasLaborales.setText(String.valueOf(cargo1.getHorasPorMes()));
        
        pantallaCargadaBotones();
    }
    

    
    private void actualizarCargoEmpleado(){
        cargo.setNombre(tfNombre.getText());
        cargo.setValorHora(Double.parseDouble(tfPrecioHora.getText()));
        cargo.setHorasPorMes(Integer.parseInt(tfHorasLaborales.getText()));
        
    }

    @Override
    public List<Component> getComponentesObligatorios() {
        return componentesObligatorios;
    }
}
