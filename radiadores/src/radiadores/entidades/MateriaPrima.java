package radiadores.entidades;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contiene los datos de la materia prima
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="materias_primas")
@DiscriminatorValue("M")
public class MateriaPrima extends Componente implements Serializable {
    
    public enum Estado {
        VIGENTE ("Vigente"),
        NO_VIGENTE ("No vigente");
        
        private String nombre;
        
        private Estado(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
    
    private static final long serialVersionUID = 1L;
    private static final List<String> CAMPOS_UNICOS = Arrays.asList(
            "nombre", "codigo");
    
    private double costoAlmacenamiento;
    private double costoUnitarioPorOmision;
    private String descripcion;
    private double pesoPorUnidad;
    private double precioBase;
    private double tamanioLoteEstandar;
    private Estado estado;

    @Column(name="costo_almacenamiento")
    public double getCostoAlmacenamiento() {
        return costoAlmacenamiento;
    }

    public void setCostoAlmacenamiento(double costoAlmacenamiento) {
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    @Column(name="costo_unitario_por_omision")
    public double getCostoUnitarioPorOmision() {
        return costoUnitarioPorOmision;
    }

    public void setCostoUnitarioPorOmision(double costoUnitarioPorOmision) {
        this.costoUnitarioPorOmision = costoUnitarioPorOmision;
    }

    @Column(name="descripcion", length=100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Column(name="peso_por_unidad")
    public double getPesoPorUnidad() {
        return pesoPorUnidad;
    }

    public void setPesoPorUnidad(double pesoPorUnidad) {
        this.pesoPorUnidad = pesoPorUnidad;
    }

    @Column(name="precio_base")
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Column(name="tamanio_lote_estandar")
    public double getTamanioLoteEstandar() {
        return tamanioLoteEstandar;
    }

    public void setTamanioLoteEstandar(double tamanioLoteEstandar) {
        this.tamanioLoteEstandar = tamanioLoteEstandar;
    }
  
    @Column(name="estado")
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
