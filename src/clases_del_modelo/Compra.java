package clases_del_modelo;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Compra {

    private LocalDateTime registroCompra;
    private List<DetalleCompra> detallesDeCompra = new LinkedList<DetalleCompra>();
    private Empleado esteEmpleado;
    private Cliente esteCliente;

    public Compra() {
    }

    public Compra(LocalDateTime registroCompra, Empleado empleado) {
        this.registroCompra = registroCompra;
        this.esteEmpleado = empleado;
    }

    public LocalDateTime getRegistroCompra() {
        return registroCompra;
    }

    public Empleado getEsteEmpleado() {
        return esteEmpleado;
    }

    public Cliente getEsteCliente() {
        return esteCliente;
    }

    public void addElementToDetallesCompra(DetalleCompra elemento) {
        detallesDeCompra.add(elemento);
    }

    public void removeElementToDetallesCompra(DetalleCompra elemento) {
        detallesDeCompra.remove(elemento);
    }

    public DetalleCompra findDetalleCompra(DetalleCompra dC) {
        for (DetalleCompra otherDC : this.detallesDeCompra) {
            if (otherDC.getEsteProducto().getNombre() == dC.getEsteProducto().getNombre()) {
                return otherDC;
            }
        }
        return null;
    }

}