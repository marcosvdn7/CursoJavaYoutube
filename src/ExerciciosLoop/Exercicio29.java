package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num;
		int i = 1;
		int count = 0;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		num = read.nextDouble();
		
		do {
			if (num <= 0 || num % 1 != 0) {
				System.out.println("\nO n�mero digitado deve ser um inteiro maior que 0.");
				System.out.println("Digite um novo n�mero: ");
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
				System.out.println((int)num+ " � um n�mero primo.");
			}
			count = 0;
			i = 1;
		}	
		read.close();

	}

}
