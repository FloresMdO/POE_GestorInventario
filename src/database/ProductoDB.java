package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Producto;

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
    
    public Connection abrirConexionJTable() {
         try {
            conn = DriverManager.getConnection(url,usuario,clave);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al conectarse a la base de datos: " + nombreBD);   
        }
        return conn;
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
    
     public Producto buscarProducto(String nombre) {
        Producto objProducto = null;
        ResultSet rs;
        try {
            stConsultar.setString(1, nombre);  
            rs = stConsultar.executeQuery();    // Linea importante para ejecutar sentencia, siempre que se quiera regresar info
            if (rs.next()) {
                objProducto = new Producto();
                objProducto.setNombre(rs.getString("nombre"));
                objProducto.setDescripcion(rs.getString("descripcion"));
                objProducto.setCategoria(rs.getString("categoria"));
                objProducto.setCantidad(rs.getInt("cantidad"));
                objProducto.setPrecio(rs.getDouble("precio"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar producto en la tabla " + nombreBD); 
        }
        return objProducto; 
    }
    
    public void eliminarProducto(Producto objProducto) {
        try {
            stEliminar.setString(1, objProducto.getNombre());
            stEliminar.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar producto de la tabla " + nombreBD);
        }
    }
    
    
}
