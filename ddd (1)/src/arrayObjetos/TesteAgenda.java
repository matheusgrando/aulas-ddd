package arrayObjetos;

public class TesteAgenda {

	public static void main(String[] args) {

		GerenciadorContatos gc = new GerenciadorContatos(3);
		
		gc.adicionar();
		gc.mostrarContatos();
	}

}
