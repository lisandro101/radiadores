/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.gestores;

import java.util.List;
import radiadores.entidades.Demanda;

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

    public double calcularPM(List<Demanda> demandas){
        int n=0;
        double total=0.0;
        for (Demanda demanda : demandas) {
            total += demanda.getDemandaReal();
            ++n;
        }
        return (total/n);
    }

    public double calcularPMP(List<Demanda> demandas){
        double total=0.0;
        for (Demanda demanda : demandas) {
            total += demanda.getDemandaReal()* demanda.getPMP();
        }
        return total;
    }
    
    public double calcularPMSE(List<Demanda> demandas, double alfa){


        return 666;
    }

    public boolean validarConstanteAlfa(double constante){
        if(constante>=0 && constante<=1){
            return true;
        }
        return false;
    }

    public boolean validarPonderaciones(List<Demanda> demandas){
        double total=0.0;
        for (Demanda demanda : demandas) {
            total +=  demanda.getPMP();
        }
        if(total>=0 && total<=1){
            return true;
        }
        return false;
    }
}
