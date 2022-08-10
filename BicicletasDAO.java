package reto5;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BicicletasDAO {
    
    public static boolean insertarBicicletas(Connection conn, Bicicletas bicicletas){
        int filasAfectadas = 0;
        String sql="INSERT INTO bicicletas(bici_fabric_nom, bici_precio,"
                + "bici_anno_constr) values"
                + "(?, ?, ?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, bicicletas.getBici_fabric_nom());
            statement.setInt(2, bicicletas.getBici_precio());
            statement.setInt(3, bicicletas.getBici_anno_constr());
            
            filasAfectadas=statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR INSERCIÓN EN BICICLETAS EN SQL");
            ex.printStackTrace();
        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
      }
    
    public static ArrayList<Bicicletas> obtenerBicicletas(Connection conn) {
        ArrayList<Bicicletas> listaBicicletas = new ArrayList<>();
        String sql = "select bici_fabric_nom, bici_precio, bici_anno_constr from bicicletas where bici_anno_constr>=2019 order by bici_fabric_nom";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString(1);
                int precio = resultado.getInt(2);
                int anno = resultado.getInt(3);
                Bicicletas bicicletas = new Bicicletas(nombre,precio,anno);
                listaBicicletas.add(bicicletas);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        return listaBicicletas;
    }
    
    public static boolean actualizarBicicletas(Connection conn) {
        int filasAfectadas = 0;
        String sql = "update bicicletas set bici_anno_constr=2017 where bici_fabric_nom=\"Cannondale\"";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            filasAfectadas=statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        if(filasAfectadas > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static ArrayList<Bicicletas> conteo(Connection conn) {
        ArrayList<Bicicletas> contador = new ArrayList<>();
        String sql = "select bici_fabric_nom from bicicletas where bici_anno_constr>=2019;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                String fabric_nomb = resultado.getString(1);
                Bicicletas intencCompra = new Bicicletas(fabric_nomb);
                contador.add(intencCompra);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        return contador;
    }
    
}