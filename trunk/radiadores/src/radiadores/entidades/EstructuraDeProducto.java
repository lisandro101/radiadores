package radiadores.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Contiene los datos de la estructura del producto
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="estructuras_de_productos")
public class EstructuraDeProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private List<ParteDeEstructura> partes;
    private ProductoTerminado productoTerminado;
    private iComponente componente;
    private boolean borrado;

    /**
     * Constructor
     */
    public EstructuraDeProducto(){
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
    
    @OneToMany(targetEntity=ParteDeEstructura.class, cascade=CascadeType.ALL,
    mappedBy="estructura")
    public List<ParteDeEstructura> getPartes() {
        return partes;
    }

    public void setPartes(List<ParteDeEstructura> partes) {
        this.partes = partes;
    }

    @ManyToOne(targetEntity=ProductoTerminado.class, cascade=CascadeType.ALL)
    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }

    @ManyToOne(targetEntity=iComponente.class, cascade=CascadeType.ALL)
    public iComponente getComponente() {
        return componente;
    }

    public void setComponente(iComponente componente) {
        this.componente = componente;
    }
    
    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}