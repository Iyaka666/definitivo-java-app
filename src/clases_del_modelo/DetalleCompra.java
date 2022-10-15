package clases_del_modelo;

/**
 *
 * @author Marlon
 */
public class DetalleCompra {

    private byte cantidad;
    private int costoCompra;
    private float valorIva;
    private Producto esteProducto;

    public DetalleCompra(byte cantidad, int costoCompra, float valorIva, Producto esteProducto) {
        this.cantidad = cantidad;
        this.costoCompra = costoCompra;
        this.valorIva = valorIva;
        this.esteProducto = esteProducto;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public int getCostoCompra() {
        return costoCompra;
    }

    public float getValorIva() {
        return valorIva;
    }

    public Producto getEsteProducto() {
        return esteProducto;
    }

}
