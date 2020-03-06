package site_1.pkg2;

import java.sql.Connection;//Libreria para conectar con una base de datos especifica
import java.sql.Date;//to identify this as an SQL DATE value.
import java.sql.DriverManager;//The basic service for managing a set of JDBC drivers
import java.sql.PreparedStatement;//An object that represents a precompiled SQL statement.
import java.sql.ResultSet;//A table of data representing a database result set, which is usually generated by executing a statement that queries the database.
import javax.swing.JOptionPane;

public class Venta extends javax.swing.JFrame {
    
   
    
    public Venta() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        choice2 = new java.awt.Choice();
        PanelMenuVenta = new java.awt.Panel();
        buttonTransluceIcon2 = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel1 = new javax.swing.JLabel();
        buttonTransluceIcon1 = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel2 = new javax.swing.JLabel();
        buttonTransluceIcon3 = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel3 = new javax.swing.JLabel();
        PanelVenta = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnAgregar = new org.edisoncor.gui.button.ButtonPopup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        choice2.setFocusable(false);
        choice2.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenuVenta.setBackground(new java.awt.Color(131, 215, 254));
        PanelMenuVenta.setLayout(new java.awt.GridBagLayout());

        buttonTransluceIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial-medico (1).png"))); // NOI18N
        buttonTransluceIcon2.setText("buttonTransluceIcon2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = -219;
        gridBagConstraints.ipady = -36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 0);
        PanelMenuVenta.add(buttonTransluceIcon2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 20, 0, 11);
        PanelMenuVenta.add(jLabel1, gridBagConstraints);

        buttonTransluceIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        buttonTransluceIcon1.setText("buttonTransluceIcon1");
        buttonTransluceIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransluceIcon1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = -219;
        gridBagConstraints.ipady = -36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 24, 0, 0);
        PanelMenuVenta.add(buttonTransluceIcon1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Historial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 35, 0, 0);
        PanelMenuVenta.add(jLabel2, gridBagConstraints);

        buttonTransluceIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/de-venta (2).png"))); // NOI18N
        buttonTransluceIcon3.setText("buttonTransluceIcon3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -217;
        gridBagConstraints.ipady = -36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 37, 0);
        PanelMenuVenta.add(buttonTransluceIcon3, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Inventario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        PanelMenuVenta.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Producto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Stock");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad");

        txtStock.setEnabled(false);

        btnAgregar.setText("Agregar");

        listProductos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listProductos);

        txtTotal.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total");

        btnVender.setText("Confirmar venta");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ventas");

        javax.swing.GroupLayout PanelVentaLayout = new javax.swing.GroupLayout(PanelVenta);
        PanelVenta.setLayout(PanelVentaLayout);
        PanelVentaLayout.setHorizontalGroup(
            PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentaLayout.createSequentialGroup()
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscar))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelVentaLayout.setVerticalGroup(
            PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addGap(17, 17, 17)
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenuVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void buttonTransluceIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransluceIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTransluceIcon1ActionPerformed

  
    
    
    private void Limpiar(){
        txtProducto.setText(null);
        txtStock.setText(null);
        txtCantidad.setText(null);
        txtTotal.setText(null);
        listProductos.removeAll();
    
    }
    
 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel PanelMenuVenta;
    private java.awt.Panel PanelVenta;
    private org.edisoncor.gui.button.ButtonPopup btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVender;
    private org.edisoncor.gui.button.ButtonTransluceIcon buttonTransluceIcon1;
    private org.edisoncor.gui.button.ButtonTransluceIcon buttonTransluceIcon2;
    private org.edisoncor.gui.button.ButtonTransluceIcon buttonTransluceIcon3;
    private java.awt.Choice choice2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
