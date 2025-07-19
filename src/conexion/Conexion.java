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
        String url = "jdbc:mysql://server246880276.mysql.database.azure.com:3306/flexibleserverdb??useSSL=true&sslMode=REQUIRED&serverTimezone=UTC";
        try {

            Connection cn = (Connection) DriverManager.getConnection(url, "sombersnail5", "PclU0U1wf1e1YPdOhfgUfQ");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
