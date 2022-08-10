package reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProveedorDAO {

    public static boolean insertarProveedor(Connection conn, Proveedor proveedor) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO proveedor(prov_id, prov_nom, prov_dir, "
                + "prov_tel) Values"
                + "(?, ?, ?, ?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, proveedor.getIdentificacion());
            statement.setString(2, proveedor.getNombre());
            statement.setString(3, proveedor.getDireccion());
            statement.setString(4, proveedor.getTelefono());
            filasAfectadas = statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACIÓN MOTOCICLETA EN SQL");
        }

        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }
}