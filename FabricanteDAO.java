package reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FabricanteDAO {

    public static boolean insertarFabricante(Connection conn, Fabricante fabricante) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO fabricante(fabric_nom) Values (?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fabricante.getNombre());
            filasAfectadas = statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACIÓN FABRICANTE EN SQL");
            ex.printStackTrace();
        }

        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }

        public static ArrayList<Fabricante> obtenerFabricante(Connection conn) {
        ArrayList<Fabricante> listaFabricante = new ArrayList<>();
        String sql = "SELECT * FROM fabricante";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString(1);
                Fabricante fabricante = new Fabricante(nombre);
                listaFabricante.add(fabricante);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        return listaFabricante;
    }
    
}