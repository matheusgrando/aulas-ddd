package aulaArrays;

import java.util.Scanner;

public class ExemploArrayUnidimensional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.printf("vetor[%d]: \n", i);
			vetor[i] = input.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
	}

}
