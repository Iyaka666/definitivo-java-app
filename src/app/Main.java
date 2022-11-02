/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Store;
import model.Customer;
import model.Employee;
import model.Gender;
import model.Product;
import model.TypeProduct;
import gui.MainUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Store newStore = new Store();
        try {
            //Valores de prueba
            //Clientes
            newStore.addNewCustomer(new Customer(333533336L, "a@b.com", 100302100L,
                    "Carlos", "Rodriguez", Gender.MALE));
            newStore.addNewCustomer(new Customer(362703921L, "b@c.com", 111302100L,
                    "Maria", "Sepulveda", Gender.FEMALE));
            newStore.addNewCustomer(new Customer(333533336L, "g@g.com", 100300000L,
                    "Marlon", "malagana", Gender.MALE));
            
            //Tipos de Productos
            TypeProduct tP1 = new TypeProduct("Bebidas azucaradas", 0.05);
            TypeProduct tP2 = new TypeProduct("Canasta familiar", 0.0);
            TypeProduct tP3 = new TypeProduct("No esenciales", 0.19);
            
            newStore.addNewTypeProduct( tP1 );

            newStore.addNewTypeProduct( tP2 );

            newStore.addNewTypeProduct( tP3 );
            
            //Producto
            newStore.addNewProduct(new Product(121212, "cepillo", 3000.0, tP3));
            newStore.addNewProduct(new Product(101010, "tequila silver", 177000.0, tP3));
            newStore.addNewProduct(new Product(131313, "whiski burchanans", 200000.0, tP3));
            
            //Empleados
            newStore.addNewEmployee(new Employee("Maicol", "1234", 1000678, "Maicol Angel", "Castañeda Ipial", Gender.MALE));
            newStore.addNewEmployee(new Employee("Carla", "5678", 1000123, "carla Angela", "Fernandez Sepulveda", Gender.FEMALE));
            newStore.addNewEmployee(new Employee("Maria", "1357", 1000456, "Maria Alejandra", "Carreño Moreno", Gender.FEMALE));
            //------------------------------------------------------------------
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        new MainUI(newStore).setVisible(true);
    }

}
