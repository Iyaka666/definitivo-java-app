package clases_del_modelo;

import com.sun.jdi.ObjectCollectedException;
import exceptions.ThisIsRegisteredException;
import exceptions.ObjectNotFoundException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marlon
 */
public class Almacen {

    private List<Cliente> misClientes = new LinkedList<>();
    private List<Empleado> misEmpleados = new LinkedList<>();
    private List<Compra> misCompras = new LinkedList<>();
    private List<Producto> misProductos = new LinkedList<>();
    private List<TipoProducto> misTiposProductos = new LinkedList<>();

    public Almacen() {
    }

    public void addNewCliente(Cliente c) throws Exception {
        if (this.misClientes.contains(c)) {
            throw new ThisIsRegisteredException("El cliente con identificicion"
                    + c.getIdentificador() + " ya se encuentra registrado");
        }
        misClientes.add(c);
    }

    public Cliente findCustomerByID(long id) throws ObjectNotFoundException {
        for (Cliente c : this.misClientes) {
            if (c.getIdentificador() == id) {
                return c;
            }
        }
        throw new ObjectNotFoundException(
                "El cliente con identificacion " + id + "no fue encontrado");
    }

    public void removeCliente(Cliente c) {
        misClientes.remove(c);
    }

    public void addNewEmpleado(Empleado e) {
        misEmpleados.add(e);
    }

    public Empleado findEmpleadoById(long id) throws Exception {
        for (Empleado e : this.misEmpleados) {
            if (e.getIdentificador() == id) {
                return e;
            }
        }
        throw new ObjectNotFoundException("El empleado con identificacion " + id
                + " no se encuentra registrado");
    }

    public Empleado findEmpleadoByUser(String user) throws Exception {
        for (Empleado e : this.misEmpleados) {
            if (e.getUsuario().equals(user)) {
                return e;
            }
        }
        throw new ObjectNotFoundException("Usuario : "+user+"No esta registrado\nInforme a superusuario para agregarlo");
    }

    public void removeEmpleado(Empleado e) {
        misEmpleados.remove(e);
    }

    public void addNewCompra(Compra c) {
        misCompras.add(c);
    }

    public void removeCompra(Compra c) {
        misCompras.remove(c);
    }

    public void addNewProducto(Producto p) throws Exception {
        if (this.misProductos.contains(p)) {
            throw new ThisIsRegisteredException("El cliente con codigo "
                    + p.getCodigo() + "ya se encuentra registrado");
        }
        misProductos.add(p);
    }

    public Producto findProductByCode(long code) throws Exception {
        for (Producto p : this.misProductos) {
            if (p.getCodigo() == code) {
                return p;
            }
        }
        throw new ObjectNotFoundException("El producto con codigo " + code
                + "no se encuentra registrado");
    }

    public List<Producto> getMisProductos() {
        return misProductos;
    }

    public void removeProducto(Producto p) {
        misProductos.remove(p);
    }

    public void addNewTipoProducto(TipoProducto tP) {
        misTiposProductos.add(tP);
    }

    public void removeTipoProducto(TipoProducto tP) {
        misTiposProductos.remove(tP);
    }

    public List<TipoProducto> getTiposDeProductos() {
        return misTiposProductos;
    }
}
