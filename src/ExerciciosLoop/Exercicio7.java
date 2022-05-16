package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 0;
		double comparar = 0;
		
		do {
			System.out.println("Informe um número: ");
			double numero = read.nextDouble();
			if (numero > comparar) {
				comparar = numero;
			}i++;
		} while (i < 5);
		
		System.out.println("O maior numero informado foi: " +comparar);

		read.close();

	}

}
