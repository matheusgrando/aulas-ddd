package crude;

import java.sql.Connection;

import oracle.jdbc.pool.OracleDataSource;

public class GerenciadorClientes {
	
	public String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private Connection conn;
	
	public GerenciadorClientes() throws Exception{
		OracleDataSource ods = new OracleDataSource();
		// Configura a URL
		ods.setURL(url);
		// Configura o usuário
		ods.setUser(Credenciais.user);
		// Configurar a senha
		ods.setPassword(Credenciais.pwd);
		
		// Obtendo uma conexão com o JDBC
		conn = ods.getConnection();
	}

}
