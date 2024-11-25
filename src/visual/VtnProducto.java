package visual;

import javax.swing.table.DefaultTableModel;
import modelo.Producto;

import database.CategoriaBD;
import database.ProductoDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.sql.Connection;


public class VtnProducto extends javax.swing.JFrame {
    
    //DefaultTableModel modeloTabla = null; // Creado por Gio
    
    private JTable tablaProductos;
    private DefaultTableModel modeloTabla;
    
    ProductoDB objBD = new ProductoDB();
    CategoriaBD categoriaBD = new CategoriaBD();
    
    Producto objProducto = new Producto();
    VtnPrincipal objVtnPrin = null;
    VtnCategoria objVtnCateg = null;
    

    public VtnProducto(VtnPrincipal objVtnPrin,Producto objProducto) {
        this.objVtnPrin = objVtnPrin;
        this.objProducto = objProducto;
        initComponents();
        
        actualizarTabla();
        actualizarCategorias();
    }
    
    public VtnProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        Boddy = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblNombreProducto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnAgregar = new javax.swing.JRadioButtonMenuItem();
        mnEditar = new javax.swing.JRadioButtonMenuItem();
        mnEliminar = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnRegresar = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(60, 63, 65));
        Header.setLayout(new java.awt.CardLayout(70, 20));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Productos");
        Header.add(lblTitulo, "card2");

        jPanel1.add(Header, java.awt.BorderLayout.PAGE_START);

        Boddy.setBackground(new java.awt.Color(245, 245, 245));
        Boddy.setLayout(new java.awt.GridBagLayout());

        tblDatos.setAutoCreateRowSorter(true);
        tblDatos.setBackground(new java.awt.Color(255, 255, 255));
        tblDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 71, 90)));
        tblDatos.setForeground(new java.awt.Color(0, 0, 0));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Categoria", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setGridColor(new java.awt.Color(255, 255, 255));
        tblDatos.setSelectionBackground(new java.awt.Color(208, 230, 255));
        tblDatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        Boddy.add(jScrollPane2, gridBagConstraints);

        lblNombreProducto.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreProducto.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Boddy.add(lblNombreProducto, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setColumns(15);
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        Boddy.add(txtNombre, gridBagConstraints);

        lblDescripcion.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Boddy.add(lblDescripcion, gridBagConstraints);

        txtaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtaDescripcion.setColumns(20);
        txtaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        Boddy.add(jScrollPane1, gridBagConstraints);

        lblCategoria.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Categoría");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Boddy.add(lblCategoria, gridBagConstraints);

        cmbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cmbCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCategoriaMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        Boddy.add(cmbCategoria, gridBagConstraints);

        lblCantidad.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Boddy.add(lblCantidad, gridBagConstraints);

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spCantidad.setPreferredSize(new java.awt.Dimension(100, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        Boddy.add(spCantidad, gridBagConstraints);

        lblPrecio.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        Boddy.add(lblPrecio, gridBagConstraints);

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        Boddy.add(txtPrecio, gridBagConstraints);

        btnEditar.setBackground(new java.awt.Color(255, 183, 77));
        btnEditar.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(95, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        Boddy.add(btnEditar, gridBagConstraints);

        btnAgregar.setBackground(new java.awt.Color(102, 187, 106));
        btnAgregar.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(95, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        Boddy.add(btnAgregar, gridBagConstraints);

        btnEliminar.setBackground(new java.awt.Color(239, 83, 80));
        btnEliminar.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(95, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        Boddy.add(btnEliminar, gridBagConstraints);

        btnRegresar.setBackground(new java.awt.Color(25, 118, 210));
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        Boddy.add(btnRegresar, gridBagConstraints);

        btnCategoria.setBackground(new java.awt.Color(25, 118, 210));
        btnCategoria.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setText("Crear Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        Boddy.add(btnCategoria, gridBagConstraints);

        jPanel1.add(Boddy, java.awt.BorderLayout.CENTER);

        jMenu2.setText("Editar");

        jMenu4.setText("Acciones");

        mnAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnAgregar.setSelected(true);
        mnAgregar.setText("Agregar producto");
        mnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAgregarActionPerformed(evt);
            }
        });
        jMenu4.add(mnAgregar);

        mnEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEditar.setSelected(true);
        mnEditar.setText("Editar producto");
        mnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditarActionPerformed(evt);
            }
        });
        jMenu4.add(mnEditar);

        mnEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnEliminar.setSelected(true);
        mnEliminar.setText("Eliminar producto");
        mnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEliminarActionPerformed(evt);
            }
        });
        jMenu4.add(mnEliminar);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Ventana");

        jMenu3.setText("Acciones");

        mnRegresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnRegresar.setSelected(true);
        mnRegresar.setText("Regresar");
        mnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegresarActionPerformed(evt);
            }
        });
        jMenu3.add(mnRegresar);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
                String descripcion = rs.getString("descripcion");
                String categoria   = rs.getString("categoria");
                String cantidad    = String.valueOf(rs.getInt("cantidad"));
                String precio      = String.valueOf(rs.getInt("precio"));
                
                String tbData[] = {nombre,descripcion,categoria,cantidad,precio};
                DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
                
                tblModel.addRow(tbData); 
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja el error de la consulta
        }
        objBD.cerrarConexion();
        // ---------- Lógica para JTable ----------
    }    
    
    private void actualizarCategorias(){
        cmbCategoria.removeAllItems();
        cmbCategoria.addItem("-");
        try {
            Connection conn = categoriaBD.abrirConexionJLista();
            Statement stmt = conn.createStatement(); 
            String query = "SELECT * FROM Categoria";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String nombre      = rs.getString("nombre");
                cmbCategoria.addItem(nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja el error de la consulta
        }
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objVtnPrin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
    public void regresarVentana() {
        objVtnPrin.setVisible(true);
        this.setVisible(false);
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        regresarVentana();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        if (objVtnCateg == null) {
            objVtnCateg = new VtnCategoria(this);  
        }
        objVtnCateg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCategoriaActionPerformed
    private void limpiarCampos() {
        txtNombre.setText("");
        txtaDescripcion.setText("");
        cmbCategoria.setSelectedItem("-");
        spCantidad.setValue(0);
        txtPrecio.setText("");
    }
    
    private boolean validarCampos() {
        boolean bandera = false;
        String categoriaSeleccion = (String) cmbCategoria.getSelectedItem();
        if (!txtNombre.getText().trim().equals("") & !txtaDescripcion.getText().trim().equals("") & !txtPrecio.getText().trim().equals("")) {
            if ((categoriaSeleccion != "-" || !categoriaSeleccion.isEmpty())) {
                bandera = true;
            }
        }
        return bandera;
    }
    
    private void obtenerInfoCampos() {
        objProducto.setNombre(txtNombre.getText());
        objProducto.setCantidad((Integer)(spCantidad.getValue()));
        objProducto.setCategoria(cmbCategoria.getItemAt(cmbCategoria.getSelectedIndex()));
        objProducto.setDescripcion(txtaDescripcion.getText());
        objProducto.setPrecio(Float.parseFloat(txtPrecio.getText()));
    }
    
    private void aregarProducto() {
        if (validarCampos()) {
           DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
           
            obtenerInfoCampos();
            
            tblModel.addRow(new Object[] {
                objProducto.getNombre(), objProducto.getDescripcion() , objProducto.getCategoria(), objProducto.getCantidad(), objProducto.getPrecio()
            });
            
            // Todo esto lo saque de este video: https://www.youtube.com/watch?v=A7pKIGhTokQ
                    
            objBD.abrirConexion();
            objBD.insertarProducto(objProducto);
            objBD.cerrarConexion();
            
            JOptionPane.showMessageDialog(this, "Producto creado con éxito");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Para agregar un nuevo producto, llene todos los campos");
        }
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        aregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void eliminarProducto() {
        DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
        int selectedrowindex = tblDatos.getSelectedRow();
            
        //Checa que este seleccionando algo.
        if(tblDatos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione el producto a eliminar");
        } else {
            //modeloTabla.removeRow(tblDatos.getSelectedRow());
            
            String buscando = txtNombre.getText();
            
            objBD.abrirConexion();
            objProducto = objBD.buscarProducto(buscando);
            objBD.cerrarConexion();
            
            if (objProducto != null) {
                tblModel.removeRow(tblDatos.getSelectedRow());
                
                objBD.abrirConexion();
                objBD.eliminarProducto(objProducto);
                objBD.cerrarConexion();
                
                JOptionPane.showMessageDialog(this, "Producto eliminado corectamente");
                limpiarCampos();
            }
        } 
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void editarProducto() {
        DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
        int selectedrowindex = tblDatos.getSelectedRow();
            
        //Checa que este seleccionando algo.
        if(tblDatos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione el producto que desea editar");
        } else {
            if (validarCampos()) {
                String buscando = tblModel.getValueAt(selectedrowindex, 0).toString();
                System.out.println(buscando);

                objBD.abrirConexion();
                objProducto = objBD.buscarProducto(buscando);
                objBD.cerrarConexion();
                
                if (objProducto != null) {
                    obtenerInfoCampos();
                    objBD.abrirConexion();
                    objBD.actualizarProducto(objProducto, buscando);
                    objBD.cerrarConexion();
                    
                    JOptionPane.showMessageDialog(this, "Producto modificado exitosamente");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos");
            }
        }
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarProducto();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)tblDatos.getModel();
        int selectedrowindex = tblDatos.getSelectedRow();
        
        txtNombre.setText(tblModel.getValueAt(selectedrowindex, 0).toString());
        txtaDescripcion.setText(tblModel.getValueAt(selectedrowindex, 1).toString());
        cmbCategoria.setSelectedItem(tblModel.getValueAt(selectedrowindex, 2));
        spCantidad.setValue(Integer.valueOf(tblModel.getValueAt(selectedrowindex, 3).toString()));
        txtPrecio.setText(tblModel.getValueAt(selectedrowindex, 4).toString());
    }//GEN-LAST:event_tblDatosMouseClicked

    private void cmbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCategoriaMouseClicked
        actualizarCategorias();
    }//GEN-LAST:event_cmbCategoriaMouseClicked

    private void mnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegresarActionPerformed
        regresarVentana();
    }//GEN-LAST:event_mnRegresarActionPerformed

    private void mnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAgregarActionPerformed
        aregarProducto();
    }//GEN-LAST:event_mnAgregarActionPerformed

    private void mnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditarActionPerformed
        editarProducto();
    }//GEN-LAST:event_mnEditarActionPerformed

    private void mnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEliminarActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_mnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Boddy;
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButtonMenuItem mnAgregar;
    private javax.swing.JRadioButtonMenuItem mnEditar;
    private javax.swing.JRadioButtonMenuItem mnEliminar;
    private javax.swing.JRadioButtonMenuItem mnRegresar;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
