package ExerciciosMatrizes;

public class Exercicio2 {

	public static void main(String[] args) {
		int[][] matrizM = new int[10][10];
		int maior5 = 0;
		int menor5 = 10;
		int maior7 = 0;
		int menor7 = 10;
		
		for (int i = 0; i < matrizM.length; i++) {
			System.out.println("\nLinha " +i);
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = (int)(Math.round(Math.random() * 9));
				System.out.println("Coluna " +j+ ": " +matrizM[i][j]);
				if (i == 5 && matrizM[i][j] > maior5) {
					maior5 = matrizM[i][j];
				} else if (i == 5 && matrizM[i][j] < menor5) {
					menor5 = matrizM[i][j];
				}
				if (i == 7 && matrizM[i][j] > maior7) {
					maior7 = matrizM[i][j];
				} else if (i == 5 && matrizM[i][j] < menor7) {
					menor7 = matrizM[i][j];
				}
			}
		}
		
		System.out.println("\nO maior valor na linha 5 da matriz M é " +maior5+ ".");
		System.out.println("O menor valor na linha 5 da matriz M é " +menor5+ ".");
		System.out.println("\nO maior valor na linha 7 da matriz M é " +maior7+ ".");
		System.out.println("O menor valor na linha 7 da matriz M é " +menor7+ ".");		
	}

}
