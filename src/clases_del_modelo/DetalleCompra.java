package clases_del_modelo;

/**
 *
 * @author Marlon
 */
public class DetalleCompra {

    private byte cantidad;
    private Double costoCompra;
    private Double valorIva;
    private Producto esteProducto;

    public DetalleCompra(byte cantidad, Producto esteProducto) {
        this.esteProducto = esteProducto;
        this.cantidad = cantidad;
        this.valorIva = this.esteProducto.getTipoProducto().getPorcentajeIva();        
        this.costoCompra = this.esteProducto.getCosto() + (this.esteProducto.getCosto() * this.valorIva);
    }

    public byte getCantidad() {
        return cantidad;
    }

    public Double getCostoCompra() {
        return costoCompra;
    }

    public Double getValorIva() {
        return valorIva;
    }

    public Producto getEsteProducto() {
        return esteProducto;
    }

}
