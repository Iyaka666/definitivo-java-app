package clases_del_modelo;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Compra {

    private LocalDateTime registroCompra;
    private List<DetalleCompra> detallesDeCompra;
    private Empleado esteEmpleado;
    private Cliente esteCliente;
    
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
    
    public void setCliente(Cliente c){
        this.esteCliente = c;
    }

    public List<DetalleCompra> getDetallesDeCompra() {
        return detallesDeCompra;
    }

    public void addDetallesCompraByObject(DetalleCompra elemento) {
        detallesDeCompra.add(elemento);
    }

    public void removeDetalleCompraByIndex(int index) {
        detallesDeCompra.remove(index);
    }
    
    public void deleteAllDetallesCompra(){
        detallesDeCompra.removeAll(detallesDeCompra);
    }
    
    public DetalleCompra getElementDetallesCompraEn(int index){
        return detallesDeCompra.get(index);
    }

}
