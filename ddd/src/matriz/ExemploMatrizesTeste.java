package matriz;

public class ExemploMatrizesTeste {

	public static void main(String[] args) {

		ExemploArrayBidimensional em = new ExemploArrayBidimensional();
		int[] v = em.tamanhoMatriz();
		int[][] m = em.criarMatriz(v);
		em.imprimirMatriz(m);

	}

}
