package model;

import exceptions.ThisIsRegisteredException;
import exceptions.ObjectNotFoundException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Store {
    private List<Customer> customers = new LinkedList<>();
    private List<Employee> employees = new LinkedList<>();
    private List<Purchase> purchases = new LinkedList<>();
    private List<Product> products = new LinkedList<>();
    private List<TypeProduct> typeProducts = new LinkedList<>();

    public Store() {
    }

    public void addNewCustomer(Customer c) throws Exception {
        if (this.customers.contains(c)) {
            throw new ThisIsRegisteredException("Customer with identification "
                    + c.getIdentification() + " already this have been registered");
        }
        customers.add(c);
    }

    public Customer findCustomerByID(long id) throws ObjectNotFoundException {
        for (Customer c : this.customers) {
            if (c.getIdentification() == id) {
                return c;
            }
        }
        throw new ObjectNotFoundException(
                "Customer with identification " + id + " not found");
    }

    public void removeCustomer(Customer c) {
        customers.remove(c);
    }

    public void addNewEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findEmployeeById(long id) throws Exception {
        for (Employee e : this.employees) {
            if (e.getIdentification() == id) {
                return e;
            }
        }
        throw new ObjectNotFoundException("Employee with identification " + id
                + " not found");
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public void addNewPurchase(Purchase c) {
        purchases.add(c);
    }

    public void removePurchase(Purchase c) {
        purchases.remove(c);
    }

    public void addNewProduct(Product p) throws Exception {
        if (this.products.contains(p)) {
            throw new ThisIsRegisteredException("Product with code "
                    + p.getCode() + " already this have been registered");
        }
        products.add(p);
    }

    public Product findProductByCode(long code) throws Exception {
        for (Product p : this.products) {
            if (p.getCode() == code) {
                return p;
            }
        }
        throw new ObjectNotFoundException("Product with code " + code
                + "not found");
    }

    public List<Product> getProducts() {
        return products;
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public void addNewTypeProduct(TypeProduct tP) {
        typeProducts.add(tP);
    }

    public void removeTypeProduct(TypeProduct tP) {
        typeProducts.remove(tP);
    }

    public List<TypeProduct> getTypeProducts() {
        return typeProducts;
    }
}
