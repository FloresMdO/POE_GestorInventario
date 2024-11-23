package database;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Producto;

// Librerias para manejo de la JTable
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDB {
    
    private String nombreBD = "proyecto_poe";
    private String puerto = "3030";
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:" + puerto +"/" + nombreBD + "?useUnicode=true&use" +
                         "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
                         "serverTimezone=GMT-5"; // GMT-5
    
    Connection conn = null;
    
    PreparedStatement stInsertar, stConsultar, stActualizar, stEliminar;
    
    public ProductoDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el driver");
        }
    }
    
    public void abrirConexion() {
        try {
            conn = DriverManager.getConnection(url,usuario,clave);
            stInsertar   = conn.prepareStatement("INSERT INTO Producto VALUES (?,?,?,?,?)");
            stConsultar  = conn.prepareStatement("SELECT * FROM Producto WHERE nombre = ?");
            stActualizar = conn.prepareStatement("UPDATE Producto SET nombre = ?, descripcion = ?, categoria = ?, cantidad = ?, precio = ? WHERE nombre = ?");
            stEliminar   = conn.prepareStatement("DELETE FROM Producto WHERE nombre = ?");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al conectarse a la base de datos: " + nombreBD);   
        }
    }
    
    public void cerrarConecion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al cerrar la conexión con la base de datos: " + nombreBD);
        }   
    }
    
    public void insertarProducto(Producto objPr) {
        try {
            stInsertar.setString(1, objPr.getNombre());
            stInsertar.setString(2, objPr.getDescripcion());
            stInsertar.setString(3, objPr.getCategoria());
               stInsertar.setInt(4, objPr.getCantidad());
            stInsertar.setDouble(5, objPr.getPrecio());
            
            stInsertar.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar registro en la tabla " + nombreBD);
        }
    }
    

    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        
        String query = "SELECT * FROM productos"; // Cambia esto por el nombre correcto de tu tabla
        
        try (Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Maneja el error de la consulta
        }
        return productos;
    }



    
    
    
    
    
    
    
}
