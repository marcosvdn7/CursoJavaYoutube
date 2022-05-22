package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtdAlunos, qtdTurmas, count = 0, somaAlunos = 0, media;
		System.out.println("Digite a quantidade de turmas: ");
		qtdTurmas = read.nextInt();
		
		do {
			System.out.println("Digite a quantidade de alunos por turma: ");
			qtdAlunos = read.nextInt();
			while (qtdAlunos <= 0 || qtdAlunos > 40) {
				System.out.println("A quantidade de alunos deve ser maior que 0 e menor que 40.");
				System.out.println("Insira novamente a quantidade: ");
				qtdAlunos = read.nextInt();
			}
			somaAlunos += qtdAlunos;
			count++;
		} while (count < qtdTurmas);
		
		media = somaAlunos / qtdTurmas;
		
		System.out.println(media+ " é a média de alunos por turma.");

		read.close();

	}

}
