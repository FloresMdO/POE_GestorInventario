
package visual;

import database.UsuariosBD;

import javax.swing.JOptionPane;
import modelo.Producto;



public class VtnPrincipal extends javax.swing.JFrame {
    
    VtnVenta objVtnVenta = null;
    VtnProducto objVtnProd = null;
    
    UsuariosBD objBD = new UsuariosBD();
    Producto objProducto = new Producto();
    
    boolean sesionIniciada = false;

    public VtnPrincipal() {
        initComponents();
        
        pnlInventario.setVisible(false);
        btnCerrarSesion.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlInventario = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        pswdUser = new javax.swing.JPasswordField();
        ckbMostrarContra = new javax.swing.JCheckBox();
        lblMensajeInicioSesion = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnVentana = new javax.swing.JMenu();
        mnVenta = new javax.swing.JRadioButtonMenuItem();
        mnProductos = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 232));

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gestor de Inventarios");
        jPanel1.add(lblTitulo);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlInventario.setBackground(new java.awt.Color(232, 232, 232));
        pnlInventario.setLayout(new java.awt.GridBagLayout());

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVentas.setText("Registar Venta");
        btnVentas.setPreferredSize(new java.awt.Dimension(125, 30));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 20, 10);
        pnlInventario.add(btnVentas, gridBagConstraints);

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setText("Ver Productos");
        btnProductos.setPreferredSize(new java.awt.Dimension(125, 30));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 10);
        pnlInventario.add(btnProductos, gridBagConstraints);

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setText("Reportes");
        btnReportes.setPreferredSize(new java.awt.Dimension(125, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        pnlInventario.add(btnReportes, gridBagConstraints);
        pnlInventario.add(jSeparator1, new java.awt.GridBagConstraints());

        getContentPane().add(pnlInventario, java.awt.BorderLayout.PAGE_END);

        pnLogin.setBackground(new java.awt.Color(44, 44, 44));
        pnLogin.setLayout(new java.awt.GridBagLayout());

        lblUsuario.setForeground(new java.awt.Color(224, 224, 224));
        lblUsuario.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pnLogin.add(lblUsuario, gridBagConstraints);

        txtUsuario.setBackground(new java.awt.Color(74, 74, 74));
        txtUsuario.setColumns(20);
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pnLogin.add(txtUsuario, gridBagConstraints);

        lblContrasena.setForeground(new java.awt.Color(224, 224, 224));
        lblContrasena.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pnLogin.add(lblContrasena, gridBagConstraints);

        pswdUser.setBackground(new java.awt.Color(74, 74, 74));
        pswdUser.setColumns(15);
        pswdUser.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pnLogin.add(pswdUser, gridBagConstraints);

        ckbMostrarContra.setForeground(new java.awt.Color(224, 224, 224));
        ckbMostrarContra.setLabel("Mostrar Contraseña");
        ckbMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbMostrarContraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pnLogin.add(ckbMostrarContra, gridBagConstraints);

        lblMensajeInicioSesion.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblMensajeInicioSesion.setForeground(new java.awt.Color(224, 224, 224));
        lblMensajeInicioSesion.setText("Inicia sesión para continuar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        pnLogin.add(lblMensajeInicioSesion, gridBagConstraints);

        btnIngresar.setBackground(new java.awt.Color(58, 58, 58));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Iniciar Sesión");
        btnIngresar.setPreferredSize(new java.awt.Dimension(150, 27));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 15);
        pnLogin.add(btnIngresar, gridBagConstraints);

        btnRegistrarse.setBackground(new java.awt.Color(58, 58, 58));
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setPreferredSize(new java.awt.Dimension(150, 27));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 20, 10);
        pnLogin.add(btnRegistrarse, gridBagConstraints);

        btnCerrarSesion.setBackground(new java.awt.Color(58, 58, 58));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        pnLogin.add(btnCerrarSesion, gridBagConstraints);

        getContentPane().add(pnLogin, java.awt.BorderLayout.CENTER);

        mnVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-page-properties-report-16.png"))); // NOI18N
        mnVentana.setText("Ventana");

        mnVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnVenta.setSelected(true);
        mnVenta.setText("Registrar Venta");
        mnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-checkout-16.png"))); // NOI18N
        mnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVentaActionPerformed(evt);
            }
        });
        mnVentana.add(mnVenta);

        mnProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnProductos.setSelected(true);
        mnProductos.setText("Ver Productos");
        mnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-open-box-16.png"))); // NOI18N
        mnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProductosActionPerformed(evt);
            }
        });
        mnVentana.add(mnProductos);

        jMenuBar1.add(mnVentana);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void abrirVentanaProductos() {
        if (sesionIniciada) {
            if (objVtnProd == null) {
            objVtnProd = new VtnProducto(this, objProducto);  
            }
            objVtnProd.setVisible(true);
            this.setVisible(false);
        }  else {
            JOptionPane.showMessageDialog(this, "Primero debe iniciar sesión");
        }
    }
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        abrirVentanaProductos();
    }//GEN-LAST:event_btnProductosActionPerformed
    private void abrirVentanaVentas() {
        if (sesionIniciada){
            if (objVtnVenta == null) {
                objVtnVenta = new VtnVenta(this, objProducto);  
            }
            objVtnVenta.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Primero debe iniciar sesión");
        }
    }
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        abrirVentanaVentas();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void mnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVentaActionPerformed
        abrirVentanaVentas();
    }//GEN-LAST:event_mnVentaActionPerformed

    private void mnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProductosActionPerformed
        abrirVentanaProductos();
    }//GEN-LAST:event_mnProductosActionPerformed

    private void ckbMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbMostrarContraActionPerformed
        if (ckbMostrarContra.isSelected()) {
            pswdUser.setEchoChar((char) 0);
        } else {
            pswdUser.setEchoChar('*');
        }
    }//GEN-LAST:event_ckbMostrarContraActionPerformed
    
    private String obtenerContrasena() {
        String pass = "";
        int x;
        char[] password = pswdUser.getPassword();
        for ( x = 0; x < password.length; x++) {
            pass += password[x];
        }
        return pass;
    }
    
    private void mostrarComponentesLogin(boolean estado) {
        lblMensajeInicioSesion.setVisible(estado);
        lblUsuario.setVisible(estado);
        txtUsuario.setVisible(estado);
        lblContrasena.setVisible(estado);
        pswdUser.setVisible(estado);
        ckbMostrarContra.setVisible(estado);
        btnIngresar.setVisible(estado);
        btnRegistrarse.setVisible(estado);
    }
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (validarLogin()) {
            
            String usr  = txtUsuario.getText();
            String pass = obtenerContrasena();
            
            objBD.abrirConexion();
            boolean existe = objBD.buscarUsuarioContrasena(usr, pass);
            objBD.cerrarConecion();
            
            if (existe) {
                pnlInventario.setVisible(true);                
                btnCerrarSesion.setVisible(true);
                mostrarComponentesLogin(false);
                sesionIniciada = true;
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese usuario y contraseña");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        txtUsuario.setText(""); 
        pswdUser.setText("");
        mostrarComponentesLogin(true);
        btnCerrarSesion.setVisible(false);
        pnlInventario.setVisible(false);
        sesionIniciada = false;
        JOptionPane.showMessageDialog(this, "Se cerró la sesión");
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        if (validarLogin()) {
            
            String usr  = txtUsuario.getText();
            String pass = obtenerContrasena();
            
            objBD.abrirConexion();
            boolean existe = objBD.buscarUsuario(usr);
            objBD.cerrarConecion();
            
            if (existe) {
                JOptionPane.showMessageDialog(this, "El usuario que intenta registrar ya existe.");
            } else {
                objBD.abrirConexion();
                objBD.registrarUsuario(usr, pass); 
                JOptionPane.showMessageDialog(this, "Usuario creado con éxito.");
                txtUsuario.setText(""); 
                pswdUser.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese usuario y contraseña.");
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed
    
    private boolean validarLogin() {
        boolean bandera = false;
        
        String pass = "";
        int x;
        char[] password = pswdUser.getPassword();
        for ( x = 0; x < password.length; x++) {
            pass += password[x];
        }

        if ((x > 0) & !txtUsuario.getText().trim().equals("")) {
            bandera = true;
        }
        return bandera;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
    private javax.swing.JCheckBox ckbMostrarContra;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblMensajeInicioSesion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButtonMenuItem mnProductos;
    private javax.swing.JRadioButtonMenuItem mnVenta;
    private javax.swing.JMenu mnVentana;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPasswordField pswdUser;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
