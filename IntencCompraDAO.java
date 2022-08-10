package reto5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IntencCompraDAO {
  public static boolean insertarIntencCompra(Connection conn, IntencCompra intencCompra){
        int filasAfectadas = 0;
        String sql="INSERT INTO Intencion_Compra(comp_clien_alias,"
                + "comp_fabric_nom, comp_fecha_hora) values"
                + "(?, ?, ?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, intencCompra.getComp_clien_alias());
            statement.setString(2, intencCompra.getComp_fabric_nom());
            statement.setString(3, intencCompra.getComp_fecha_hora());
           
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
  
  public static ArrayList<IntencCompra> obtenerIntencCompra(Connection conn) {
        ArrayList<IntencCompra> listaIntencCompra = new ArrayList<>();
        String sql = "select comp_fabric_nom from intencion_compra where comp_clien_alias=\"lucky\" order by comp_fabric_nom";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString(1);
                IntencCompra intencCompra = new IntencCompra(nombre);
                listaIntencCompra.add(intencCompra);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR EN CONSULTA SQL");
            ex.printStackTrace();
        }
        return listaIntencCompra;
    }
  
  public static boolean borrarIntCompra(Connection conn) {
        int filasAfectadas = 0;
        String sql = "delete from intencion_compra where comp_clien_alias=\"green\" and comp_fabric_nom=\"Trek\"";
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
      
}