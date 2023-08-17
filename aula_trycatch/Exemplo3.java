package aula_trycatch;

public class Exemplo3 {

	public void caixaAlta() throws NullPointerException {

		String frase = null;
		String novaFrase = null;

		novaFrase = frase.toUpperCase();
		System.out.println("Frase: " + frase);
	}

	public static void main(String[] args) {

		Exemplo3 ex = new Exemplo3();
		try {
			ex.caixaAlta();
		}catch (NullPointerException e) {		
			System.out.println("Ocorreu um erro ao executar o método Exemplo3");
		}

	}

}
