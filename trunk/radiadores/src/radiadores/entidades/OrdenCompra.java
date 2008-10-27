package radiadores.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contiene los datos de una orden de compra
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="ordenes_de_compra")
public class OrdenCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private Proveedor proveedor;
    private Date fecha;
    private Date fechaEstimadaEntrega;
    private List<DetalleOrdenCompra> detallesOrdenCompra;

    /**
     * Constructor
     */
    public OrdenCompra(){
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
    
    @ManyToOne(targetEntity=Proveedor.class, cascade=CascadeType.ALL)
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Column(name="fecha")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column(name="fecha_estimada_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(Date fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    @OneToMany(targetEntity=DetalleOrdenCompra.class, cascade=CascadeType.ALL,
    mappedBy="ordenCompra")
    public List<DetalleOrdenCompra> getDetallesOrdenCompra() {
        return detallesOrdenCompra;
    }

    public void setDetallesOrdenCompra(List<DetalleOrdenCompra> detallesOrdenCompra) {
        this.detallesOrdenCompra = detallesOrdenCompra;
    }
}