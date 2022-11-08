package model;

import exceptions.ThisIsRegisteredException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Purchase {

    private LocalDateTime dateTimePurchase;
    private List<DetailPurchase> detailsPurchase = new ArrayList<>(1);
    private Employee employee;
    private Customer customer;
    
    public Purchase(Employee employee) throws Exception {
        this.employee = employee;
    }
    
    public LocalDateTime getDataTimePurchase() {
        return dateTimePurchase;
    }
    
    public void setDateTimePurchase(LocalDateTime lDT){
        this.dateTimePurchase = lDT;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public List<DetailPurchase> getDetailsPurchase(){
        return detailsPurchase;
    }

    public void addDetailsPurchaseByObject(DetailPurchase dP) throws Exception{
        if(detailsPurchase.contains(dP)){
            throw new ThisIsRegisteredException("This detail of purchase already exist");
        }
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
