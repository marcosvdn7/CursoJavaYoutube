package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		try (Scanner read = new Scanner(System.in)) {
			int num;
			int resultado = 1;
			System.out.println("Informe um número inteiro: ");
			num = read.nextInt();
			
			for ( ; num > 1 ; num--) {
				resultado *= num;
			}
			System.out.println(resultado);
			read.close();
		}
	}

}
