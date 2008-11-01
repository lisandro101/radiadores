package radiadores;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import radiadores.entidades.Cargo;
import radiadores.igu.PantallaPrincipal;
import radiadores.persistencia.FachadaPersistencia;

/**
 *
 * @author Lisandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
            IllegalAccessException, UnsupportedLookAndFeelException {
        
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        
        
        FachadaPersistencia.getInstancia().buscar(Cargo.class, "Select c from Cargo c");
        
        
        PantallaPrincipal p = new PantallaPrincipal();
        
        p.setLocationRelativeTo(null);
        p.setSize(900, 690);
        p.setVisible(true);
    }

}
