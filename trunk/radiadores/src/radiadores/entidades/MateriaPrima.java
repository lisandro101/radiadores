package radiadores.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Contiene los datos de la materia prima
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="materias_primas")
public class MateriaPrima implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String codigo;
    private double costoAlmacenamiento;
    private double costoUnitarioPorOmision;
    private String descripcion;
    private String nombreMateriaPrima;
    private double pesoPorUnidad;
    private double precioBase;
    private List<Proveedor> proveedores;
    private double tamanioLoteEstandar;
    private String unidadMedida;
    private String estado;

    public MateriaPrima(){
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

    @Column(name="codigo", length=20)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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

    @Column(name="nombre_materia_prima")
    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
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

    @OneToMany(targetEntity=Proveedor.class, cascade=CascadeType.ALL)
    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    @Column(name="tamanio_lote_estandar")
    public double getTamanioLoteEstandar() {
        return tamanioLoteEstandar;
    }

    public void setTamanioLoteEstandar(double tamanioLoteEstandar) {
        this.tamanioLoteEstandar = tamanioLoteEstandar;
    }

    @Column(name="unidad_medida", length=20)
    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    @Column(name="estado", length=20)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}