package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int qtdTemp, i = 0;
		double somaTemp = 0;
		double media;
		double temperatura;
		double maiorTemp = 0, menorTemp = 0;
		
		System.out.println("Quantas temperaturas deseja informar: ");
		qtdTemp = read.nextInt();
		
		do {
			System.out.println("Informe a temperatura: ");
			temperatura = read.nextDouble();
			if (menorTemp == 0) {
				menorTemp = temperatura;
			}
			if (temperatura > maiorTemp) {
				maiorTemp = temperatura;
			} else if (temperatura < menorTemp) {
				menorTemp = temperatura;
			}
			somaTemp += temperatura;
			i++;
		} while (i < qtdTemp);

		media = somaTemp / qtdTemp;
		System.out.println(maiorTemp+ "C� foi a maior temperatura registrada.");
		System.out.println(menorTemp+ "C� foi a menor temperatura registrada.");
		System.out.println(media+ "C� � a m�dia de todas as temperaturas registradas.");
		read.close();
	}

}
