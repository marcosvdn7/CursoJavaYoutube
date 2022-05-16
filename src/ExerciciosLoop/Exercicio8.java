package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double numero, media;
		double soma = 0;
		int i = 0;
		
		do {
			System.out.println("Informe um número: ");
			numero = read.nextDouble();
			soma = numero + soma;
			i++;
		} while(i < 5);
		media = soma/i;
		System.out.println("A soma dos números é de " +soma);
		System.out.println("A média dos números informados é " +media);
		read.close();

	}

}
