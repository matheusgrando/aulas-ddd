package br.com.willywonka.beans;

public class Chocolate extends Produto {

	private String formato;

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void mostrarAtributo() {
		System.out.println("O nome do produto é " + getNome() +
				"\n O preço do produto é " .getPreco() + 
				"\n O peso do produto é " + getPeso() +
				"\n O tipo de chocolate desse produto é " + getTipoChocolate() +
				"\n O formato desse chocolate é " + getFormato());
	}
	
	public double calcularPesoTotal(double pesoEmbalagem) {
		double soma = 2.1 + getPeso();
		return soma;
	}

}
