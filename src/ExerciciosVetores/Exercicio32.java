package ExerciciosVetores;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		try (Scanner read = new Scanner(System.in)) {
			int[] vetorA = new int[5];
			int resultado;
			int i = 0, j = 1;
			
			for (i = 0; i < vetorA.length; i++) {
				System.out.println("Informe o valor da posição " +i+ " de A: ");
				vetorA[i] = read.nextInt();
			}

			i = 0;
			
			for (; j <= 10; j++) {
				if (i == 5) {
					break;
				}
				resultado = vetorA[i] * j;
				System.out.println(vetorA[i]+ " x " +j+ " = " +resultado);
				if (j == 10) {
					System.out.println(" ");
					j = 0;
					i++;
				} 
			}
			read.close();
		}
	}
}
