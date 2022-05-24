package ExerciciosVetores;

public class Exercicio35 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 7;
		vetorA[1] = 13;
		vetorA[2] = 2;
		vetorA[3] = 4;
		vetorA[4] = 6;
		vetorA[5] = 8;
		vetorA[6] = 24;
		vetorA[7] = 25;
		vetorA[8] = 35;
		vetorA[9] = 37;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("\nDivisores de " +vetorA[i]+ ".");
			for (int j = 1; j <= vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.print(j+ " ");
				}
			}
			System.out.println();
		}

	}

}
