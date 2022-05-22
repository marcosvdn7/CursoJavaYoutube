package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double n;
		double h = 0;
		System.out.println("Informe o valor de N: ");
		n = read.nextInt();
		for (double i = 1; i <= n; i++) {
			h += 1 / i;
		}
		System.out.println("Valor do H = " +h);
		
		read.close();

	}

}
