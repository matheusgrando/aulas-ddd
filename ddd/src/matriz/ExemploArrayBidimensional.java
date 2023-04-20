package matriz;

import java.util.Scanner;

public class ExemploArrayBidimensional {

	public int[] tamanhoMatriz() {
		System.out.println("*-* TAMANHO DA MATRIZ *-*");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[2];

		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Colunas: ");
		vetor[1] = input.nextInt();

		return vetor;
	}

	public int[][] criarMatriz(int[] v) {
		System.out.println("*-* CRIAR A MATRIZ *-*");
		Scanner input = new Scanner(System.in);

		// Instanciando uma matriz
		int[][] matriz = new int[v[0]][v[1]];

		// Percorrendo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Matriz[%d][%d]: ", i, j);
				matriz[i][j] = input.nextInt();
			}
		}

		return matriz;

	}

	public void imprimirMatriz(int[][] m) {
		System.out.println("*-* IMPRIMIR A MATRIZ *-*");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("Matriz[%d][%d]: %d \n", i, j, m[i][j]);
			}
		}
	}

}
