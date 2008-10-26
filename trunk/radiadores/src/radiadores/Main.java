/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import radiadores.igu.PantallaPrincipal;

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
        
        PantallaPrincipal p = new PantallaPrincipal();
        
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        
        

    }

}
