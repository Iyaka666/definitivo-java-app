/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases_del_modelo.Almacen;
import clases_del_modelo.Cliente;
import clases_del_modelo.Genero;
import clases_del_modelo.Producto;
import clases_del_modelo.TipoProducto;
import interfaces_de_usuario.MainUI;
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

        Almacen newStore = new Almacen();
        try {
            //Valores de prueba
            //Clientes
            newStore.addNewCliente( new Cliente(333533336L, "a@b.com", 100302100L,
                    "Carlos", "Rodriguez", Genero.MASCULINO));
            newStore.addNewCliente( new Cliente(362703921L, "b@c.com", 111302100L,
                    "Maria", "Sepulveda", Genero.FEMENINO));
            newStore.addNewCliente( new Cliente(333533336L, "g@g.com", 100300000L,
                    "Marlon", "malagana", Genero.MASCULINO));
            
            //Tipos de Productos
            TipoProducto tP1 = new TipoProducto("Bebidas azucaradas", 0.05);
            TipoProducto tP2 = new TipoProducto("Canasta familiar", 0.0);
            TipoProducto tP3 = new TipoProducto("No esenciales", 0.19);
            
            newStore.addNewTipoProducto( tP1 );

            newStore.addNewTipoProducto( tP2 );

            newStore.addNewTipoProducto( tP3 );
            
            //Producto
            newStore.addNewProducto( new Producto(121212, "cepillo", 3000.0, tP3));
            newStore.addNewProducto( new Producto(101010, "tequila silver", 177000.0, tP3));
            newStore.addNewProducto( new Producto(131313, "whiski burchanans", 200000.0, tP3));
            //------------------------------------------------------------------
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        new MainUI(newStore).setVisible(true);
    }

}
