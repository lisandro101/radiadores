package radiadores.igu;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import radiadores.entidades.CostoVariable;
import radiadores.entidades.Demanda;
import radiadores.entidades.ProductoTerminado;
import radiadores.entidades.PuntoEquilibrio;
import radiadores.gestores.GestorDemanda;
import radiadores.igu.model.DemandaTableModel;
import radiadores.utils.*;

/**
 *
 * @author  Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class PanelDemanda extends javax.swing.JDialog implements IValidable {
    private static final long serialVersionUID = 1L;

    private DemandaTableModel tmBuscar;
    private ProductoTerminado productoTerminado;
    List<Demanda> demandas;

    public enum Error {
        ERROR_MEDIO ("error medio"),
        ERROR_MEDIO_ABSOLUTO ("error medio absoluto"),
        ERROR_CUADRADO_MEDIO ("error cuadrado medio"),
        ERROR_PORCENTUAL_MEDIO ("error porcentual medio");


        private String nombre;

        private Error(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }

    private Error error;




    /** Creates new form PanelCargoEmpleado */
    public PanelDemanda() {
        initComponents();
        inicializar();
        btCalcular.setEnabled(false);
    }

    private void inicializar() {
        tmBuscar = new DemandaTableModel(0);
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

        errores = new javax.swing.ButtonGroup();
        pTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCargos = new org.jdesktop.swingx.JXTable();
        pProductoTerminado = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        btBuscarProdTerminado = new javax.swing.JButton();
        dpPeriodoInicial = new org.jdesktop.swingx.JXDatePicker();
        dpPeriodoFinal = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCargarPeriodos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbMedio = new javax.swing.JRadioButton();
        rbMedioAbsoluto = new javax.swing.JRadioButton();
        rbCuadradoMedio = new javax.swing.JRadioButton();
        rbPorcentualMedioAbsoluto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPM = new javax.swing.JTextField();
        tfPMP = new javax.swing.JTextField();
        tfPMSE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfconstanteAlfa = new javax.swing.JTextField();
        pBotones = new javax.swing.JPanel();
        btCalcular = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Demanda");

        pTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Periodo", "Demanda Real", "PM", "PMP", "PMSE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCargos);

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
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo)
                    .addComponent(lbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarProdTerminado)))
                .addContainerGap())
        );
        pProductoTerminadoLayout.setVerticalGroup(
            pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductoTerminadoLayout.createSequentialGroup()
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbCodigo)
                    .addComponent(btBuscarProdTerminado)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pProductoTerminadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dpPeriodoInicial.setFormats("MMMM aaaa");

        dpPeriodoFinal.setFormats("MMMM aaaa");

        jLabel1.setText("Periodo inicial");

        jLabel2.setText("Periodo final");

        btCargarPeriodos.setText("Cargar Periodos");
        btCargarPeriodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargarPeriodosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Error"));

        errores.add(rbMedio);
        rbMedio.setText("Medio");
        rbMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedioActionPerformed(evt);
            }
        });
        jPanel1.add(rbMedio);

        errores.add(rbMedioAbsoluto);
        rbMedioAbsoluto.setText("Medio Absoluto");
        jPanel1.add(rbMedioAbsoluto);

        errores.add(rbCuadradoMedio);
        rbCuadradoMedio.setText("Cuadrado Medio");
        rbCuadradoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCuadradoMedioActionPerformed(evt);
            }
        });
        jPanel1.add(rbCuadradoMedio);

        errores.add(rbPorcentualMedioAbsoluto);
        rbPorcentualMedioAbsoluto.setText("Porcentual Medio Absoluto");
        jPanel1.add(rbPorcentualMedioAbsoluto);

        jLabel3.setText("PM");

        jLabel4.setText("PMP");

        jLabel5.setText("PMSE");

        tfPM.setEditable(false);

        tfPMP.setEditable(false);

        tfPMSE.setEditable(false);
        tfPMSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPMSEActionPerformed(evt);
            }
        });

        jLabel6.setText("Constante de suavizado");

        javax.swing.GroupLayout pTablaLayout = new javax.swing.GroupLayout(pTabla);
        pTabla.setLayout(pTablaLayout);
        pTablaLayout.setHorizontalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addComponent(tfPMSE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfconstanteAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfPMP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
            .addComponent(pProductoTerminado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpPeriodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pTablaLayout.createSequentialGroup()
                        .addComponent(dpPeriodoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btCargarPeriodos)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        pTablaLayout.setVerticalGroup(
            pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTablaLayout.createSequentialGroup()
                .addComponent(pProductoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dpPeriodoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpPeriodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCargarPeriodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfPMSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfconstanteAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });
        pBotones.add(btCalcular);

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });
        pBotones.add(btCerrar);

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        pBotones.add(btLimpiar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
    dispose();
}//GEN-LAST:event_btCerrarActionPerformed

