package ExerciciosVetores;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " +i+ " de A: ");
			vetorA[i] = read.nextInt();
			if (vetorA[i] % 2 != 0) {
				vetorB[j] = vetorA[i];
				j++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorC[k] = vetorA[i];
				k++;
			}
		}
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.print("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		System.out.print("\nVetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+ " ");
		}
		
		read.close();
	}

}
