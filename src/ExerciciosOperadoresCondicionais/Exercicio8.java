package ExerciciosOperadoresCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double preco1, preco2, preco3;
		System.out.println("Informe o valor do primeiro produto: ");
		preco1 = read.nextDouble();
		System.out.println("Informe o valor do segundo produto: ");
		preco2 = read.nextDouble();
		System.out.println("Informe o valor do terceiro produto: ");
		preco3 = read.nextDouble();
		
		if (preco1 < preco2 && preco2 < preco3) {
			System.out.println("Compre o primeiro produto.");
		} else if (preco1 > preco2 && preco3 > preco2) {
			System.out.println("Compre o segundo produto.");
		} else if (preco3 < preco1 && preco2 > preco1) {
			System.out.println("Compre o terceiro produto.");
		} else if (preco1 > preco2 && preco2 > preco3) {
			System.out.println("Compre o terceiro produto.");
		} else if (preco1 == preco2 && preco2 == preco3) {
			System.out.println("Os três produtos tem o mesmo valor.");
		} else if (preco1 == preco3) {
			System.out.println("O primeiro e o terceiro produto tem o mesmo valor..");
		} else if (preco2 == preco3) {
			System.out.println("O segundo e o terceiro produto tem o mesmo valor.");
		} else if (preco1 == preco2) {
			System.out.println("O primeiro e o segundo produto tem o mesmo valor.");
		}
		
		read.close();

	}

}
