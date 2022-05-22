package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		int i = 1;
		int count = 0;
		
		System.out.println("Digite um número inteiro positivo: ");
		num = read.nextDouble();
		
		do {
			if (num <= 0 || num % 1 != 0) {
				System.out.println("\nO número digitado deve ser um inteiro maior que 0.");
				System.out.println("Digite um novo número: ");
				num = read.nextDouble();
			}
		} while (num <= 0 || num % 1 != 0);
		
		while (num > 1) {
			num--;
			do {
				if (num % i == 0) {
					count++;
				}
				i++;
			} while (i <= num);
			if (count == 2) {
				System.out.println((int)num+ " é um número primo.");
			}
			count = 0;
			i = 1;
		}	
		read.close();

	}

}
