package aula_interface;

public class ControleRemotoTeste {

	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto();
		cr.abrirMenu();
		cr.ligar();
		cr.abrirMenu();
		
		System.out.println("Volume: " + cr.getVolume());
		cr.aumentarVolume();
		System.out.println("Volume: " + cr.getVolume());
		
		cr.play();
		cr.ativarMudo();
		cr.abrirMenu();
		
		cr.desativatMudo();
		System.out.println("Volume: " + cr.getVolume());
		
		cr.abrirMenu();
		cr.fecharMenu();
		
		cr.desligar();
	}

}
