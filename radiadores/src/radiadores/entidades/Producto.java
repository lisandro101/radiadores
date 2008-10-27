package radiadores.entidades;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Contiene los datos de un producto
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="productos")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo", discriminatorType=DiscriminatorType.CHAR)
@DiscriminatorValue("P")
public abstract class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String categoria;
    private String codigo;
    private String condicionesEmbalaje;
    private double costoAlmacenamiento;
    private double costoEmision;
    private double costoUnitarioOmision;
    private String descripcion;
    private String nombre;
    private String numeroPlano;
    private double pesoUnidad;
    private String politicaCompra;
    private double precioBase;
    private double tamanioLoteEstandar;
    private String unidadMedida;
    private String estado;
    private double stock;

    /**
     * Constructor
     */
    public Producto(){
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

    @Column(name="categoria", length=100)
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Column(name="codigo", length=20)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name="condiciones_embalaje", length=255)
    public String getCondicionesEmbalaje() {
        return condicionesEmbalaje;
    }

    public void setCondicionesEmbalaje(String condicionesEmbalaje) {
        this.condicionesEmbalaje = condicionesEmbalaje;
    }

    @Column(name="costo_almacenamiento")
    public double getCostoAlmacenamiento() {
        return costoAlmacenamiento;
    }

    public void setCostoAlmacenamiento(double costoAlmacenamiento) {
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    @Column(name="costo_emision")
    public double getCostoEmision() {
        return costoEmision;
    }

    public void setCostoEmision(double costoEmision) {
        this.costoEmision = costoEmision;
    }

    @Column(name="costo_unitario_omision")
    public double getCostoUnitarioOmision() {
        return costoUnitarioOmision;
    }

    public void setCostoUnitarioOmision(double costoUnitarioOmision) {
        this.costoUnitarioOmision = costoUnitarioOmision;
    }

    @Column(name="descripcion", length=100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name="nombre", length=100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="numero_plano", length=20)
    public String getNumeroPlano() {
        return numeroPlano;
    }

    public void setNumeroPlano(String numeroPlano) {
        this.numeroPlano = numeroPlano;
    }

    @Column(name="peso_unidad")
    public double getPesoUnidad() {
        return pesoUnidad;
    }

    public void setPesoUnidad(double pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    @Column(name="politica_compra", length=255)
    public String getPoliticaCompra() {
        return politicaCompra;
    }

    public void setPoliticaCompra(String politicaCompra) {
        this.politicaCompra = politicaCompra;
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
    
    @Column(name="stock")
    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}