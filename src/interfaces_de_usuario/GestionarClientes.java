package interfaces_de_usuario;

import clases_del_modelo.Almacen;
import clases_del_modelo.Cliente;
import clases_del_modelo.Genero;
import exceptions.ObjectNotFoundException;
import exceptions.StringVoidAtribException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class GestionarClientes extends javax.swing.JInternalFrame {

    private Almacen esteAlmacen;
    private Cliente customerRegistered;

    /**
     * Creates new form GestionarClientes
     */
    public GestionarClientes(Almacen almacen) {
        this.esteAlmacen = almacen;
        initComponents();
        HandlerFindById handlerFind = new HandlerFindById();
        jBCancelar.doClick();
        jBGuardar.addActionListener(new HandlerLogInCustomer());
        jBBuscar.addActionListener(handlerFind);
        jTFIdentificacion.addActionListener(handlerFind);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFIdentificacion = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jCBGenero = new JComboBox<Genero>(Genero.values());
        jCBGenero.setSelectedItem(null);
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jFTFTelefono = new javax.swing.JFormattedTextField();
        jFTFCorreo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLGestionarCompras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLGestionarCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGestionarCompras.setText("Gestionar Clientes");

        jLIdentificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLIdentificacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIdentificacion.setText("Identificacion :");

        jLNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLNombres.setText("Nombre(s) :");

        jLApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLApellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLApellidos.setText("Apellido(s) :");

        jLGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLGenero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLGenero.setText("Genero :");

        jLTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTelefono.setText("Telefono :");

        jLCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLCorreo.setText("Correo :");

        jBGuardar.setText("Guardar");

        jBCancelar.setText("Cancelar");

        jBBuscar.setText("...");

        jFTFTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        try {
            jFTFCorreo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***********************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLGestionarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTFIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBBuscar))
                            .addComponent(jTFNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jTFApellidos)
                            .addComponent(jCBGenero, 0, 302, Short.MAX_VALUE)
                            .addComponent(jFTFTelefono)
                            .addComponent(jFTFCorreo))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLGestionarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jFTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<Genero> jCBGenero;
    private javax.swing.JFormattedTextField jFTFCorreo;
    private javax.swing.JFormattedTextField jFTFTelefono;
    private final javax.swing.JLabel jLApellidos = new javax.swing.JLabel();
    private final javax.swing.JLabel jLCorreo = new javax.swing.JLabel();
    private final javax.swing.JLabel jLGenero = new javax.swing.JLabel();
    private final javax.swing.JLabel jLGestionarCompras = new javax.swing.JLabel();
    private final javax.swing.JLabel jLIdentificacion = new javax.swing.JLabel();
    private final javax.swing.JLabel jLNombres = new javax.swing.JLabel();
    private final javax.swing.JLabel jLTelefono = new javax.swing.JLabel();
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFIdentificacion;
    private javax.swing.JTextField jTFNombres;
    // End of variables declaration//GEN-END:variables

    private void makeDeleteFields() {
        jTFIdentificacion.setText("");
        jTFNombres.setText("");
        jTFApellidos.setText("");
        jFTFTelefono.setText("");
        jFTFCorreo.setText("");
        jCBGenero.setSelectedItem(null);
        jCBGenero.updateUI();

    }

    public class HandlerDeleteFields implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            makeDeleteFields();
        }

    }

    public class HandlerLogInCustomer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (customerRegistered == null) {
                    customerRegistered = new Cliente( Long.parseLong(jFTFTelefono.getText()), //phone
                            ( ""+jFTFCorreo.getValue() ).trim(),          //emails
                            Long.parseLong(jTFIdentificacion.getText()),  //identification
                            jTFNombres.getText().trim(),                  //names
                            jTFApellidos.getText().trim(),                //lastnames
                            (Genero) jCBGenero.getSelectedItem());        //gender
                    esteAlmacen.addNewCliente(customerRegistered);        //added new customer
                } else {
                    //editing information object customer 
                    long id = Long.parseLong(jTFIdentificacion.getText());
                    customerRegistered = esteAlmacen.findCustomerByID(id);
                    customerRegistered.setNombres( jTFNombres.getText().trim() );
                    customerRegistered.setApellidos( jTFApellidos.getText().trim() );
                    customerRegistered.setCorreo( jFTFCorreo.getText().trim() );
                    customerRegistered.setGenero( (Genero)jCBGenero.getSelectedItem() );
                    customerRegistered.setTelefono( Long.parseLong(jFTFTelefono.getText()) );
                    makeDeleteFields();
                }
            } catch (StringVoidAtribException ex) {
                JOptionPane.showMessageDialog(GestionarClientes.this,
                        "El campo de texto no puede estar vacio");
            } catch (Exception ex) {
                Logger.getLogger(GestionarClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class HandlerFindById implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                long id = Long.parseLong(jTFIdentificacion.getText());
                Cliente customerFound = esteAlmacen.findCustomerByID(id);
                jTFNombres.setText(customerFound.getNombres());
                jTFApellidos.setText(customerFound.getApellidos());
                jCBGenero.setSelectedItem(customerFound.getGenero());
                jFTFTelefono.setText(String.valueOf(customerFound.getTelefono()));
                jFTFCorreo.setText(customerFound.getCorreo());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(GestionarClientes.this,
                        "El numero de identificacion es incorrecto");
            } catch (ObjectNotFoundException ex) {
                int option = JOptionPane.showConfirmDialog(
                        GestionarClientes.this, "No se encuentra un cliente "
                        + "con el numero de identificacion ingresado\n �Desea "
                        + "registrar el cliente ?", "Gestionar cliente",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    jTFNombres.requestFocus();
                }
            }
        }
    }

}
