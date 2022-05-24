package ExerciciosVetores;

public class Exercicio36 {

	public static void main(String[] args) {
		int[] vetorA = new int[11];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.pow(2, i);
			System.out.println(vetorA[i]);
		}

	}

}
