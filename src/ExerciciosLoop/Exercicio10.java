package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1, num2;
		boolean verificacao = false;
		
		do {
			System.out.println("Informe um número inteiro: ");
			num1 = read.nextDouble();
			if (num1 % 1 > 0) {
				System.out.println("O número informado nao é um inteiro!");
			} else {
				verificacao = true;
			}
		}while(!verificacao);
		
		do {
			System.out.println("Informe um número inteiro: ");
			num2 = read.nextDouble();
			if (num2 % 1 > 0) {
				System.out.println("O número informado nao é um inteiro! Informe um número válido.");
			} else {
				verificacao = true;
			}
		}while(!verificacao);
		
		if (num1 < num2) {
			do {
				System.out.println(num1);
				num1++;
			}while(num1 <= num2);
		} else if (num2 < num1) {
			do {
				System.out.println(num2);
				num2++;
			}while(num2 <= num1);
		} else {
			System.out.println("Os dois números são iguais, então nao existem números inteiros entre eles.");
		}
		
			

		read.close();

	}

}
