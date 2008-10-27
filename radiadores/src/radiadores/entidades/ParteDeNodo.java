/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package radiadores.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contiene los datos de un componente de un nodo, puede ser una materia prima,
 * un producto, etc.
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="partes_de_nodo")
public class ParteDeNodo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private iComponente componente;
    private int cantidad;
    private boolean borrado;
    private NodoRuta nodoRuta;
    
    /**
     * Constructor
     */
    public ParteDeNodo() {
        setId(UUID.randomUUID().toString());
    }

    /**
     * Devuelve el identificador único de la clase
     * 
     * @return El identificador único de la clase
     */
    @Id
    @Column(name="id", length=36)
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador único de la clase
     * 
     * @param id Nuevo valor del identificador único de la clase
     */
    public void setId(String id) {
        this.id = id;
    }
    
    @ManyToOne(targetEntity=iComponente.class, cascade=CascadeType.ALL)
    public iComponente getComponente() {
        return componente;
    }

    public void setComponente(iComponente componente) {
        this.componente = componente;
    }

    @Column(name="cantidad")
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    @ManyToOne(targetEntity=NodoRuta.class, cascade=CascadeType.ALL)
    public NodoRuta getNodoRuta() {
        return nodoRuta;
    }

    public void setNodoRuta(NodoRuta nodoRuta) {
        this.nodoRuta = nodoRuta;
    }
}