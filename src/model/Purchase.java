package model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Purchase {

    private LocalDateTime dataTimePurchase;
    private List<DetailPurchase> detailsPurchase;
    private Employee employee;
    private Customer customer;
    
    public Purchase(LocalDateTime dataTimePurchase, Employee employee) {
        this.dataTimePurchase = dataTimePurchase;
        this.employee = employee;
    }

    public LocalDateTime getDataTimePurchase() {
        return dataTimePurchase;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer c){
        this.customer = c;
    }

    public List<DetailPurchase> getDetailsPurchase() {
        return detailsPurchase;
    }

    public void addDetailsPurchaseByObject(DetailPurchase dP) {
        detailsPurchase.add(dP);
    }

    public void removeDetailPurchaseByIndex(int index) {
        detailsPurchase.remove(index);
    }
    
    public void deleteAllDetailsPurchase(){
        detailsPurchase.removeAll(detailsPurchase);
    }
    
    public DetailPurchase getElementDetailsPurchaseAt(int index){
        return detailsPurchase.get(index);
    }

}
