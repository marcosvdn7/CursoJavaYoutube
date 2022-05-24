package ExerciciosVetores;

public class Exercicio33 {

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
		double resultado;
		int count = 0;
		
		for (int i = 0, j = 1; i < vetorA.length; i++) {
			while (j <= vetorA[i]) {
				resultado = vetorA[i] % j;
				j++;
					if (resultado == 0) {
					count++;
					}
				}
				if (count == 2) {
					System.out.println(vetorA[i]+ " é um número primo.");
				} else {
					System.out.println(vetorA[i]+ " não é um número primo.");
				}
				count = 0;
				j = 1;
		}

	}

}
