package ExerciciosVetores;

public class Exercicio23 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		vetorA[0] = 2;
		vetorA[1] = 4;
		vetorA[2] = 6;
		vetorA[3] = 8;
		vetorA[4] = 10;
		vetorA[5] = 12;
		vetorA[6] = 13;
		vetorA[7] = 16;
		vetorA[8] = 18;
		vetorA[9] = 20;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				break;
			}
			System.out.println(vetorA[i]);
			}
		}

	}

