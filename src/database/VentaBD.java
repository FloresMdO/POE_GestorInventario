package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Venta;


public class VentaBD {
    
    private String nombreBD = "proyecto_poe";
    private String puerto = "3306"; // 3030
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:" + puerto + "/" + nombreBD + "?useUnicode=true&use" +
                         "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&" + 
                         "serverTimezone=GMT-5"; // GMT-5
    
    Connection conn = null;
    
    PreparedStatement stActualizar;
    
    public VentaBD(){
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
            stActualizar = conn.prepareStatement("UPDATE Venta SET ganancias = ganancias + ?, ventas = ventas + ? WHERE nombre = ?");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("VENTA: Error al conectarse a la base de datos: " + nombreBD);   
        }
    }
    
    public void cerrarConexion() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("VENTA: Error al cerrar la conexión con la base de datos: " + nombreBD);
        }   
    }
    
    public void actualizarVenta(Venta objVenta){
        try {            
            stActualizar.setDouble(1, objVenta.getGanancia());
            stActualizar.setInt(2, objVenta.getNumVendido());
            stActualizar.setString(3, objVenta.getSucursal());
            stActualizar.executeLargeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("VENTA: Error al actualzar las categoria en la base de datos " + nombreBD);
            
        }
    }
    
}
