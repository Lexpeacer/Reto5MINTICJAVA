package reto5;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientesDAO {
  public static boolean insertarClientes(Connection conn, Clientes clientes){
        int filasAfectadas = 0;
        String sql="INSERT INTO clientes(clien_alias, clien_nom, clien_ape,"
                + "clien_email, clien_cel, clien_contras, clien_fnac) values"
                + "(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, clientes.getClien_alias());
            statement.setString(2, clientes.getClien_nom());
            statement.setString(3, clientes.getClien_ape());
            statement.setString(4, clientes.getClien_email());
            statement.setString(5, clientes.getClien_cel());
            statement.setInt(6, clientes.getClien_contras());
            statement.setString(7, clientes.getClien_fnac());
            
            
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
  
  public static boolean actualizarCelNinja(Connection conn) {
        int filasAfectadas = 0;
        String sql = "update clientes set clien_cel=3115678432 where clien_alias=\"ninja\"";
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
  
    public static ArrayList<Clientes> obtenerIntenClient(Connection conn) {
            ArrayList<Clientes> listaIntenClient = new ArrayList<>();
            String sql = "select c.clien_alias, c.clien_nom, c.clien_ape from clientes c, intencion_compra i where i.comp_clien_alias=c.clien_alias and i.comp_fabric_nom=\"Yeti\" order by c.clien_alias";
            try {
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultado = statement.executeQuery();

                while (resultado.next()) {
                    String alias = resultado.getString(1);
                    String nombre = resultado.getString(2);
                    String apellido = resultado.getString(3);
                    Clientes clientes = new Clientes(alias, nombre, apellido);
                    listaIntenClient.add(clientes);
                }
            } catch (SQLException ex) {
                System.out.println("ERROR EN CONSULTA SQL");
                ex.printStackTrace();
            }
            return listaIntenClient;
        }
}   