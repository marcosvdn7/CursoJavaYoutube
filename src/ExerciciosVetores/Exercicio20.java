package ExerciciosVetores;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacaoDolar;
		
		System.out.println("Informe a cotação atual do dólar: ");
		cotacaoDolar = read.nextDouble();
		
		for (int i = 1; i <= vetorA.length; i++) {
			int j = 0; 
			vetorA[(int) j] = (cotacaoDolar * i);
			System.out.println(vetorA[j]);
			j++;
		}
		System.out.println(vetorA[15]);
		read.close();
	}

}
