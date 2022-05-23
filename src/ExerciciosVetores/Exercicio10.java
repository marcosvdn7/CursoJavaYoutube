package ExerciciosVetores;

public class Exercicio10 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 10;
		vetorA[1] = 25;
		vetorA[2] = 33;
		vetorA[3] = 45;
		vetorA[4] = 9;
		vetorA[5] = 22;
		vetorA[6] = 59;
		vetorA[7] = 68;
		vetorA[8] = 75;
		vetorA[9] = 96;
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
			System.out.println(vetorB[i]);
		}

	}

}
