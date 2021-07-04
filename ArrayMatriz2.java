package exercicio;

public class ArrayMatriz2 {

	public static void main(String[] args) {
		int[][] numero = { { 25, 26, 27, 28 }, { 10, 11, 12, 14 }, { 3, 2, 1, 0 } };

		for (int i = 0; i < numero.length; ++i) {
			for (int j = 0; j < numero[i].length; ++j) {

				System.out.println(numero[i][j]);

			}
		}

	}

}
