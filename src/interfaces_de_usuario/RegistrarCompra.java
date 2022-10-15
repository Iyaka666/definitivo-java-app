
package interfaces_de_usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class RegistrarCompra extends javax.swing.JInternalFrame {

    
    public RegistrarCompra() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jLNIT = new javax.swing.JLabel();
        jLReasonSocial = new javax.swing.JLabel();
        jLCustomer = new javax.swing.JLabel();
        jSIdCustomer = new javax.swing.JSeparator();
        jTFIdCustomer = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        jTFNameCustomer = new javax.swing.JTextField();
        jSNameProduct = new javax.swing.JSeparator();
        jLProduct = new javax.swing.JLabel();
        jTFIdProduct = new javax.swing.JTextField();
        jTFNameProduct = new javax.swing.JTextField();
        jTFQuantity = new javax.swing.JTextField();
        jSIdProduct = new javax.swing.JSeparator();
        jSNameCustomer = new javax.swing.JSeparator();
        jBAdd = new javax.swing.JButton();
        jBReturn = new javax.swing.JButton();
        jFTFCost = new javax.swing.JFormattedTextField();
        jLSubtotal = new javax.swing.JLabel();
        jLIVA = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jBLogInPurchase = new javax.swing.JButton();
        jBCancel = new javax.swing.JButton();
        jFTFSubtotal = new javax.swing.JFormattedTextField();
        jFTFIVA = new javax.swing.JFormattedTextField();
        jFTFTotal = new javax.swing.JFormattedTextField();
        jSCostProduct = new javax.swing.JSeparator();
        jSQuantityProduct = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBackground.setForeground(new java.awt.Color(0, 0, 0));

        jLNIT.setBackground(new java.awt.Color(255, 255, 255));
        jLNIT.setForeground(new java.awt.Color(0, 0, 0));
        jLNIT.setText("NIT");

        jLReasonSocial.setBackground(new java.awt.Color(255, 255, 255));
        jLReasonSocial.setForeground(new java.awt.Color(0, 0, 0));
        jLReasonSocial.setText("Razon Social");

        jLCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jLCustomer.setForeground(new java.awt.Color(0, 0, 0));
        jLCustomer.setText("Cliente");

        jSIdCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTFIdCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jTFIdCustomer.setForeground(new java.awt.Color(0, 0, 0));
        jTFIdCustomer.setText("Identificacion");
        jTFIdCustomer.setBorder(null);

        jBSearch.setForeground(new java.awt.Color(255, 255, 255));
        jBSearch.setText("...");

        jTFNameCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jTFNameCustomer.setForeground(new java.awt.Color(0, 0, 0));
        jTFNameCustomer.setText("Nombre");
        jTFNameCustomer.setBorder(null);

        jLProduct.setBackground(new java.awt.Color(255, 255, 255));
        jLProduct.setForeground(new java.awt.Color(0, 0, 0));
        jLProduct.setText("Producto");

        jTFIdProduct.setBackground(new java.awt.Color(255, 255, 255));
        jTFIdProduct.setForeground(new java.awt.Color(0, 0, 0));
        jTFIdProduct.setText("Codigo");
        jTFIdProduct.setBorder(null);

        jTFNameProduct.setBackground(new java.awt.Color(255, 255, 255));
        jTFNameProduct.setForeground(new java.awt.Color(0, 0, 0));
        jTFNameProduct.setText("Nombre");
        jTFNameProduct.setBorder(null);

        jTFQuantity.setBackground(new java.awt.Color(255, 255, 255));
        jTFQuantity.setForeground(new java.awt.Color(0, 0, 0));
        jTFQuantity.setText("Cantidad");
        jTFQuantity.setBorder(null);

        jSNameCustomer.setPreferredSize(new java.awt.Dimension(64, 15));

        jBAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBAdd.setText("Agregar");

        jBReturn.setForeground(new java.awt.Color(255, 255, 255));
        jBReturn.setText("Devolver");

        jFTFCost.setBackground(new java.awt.Color(255, 255, 255));
        jFTFCost.setBorder(null);
        jFTFCost.setForeground(new java.awt.Color(0, 0, 0));
        jFTFCost.setText("Costo");

        jLSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        jLSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLSubtotal.setText("Subtotal:");

        jLIVA.setBackground(new java.awt.Color(255, 255, 255));
        jLIVA.setForeground(new java.awt.Color(0, 0, 0));
        jLIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIVA.setText("IVA:");

        jLTotal.setBackground(new java.awt.Color(255, 255, 255));
        jLTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotal.setText("Total:");

        jBLogInPurchase.setForeground(new java.awt.Color(255, 255, 255));
        jBLogInPurchase.setText("Registrar compra");

        jBCancel.setForeground(new java.awt.Color(255, 255, 255));
        jBCancel.setText("Cancelar");

        jFTFSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        jFTFSubtotal.setBorder(null);
        jFTFSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        jFTFSubtotal.setText("jFormattedTextField1");

        jFTFIVA.setBackground(new java.awt.Color(255, 255, 255));
        jFTFIVA.setBorder(null);
        jFTFIVA.setForeground(new java.awt.Color(0, 0, 0));
        jFTFIVA.setText("jFormattedTextField1");

        jFTFTotal.setBackground(new java.awt.Color(255, 255, 255));
        jFTFTotal.setBorder(null);
        jFTFTotal.setForeground(new java.awt.Color(0, 0, 0));
        jFTFTotal.setText("jFormattedTextField1");

        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title1", "Title2", "Title3", "Title4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(51, 51, 55));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLReasonSocial)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jLNIT)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(jBLogInPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBCancel))
                            .addComponent(jBAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                    .addComponent(jBReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFTFSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLCustomer)
                                .addComponent(jLProduct)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSIdCustomer, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFIdCustomer))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSNameCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFNameCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSIdProduct, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFIdProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                            .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFTFCost, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                            .addComponent(jSNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSCostProduct)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                        .addComponent(jSQuantityProduct)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLReasonSocial)
                .addGap(7, 7, 7)
                .addComponent(jLNIT)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jSNameCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(jLProduct)
                        .addGap(17, 17, 17)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSIdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSCostProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jBAdd))
                            .addComponent(jSQuantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLCustomer)
                        .addGap(25, 25, 25)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBReturn)
                    .addComponent(jLSubtotal)
                    .addComponent(jFTFSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIVA)
                    .addComponent(jFTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTotal)
                    .addComponent(jFTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogInPurchase)
                    .addComponent(jBCancel))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBLogInPurchase;
    private javax.swing.JButton jBReturn;
    private javax.swing.JButton jBSearch;
    private javax.swing.JFormattedTextField jFTFCost;
    private javax.swing.JFormattedTextField jFTFIVA;
    private javax.swing.JFormattedTextField jFTFSubtotal;
    private javax.swing.JFormattedTextField jFTFTotal;
    private javax.swing.JLabel jLCustomer;
    private javax.swing.JLabel jLIVA;
    private javax.swing.JLabel jLNIT;
    private javax.swing.JLabel jLProduct;
    private javax.swing.JLabel jLReasonSocial;
    private javax.swing.JLabel jLSubtotal;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JSeparator jSCostProduct;
    private javax.swing.JSeparator jSIdCustomer;
    private javax.swing.JSeparator jSIdProduct;
    private javax.swing.JSeparator jSNameCustomer;
    private javax.swing.JSeparator jSNameProduct;
    private javax.swing.JSeparator jSQuantityProduct;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFIdCustomer;
    private javax.swing.JTextField jTFIdProduct;
    private javax.swing.JTextField jTFNameCustomer;
    private javax.swing.JTextField jTFNameProduct;
    private javax.swing.JTextField jTFQuantity;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public class HandlerFindCustomer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
    }

}
