package aula_trycatch;

import java.util.Random;

public class Exemplo2 {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				System.out.printf("b: %d | c: %d\n", b, c);
				a = b/c;
				System.out.printf("a: %d \n", a);
			}catch(Exception e) {
				System.out.println("Exception ");
				e.printStackTrace();
			}

		}
	}

}
