/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;

/**
 *
 * @author stafoxter
 */
public class GestorDemanda {
    
    private static GestorDemanda instancia;
    
    public synchronized static GestorDemanda getInstancia(){
        if (instancia == null){
            instancia = new GestorDemanda();
        }
        return instancia;            
    }
    private GestorDemanda(){
        
    }

    public double calcularPM(){
        return 666;
    }

    public double calcularPMP(){
        return 666;
    }
    
    public double calcularPMSE(){
        return 666;
    }
}
