package model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Purchase {

    private LocalDateTime registroCompra;
    private List<DetailPurchase> detallesDeCompra;
    private Employee esteEmpleado;
    private Customer esteCliente;
    
    public Purchase(LocalDateTime registroCompra, Employee empleado) {
        this.registroCompra = registroCompra;
        this.esteEmpleado = empleado;
    }

    public LocalDateTime getRegistroCompra() {
        return registroCompra;
    }

    public Employee getEsteEmpleado() {
        return esteEmpleado;
    }

    public Customer getEsteCliente() {
        return esteCliente;
    }
    
    public void setCliente(Customer c){
        this.esteCliente = c;
    }

    public List<DetailPurchase> getDetallesDeCompra() {
        return detallesDeCompra;
    }

    public void addDetallesCompraByObject(DetailPurchase elemento) {
        detallesDeCompra.add(elemento);
    }

    public void removeDetalleCompraByIndex(int index) {
        detallesDeCompra.remove(index);
    }
    
    public void deleteAllDetallesCompra(){
        detallesDeCompra.removeAll(detallesDeCompra);
    }
    
    public DetailPurchase getElementDetallesCompraEn(int index){
        return detallesDeCompra.get(index);
    }

}
