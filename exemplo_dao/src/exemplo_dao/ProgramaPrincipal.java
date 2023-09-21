package exemplo_dao;

import java.sql.Connection;
import java.sql.SQLException;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		//atributo da classe ProgramaPrincipal - conexao (Connection)
		Connection conexao = null;
		
		//Obtém uma conexão com o banco de dados
		try {
			conexao = ConexaoBancoDados.obterConexao();
			System.out.println("Conexão realizada com sucesso!");
		} catch (SQLException e) {
			System.err.println("Erro ao obter a conexão com o Banco de Dados! " + e.getMessage());
			e.printStackTrace();
		}
		
		//criar um objeto DAO de usuário
		UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
		
		//Insere um novo usuário no Banco de Dados
		usuarioDAO.inserir(new Usuario("Silas", "sisi@gatinho.com.br"));
		
		//Alguns testes...
		usuarioDAO.deletar(0);
		usuarioDAO.atualizar(null);
		
		
		
		//fechando a conexão com o banco de dados
		System.out.println("Status: " + ConexaoBancoDados.fecharConexao());
	}
    
}
