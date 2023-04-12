package br.com.fiap.main;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;

public class TesteBanco {

	public static void main(String[] args) {

		// Instanciar objetos
		Banco objetoBanco = new Banco();
		Cliente objetoCliente = new Cliente();
		Endereco objetoEndereco = new Endereco();

		// Entrada
		// Banco
		objetoBanco.setNome("FiapBank");
		objetoBanco.setAgencia(123);
		objetoBanco.setCliente(objetoCliente);
		objetoBanco.setEndereco(objetoEndereco);

		// Cliente
		objetoCliente.setNomeCliente("Rafa");
		objetoCliente.setIdade(38);
		objetoCliente.setRg("3335555");
		objetoCliente.setNumeroCartao(321);

		// Endereco
		objetoEndereco.setLogradouro("Rua Arroio Triunfo");
		objetoEndereco.setNumero(295);
		objetoEndereco.setBairro("Cid. Tiradentes");
		objetoEndereco.setMunicipio("São Paulo");

		// Saídas
		System.out.println("Nome do Banco: " + objetoBanco.getNome() + "\nAgencia: " + objetoBanco.getAgencia()
				+ "\nNome do Cliente: " + objetoBanco.getCliente().getNomeCliente() + "\nIdade: "
				+ objetoBanco.getCliente().getIdade() + "\nRG: " + objetoBanco.getCliente().getRg()
				+ "\nNumero do Cartão do Cliente: " + objetoBanco.getCliente().getNumeroCartao() + "\nLogradouro: "
				+ objetoBanco.getEndereco().getLogradouro() + "\nNumero: " + objetoBanco.getEndereco().getNumero()
				+ "\nBairro: " + objetoBanco.getEndereco().getBairro() + "\nMunicipio: "
				+ objetoBanco.getEndereco().getMunicipio());
	}

}
