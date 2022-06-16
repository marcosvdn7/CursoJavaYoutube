package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio3Aluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new String[3];
		aluno1.notas = new int[aluno1.disciplinas.length][2];
		double media = 0;
		double somaNotas = 0;
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = read.next();
		System.out.println("Informe o número de matrícula do aluno: ");
		aluno1.numMatricula = read.nextInt();
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe a " +(i + 1)+ "ª disciplina: ");
			aluno1.disciplinas[i] = read.next();
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Informe a primeira nota da disciplina " +aluno1.disciplinas[i]+ ": ");
				aluno1.notas[i][j] = read.nextInt();
				somaNotas += aluno1.notas[i][j];
			}
			media = somaNotas / aluno1.notas[i].length;
			somaNotas = 0;
			System.out.println("-------------------------");
			System.out.println("Aluno: " +aluno1.nome);
			System.out.println("Numero matricula: " +aluno1.numMatricula);
			System.out.println("Disciplina: " +aluno1.disciplinas[i]);
			System.out.println("Nota 1: " +aluno1.notas[i][0]);
			System.out.println("Nota 2: " +aluno1.notas[i][1]);
			System.out.println("Média: " +media);
			System.out.println("Status: " +(aluno1.verificarAprovacao(media) == true ? "APROVADO!!\n" : "REPROVADO!!\n"));
			System.out.println("-------------------------");
		}
		
		read.close();
	}
}
