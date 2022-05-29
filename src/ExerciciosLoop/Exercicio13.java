package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num, num2, resultado = 1;
		int count = 0;
		
		System.out.println("Informe o primeiro número: ");
		num = read.nextDouble();
		System.out.println("Informe o segundo número: ");
		num2 = read.nextDouble();
		
		do {
			resultado *= num;
			count++;
		} while (num2 > count);
		System.out.println(resultado);
		read.close();

	}

}
