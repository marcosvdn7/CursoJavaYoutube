package ExerciciosVetores;

public class Exercicio14 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 1;
		vetorA[1] = 1;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 1;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorA[8] = 9;
		vetorA[9] = 10;
		int impar = 0;
		int percentImpar;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		percentImpar = (impar * 100) / vetorA.length;
		
		System.out.println(percentImpar+ "% dos valores no vetor A sao ímpares.");
	}

}
