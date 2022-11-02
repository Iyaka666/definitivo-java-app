package gui;

import model.Store;
import model.TypeProduct;
import exceptions.OutRangeGivenDoubleException;
import exceptions.StringVoidException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

//@author Marlon
public class TypeProductsUI extends javax.swing.JInternalFrame {

    private Store store;
    private TypeProduct typeProductRegistered;

    public TypeProductsUI(Store a) {
        this.store = a;
        initComponents();
        btnSave.addActionListener(new HandlerSaveTypeProduct());
        btnCancel.addActionListener(new HandlerDeleteField());
        jTTypeProduct.setModel(new ModelTypeProduct());
        jTTypeProduct.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labName = new javax.swing.JLabel();
        labIva = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txfName = new javax.swing.JTextField();
        ftxIVA = new javax.swing.JFormattedTextField();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTypeProduct = new javax.swing.JTable();
        labManagementTypeProducts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labName.setText("Nombre:");

        labIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labIva.setText("IVA:");

        btnSave.setText("Guardar");

        btnCancel.setText("Cancelar");

        jTTypeProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTTypeProduct);

        labManagementTypeProducts.setText("Gestionar Tipos de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(20, 20, 20)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(ftxIVA)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(179, 179, 179)
                            .addComponent(btnSave)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(labManagementTypeProducts)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labManagementTypeProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labName)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIva)
                    .addComponent(ftxIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JFormattedTextField ftxIVA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTypeProduct;
    private javax.swing.JLabel labIva;
    private javax.swing.JLabel labManagementTypeProducts;
    private javax.swing.JLabel labName;
    private javax.swing.JTextField txfName;
    // End of variables declaration//GEN-END:variables
    private void makeDeleteFieldsNoTable(){
        txfName.setText("");
        ftxIVA.setText("");
    }
    
    public class HandlerDeleteField implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            makeDeleteFieldsNoTable();
        }
        
    }
    
    public class HandlerSaveTypeProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                if (typeProductRegistered == null) {
                    typeProductRegistered = new TypeProduct(txfName.getText(), (Double) ftxIVA.getValue());
                    jTTypeProduct.updateUI();
                } else {
                    typeProductRegistered.setName(txfName.getText());
                    typeProductRegistered.setPercentageIva((Double) ftxIVA.getValue());
                    JOptionPane.showMessageDialog(TypeProductsUI.this, "The information have been modified");
                    jTTypeProduct.updateUI();
                    makeDeleteFieldsNoTable();
                    txfName.requestFocus();
                }
            } catch (StringVoidException | OutRangeGivenDoubleException ex) {
                JOptionPane.showMessageDialog(TypeProductsUI.this, ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(TypeProductsUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class ModelTypeProduct extends AbstractTableModel {

        private final String[] columnsNames = {"Name", "Percentage IVA"};

        @Override
        public int getRowCount() {
            return store.getTypeProducts().size();
        }

        @Override
        public int getColumnCount() {
            return columnsNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            TypeProduct tP = store.getTypeProducts().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return tP.getName();
                case 1:
                    return tP.getPercentageIva();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return columnsNames[column];
        }

    }
}