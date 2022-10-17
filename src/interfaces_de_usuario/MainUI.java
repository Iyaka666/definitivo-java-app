
package interfaces_de_usuario;

import clases_del_modelo.Almacen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@author Marlon E. Zambrano Z.
public class MainUI extends javax.swing.JFrame {

    private Almacen store;
    public MainUI( Almacen thisStore ) {
        this.store = thisStore;
        initComponents();
        jMCustomer.addActionListener(new HandlerShowCustomersUI());
        jMProduct.addActionListener(new HandlerShowProductsUI());
        jMTypeProduct.addActionListener(new HandlerShowTypeProductsUI());
        jMPurchase.addActionListener(new HandlerShowSignInPurchaseUI());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopP = new javax.swing.JDesktopPane();
        jMB1 = new javax.swing.JMenuBar();
        jMPurchase = new javax.swing.JMenu();
        jMCustomer = new javax.swing.JMenu();
        jMProduct = new javax.swing.JMenu();
        jMTypeProduct = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jDesktopP, java.awt.BorderLayout.CENTER);

        jMPurchase.setText("Compras");
        jMB1.add(jMPurchase);

        jMCustomer.setText("Clientes");
        jMB1.add(jMCustomer);

        jMProduct.setText("Productos");
        jMB1.add(jMProduct);

        jMTypeProduct.setText("Tipos de productos");
        jMB1.add(jMTypeProduct);

        setJMenuBar(jMB1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopP;
    private javax.swing.JMenuBar jMB1;
    private javax.swing.JMenu jMCustomer;
    private javax.swing.JMenu jMProduct;
    private javax.swing.JMenu jMPurchase;
    private javax.swing.JMenu jMTypeProduct;
    // End of variables declaration//GEN-END:variables
        
    public class HandlerShowCustomersUI implements ActionListener{
        private GestionarClientes customerUI;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(customerUI == null){
                customerUI = new GestionarClientes(store);
                jDesktopP.add(customerUI);            
            }
            customerUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowProductsUI implements ActionListener{
        private GestionarProductos productUI;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(productUI == null){
                productUI = new GestionarProductos(store);
                jDesktopP.add(productUI);            
            }
            productUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowTypeProductsUI implements ActionListener{
        private GestionarTiposProductos typeProductsUI;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(typeProductsUI == null){
                typeProductsUI = new GestionarTiposProductos(store);
                jDesktopP.add(typeProductsUI);            
            }
            typeProductsUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowSignInPurchaseUI implements ActionListener{
        private RegistrarCompra signInPurchasesUI;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(signInPurchasesUI == null){
                signInPurchasesUI = new RegistrarCompra(store);
                jDesktopP.add(signInPurchasesUI);            
            }
            signInPurchasesUI.setVisible(true);            
        }
            
    }

}
