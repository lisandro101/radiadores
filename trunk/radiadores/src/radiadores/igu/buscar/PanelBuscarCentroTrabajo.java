/*
 * PanelBuscarCentroTrabajo.java
 *
 * Created on 27 de octubre de 2008, 16:40
 */

package radiadores.igu.buscar;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import radiadores.entidades.CentroDeTrabajo;
import radiadores.igu.PanelCentroTrabajo;
import radiadores.igu.model.CentroTrabajoTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  Lisandro
 */
public class PanelBuscarCentroTrabajo extends javax.swing.JDialog {

    private CentroTrabajoTableModel tmCentro;
    private List<CentroDeTrabajo> centros;
    private PanelCentroTrabajo panelCentro;
    private int tipoBusqueda;
    private CentroTrabajoTableModel tmOrigen;

    /** Creates new form PanelBuscarMaquina */
    public PanelBuscarCentroTrabajo() {
        initComponents();
        inicializar();
    }

    
    /** Creates new form PanelBuscarMaquina */
    public PanelBuscarCentroTrabajo(CentroTrabajoTableModel tm) { 
        initComponents();
        tipoBusqueda = 1;
        tmOrigen = tm;
        //TODO Este tipo de busqueda deberia permitir selección multiple
        inicializar();
        
    }

     /** Creates new form PanelBuscarMaquina */
    public PanelBuscarCentroTrabajo(PanelCentroTrabajo pCentro) {
        initComponents();
        tipoBusqueda = 2;
        panelCentro = pCentro;
        inicializar();
    }
    
    private void inicializar() {
        tmCentro = new CentroTrabajoTableModel();
        jtCentroTrabajo.setModel(tmCentro);
        jtCentroTrabajo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBuscar = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        pTablaProveedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCentroTrabajo = new org.jdesktop.swingx.JXTable();
        pBoton = new javax.swing.JPanel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNombre.setText("Nombre:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        lbCodigo.setText("Codigo:");

        javax.swing.GroupLayout pBuscarLayout = new javax.swing.GroupLayout(pBuscar);
        pBuscar.setLayout(pBuscarLayout);
        pBuscarLayout.setHorizontalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre)
                    .addComponent(lbCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pBuscarLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscar)
                    .addGroup(pBuscarLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(14, 14, 14)
                        .addComponent(lbCodigo)))
                .addContainerGap())
        );

        jtCentroTrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCentroTrabajo.setEditable(false);
        jScrollPane1.setViewportView(jtCentroTrabajo);

        javax.swing.GroupLayout pTablaProveedoresLayout = new javax.swing.GroupLayout(pTablaProveedores);
        pTablaProveedores.setLayout(pTablaProveedoresLayout);
        pTablaProveedoresLayout.setHorizontalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTablaProveedoresLayout.setVerticalGroup(
            pTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });
        pBoton.add(btAceptar);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        pBoton.add(btCancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pTablaProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(pBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTablaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
dispose();
}//GEN-LAST:event_btCancelarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    tmCentro.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("SELECT a FROM CentroDeTrabajo a WHERE (a.nombre) LIKE :valor and a.borrado=false" );
    consulta.setParameter("valor", "%"+tfNombre.getText()+"%");
     
    centros = FachadaPersistencia.getInstancia().buscar(CentroDeTrabajo.class, consulta);

    for (CentroDeTrabajo centroDeTrabajo : centros) {
        tmCentro.agregarFila(centroDeTrabajo);
    }
}//GEN-LAST:event_btBuscarActionPerformed

private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
    int indice = jtCentroTrabajo.convertRowIndexToModel(jtCentroTrabajo.getSelectedRow());
    CentroDeTrabajo resultado;
 
    if(indice ==-1 ){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun Centro de Trabajo");
    }
    else{
        resultado = tmOrigen.getFila(indice);
        if(tipoBusqueda == 1){
            if(tmOrigen.getRowCount()<1){
                tmOrigen.agregarFila(resultado);       
                dispose();
            }
            else{
                if(ValidacionBuscar.getInstancia(). centroEstaCargadoEnTabla(tmOrigen, resultado)){
                    JOptionPane.showMessageDialog(this, "El Centro de Trabajo ya se encuentra cargado");
                }
                else{
                    tmOrigen.agregarFila(resultado);       
                    dispose();
                }
            }
        }
        else{
            panelCentro.setCentroTrabajo(resultado);
            dispose();
        }
    }
}//GEN-LAST:event_btAceptarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelBuscarCentroTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jtCentroTrabajo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pBoton;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pTablaProveedores;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
