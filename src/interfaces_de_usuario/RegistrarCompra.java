package interfaces_de_usuario;

import clases_del_modelo.Almacen;
import clases_del_modelo.Cliente;
import clases_del_modelo.Compra;
import clases_del_modelo.DetalleCompra;
import clases_del_modelo.Producto;
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
public class RegistrarCompra extends javax.swing.JInternalFrame {

    private final Almacen store;
    private Compra purchase;
    private Cliente customerFound;
    private Producto productFound;
    private Double subtotal = 0.0;
    private Double valorIva = 0.0;
    private Double total = 0.0;

    public RegistrarCompra(Almacen store) {
        this.store = store;
        initComponents();
        jTPresenterInfo.updateUI();
        HandlerFindCustomer hFindCustomer = new HandlerFindCustomer();
        jBSearch.addActionListener(hFindCustomer);
        jTFId.addActionListener(hFindCustomer);
        jTFCode.addActionListener(new HandlerFindProduct());
        jBAddDetailPurchase.addActionListener(new HandlerAddDetailPurchase());
        jBReturn.addActionListener(new HandlerReturnProduct());
        jBCancel.addActionListener(new HandlerCancel());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLReasonSocial = new javax.swing.JLabel();
        jLNIT = new javax.swing.JLabel();
        jPCustomer = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jLNameCustomer = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFNameCustomer = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        jPProduct = new javax.swing.JPanel();
        jLCode = new javax.swing.JLabel();
        jLNameProduct = new javax.swing.JLabel();
        jLCost = new javax.swing.JLabel();
        jLQuantity = new javax.swing.JLabel();
        jTFCode = new javax.swing.JTextField();
        jTFNameProduct = new javax.swing.JTextField();
        jFTFCost = new javax.swing.JFormattedTextField();
        jTFQuantity = new javax.swing.JTextField();
        jBAddDetailPurchase = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPresenterInfo = new javax.swing.JTable();
        jBReturn = new javax.swing.JButton();
        jLSubtotal = new javax.swing.JLabel();
        jLIva = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jBSignInPurchase = new javax.swing.JButton();
        jBCancel = new javax.swing.JButton();
        jFTFSubtotal = new javax.swing.JFormattedTextField();
        jFTFIva = new javax.swing.JFormattedTextField();
        jFTFTotal = new javax.swing.JFormattedTextField();

        jLReasonSocial.setText("Razon Social");

        jLNIT.setText("NIT");

        jPCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLId.setText("Identificacion");

        jLNameCustomer.setText("Nombre");

        jTFNameCustomer.setEnabled(false);

        jBSearch.setText("...");

        javax.swing.GroupLayout jPCustomerLayout = new javax.swing.GroupLayout(jPCustomer);
        jPCustomer.setLayout(jPCustomerLayout);
        jPCustomerLayout.setHorizontalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLId, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jTFId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNameCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNameCustomer))
                .addContainerGap())
        );
        jPCustomerLayout.setVerticalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jLNameCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSearch))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        jLCode.setText("Codigo");

        jLNameProduct.setText("Nombre");

        jLCost.setText("Costo");

        jLQuantity.setText("Cantidad");

        jTFNameProduct.setEnabled(false);

        jFTFCost.setEnabled(false);

        javax.swing.GroupLayout jPProductLayout = new javax.swing.GroupLayout(jPProduct);
        jPProduct.setLayout(jPProductLayout);
        jPProductLayout.setHorizontalGroup(
            jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFCode, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jLCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNameProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNameProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFTFCost, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPProductLayout.setVerticalGroup(
            jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCode)
                    .addComponent(jLNameProduct)
                    .addComponent(jLCost)
                    .addComponent(jLQuantity))
                .addGap(5, 5, 5)
                .addGroup(jPProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jBAddDetailPurchase.setText("Agregar");

        jTPresenterInfo.setModel(new javax.swing.table.DefaultTableModel(
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
        jTPresenterInfo.setCellSelectionEnabled(true);
        jTPresenterInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTPresenterInfo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTPresenterInfo);

        jBReturn.setText("Devolver");

        jLSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSubtotal.setText("Subtotal :");

        jLIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIva.setText("IVA :");

        jLTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotal.setText("Total :");

        jBSignInPurchase.setText("Registrar Compra");

        jBCancel.setText("Cancelar");

        jFTFSubtotal.setEnabled(false);

        jFTFIva.setEnabled(false);

        jFTFTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLReasonSocial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLNIT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAddDetailPurchase, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBReturn)
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFTFSubtotal)
                                    .addComponent(jFTFIva)
                                    .addComponent(jFTFTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBSignInPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jBCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLReasonSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNIT)
                .addGap(10, 10, 10)
                .addComponent(jPCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAddDetailPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBReturn)
                    .addComponent(jLSubtotal)
                    .addComponent(jFTFSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIva)
                    .addComponent(jFTFIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTotal)
                    .addComponent(jFTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSignInPurchase)
                    .addComponent(jBCancel))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddDetailPurchase;
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBReturn;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSignInPurchase;
    private javax.swing.JFormattedTextField jFTFCost;
    private javax.swing.JFormattedTextField jFTFIva;
    private javax.swing.JFormattedTextField jFTFSubtotal;
    private javax.swing.JFormattedTextField jFTFTotal;
    private javax.swing.JLabel jLCode;
    private javax.swing.JLabel jLCost;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIva;
    private javax.swing.JLabel jLNIT;
    private javax.swing.JLabel jLNameCustomer;
    private javax.swing.JLabel jLNameProduct;
    private javax.swing.JLabel jLQuantity;
    private javax.swing.JLabel jLReasonSocial;
    private javax.swing.JLabel jLSubtotal;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JPanel jPCustomer;
    private javax.swing.JPanel jPProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCode;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNameCustomer;
    private javax.swing.JTextField jTFNameProduct;
    private javax.swing.JTextField jTFQuantity;
    private javax.swing.JTable jTPresenterInfo;
    // End of variables declaration//GEN-END:variables

    public class HandlerFindCustomer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long id = Long.parseLong(jTFId.getText());
                customerFound = store.findCustomerByID(id);
                jTFNameCustomer.setText(customerFound.getNombres());
            } catch (ObjectNotFoundException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(RegistrarCompra.this, ex.getMessage());
            }
        }
    }

    public class HandlerFindProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long code = Long.parseLong(jTFCode.getText());
                productFound = store.findProductByCode(code);
                jTFNameProduct.setText(productFound.getNombre());
                jFTFCost.setValue(productFound.getCosto());
                jTFQuantity.setText("1");
                jTFQuantity.requestFocus();
                jTFQuantity.selectAll();
            } catch (NumberFormatException | ObjectNotFoundException ex1) {
                JOptionPane.showMessageDialog(RegistrarCompra.this, ex1.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class HandlerAddDetailPurchase implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long code = Long.parseLong(jTFCode.getText());
                long id = Long.parseLong(jTFId.getText());
                if (customerFound == null) {
                    customerFound = store.findCustomerByID(id);
                }
                if (productFound == null) {
                    productFound = store.findProductByCode(code);
                }
                DetalleCompra detailPurchase = new DetalleCompra(
                        Byte.parseByte(jTFQuantity.getText()),
                        productFound);
                if (purchase == null) {
                    purchase = new Compra(LocalDateTime.now(), store.findEmpleadoById(1000123));
                }
                subtotal += productFound.getCosto();
                valorIva += detailPurchase.getValorIva();
                total += detailPurchase.getCostoCompra();
                purchase.addDetallesCompraByObject(detailPurchase);
                jFTFSubtotal.setValue(subtotal);
                jFTFIva.setValue(valorIva);
                jFTFTotal.setValue(total);
                jTPresenterInfo.updateUI();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(RegistrarCompra.this, ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class HandlerReturnProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int detailPurchaseSelectRow = jTPresenterInfo.getSelectedRow();
                int option = JOptionPane.showConfirmDialog(RegistrarCompra.this,
                        "¿Esta seguro de eliminar ese producto?", "Registrar Compras",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    DetalleCompra detailPurchase = purchase.getElementDetallesCompraEn(detailPurchaseSelectRow);
                    subtotal -= detailPurchase.getEsteProducto().getCosto();
                    valorIva -= detailPurchase.getValorIva();
                    total -= detailPurchase.getCostoCompra();
                    purchase.removeDetalleCompraByIndex(detailPurchaseSelectRow);
                }
            } catch (HeadlessException ex) {
                Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public class HandlerSignInPurchase implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (customerFound != null || productFound != null || !purchase.getDetallesDeCompra().isEmpty()){
                store.addNewCompra(purchase);
                JOptionPane.showMessageDialog(RegistrarCompra.this, "Registro exitoso");
            }
        }
        
    }

    public class HandlerCancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jTFId.setText("");
            jTFNameCustomer.setText("");
            jTFCode.setText("");
            jTFNameProduct.setText("");
            jFTFCost.setText("");
            jTFQuantity.setText("");
            jFTFSubtotal.setText("");
            jFTFIva.setText("");
            jFTFTotal.setText("");
            if(purchase != null){
                purchase.deleteAllDetallesCompra();
            }
        }
    }
    
    public class ModelTb extends AbstractTableModel {

        private final String[] headersNames = {"Codigo", "Nombre", "Vr. Unit.", "Cant", "Costo"};

        @Override
        public int getRowCount() {
            return purchase.getDetallesDeCompra().size();
        }

        @Override
        public int getColumnCount() {
            return headersNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            DetalleCompra dC = purchase.getDetallesDeCompra().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return dC.getEsteProducto().getCodigo();
                case 1:
                    return dC.getEsteProducto().getNombre();
                case 2:
                    return dC.getEsteProducto().getCosto();
                case 3:
                    return dC.getCantidad();
                case 4:
                    return dC.getCostoCompra();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return headersNames[column];
        }

    }
}
