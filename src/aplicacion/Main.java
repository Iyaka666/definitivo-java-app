/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import clases_del_modelo.Almacen;
import clases_del_modelo.Cliente;
import clases_del_modelo.Genero;
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
            Cliente cliente1 = new Cliente(333533336L, "a@b.com", 100302100L,
                    "Carlos", "Rodriguez", Genero.MASCULINO);
            Cliente cliente2 = new Cliente(362703921L, "b@c.com", 111302100L,
                    "Maria", "Sepulveda", Genero.FEMENINO);
            Cliente cliente3 = new Cliente(333533336L, "g@g.com", 100300000L,
                    "Marlon", "malagana", Genero.MASCULINO);
            //------------------------------------------------------------------
            newStore.addNewCliente(cliente1);
            newStore.addNewCliente(cliente2);
            newStore.addNewCliente(cliente3);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        new MainUI(newStore).setVisible(true);
    }

}
