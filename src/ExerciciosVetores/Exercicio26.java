package ExerciciosVetores;

public class Exercicio26 {

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
		vetorB[0] = 2;
		vetorB[1] = 4;
		vetorB[2] = 6;
		vetorB[3] = 8;
		vetorB[4] = 6;
		vetorB[5] = 8;
		vetorB[6] = 9;
		vetorB[7] = 5;
		vetorB[8] = 2;
		vetorB[9] = 1;
		int[] vetorC = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
			System.out.print(vetorC[i]+ " ");
		}

	}

}
