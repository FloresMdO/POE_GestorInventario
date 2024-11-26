package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuariosBD {
    
    private String nombreBD = "proyecto_poe";
    private String puerto = "3306"; // 3030
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:" + puerto +"/" + nombreBD + "?useUnicode=true&use" +
                         "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
                         "serverTimezone=GMT-5"; // GMT-5
    
    Connection conn = null;
    
    PreparedStatement stInsertar, stConsultar, stConsultarUsr;
    
    public UsuariosBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al cargar el driver");
        }
    }
    
    public void abrirConexion() {
        try {
            conn = DriverManager.getConnection(url,usuario,clave); // urlanterior: jdbc:mysql://127.0.0.1/escuela3n?serverTimezone=UTF-8
            stInsertar     = conn.prepareStatement("INSERT INTO Usuarios VALUES (?,?)");
            stConsultar    = conn.prepareStatement("SELECT usuario, contrasena FROM Usuarios WHERE usuario = ? and contrasena = ?");
            stConsultarUsr = conn.prepareStatement("SELECT usuario FROM Usuarios WHERE usuario = ?");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Ewe no me pude conectar a la base de datos");   
        }
    }
    
    public void cerrarConecion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("No pude cerrar la conexión bro");
        }   
    }
    
    public void registrarUsuario(String usuario, String contrasena) {
        try {
            stInsertar.setString(1, usuario);
            stInsertar.setString(2, contrasena);
            
            stInsertar.execute(); // Linea importante para ejecutar la sentencia
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("No se pudo insertar el registro en la tabla Usuarios");
        }
    }
    
    public boolean buscarUsuarioContrasena(String usuario, String contrasena) {
        boolean existe = false;
        ResultSet rs;
        try {
            stConsultar.setString(1, usuario); 
            stConsultar.setString(2, contrasena); 
            
            rs = stConsultar.executeQuery();    // Linea importante para ejecutar sentencia, siempre que se quiera regresar info
            if (rs.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al generar la consulta en de Usuario en la BD"); 
        }
        return existe; 
    }
    
    public boolean buscarUsuario(String usuario) {
        boolean existe = false;
        ResultSet rs;
        try {
            stConsultarUsr.setString(1, usuario); 
            
            rs = stConsultarUsr.executeQuery();    // Linea importante para ejecutar sentencia, siempre que se quiera regresar info
            if (rs.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al generar la consulta en de Usuario en la BD"); 
        }
        return existe; 
    }
    
}
