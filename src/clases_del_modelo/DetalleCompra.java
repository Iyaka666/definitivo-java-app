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

    public DetalleCompra(byte cantidad, Producto esteProducto) throws Exception{
        this.esteProducto = esteProducto;
        if(!(cantidad>=0 && cantidad <= 127)){
            throw new NumberFormatException("La cantidad solo acepta valores desde 0 hasta 127");
        }
        this.cantidad = cantidad;
        this.valorIva = this.esteProducto.getCosto() * this.esteProducto.getTipoProducto().getPorcentajeIva();        
        this.costoCompra = (this.esteProducto.getCosto() + this.valorIva) * this.cantidad;
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
