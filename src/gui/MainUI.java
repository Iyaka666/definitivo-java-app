
package gui;

import model.Store;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@author Marlon E. Zambrano Z.
public class MainUI extends javax.swing.JFrame {

    private Store store;
    public MainUI( Store thisStore ) {
        this.store = thisStore;
        initComponents();
        mniCustomer.addActionListener(new HandlerShowCustomersUI());
        mniProducts.addActionListener(new HandlerShowProductsUI());
        mniTypeProducts.addActionListener(new HandlerShowTypeProductsUI());
        mniPurchases.addActionListener(new HandlerShowSignInPurchaseUI());
        mniExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopP = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menMain = new javax.swing.JMenu();
        mniPurchases = new javax.swing.JMenuItem();
        mniProducts = new javax.swing.JMenuItem();
        mniTypeProducts = new javax.swing.JMenuItem();
        mniCustomer = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 900, 700));
        setSize(new java.awt.Dimension(900, 700));

        jDesktopP.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopP.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jDesktopP, java.awt.BorderLayout.CENTER);

        menMain.setText("Principal");

        mniPurchases.setText("Compras");
        menMain.add(mniPurchases);

        mniProducts.setText("Productos");
        menMain.add(mniProducts);

        mniTypeProducts.setText("Tipos de Productos");
        menMain.add(mniTypeProducts);

        mniCustomer.setText("Clientes");
        menMain.add(mniCustomer);
        menMain.add(separator);

        mniExit.setText("Salir");
        menMain.add(mniExit);

        menuBar.add(menMain);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopP;
    private javax.swing.JMenu menMain;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniCustomer;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniProducts;
    private javax.swing.JMenuItem mniPurchases;
    private javax.swing.JMenuItem mniTypeProducts;
    private javax.swing.JPopupMenu.Separator separator;
    // End of variables declaration//GEN-END:variables
        
    public class HandlerShowCustomersUI implements ActionListener{
        private CustomerUI customerUI = null;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(customerUI == null){
                customerUI = new CustomerUI(store);
                jDesktopP.add(customerUI);            
            }
            customerUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowProductsUI implements ActionListener{
        private ProductsUI productUI = null;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(productUI == null){
                productUI = new ProductsUI(store);
                jDesktopP.add(productUI);            
            }
            productUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowTypeProductsUI implements ActionListener{
        private TypeProductsUI typeProductsUI = null;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(typeProductsUI == null){
                typeProductsUI = new TypeProductsUI(store);
                jDesktopP.add(typeProductsUI);            
            }
            typeProductsUI.setVisible(true);            
        }
            
    }
    
    public class HandlerShowSignInPurchaseUI implements ActionListener{
        private PurchasesUI signInPurchasesUI = null;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(signInPurchasesUI == null){
                signInPurchasesUI = new PurchasesUI(store);
                jDesktopP.add(signInPurchasesUI);            
            }
            signInPurchasesUI.setVisible(true);            
        }
            
    }

}
