package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Categoria;

public class CategoriaBD {
    
    private String nombreBD = "proyecto_poe";
    private String puerto = "3306"; // 3030
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:" + puerto + "/" + nombreBD + "?useUnicode=true&use" +
                         "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
                         "serverTimezone=GMT-5"; // GMT-5
    
    Connection conn = null;
    
    PreparedStatement stInsertar, stConsultar, stActualizar, stEliminar;
    
    public CategoriaBD(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el driver");
        }
    }
    
     public Connection abrirConexionJLista() {
         try {
            conn = DriverManager.getConnection(url,usuario,clave);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("CATEGORIA: Error al conectarse a la base de datos: " + nombreBD);   
        }
        return conn;
    }
    
    public void abrirConexion() {
        try {
            conn = DriverManager.getConnection(url,usuario,clave);
            stInsertar   = conn.prepareStatement("INSERT INTO Categoria VALUES (?,?)");
            stConsultar  = conn.prepareStatement("SELECT * FROM Categoria WHERE nombre = ?");
            stActualizar = conn.prepareStatement("UPDATE Categoria SET nombre = ?, descripcion = ? WHERE nombre = ?");
            stEliminar   = conn.prepareStatement("DELETE FROM Categoria WHERE nombre = ?");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al conectarse a la base de datos(Categoria): " + nombreBD);   
        }
    }
    
    public void cerrarConexion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("CATEGORIA: Error al cerrar la conexión con la base de datos: " + nombreBD);
        }   
    }
    public void insertarCategoria(Categoria objCategoria) {
        try {
            stInsertar.setString(1, objCategoria.getNombre());
            stInsertar.setString(2, objCategoria.getDescripcion());
            
            stInsertar.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al insertar categoria en la base de datos " + nombreBD);
        }
    }
    
    
    
    public Categoria buscarCategoria(String nombre) {
        Categoria objCategoria = null;
        ResultSet rs;
        try {
            stConsultar.setString(1, nombre);  
            rs = stConsultar.executeQuery();    // Linea importante para ejecutar sentencia, siempre que se quiera regresar info
            if (rs.next()) {
                objCategoria = new Categoria();
                objCategoria.setNombre(rs.getString("nombre"));
                objCategoria.setDescripcion(rs.getString("descripcion"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar categoria en la base de datos " + nombreBD); 
        }
        return objCategoria; 
    }
    
    public void actualizarCategoria(Categoria objCategoria) {
        try {
            stActualizar.setString(1, objCategoria.getNombre());
            stActualizar.setString(2, objCategoria.getDescripcion());
            stActualizar.executeLargeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al actualzar las categoria en la base de datos " + nombreBD);
            
        }
    }
    
    public void eliminarCategoria(Categoria objCategoria) {
        try {
            stEliminar.setString(1, objCategoria.getNombre());
            stEliminar.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar categoria de la base de datos " + nombreBD);
        }
    }
}
