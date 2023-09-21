package exemplo_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	
	//atributo privado da classe UsuarioDAO (conexao) : Connection
	private Connection conexao;
	
	//Construtor
	public UsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void inserir(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.prepareStatement("INSERT INTO tb_usuario "
					+ "VALUES(?,?)");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.execute();
			System.out.println("Usuário inserido com sucesso!");
		} catch (SQLException e) {
			System.err.println("Erro ao inserir o usuário! " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void atualizar(Usuario usuario) {
		try {
			PreparedStatement ps = conexao.prepareStatement("UPDATE tb_usuario "
					+ "SET nome = ?, email = ? WHERE id =  ?");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setInt(3, usuario.getId());
			ps.execute();
			System.out.println("Usuário alterado com sucesso!!!");
		} catch (SQLException e) {
			System.err.println("Não foi possível remover o usuário! " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void deletar(int id) {
		try {
			PreparedStatement ps = conexao.prepareStatement("DELETE FROM tb_usuario WHERE id = ?");
			ps.setInt(1, id);
			ps.execute();
			System.out.println("Usuário removido com sucesso!");
		} catch (SQLException e) {
			System.err.println("Não foi possível apagar o usuário " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public List<Usuario> listarTodos(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			PreparedStatement ps = conexao.prepareStatement("SELECT * FROM tb_usuario");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(0); //rs.getString("id")
				String nome = rs.getString(1); //rs.getString("nome")
				String email = rs.getString(2); //rs.getString("email")
				usuarios.add(new Usuario(id, nome, email));
			}
			System.out.println("Lista foi criada!");
		} catch (SQLException e) {
			System.err.println("Não foi possível criar a lista de usuários " + e.getMessage());
			e.printStackTrace();
		}
		return usuarios;
	}
	
	
	public Usuario listarPorId(int id) {
		Usuario usuario = null;
		try {
			PreparedStatement ps = conexao.prepareStatement("SELECT * FROM tb_usuario WHERE id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String nome = rs.getString(1);
				String email = rs.getString(2);
				usuario = new Usuario(id, nome, email);
			}
		} catch (SQLException e) {
			System.err.println("Erro ao buscar pelo usuário " + e.getMessage());
			e.printStackTrace();
		}
		return usuario;
	}	
}