private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
    double alfa = Double.parseDouble(tfconstanteAlfa.getText());
    setError();

    if(GestorDemanda.getInstancia().validarConstanteAlfa(alfa) && GestorDemanda.getInstancia().validarPonderaciones(demandas)){
        tfPM.setText(String.valueOf(GestorDemanda.getInstancia().calcularPM(demandas)));
        tfPMP.setText(String.valueOf(GestorDemanda.getInstancia().calcularPMP(demandas)));
        tfPMP.setText(String.valueOf(GestorDemanda.getInstancia().calcularPMSE(demandas,alfa )));
    }else{
        if(GestorDemanda.getInstancia().validarConstanteAlfa(alfa)){
            JOptionPane.showMessageDialog(this, "La constante de suavizado esta fuera de rango [0-1]");
        }else if(GestorDemanda.getInstancia().validarPonderaciones(demandas)){
            JOptionPane.showMessageDialog(this, "La sumatoria de las constantes de ponderación no es igual a 1");
        }
    }
}//GEN-LAST:event_btCalcularActionPerformed

private void btBuscarProdTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProdTerminadoActionPerformed
//    PanelBuscarProductoGral buscarProv = new PanelBuscarProductoGral(this);
//
//    buscarProv.setModal(true);
//    buscarProv.setVisible(true);
}//GEN-LAST:event_btBuscarProdTerminadoActionPerformed

private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
 radiadores.utils.Util.getInstancia().limpiarCampos(this);
 productoTerminado=null;
 btCalcular.setEnabled(false);
}//GEN-LAST:event_btLimpiarActionPerformed

private void btCargarPeriodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargarPeriodosActionPerformed
    demandas= new ArrayList<Demanda>();
    Demanda demanda;
    Calendar cal = Calendar.getInstance();
    Date fechaInicial = dpPeriodoInicial.getDate();
    Date fechaFinal = dpPeriodoFinal.getDate();
    cal.setTime(fechaFinal);
    cal.add(Calendar.DAY_OF_MONTH, 30);
    Date fechaTemp = cal.getTime();
    
    if(fechaInicial != null & fechaFinal != null){
        if(fechaInicial.compareTo(fechaTemp)>0){
            JOptionPane.showMessageDialog(this, "El periodo inicial es mayor que el periodo final");
        }else{
            
            while(fechaInicial.compareTo(fechaFinal)<0){
                demanda= new Demanda();
                demanda.setPeriodo(fechaInicial);

            }
        }
    }
}//GEN-LAST:event_btCargarPeriodosActionPerformed

private void rbMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rbMedioActionPerformed

private void rbCuadradoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCuadradoMedioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_rbCuadradoMedioActionPerformed

private void tfPMSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPMSEActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_tfPMSEActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarProdTerminado;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCargarPeriodos;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btLimpiar;
    private org.jdesktop.swingx.JXDatePicker dpPeriodoFinal;
    private org.jdesktop.swingx.JXDatePicker dpPeriodoInicial;
    private javax.swing.ButtonGroup errores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pProductoTerminado;
    private javax.swing.JPanel pTabla;
    private javax.swing.JRadioButton rbCuadradoMedio;
    private javax.swing.JRadioButton rbMedio;
    private javax.swing.JRadioButton rbMedioAbsoluto;
    private javax.swing.JRadioButton rbPorcentualMedioAbsoluto;
    private org.jdesktop.swingx.JXTable tCargos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPM;
    private javax.swing.JTextField tfPMP;
    private javax.swing.JTextField tfPMSE;
    private javax.swing.JTextField tfconstanteAlfa;
    // End of variables declaration//GEN-END:variables

    @Override
    public List<Component> getComponentesObligatorios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
        cargarPantalla();
    }
    
    private void cargarPantalla(){
        radiadores.utils.Util.getInstancia().limpiarCampos(this);
        tfCodigo.setText(productoTerminado.getCodigo());
        tfNombre.setText(productoTerminado.getNombre());
        btCalcular.setEnabled(true);
        
    }

    private void setError(){
        if(rbMedio.isSelected()){
            error= Error.ERROR_MEDIO;
        }else if(rbMedioAbsoluto.isSelected()){
            error= Error.ERROR_MEDIO_ABSOLUTO;
        }else if(rbCuadradoMedio.isSelected()){
            error= Error.ERROR_CUADRADO_MEDIO;
        }else {
            error= Error.ERROR_PORCENTUAL_MEDIO;
        }
    }
}
