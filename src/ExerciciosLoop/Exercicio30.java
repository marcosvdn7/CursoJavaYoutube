package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num, inicio, fim; 
		int i = 0;
		int resultado;
		
		System.out.println("Informe um número inteiro positivo: ");
		num = read.nextDouble();
		while (num % 1 != 0 || num <= 0) {
			System.out.println("O número infomardo deve ser um inteiro positivo! Informe outro número: ");
			num = read.nextDouble();
		}
		System.out.println("Informe onde deve começar a tabuada: ");
		inicio = read.nextDouble();
		while (inicio % 1 != 0 || inicio <= 0) {
			System.out.println("O número infomardo deve ser um inteiro positivo! Informe outro número: ");
			inicio = read.nextDouble();
		}
		System.out.println("Informe onde deve terminar a tabuada: ");
		fim = read.nextDouble();
		while (num % 1 != 0 || num <= 0) {
			System.out.println("O número infomardo deve ser um inteiro positivo! Informe outro número: ");
			fim = read.nextDouble();
		}
		while (inicio >= fim) {
			System.out.println("O número de início deve ser menor que o número final!");
			System.out.println("Informe novamente o valor inicial: ");
			inicio = read.nextDouble();
			while (num % 1 != 0 || num <= 0) {
				System.out.println("O número infomardo deve ser um inteiro positivo! Informe outro número: ");
				inicio = read.nextDouble();
			}
			System.out.println("Informe novamente o valor final: ");
			fim = read.nextDouble();
			while (num % 1 != 0 || num <= 0) {
				System.out.println("O número infomardo deve ser um inteiro positivo! Informe outro número: ");
				fim = read.nextDouble();
			}
		}
		i = (int) inicio;
		
		do {
			while (i == 0) {
				System.out.println("Vou montar a tabuada de " +num+ " começando por " +inicio+	"e terminado em " +fim+ "\n");		}
			resultado =(int) ((int)num * i);
			System.out.println((int)num+ " X " +i+ " = " +resultado);
			i++;
		} while (i <= fim);

		read.close();

	}

}
