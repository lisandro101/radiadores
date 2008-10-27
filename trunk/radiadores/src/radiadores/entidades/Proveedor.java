package radiadores.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contiene los datos de un proveedor
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String direccion;
    private Date fechaInicioActividad;
    private String mail;
    private String nombreContacto;
    private String nombreProveedor;
    private String telefono;
    private List<OrdenCompra> ordenesCompra;
    private List<iComponente> componentes; 

    /**
     * Constructor
     */
    public Proveedor(){
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

    @Column(name="direccion", length=100)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name="fecha_inicio_actividad")
    @Temporal(TemporalType.DATE)
    public Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    @Column(name="mail", length=100)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Column(name="nombre_contacto", length=100)
    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Column(name="nombre_proveedor", length=100)
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    @Column(name="telefono", length=15)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}