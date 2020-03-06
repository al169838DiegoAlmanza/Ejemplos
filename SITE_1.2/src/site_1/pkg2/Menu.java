
package site_1.pkg2;


public class Menu extends javax.swing.JFrame {

    Venta v = new Venta();
    Inventario i = new Inventario();
    Proveedor p = new Proveedor();
    Historial h = new Historial();
    
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelmenu = new java.awt.Panel();
        btnVenta = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel1 = new javax.swing.JLabel();
        btnHistorial = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel2 = new javax.swing.JLabel();
        btnProveedores = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel4 = new javax.swing.JLabel();
        btnInventario1 = new org.edisoncor.gui.button.ButtonTransluceIcon();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        Panelmenu.setBackground(new java.awt.Color(131, 215, 254));

        btnVenta.setBackground(new java.awt.Color(153, 204, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/terminal-de-pago.png"))); // NOI18N
        btnVenta.setText("buttonTransluceIcon2");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Proveedores");

        btnHistorial.setBackground(new java.awt.Color(153, 204, 255));
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        btnHistorial.setText("buttonTransluceIcon1");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Venta");

        btnProveedores.setBackground(new java.awt.Color(153, 204, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/de-venta (2).png"))); // NOI18N
        btnProveedores.setText("buttonTransluceIcon3");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SITE.png"))); // NOI18N

        btnInventario1.setBackground(new java.awt.Color(153, 204, 255));
        btnInventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        btnInventario1.setText("buttonTransluceIcon1");
        btnInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventario1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Historial de venta ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Inventario");

        javax.swing.GroupLayout PanelmenuLayout = new javax.swing.GroupLayout(Panelmenu);
        Panelmenu.setLayout(PanelmenuLayout);
        PanelmenuLayout.setHorizontalGroup(
            PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelmenuLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelmenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelmenuLayout.createSequentialGroup()
                                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(179, 179, 179))
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)))
                                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelmenuLayout.createSequentialGroup()
                                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addComponent(btnInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(133, 133, 133))
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(150, 150, 150)))
                                .addGap(11, 11, 11)
                                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelmenuLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel1)))))
                        .addGap(22, 22, 22)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        PanelmenuLayout.setVerticalGroup(
            PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelmenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelmenuLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelmenuLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelmenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Acceso ");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña: ");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 285, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        panel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 151, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("de seguridad");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 178, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bloquear.png"))); // NOI18N
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, 50, 68));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        v.show();
        this.dispose();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        h.show();
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        p.show();
        this.dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventario1ActionPerformed
        i.show();
        this.dispose();
    }//GEN-LAST:event_btnInventario1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Panelmenu;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnHistorial;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnInventario1;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnProveedores;
    private org.edisoncor.gui.button.ButtonTransluceIcon btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
