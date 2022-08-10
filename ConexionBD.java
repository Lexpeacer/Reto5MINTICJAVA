package reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexionBD {

    public static Connection conectarBD() {
        String dbURL = "jdbc:mysql://localhost:3306/quintoreto";
        String username = "root";
        String contrasena = "admin";

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, contrasena);
            if (conn != null) {
                System.out.println("Conectado");
            }
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
