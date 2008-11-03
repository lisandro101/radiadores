package radiadores;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import radiadores.entidades.Cargo;
import radiadores.igu.PantallaPrincipal;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */
public class Main {

    /**
     * 
     * @param args
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException {
        
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        
        
        PantallaPrincipal p = new PantallaPrincipal();
        
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        
        new Thread() {
            @Override
            public void run() {
                FachadaPersistencia.getInstancia().buscar(Cargo.class,
                        "SELECT c FROM Cargo c WHERE 0 > 1");
            }
            
        }.start();
    }

}
