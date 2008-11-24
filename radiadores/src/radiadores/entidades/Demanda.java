/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.entidades;

import java.util.Date;

/**
 *
 * @author stafoxter
 */
public class Demanda {

    private ProductoTerminado productoTerminado;
    private Date periodo;
    private double demandaReal;
    private double pM;
    private double pMP;
    private double pMSE;

    public double getDemandaReal() {
        return demandaReal;
    }

    public void setDemandaReal(double demandaReal) {
        this.demandaReal = demandaReal;
    }

    public double getPM() {
        return pM;
    }

    public void setPM(double pM) {
        this.pM = pM;
    }

    public double getPMP() {
        return pMP;
    }

    public void setPMP(double pMP) {
        this.pMP = pMP;
    }

    public double getPMSE() {
        return pMSE;
    }

    public void setPMSE(double pMSE) {
        this.pMSE = pMSE;
    }

    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }
    
    
}
