package br.com.fiap.beans;

public class Banco {
	
	// visibilidade, tipo de dado e nome da variável
	private String nome;
	private int agencia;
	private Cliente cliente;
	private Endereco endereco;
	
	// Setters (Entrada)
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}
	
	// Getters (Saída)
	public String getNome () {
		return nome;
	} 
	
	public int getAgencia () {
		return agencia;
	}
	
	public Cliente getCliente () {
		return cliente;
	}
	
	public Endereco getEndereco () {
		return endereco;
	}
}
