package radiadores.persistencia;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz que deben implementar todos los objetos persistentes
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
public interface IPersistente extends Serializable {
    
    /**
     * Devuelve una lista con los campos que deben ser únicos en la clase
     * 
     * @return Una lista con los campos que deben ser únicos en la clase
     */
    public List<String> getCamposUnicos();
}