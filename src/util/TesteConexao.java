package util;
import java.sql.*;

public class TesteConexao {
    public static void main(String[] args) throws ClassNotFoundException{
     //ConexaoSQL.conectar();
     
        try {
            // estabelece
            Connection conn = ConexaoSQL.conectar();
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão Aberta");
            }
            ConexaoSQL conexao = new ConexaoSQL();
            conexao.conn = conn;
            boolean desconectou = conexao.desconectar();
            if (desconectou && conn.isClosed()){
                System.out.println("Conexão Fechada.");
            }else{
                System.out.println("Falha ao Fechar!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
