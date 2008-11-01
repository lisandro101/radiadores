package radiadores.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contiene la información de una línea de una orden de compra
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="detalles_ordenes_de_compra")
public class DetalleOrdenCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private int cantidad;
    private Componente componente;
    private OrdenCompra ordenCompra;
    private boolean borrado;

    /**
     * Constructor
     */
    public DetalleOrdenCompra() {
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

    @Column(name="cantidad")
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @JoinColumn(name="componente_id")
    @ManyToOne(targetEntity=Componente.class, cascade=CascadeType.ALL)
    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    @JoinColumn(name="orden_de_compra_id")
    @ManyToOne(targetEntity=OrdenCompra.class, cascade=CascadeType.ALL)
    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }
    
    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}