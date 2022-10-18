
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
        jMICustomer.addActionListener(new HandlerShowCustomersUI());
        jMIProducts.addActionListener(new HandlerShowProductsUI());
        jMITypeProducts.addActionListener(new HandlerShowTypeProductsUI());
        jMIPurchases.addActionListener(new HandlerShowSignInPurchaseUI());
        jMIExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopP = new javax.swing.JDesktopPane();
        jMB1 = new javax.swing.JMenuBar();
        jMMain = new javax.swing.JMenu();
        jMIPurchases = new javax.swing.JMenuItem();
        jMIProducts = new javax.swing.JMenuItem();
        jMITypeProducts = new javax.swing.JMenuItem();
        jMICustomer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jDesktopP, java.awt.BorderLayout.CENTER);

        jMMain.setText("Principal");

        jMIPurchases.setText("Compras");
        jMMain.add(jMIPurchases);

        jMIProducts.setText("Productos");
        jMMain.add(jMIProducts);

        jMITypeProducts.setText("Tipos de Productos");
        jMMain.add(jMITypeProducts);

        jMICustomer.setText("Clientes");
        jMMain.add(jMICustomer);
        jMMain.add(jSeparator1);

        jMIExit.setText("Salir");
        jMMain.add(jMIExit);

        jMB1.add(jMMain);

        setJMenuBar(jMB1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopP;
    private javax.swing.JMenuBar jMB1;
    private javax.swing.JMenuItem jMICustomer;
    private javax.swing.JMenuItem jMIExit;
    private javax.swing.JMenuItem jMIProducts;
    private javax.swing.JMenuItem jMIPurchases;
    private javax.swing.JMenuItem jMITypeProducts;
    private javax.swing.JMenu jMMain;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
        
    public class HandlerShowCustomersUI implements ActionListener{
        private GestionarClientes customerUI = null;
        
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
        private GestionarProductos productUI = null;
        
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
        private GestionarTiposProductos typeProductsUI = null;
        
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
        private RegistrarCompra signInPurchasesUI = null;
        
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
