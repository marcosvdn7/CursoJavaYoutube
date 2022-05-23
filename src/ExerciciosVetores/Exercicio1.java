package ExerciciosVetores;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] vetorA = new int[5];
		vetorA[0] = 2;
		vetorA[1] = 4;
		vetorA[2] = 6;
		vetorA[3] = 8;
		vetorA[4] = 10;
		int[] vetorB = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
			System.out.println(vetorB[i]);
		}
		

	}

}
