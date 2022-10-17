package interfaces_de_usuario;

import clases_del_modelo.Almacen;
import clases_del_modelo.TipoProducto;
import exceptions.OutRangeGivenDoubleException;
import exceptions.StringVoidAtribException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

//@author Marlon
public class GestionarTiposProductos extends javax.swing.JInternalFrame {

    private Almacen store;
    private TipoProducto typeProductRegistered;

    public GestionarTiposProductos(Almacen a) {
        this.store = a;
        initComponents();
        jBSave.addActionListener(new HandlerSaveTypeProduct());
        jBCancel.addActionListener(new HandlerDeleteField());
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

        jLName = new javax.swing.JLabel();
        jLIva = new javax.swing.JLabel();
        jBSave = new javax.swing.JButton();
        jTFName = new javax.swing.JTextField();
        jFTFIVA = new javax.swing.JFormattedTextField();
        jBCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTypeProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLName.setText("Nombre:");

        jLIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIva.setText("IVA:");

        jBSave.setText("Guardar");

        jBCancel.setText("Cancelar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jFTFIVA)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jBSave)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancel)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName)
                    .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIva)
                    .addComponent(jFTFIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSave)
                    .addComponent(jBCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBSave;
    private javax.swing.JFormattedTextField jFTFIVA;
    private javax.swing.JLabel jLIva;
    private javax.swing.JLabel jLName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTable jTTypeProduct;
    // End of variables declaration//GEN-END:variables
    private void makeDeleteFieldsNoTable(){
        jTFName.setText("");
        jFTFIVA.setText("");
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
                    typeProductRegistered = new TipoProducto(jTFName.getText(), (Double) jFTFIVA.getValue());
                    jTTypeProduct.updateUI();
                } else {
                    typeProductRegistered.setNombre(jTFName.getText());
                    typeProductRegistered.setPorcentajeIva((Double) jFTFIVA.getValue());
                    JOptionPane.showMessageDialog(GestionarTiposProductos.this, "La información se ha modificado");
                    jTTypeProduct.updateUI();
                    makeDeleteFieldsNoTable();
                    jTFName.requestFocus();
                }
            } catch (StringVoidAtribException ex) {
                JOptionPane.showMessageDialog(GestionarTiposProductos.this, "El nombre no puede estar vacio");
            } catch (OutRangeGivenDoubleException ex) {
                JOptionPane.showMessageDialog(GestionarTiposProductos.this, "El porcentaje debe estar entre 0% y 100%");
            } catch (Exception ex) {
                Logger.getLogger(GestionarTiposProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public class ModelTypeProduct extends AbstractTableModel {

        private final String[] columnsNames = {"Nombre", "Porcentaje IVA"};

        @Override
        public int getRowCount() {
            return store.getTiposDeProductos().size();
        }

        @Override
        public int getColumnCount() {
            return columnsNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            TipoProducto tP = store.getTiposDeProductos().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return tP.getNombre();
                case 1:
                    return tP.getPorcentajeIva();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return columnsNames[column];
        }

    }
}
