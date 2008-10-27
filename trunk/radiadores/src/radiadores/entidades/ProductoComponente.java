package radiadores.entidades;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Lisandro
 * @version 1.0
 * @created 21-oct-2008 12:47:04 a.m.
 */
@Entity
@Table(name="productos_componente")
@DiscriminatorValue("C")
public class ProductoComponente extends Producto {
    private static final long serialVersionUID = 1L;
    
    private List<Proveedor> proveedores;

    public ProductoComponente(){
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
}
