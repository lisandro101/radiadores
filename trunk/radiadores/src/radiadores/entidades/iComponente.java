package radiadores.entidades;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz genérica de componentes (materia prima, productos, etc.)
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
public interface iComponente extends Serializable {

//	public Proveedor mProveedor;

    /**
     * 
     * @param componente
     */
    public iComponente getComponente(String componente);

    public List<Proveedor> getProveedores();

}