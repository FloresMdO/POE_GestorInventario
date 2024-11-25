
package modelo;

import database.ProductoDB;

public class PrincipalInventario {
    
    public static void main(String[] args) {
        ProductoDB objBD = new ProductoDB();
        
        objBD.abrirConexion();
        objBD.cerrarConexion();      
    }
}
