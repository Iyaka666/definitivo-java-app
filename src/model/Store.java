package model;

import com.sun.jdi.ObjectCollectedException;
import exceptions.ThisIsRegisteredException;
import exceptions.ObjectNotFoundException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Store {

    private List<Customer> misClientes = new LinkedList<>();
    private List<Employee> misEmpleados = new LinkedList<>();
    private List<Purchase> misCompras = new LinkedList<>();
    private List<Product> misProductos = new LinkedList<>();
    private List<TypeProduct> misTiposProductos = new LinkedList<>();

    public Store() {
    }

    public void addNewCliente(Customer c) throws Exception {
        if (this.misClientes.contains(c)) {
            throw new ThisIsRegisteredException("El cliente con identificicion"
                    + c.getIdentificador() + " ya se encuentra registrado");
        }
        misClientes.add(c);
    }

    public Customer findCustomerByID(long id) throws ObjectNotFoundException {
        for (Customer c : this.misClientes) {
            if (c.getIdentificador() == id) {
                return c;
            }
        }
        throw new ObjectNotFoundException(
                "El cliente con identificacion " + id + "no fue encontrado");
    }

    public void removeCliente(Customer c) {
        misClientes.remove(c);
    }

    public void addNewEmpleado(Employee e) {
        misEmpleados.add(e);
    }

    public Employee findEmpleadoById(long id) throws Exception {
        for (Employee e : this.misEmpleados) {
            if (e.getIdentificador() == id) {
                return e;
            }
        }
        throw new ObjectNotFoundException("El empleado con identificacion " + id
                + " no se encuentra registrado");
    }

    public Employee findEmpleadoByUser(String user) throws Exception {
        for (Employee e : this.misEmpleados) {
            if (e.getUsuario().equals(user)) {
                return e;
            }
        }
        throw new ObjectNotFoundException("Usuario : "+user+"No esta registrado\nInforme a superusuario para agregarlo");
    }

    public void removeEmpleado(Employee e) {
        misEmpleados.remove(e);
    }

    public void addNewCompra(Purchase c) {
        misCompras.add(c);
    }

    public void removeCompra(Purchase c) {
        misCompras.remove(c);
    }

    public void addNewProducto(Product p) throws Exception {
        if (this.misProductos.contains(p)) {
            throw new ThisIsRegisteredException("El cliente con codigo "
                    + p.getCodigo() + "ya se encuentra registrado");
        }
        misProductos.add(p);
    }

    public Product findProductByCode(long code) throws Exception {
        for (Product p : this.misProductos) {
            if (p.getCodigo() == code) {
                return p;
            }
        }
        throw new ObjectNotFoundException("El producto con codigo " + code
                + "no se encuentra registrado");
    }

    public List<Product> getMisProductos() {
        return misProductos;
    }

    public void removeProducto(Product p) {
        misProductos.remove(p);
    }

    public void addNewTipoProducto(TypeProduct tP) {
        misTiposProductos.add(tP);
    }

    public void removeTipoProducto(TypeProduct tP) {
        misTiposProductos.remove(tP);
    }

    public List<TypeProduct> getTiposDeProductos() {
        return misTiposProductos;
    }
}
