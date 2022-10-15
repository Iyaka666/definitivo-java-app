/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_de_usuario;

import clases_del_modelo.Almacen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author carbonera
 */
public class MainUI extends javax.swing.JFrame {

    private Almacen store;
    public MainUI( Almacen thisStore ) {
        this.store = thisStore;
        initComponents();
        jMApplication.addActionListener(new HandlerShowCustomerUI());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopP = new javax.swing.JDesktopPane();
        jMB1 = new javax.swing.JMenuBar();
        jMApplication = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jDesktopP, java.awt.BorderLayout.CENTER);

        jMApplication.setText("Aplicaciones");
        jMB1.add(jMApplication);

        jMenu2.setText("Edit");
        jMB1.add(jMenu2);

        setJMenuBar(jMB1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopP;
    private javax.swing.JMenu jMApplication;
    private javax.swing.JMenuBar jMB1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables

    public class HandlerShowCustomerUI implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            GestionarClientes customerUI = new GestionarClientes(store);
            jDesktopP.add(customerUI);
            customerUI.setVisible(true);
            
        }
            
    }

}
