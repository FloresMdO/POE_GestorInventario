package visual;

import modelo.Producto;
import modelo.Venta;

import database.ProductoDB;
import database.VentaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VtnVenta extends javax.swing.JFrame {
    
    VtnPrincipal objVtnPrin = null;
    ProductoDB objBD = new ProductoDB();
    Producto objProducto = new Producto();
    VentaBD objVentaBD = new VentaBD();
    Venta objVenta = new Venta();
    
    
    public VtnVenta() {
        initComponents();
    }
    
    public VtnVenta(VtnPrincipal objVtnPrin, Producto objProducto) {
        this.objVtnPrin = objVtnPrin;
        this.objProducto = objProducto;
        initComponents();
        actualizarTabla();
    }
    
    private void limpiarCampos(){
        bgSucursales.clearSelection();
        spCantidad.setValue(0);
    }
    private void redibujarTabla(){
        DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
        tblModel.setValueAt(objProducto.getCantidad(), tblDatos.getSelectedRow(), 2);
    }
   
 
    
    private void actualizarTabla() {
        // ---------- Lógica para JTable ----------
        // Codigo obtenido de https://www.youtube.com/watch?v=frafcK6fhdQ
 
        try {
            Connection conn = objBD.abrirConexionJTable();
            Statement stmt = conn.createStatement(); 
            String query = "SELECT * FROM Producto";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String nombre      = rs.getString("nombre");
                String categoria   = rs.getString("categoria");
                String cantidad    = String.valueOf(rs.getInt("cantidad"));
                String precio      = String.valueOf(rs.getInt("precio"));
                
                String tbData[] = {nombre,categoria,cantidad,precio};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
                
                tblModel.addRow(tbData); 
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja el error de la consulta
        }
        objBD.cerrarConexion();
        // ---------- Lógica para JTable ----------
    }    
    
    private boolean validar_campos(){
        if(tblDatos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Seleccione el producto a registrar");
            return false;
        }
        if(!rbBenito.isSelected() && !rbLomas.isSelected()){
            JOptionPane.showMessageDialog(this, "Seleccione la sucursal");
            return false;
        }
        if(objProducto.getCantidad() < (Integer)spCantidad.getValue()){
            JOptionPane.showMessageDialog(this, "La cantidad vendida es mayor al almacen");
            return false;
        }
        return true;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgSucursales = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        btnVenda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblProducto = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        rbLomas = new javax.swing.JRadioButton();
        rbBenito = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar nueva venta");
        jPanel1.add(lblTitulo);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        btnRegresar.setBackground(new java.awt.Color(25, 118, 210));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblCantidad.setText("Ingresa cantidad vendida:");

        btnVenda.setBackground(new java.awt.Color(25, 118, 210));
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Confirmar venta");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Categoria", "Cantidad", "Precio"
            }
        ));
        tblDatos.setMinimumSize(new java.awt.Dimension(30, 40));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);

        lblProducto.setText("Seleccione el producto");

        lblSucursal.setText("Seleccione la sucursal");

        bgSucursales.add(rbLomas);
        rbLomas.setText("Lomas Turbas");
        rbLomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLomasActionPerformed(evt);
            }
        });

        bgSucursales.add(rbBenito);
        rbBenito.setText("Benito Camela");
        rbBenito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBenitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(rbBenito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbLomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(btnVenda)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblCantidad)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(lblProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbLomas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbBenito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenda)
                .addGap(80, 80, 80))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        limpiarCampos();
        objVtnPrin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void rbLomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLomasActionPerformed
        // TODO add your handling code here:
        objVenta.setSucursal("Lomas");
    }//GEN-LAST:event_rbLomasActionPerformed

        
        
    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        if(validar_campos()){
            objVenta.setNumVendido((Integer)spCantidad.getValue());
            objVenta.setGanancia(objProducto.getPrecio() * objVenta.getNumVendido());
            
            objVentaBD.abrirConexion();
            objVentaBD.actualizarVenta(objVenta);
            objVentaBD.cerrarConexion();
            JOptionPane.showMessageDialog(this, "Se registro la venta correctamente.");
            
            
            objBD.abrirConexion();
            objProducto = objBD.buscarProducto(objProducto.getNombre());
            objProducto.setCantidad(objProducto.getCantidad() - (Integer)spCantidad.getValue());
            objBD.actualizarProducto(objProducto, objProducto.getNombre());
            objBD.cerrarConexion();
            
            redibujarTabla();
            
        }
        
    }//GEN-LAST:event_btnVendaActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
        int selectedrowindex = tblDatos.getSelectedRow();
        
        objProducto.setNombre(tblModel.getValueAt(selectedrowindex, 0).toString());
        objProducto.setCategoria(tblModel.getValueAt(selectedrowindex, 1).toString());
        objProducto.setCantidad(Integer.parseInt(tblModel.getValueAt(selectedrowindex, 2).toString()));
        objProducto.setPrecio(Double.parseDouble(tblModel.getValueAt(selectedrowindex, 3).toString()));
    }//GEN-LAST:event_tblDatosMouseClicked

    private void rbBenitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBenitoActionPerformed
        // TODO add your handling code here:
        objVenta.setSucursal("Benito");
    }//GEN-LAST:event_rbBenitoActionPerformed

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
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSucursales;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbBenito;
    private javax.swing.JRadioButton rbLomas;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
