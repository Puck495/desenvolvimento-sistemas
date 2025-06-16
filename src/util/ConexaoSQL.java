package util;
import java.sql.*;

public class ConexaoSQL {
    
    public Connection conn;
    
    public static Connection conectar() throws ClassNotFoundException{
    
    Connection conn = null;
    
    String driverName = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/bd_controletarefas";
    String userName = "root";
    String password = "Senha@123";
    
        try {
            Class.forName(driverName);
        conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexão Bem Sucedida!");
            return conn;
        } catch (SQLException x) {
            System.err.println("Conexão Falhou...");
            return null;
        }
            }  
    
    public PreparedStatement criarPreparedStatement (String pSQL, int RETURN_GENERATED_KEYS){
        try {
            return conn.prepareStatement(pSQL, RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public boolean desconectar(){
        try {
            if (!this.conn.isClosed()){
                this.conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
