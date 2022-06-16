package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio3Aluno {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new String[3];
		aluno1.notas = new double[3][3];
		double media = 0;
		double somaNotas = 0;
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = read.next();
		System.out.println("Informe o número de matrícula do aluno: ");
		aluno1.numMatricula = read.nextInt();
		System.out.println("Informe o curso em que o aluno está matriculado: ");
		aluno1.curso = read.next();
		
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe a " +(i + 1)+ "ª disciplina: ");
			aluno1.disciplinas[i] = read.next();
		}
		
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			for (int j = 0; j < aluno1.disciplinas.length - 1; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota da disciplina " +aluno1.disciplinas[i]+ ": ");
				aluno1.notas[i][j] = read.nextInt();
				somaNotas += aluno1.notas[i][j];
			}
			media = somaNotas / (aluno1.notas[i].length - 1);
			somaNotas = 0;
			aluno1.notas[i][aluno1.notas[i].length - 1] = media;
			media = 0;
		}
		
		aluno1.mostrarInformacoes();
		
		read.close();
	}
}
