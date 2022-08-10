package reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MotocicletaDAO {

    public static boolean insertarMotocicleta(Connection conn, Motocicleta motocicleta) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO motocicleta(moto_fabric_nom, moto_precio, moto_aut_bateria,"
                + "moto_prov_id) Values"
                + "(?, ?, ?, ?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, motocicleta.getFabricanteNombre());
            statement.setInt(2, motocicleta.getPrecio());
            statement.setInt(3, motocicleta.getAutonomiaBateria());
            statement.setInt(4, motocicleta.getProveedorIdentificacion());
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
    
    public static ArrayList<Motocicleta> obtenerMotocicleta(Connection conn) {
        ArrayList<Motocicleta> listaMotocicleta = new ArrayList<>();
        String sql = "select moto_fabric_nom from motocicleta where moto_prov_id=101";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

          while (resultado.next()) {
                String nombre = resultado.getString(1);
                Motocicleta motocicleta = new Motocicleta(nombre);
                listaMotocicleta.add(motocicleta);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        return listaMotocicleta;
    }
}