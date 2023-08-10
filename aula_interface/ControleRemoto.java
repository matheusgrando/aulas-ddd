package aula_interface;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Método Construtor
	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		this.volume = volume;
		this.ligado = ligado;
		this.tocando = tocando;
	}
	
	public ControleRemoto() {
		this.volume = 20;
		this.ligado = false;
		this.tocando = false;
	}
	
	// Getters e Setters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	

	@Override
	public void ligar() {
		System.out.println("**-- Ligando o aparelho --**");
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		System.out.println("**-- Desigando o aparelho --**");
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("**-- Abrindo o menu --**");
		System.out.println("Está ligado?" + this.isLigado());
		System.out.println("Está tocando?" + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
	}

	@Override
	public void fecharMenu() {
		if(this.isLigado()) {
			System.out.println("**-- Fechando o menu --**");
		}else {
			System.out.println("**-- Não foi possível fechar o menu --**");
		}
	}

	@Override
	public void aumentarVolume() {
		if(this.isLigado()) {
			if(this.getVolume() > 100) {
				this.setVolume(this.getVolume() + 5);
			}else{
				System.out.println("Volume MÁXIMO - 100%");
			}
		}else {
			System.out.println("Aparelho Desligado!");
		}
	}

	@Override
	public void diminuirVolume() {
		if(this.ligado) {
			this.setVolume(this.getVolume() = 5);
			}else {
				System.out.println("Volume MÍNIMO - 0%");
		}else{
			System.out.println("Aparelho Desligado!");
		}
	}

	@Override
	public void ativarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desativatMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(20);
		}
	}

	@Override
	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
			System.out.println("Tocando a mídia XPTO " + this.isTocando());
		}else {
			System.out.println("Não foi possível reproduzir a mídia - ligue o aparelho");
		}
	}

	@Override
	public void pause() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não foi possível tocar a mídia - ligue o aparelho!");
		}
	}

}
