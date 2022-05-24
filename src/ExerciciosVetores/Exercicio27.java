package ExerciciosVetores;

public class Exercicio27 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 52;
		vetorA[1] = 6;
		vetorA[2] = 7;
		vetorA[3] = 9;
		vetorA[4] = 13;
		vetorA[5] = 4;
		vetorA[6] = 9;
		vetorA[7] = 2;
		vetorA[8] = 8;
		vetorA[9] = 2;
		char[] vetorB = new char[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 7) {
				vetorB[i] = 'a';
			} else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
			} else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			} else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
			} else {
				vetorB[i] = 'e';
			}
			System.out.print(vetorB[i]+ " ");
		}
	}

}
