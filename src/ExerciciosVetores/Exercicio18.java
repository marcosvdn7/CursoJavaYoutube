package ExerciciosVetores;

public class Exercicio18 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 21;
		vetorA[1] = 20;
		vetorA[2] = 17;
		vetorA[3] = 18;
		vetorA[4] = 18;
		vetorA[5] = 24;
		vetorA[6] = 45;
		vetorA[7] = 17;
		vetorA[8] = 27;
		vetorA[9] = 25;
		int maior = 0, menor = 0;
	
		for (int i = 0; i < vetorA.length; i++) {
			if (menor == 0) {
				menor = vetorA[i];
			}
			if (vetorA[i] > maior) {
				maior = vetorA[i];
			} else if (vetorA[i] < menor){
				menor = vetorA[i];
			}
		}
			System.out.println("A maior idade encontrata no vetor A foi " +maior+ ".");
			System.out.println("A menor idade encontrata no vetor A foi " +menor+ ".");
	}

}
