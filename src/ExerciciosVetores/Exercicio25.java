package ExerciciosVetores;

public class Exercicio25 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 5;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 5;
		vetorA[6] = 4;
		vetorA[7] = 5;
		vetorA[8] = 2;
		vetorA[9] = 1;
		int[] vetorB = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[i] = 0;
			} else {
				vetorB[i] = 1;
			}
			System.out.print(vetorB[i]+ " ");
		}

	}

}
