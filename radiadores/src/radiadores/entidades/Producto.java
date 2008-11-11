package radiadores.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contiene los datos de un producto
 * 
 * @author Franco Catena, Mario Mariani, Lisandro Nieto, Sebastián Torres
 * @version 1.0
 */
@Entity
@Table(name="productos")
@DiscriminatorValue("P")
public abstract class Producto extends Componente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String categoria;
    private String condicionesEmbalaje;
    private double costoAlmacenamiento;
    private double costoEmision;
    private double costoUnitarioOmision;
    private String descripcion;
//    private String nombre;
    private String numeroPlano;
    private double pesoUnidad;
    private String politicaCompra;
    private double precioBase;
    private double tamanioLoteEstandar;
    private String unidadMedida;
    private String estado;
    
    private boolean borrado;

    @Column(name="categoria", length=100)
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

//    @Column(name="nombre", length=100)
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

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
    
   
    
    @Column(name="borrado")
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
}