package radiadores.igu.model;

import javax.swing.AbstractListModel;
import radiadores.entidades.Maquina;

/**
 *
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 */

public class UnidadMedidaTableModel extends AbstractListModel implements IModeloReiniciable {
    private static final long serialVersionUID = 1L;

    
    public enum Unidad{
        CENTIMETRO ("cm"),
        METRO ("m"),
        CENTIMETRO_2 ("cm2"),
        METRO_2 ("m2"),
        CENTIMETRO_3 ("cm3"),
        METRO_3 ("m3"),
        LITRO ("l"),
        GRAMO ("gr"),
        KILOGRAMO ("Kg"),
        UNIDAD ("unid");
        
        private String unidad;
        
        private Unidad(String nombre) {
            this.unidad = nombre;
        }

        @Override
        public String toString() {
            return unidad;
        }
    }
    
    @Override
    public int getSize() {
        return Unidad.values().length;
    }

    @Override
    public Object getElementAt(int index) {
//        Object resultado = null;
        

//        switch(index) {
//            case 0:
//                resultado = Unidad.CENTIMETRO;
//                break;
//            case 1:
//                resultado = Unidad.METRO;
//                break;
//            case 2:
//                resultado = Unidad.CENTIMETRO_2;
//                break;
//            case 3:
//                resultado = Unidad.METRO_2;
//                break;
//            case 4:
//                resultado = Unidad.CENTIMETRO_3;
//                break;
//            case 5:
//                resultado = Unidad.METRO_3;
//                break;
//            case 6:
//                resultado = Unidad.LITRO;
//                break;
//            case 7:
//                resultado = Unidad.GRAMO;
//                break;
//            case 8:
//                resultado = Unidad.KILOGRAMO;
//                break;
//            case 9:
//                resultado = Unidad.UNIDAD;
//                break;    
//        }
//        return resultado;
        return Unidad.values()[index];
    }
    
    @Override
    public void reiniciar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    

}