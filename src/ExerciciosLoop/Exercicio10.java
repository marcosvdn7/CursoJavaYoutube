package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1, num2;
		boolean verificacao = false;
		
		do {
			System.out.println("Informe um n�mero inteiro: ");
			num1 = read.nextDouble();
			if (num1 % 1 > 0) {
				System.out.println("O n�mero informado nao � um inteiro!");
			} else {
				verificacao = true;
			}
		}while(!verificacao);
		
		do {
			System.out.println("Informe um n�mero inteiro: ");
			num2 = read.nextDouble();
			if (num2 % 1 > 0) {
				System.out.println("O n�mero informado nao � um inteiro! Informe um n�mero v�lido.");
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
			System.out.println("Os dois n�meros s�o iguais, ent�o nao existem n�meros inteiros entre eles.");
		}
		
			

		read.close();

	}

}
