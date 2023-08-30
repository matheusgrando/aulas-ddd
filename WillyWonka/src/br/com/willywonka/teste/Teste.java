package br.com.willywonka.teste;

import br.com.willywonka.beans.Chocolate;

public class Teste {

	public static void main(String[] args) {

		Chocolate chocolate = new Chocolate();
		
		chocolate.setNome("Deliciosa Bolinha do Willy Wonka");
		chocolate.setPreco(200);
		chocolate.setPeso(11.4);
		chocolate.setTipoChocolate("Amargo");
		chocolate.setFormato("Bolinha");
		
		chocolate.mostrarAtributo();
		
		System.out.println("A soma do peso do produto mais" +
				"a soma do peso da embalagem é " + chocolate.calcularPesoTotal(2.1));

	}

}
