package ExerciciosOOAula27;

import java.util.Scanner;

public class Exercicio3Aluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new String[3];
		aluno1.notas = new int[aluno1.disciplinas.length][2];
		
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = read.nextLine();
		System.out.println("Informe o número de matrícula do aluno: ");
		aluno1.numMatricula = read.nextInt();
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe a " +(i + 1)+ "º disciplina: ");
			aluno1.disciplinas[i] = read.next();
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Informe a primeira nota da disciplina " +aluno1.disciplinas[i]+ ": ");
				aluno1.notas[i][j] = read.nextInt();
			}
		}
		aluno1.verificarAprovacao();
	}
}
