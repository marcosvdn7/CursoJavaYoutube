package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double nota, media, somaNotas = 0;
		int qtdNotas, i = 0;
		System.out.println("Informe a quantidade de notas: ");
		qtdNotas = read.nextInt();
		
		while (i < qtdNotas) {
			System.out.println("Informe uma nota: ");
			nota = read.nextDouble();
			somaNotas += nota;
			i++;
		}
		media = somaNotas / qtdNotas;
		System.out.println("A média das notas informadas foi de :" +media+ ".");
		read.close();

	}

}
