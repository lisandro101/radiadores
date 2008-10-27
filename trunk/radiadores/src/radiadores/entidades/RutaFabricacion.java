package radiadores.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Contiene los datos de una ruta de fabricación
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="rutas_de_fabricacion")
public class RutaFabricacion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nombre;
    private ProductoTerminado productoTerminado;
    private List<NodoRuta> nodosRuta;
    private boolean borrado;

    /**
     * Constructor
     */
    public RutaFabricacion(){
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

    @Column(name="nombre", length=100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JoinColumn(name="producto_terminado_id")
    @OneToOne(targetEntity=ProductoTerminado.class, cascade=CascadeType.ALL)
    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }

    @OneToMany(targetEntity=NodoRuta.class, cascade=CascadeType.ALL,
    mappedBy="rutaFabricacion")
    public List<NodoRuta> getNodosRuta() {
        return nodosRuta;
    }

    public void setNodosRuta(List<NodoRuta> nodosRuta) {
        this.nodosRuta = nodosRuta;
    }
    
    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}