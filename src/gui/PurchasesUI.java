package gui;

import model.Store;
import model.Customer;
import model.Purchase;
import model.DetailPurchase;
import model.Product;
import exceptions.ObjectNotFoundException;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class PurchasesUI extends javax.swing.JInternalFrame {

    private final Store store;
    private Purchase purchase;
    private Customer customerFound;
    private Product productFound;
    private Double subtotal = 0.0;
    private Double valorIva = 0.0;
    private Double total = 0.0;

    public PurchasesUI(Store store) {
        this.store = store;
        initComponents();
        tbTypeProducts.updateUI();
        HandlerFindCustomer hFindCustomer = new HandlerFindCustomer();
        btnSearch.addActionListener(hFindCustomer);
        txfId.addActionListener(hFindCustomer);
        txfCode.addActionListener(new HandlerFindProduct());
        btnAddDetailPurchase.addActionListener(new HandlerAddDetailPurchase());
        btnReturn.addActionListener(new HandlerReturnProduct());
        btnCancel.addActionListener(new HandlerCancel());
        btnSignInPurchase.addActionListener(new HandlerSignInPurchase());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labReasonSocial = new javax.swing.JLabel();
        labNIT = new javax.swing.JLabel();
        pnlCustomer = new javax.swing.JPanel();
        labId = new javax.swing.JLabel();
        labNameCustomer = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        txfNameCustomer = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        pnlProduct = new javax.swing.JPanel();
        labCode = new javax.swing.JLabel();
        labNameProduct = new javax.swing.JLabel();
        labCost = new javax.swing.JLabel();
        labQuantity = new javax.swing.JLabel();
        txfCode = new javax.swing.JTextField();
        txfNameProduct = new javax.swing.JTextField();
        ftxCost = new javax.swing.JFormattedTextField();
        txfQuantity = new javax.swing.JTextField();
        btnAddDetailPurchase = new javax.swing.JButton();
        spnContainTable = new javax.swing.JScrollPane();
        tbTypeProducts = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        labSubtotal = new javax.swing.JLabel();
        labIva = new javax.swing.JLabel();
        labTotal = new javax.swing.JLabel();
        btnSignInPurchase = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        ftxSubtotal = new javax.swing.JFormattedTextField();
        ftxIva = new javax.swing.JFormattedTextField();
        ftxTotal = new javax.swing.JFormattedTextField();

        setClosable(true);

        labReasonSocial.setText("Razon Social");

        labNIT.setText("NIT");

        pnlCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        labId.setText("Identificacion");

        labNameCustomer.setText("Nombre");

        txfNameCustomer.setEnabled(false);

        btnSearch.setText("...");

        javax.swing.GroupLayout pnlCustomerLayout = new javax.swing.GroupLayout(pnlCustomer);
        pnlCustomer.setLayout(pnlCustomerLayout);
        pnlCustomerLayout.setHorizontalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labId, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(txfId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNameCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNameCustomer))
                .addContainerGap())
        );
        pnlCustomerLayout.setVerticalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labId)
                    .addComponent(labNameCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        labCode.setText("Codigo");

        labNameProduct.setText("Nombre");

        labCost.setText("Costo");

        labQuantity.setText("Cantidad");

        txfNameProduct.setEnabled(false);

        ftxCost.setEnabled(false);

        javax.swing.GroupLayout pnlProductLayout = new javax.swing.GroupLayout(pnlProduct);
        pnlProduct.setLayout(pnlProductLayout);
        pnlProductLayout.setHorizontalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfCode, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(labCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNameProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNameProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftxCost, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(labCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(labQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlProductLayout.setVerticalGroup(
            pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labCode)
                    .addComponent(labNameProduct)
                    .addComponent(labCost)
                    .addComponent(labQuantity))
                .addGap(5, 5, 5)
                .addGroup(pnlProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnAddDetailPurchase.setText("Agregar");

        tbTypeProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTypeProducts.setCellSelectionEnabled(true);
        tbTypeProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTypeProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spnContainTable.setViewportView(tbTypeProducts);

        btnReturn.setText("Devolver");

        labSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labSubtotal.setText("Subtotal :");

        labIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labIva.setText("IVA :");

        labTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labTotal.setText("Total :");

        btnSignInPurchase.setText("Registrar Compra");

        btnCancel.setText("Cancelar");

        ftxSubtotal.setEnabled(false);

        ftxIva.setEnabled(false);

        ftxTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(labReasonSocial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(labNIT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddDetailPurchase, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnContainTable)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReturn)
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(labTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ftxSubtotal)
                                    .addComponent(ftxIva)
                                    .addComponent(ftxTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSignInPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labReasonSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labNIT)
                .addGap(10, 10, 10)
                .addComponent(pnlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddDetailPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(spnContainTable, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(labSubtotal)
                    .addComponent(ftxSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIva)
                    .addComponent(ftxIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTotal)
                    .addComponent(ftxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignInPurchase)
                    .addComponent(btnCancel))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetailPurchase;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSignInPurchase;
    private javax.swing.JFormattedTextField ftxCost;
    private javax.swing.JFormattedTextField ftxIva;
    private javax.swing.JFormattedTextField ftxSubtotal;
    private javax.swing.JFormattedTextField ftxTotal;
    private javax.swing.JLabel labCode;
    private javax.swing.JLabel labCost;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labIva;
    private javax.swing.JLabel labNIT;
    private javax.swing.JLabel labNameCustomer;
    private javax.swing.JLabel labNameProduct;
    private javax.swing.JLabel labQuantity;
    private javax.swing.JLabel labReasonSocial;
    private javax.swing.JLabel labSubtotal;
    private javax.swing.JLabel labTotal;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlProduct;
    private javax.swing.JScrollPane spnContainTable;
    private javax.swing.JTable tbTypeProducts;
    private javax.swing.JTextField txfCode;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfNameCustomer;
    private javax.swing.JTextField txfNameProduct;
    private javax.swing.JTextField txfQuantity;
    // End of variables declaration//GEN-END:variables

    public class HandlerFindCustomer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long id = Long.parseLong(txfId.getText());
                customerFound = store.findCustomerByID(id);
                txfNameCustomer.setText(customerFound.getNames());
            } catch (ObjectNotFoundException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(PurchasesUI.this, ex.getMessage());
            }
        }
    }

    public class HandlerFindProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long code = Long.parseLong(txfCode.getText());
                productFound = store.findProductByCode(code);
                txfNameProduct.setText(productFound.getName());
                ftxCost.setValue(productFound.getCost());
                txfQuantity.setText("1");
                txfQuantity.requestFocus();
                txfQuantity.selectAll();
            } catch (NumberFormatException | ObjectNotFoundException ex1) {
                JOptionPane.showMessageDialog(PurchasesUI.this, ex1.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PurchasesUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class HandlerAddDetailPurchase implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long code = Long.parseLong(txfCode.getText());
                long id = Long.parseLong(txfId.getText());
                if (customerFound == null) {
                    customerFound = store.findCustomerByID(id);
                }
                if (productFound == null) {
                    productFound = store.findProductByCode(code);
                }
                DetailPurchase detailPurchase = new DetailPurchase(
                        Byte.parseByte(txfQuantity.getText()),
                        productFound);
                if (purchase == null) {
                    purchase = new Purchase(LocalDateTime.now(), store.findEmployeeById(1000123));
                }
                subtotal += productFound.getCost();
                valorIva += detailPurchase.getValueIva();
                total += detailPurchase.getCostPurchase();
                purchase.addDetailsPurchaseByObject(detailPurchase);
                ftxSubtotal.setValue(subtotal);
                ftxIva.setValue(valorIva);
                ftxTotal.setValue(total);
                tbTypeProducts.updateUI();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(PurchasesUI.this, ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(PurchasesUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class HandlerReturnProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int detailPurchaseSelectRow = tbTypeProducts.getSelectedRow();
                int option = JOptionPane.showConfirmDialog(PurchasesUI.this,
                        "¿Esta seguro de eliminar ese producto?", "Registrar Compras",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    DetailPurchase detailPurchase = purchase.getElementDetailsPurchaseAt(detailPurchaseSelectRow);
                    subtotal -= detailPurchase.getProduct().getCost();
                    valorIva -= detailPurchase.getValueIva();
                    total -= detailPurchase.getCostPurchase();
                    purchase.removeDetailPurchaseByIndex(detailPurchaseSelectRow);
                }
            } catch (HeadlessException ex) {
                Logger.getLogger(PurchasesUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public class HandlerSignInPurchase implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (customerFound != null && productFound != null && !purchase.getDetailsPurchase().isEmpty()){
                store.addNewPurchase(purchase);
                JOptionPane.showMessageDialog(PurchasesUI.this, "Registro exitoso");
            }
        }
        
    }

    public class HandlerCancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txfId.setText("");
            txfNameCustomer.setText("");
            txfCode.setText("");
            txfNameProduct.setText("");
            ftxCost.setText("");
            txfQuantity.setText("");
            ftxSubtotal.setText("");
            ftxIva.setText("");
            ftxTotal.setText("");
            if(purchase != null){
                purchase.deleteAllDetailsPurchase();
            }
        }
    }
    
    public class ModelTb extends AbstractTableModel {

        private final String[] headersNames = {"Codigo", "Nombre", "Vr. Unit.", "Cant", "Costo"};

        @Override
        public int getRowCount() {
            return purchase.getDetailsPurchase().size();
        }

        @Override
        public int getColumnCount() {
            return headersNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            DetailPurchase dC = purchase.getDetailsPurchase().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return dC.getProduct().getCode();
                case 1:
                    return dC.getProduct().getName();
                case 2:
                    return dC.getProduct().getCost();
                case 3:
                    return dC.getQuantity();
                case 4:
                    return dC.getCostPurchase();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return headersNames[column];
        }

    }
}
