
package visual;

import modelo.Producto;


public class VtnPrincipal extends javax.swing.JFrame {
    
    VtnVenta objVtnVenta = null;
    VtnProducto objVtnProd = null;
    
    Producto objProducto = new Producto();

    public VtnPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 232));

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Gestor de Inventarios");
        jPanel1.add(lblTitulo);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setLayout(new java.awt.GridBagLayout());

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
        jPanel2.add(btnVentas, gridBagConstraints);

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
        jPanel2.add(btnProductos, gridBagConstraints);

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setText("Reportes");
        btnReportes.setPreferredSize(new java.awt.Dimension(125, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        jPanel2.add(btnReportes, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        if (objVtnProd == null) {
            objVtnProd = new VtnProducto(this, objProducto);  
        }
        objVtnProd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        if (objVtnVenta == null) {
            objVtnVenta = new VtnVenta(this, objProducto);  
        }
        objVtnVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

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
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
