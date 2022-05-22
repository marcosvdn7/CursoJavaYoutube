package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double media, qtdPessoas, idade, somaIdade = 0;
		int i = 0;
		System.out.println("Informe a quantidade de pessoas: ");
		qtdPessoas = read.nextDouble();
		
		while(i < qtdPessoas) {
			System.out.println("Informe a idade: ");
			idade = read.nextDouble();
			somaIdade += idade;
			i++;
		}
		media = somaIdade / qtdPessoas;
		
		if(media <= 25 && media > 0) {
			System.out.println("Essa pessoas são, em sua maioria, jovens.");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Essa pessoas sao, em sua maioria, adultos.");
		} else if (media > 60) {
			System.out.println("Essa pessoas sao, em sua maioria, idosos.");
		}
		
		read.close();

	}

}
