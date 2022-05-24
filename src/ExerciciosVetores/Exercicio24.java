package ExerciciosVetores;

public class Exercicio24 {

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
		int comparar;
		int count = 0;
		
		for (int i = 0, j = vetorA.length - 1; i < vetorA.length / 2; i++, j--) {
			comparar = vetorA[i] - vetorA[j];
			count++;
			if (comparar != 0) {
				System.out.println("O vetor A não é um palíndromo.");
				break;
			}
		}
		if (count == vetorA.length / 2) {
			System.out.println("O vetor A é um palíndromo.");
		}
	}

}
