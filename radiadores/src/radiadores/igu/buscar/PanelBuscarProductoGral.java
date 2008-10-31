/*
 * PanelBuscarProductoGral.java
 *
 * Created on 30 de octubre de 2008, 18:32
 */

package radiadores.igu.buscar;

import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.JXTable;
import radiadores.entidades.Componente;
import radiadores.entidades.MateriaPrima;
import radiadores.entidades.ProductoComponente;
import radiadores.entidades.ProductoTerminado;
import radiadores.igu.PanelMateriaPrima;
import radiadores.igu.PanelProductoComponente;
import radiadores.igu.PanelProductoTerminado;
import radiadores.igu.model.ProductoGralTableModel;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author  stafoxter
 */
public class PanelBuscarProductoGral extends javax.swing.JDialog {

    private ProductoGralTableModel tmBuscar;
    private ProductoGralTableModel tmOrigen;
    private List<Componente> componentes;    
    private int tipoBusqueda;

    
    private PanelMateriaPrima panelMateriaPrima;
    private PanelProductoComponente panelProductoComponente;
    private PanelProductoTerminado panelProductoTerminado;
    /** Creates new form PanelBuscarProductoGral */
    
    //Si es para rellenar un Un TableModel
    public PanelBuscarProductoGral(TableModel tm1) {
        initComponents();
        tipoBusqueda=1;
        tmOrigen = (ProductoGralTableModel) tm1;
        inicializar();
    }
    
    //Si es para la pantalla Materia prima
    public PanelBuscarProductoGral(PanelMateriaPrima ini) {
        initComponents();
        tipoBusqueda=2;
        panelMateriaPrima= ini;
        inicializar();
    }
    
    //Si es para la pantalla Producto Componente
    public PanelBuscarProductoGral(PanelProductoComponente ini) {
        initComponents();
        tipoBusqueda=3;
        panelProductoComponente= ini;
        inicializar();
    }
    
    //Si es para la pantalla Producto Terminado
    public PanelBuscarProductoGral(PanelProductoTerminado ini) {
        initComponents();
        tipoBusqueda=4;
        panelProductoTerminado= ini;
        inicializar();
    }

    
    private void inicializar() {
        tmBuscar = new ProductoGralTableModel(0);
        tResultadoComponentes.setModel(tmBuscar);
        tResultadoComponentes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tResultadoComponentes = new org.jdesktop.swingx.JXTable();
        pBoton = new javax.swing.JPanel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCodigo.setText("Código:");

        lbNombre.setText("Nombre:");

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
                    .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
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

        tResultadoComponentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tResultadoComponentes.setEditable(false);
        jScrollPane1.setViewportView(tResultadoComponentes);

        javax.swing.GroupLayout pTablaComponentesLayout = new javax.swing.GroupLayout(pTablaComponentes);
        pTablaComponentes.setLayout(pTablaComponentesLayout);
        pTablaComponentesLayout.setHorizontalGroup(
            pTablaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaComponentesLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        pTablaComponentesLayout.setVerticalGroup(
            pTablaComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
                    .addComponent(pBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(pTablaComponentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pProductoTerminado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pTablaComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
    int indice = tResultadoComponentes.getSelectedRow();
    Componente resultado;

    
    if(indice ==-1 ){
        JOptionPane.showMessageDialog(this, "No se ha seleccionado Componente");
    }else{
        resultado=tmBuscar.getFila(indice);
        if(tipoBusqueda==1){
            if(tmOrigen.getRowCount()<1){
                tmOrigen.agregarFila(resultado);       
                dispose();
            }else{
                if(ValidacionBuscar.getInstancia().componenteEstaCargadoEnTabla(tmOrigen, resultado)){
                    JOptionPane.showMessageDialog(this, "El Componente ya se encuentra asignado");
                }else{
                    tmOrigen.agregarFila(resultado);       
                    dispose();
                }
            }
        }else if(tipoBusqueda==2){
            panelMateriaPrima.setComponente((MateriaPrima)resultado);
            dispose();
        }else if(tipoBusqueda==3){
            panelProductoComponente.setComponente((ProductoComponente)resultado);
            dispose();
        }else{
            panelProductoTerminado.setComponente((ProductoTerminado)resultado);
            dispose();
        }
                
        
    }
}//GEN-LAST:event_btAceptarActionPerformed

private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
dispose();
}//GEN-LAST:event_btCancelarActionPerformed

private void btBuscarProdTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProdTerminadoActionPerformed

    tmBuscar.limpiarTableModel();
    
    Query consulta = FachadaPersistencia.getInstancia().crearConsulta("Select a from Componente a where ( (a.nombre) LIKE :uno or (a.codigo) LIKE :dos ) and a.borrado=false" );
    consulta.setParameter("uno", "%"+tfNombre.getText()+"%");
    consulta.setParameter("dos", "%"+tfCodigo.getText()+"%");
     
    componentes= FachadaPersistencia.getInstancia().buscar(Componente.class, consulta);

    
    for (int i = 0; i < componentes.size(); i++) {
        tmBuscar.agregarFila(componentes.get(i));
    }
       
}//GEN-LAST:event_btBuscarProdTerminadoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btBuscarProdTerminado;
    private javax.swing.JButton btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pBoton;
    private javax.swing.JPanel pProductoTerminado;
    private javax.swing.JPanel pTablaComponentes;
    private org.jdesktop.swingx.JXTable tResultadoComponentes;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

}
