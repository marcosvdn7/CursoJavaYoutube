package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario;
		double percent = 0.015;
		double percent2;
		double aumento;
		int ano = 1996;
		
		System.out.println("Informe o salário do funcionário: ");
		salario = read.nextDouble();
		while (salario <= 0) {
			System.out.println("Salário deve ser maior que 0! Informe novamente: ");
			salario = read.nextDouble();
		}
		
		do {
			aumento = salario * percent;
			salario += aumento;
			percent2 = percent * 100;
			System.out.println(ano+ " - Salário: R$" +salario+ " - Aumento: " +percent2+ "%.");
			percent *= 2;
			ano++;
		} while (ano <= 2022);
		
		read.close();
	}

}
