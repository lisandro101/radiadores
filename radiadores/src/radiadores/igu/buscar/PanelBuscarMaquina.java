/*
 * PanelBuscarMaquina.java
 *
 * Created on 26 de octubre de 2008, 18:54
 */

package radiadores.igu.buscar;

import radiadores.igu.*;
import java.util.List;
import javax.persistence.Query;
import radiadores.entidades.Maquina;
import radiadores.igu.model.MaquinaTableModel;
import radiadores.persistencia.FachadaPersistencia;
import javax.swing.*;

/**
 *
 * @author  stafoxter
 */
public class PanelBuscarMaquina extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;

    private MaquinaTableModel tmMaquina;
    private List<Maquina> maquinas;
    private PanelMaquina panelMaquina;
    private int tipoBusqueda;
    private MaquinaTableModel tmOrigen;
    
    /** Creates new form PanelBuscarMaquina */
    public PanelBuscarMaquina() {
        initComponents();
        inicializar();
    }
    
    /** Creates new form PanelBuscarMaquina */
    public PanelBuscarMaquina(MaquinaTableModel tm) { 
        initComponents();
        tipoBusqueda = 1;
        tmOrigen = tm;
        //TODO Este tipo de busqueda deberia permitir selección multiple
        inicializar();
        
    }
    
    /** Creates new form PanelBuscarMaquina */
    public PanelBuscarMaquina(PanelMaquina pMaquina) {
        initComponents();
        tipoBusqueda = 2;
        panelMaquina = pMaquina;
        inicializar();
    }
    
    private void inicializar() {
        tmMaquina = new MaquinaTableModel();
        jtMaquina.setModel(tmMaquina);
        jtMaquina.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
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
        jTextField1 = new javax.swing.JTextField();
        pTablaMaquinas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaquina = new org.jdesktop.swingx.JXTable();
        pBoton = new javax.swing.JPanel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Maquinaria");

        lbNombre.setText("Nombre:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        lbCodigo.setText("Código:");

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
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jtMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Codigo", "Ubicacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMaquina.setEditable(false);
        jScrollPane1.setViewportView(jtMaquina);

        javax.swing.GroupLayout pTablaMaquinasLayout = new javax.swing.GroupLayout(pTablaMaquinas);
        pTablaMaquinas.setLayout(pTablaMaquinasLayout);
        pTablaMaquinasLayout.setHorizontalGroup(
            pTablaMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaMaquinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTablaMaquinasLayout.setVerticalGroup(
            pTablaMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaMaquinasLayout.createSequentialGroup()
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
                    .addComponent(pTablaMaquinas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(pBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTablaMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
    dispose();
}//GEN-LAST:event_btCancelarActionPerformed

private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    tmMaquina.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Maquina a where (a.nombre) LIKE :valor and a.borrado=false" );
    consulta.setParameter("valor", "%"+tfNombre.getText()+"%");
     
    maquinas = FachadaPersistencia.getInstancia().buscar(Maquina.class, consulta);

    
    for (int i = 0; i < maquinas.size(); i++) {
        tmMaquina.agregarFila(maquinas.get(i));
    }
    
}//GEN-LAST:event_btBuscarActionPerformed

private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
    int indice = jtMaquina.convertRowIndexToModel(jtMaquina.getSelectedRow());
    Maquina resultado;
 
    if(indice ==-1 ){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado maquina");
    }
    else{
        resultado = tmMaquina.getFila(indice);
        if(tipoBusqueda == 1){
            if(tmOrigen.getRowCount()<1){
                tmOrigen.agregarFila(resultado);       
                dispose();
            }
            else{
                if(ValidacionBuscar.getInstancia().maquinaEstaCargadaEnTabla(tmOrigen, resultado)){
                    JOptionPane.showMessageDialog(this, "La maquina ya se encuentra cargada");
                }
                else{
                    tmOrigen.agregarFila(resultado);       
                    dispose();
                }
            }
        }
        else{
            panelMaquina.setMaquina(resultado);
            dispose();
        }
    }
}//GEN-LAST:event_btAceptarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXTable jtMaquina;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pBoton;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pTablaMaquinas;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
