package aula_trycatch;

public class Exemplo4 {

	public static void main(String[] args) {

		try {
			int[] numeros = {1, 2, 3, 4, 5};
			
			for(int i = 0; i < numeros.length; i++) {
				System.out.println("Números: " + numeros[i]);
			}
			
		}catch(ArithmeticException e) {
			System.out.println("Algo deu errado!");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Algo deu ruim!");
		}catch(NullPointerException e) {
			System.out.println("Chora Silas");
		}finally {
			System.out.println("Tchau, brigado");
		}

	}

}
