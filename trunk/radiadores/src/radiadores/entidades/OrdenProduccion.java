package radiadores.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import radiadores.persistencia.IPersistente;

/**
 * Contiene los datos de una orden de producción
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="ordenes_de_produccion")
public class OrdenProduccion implements Serializable, IPersistente {
    private static final long serialVersionUID = 1L;
    private static final List<String> CAMPOS_UNICOS = new ArrayList<String>(0);
    
    private String id;
    private Date fecha;
    private Date fechaEstimadaEntrega;
    private String nombreCliente;
    private List<DetalleOrdenProduccion> detallesOrdenProduccion;
    private boolean borrado;
    private String nroOrdenProduccion;
    
    /**
     * Constructor
     */
    public OrdenProduccion(){
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

    @Column(name="nombre_cliente", length=100)
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @OneToMany(targetEntity=DetalleOrdenProduccion.class,
    cascade=CascadeType.ALL, mappedBy="ordenProduccion")
    public List<DetalleOrdenProduccion> getDetallesOrdenProduccion() {
        return detallesOrdenProduccion;
    }

    public void setDetallesOrdenProduccion(List<DetalleOrdenProduccion> detalles) {
        this.detallesOrdenProduccion = detalles;
    }

    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    @Override
    @Transient
    public List<String> getCamposUnicos() {
        return CAMPOS_UNICOS;
    }
    
    @Column(name="nro_orden_produccion", length=100)
    public String getNroOrdenProduccion() {
        return nroOrdenProduccion;
    }

    public void setNroOrdenProduccion(String nroOrden) {
        this.nroOrdenProduccion = nroOrden;
    }
}