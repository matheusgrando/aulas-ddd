package aulaArrays;

import java.util.Scanner;

public class Exemplo2Array {

	public int tamanhoVetor() {
		Scanner input = new Scanner(System.in);
		System.out.println("*-* TAMANHO DO VETOR *-*");
		System.out.println("Tamanho: ");
		int t = input.nextInt();
		return t;
	}

	public int[] criaVetor(int t) {
		System.out.println("*-* CRIA DO VETOR *-*");
		int[] vetor = new int[t];
		return vetor;
	}

	public int[] populaVetor(int[] v) {
		System.out.println("*-* POPULA DO VETOR *-*");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Vetor[%d]: \n", i);
			v[i] = input.nextInt();
		}
		return v;
	}

	public void imprimir(int[] v) {
		System.out.println("*-* IMPRIME O VETOR *-*");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Vetor[%d]: %d \n", i, v[i]);
		}
	}

	public static void main(String[] args) {
		Exemplo2Array ea = new Exemplo2Array();
		int t = ea.tamanhoVetor();
		int[] v = ea.criaVetor(t);
		v = ea.populaVetor(v);
		ea.imprimir(v);
	}

}
