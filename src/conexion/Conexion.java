package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 *  @author Grupo 1
 */
public class Conexion {
    public static Connection conectar() {

        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_sitemaventas", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
