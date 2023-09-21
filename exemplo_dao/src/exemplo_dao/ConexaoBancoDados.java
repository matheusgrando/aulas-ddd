package exemplo_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {
    
	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private static final String USER = Credenciais.USER;
	private static final String PWD = Credenciais.PWD;
	private static Connection conexao;
	
	
	public static Connection obterConexao() throws SQLException {
		conexao = DriverManager.getConnection(URL, USER, PWD);
		return conexao;
	}
	
	public static boolean fecharConexao() {
		try {
			conexao.close();
			System.out.println("Fechando a conexão com o banco de dados...");
			return true;
		} catch (SQLException e) {
			System.err.println("Não foi possível fechar a conexão! " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

}
