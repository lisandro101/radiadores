/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import radiadores.persistencia.IPersistente;

/**
 *
 * @author stafoxter
 */
@Entity
@Table(name="costos_fijos")
public class CostoFijo implements Serializable, IPersistente{
    private static final long serialVersionUID = 1L;
    private static final List<String> CAMPOS_UNICOS = new ArrayList<String>(0);

    
    private String id;
    private String concepto;
    private double importe;
    private boolean vigente;
    private boolean borrado;

    public CostoFijo(){
        setId(UUID.randomUUID().toString());
    }
    
    @Column(name="concepto", length=100)
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Id
    @Column(name="id", length=36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name="importe")
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    @Column(name="vigente")
    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    
    @Override
    public List<String> getCamposUnicos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    


}
