package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio3Aluno {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		aluno1.disciplinas = new String[3];
		aluno1.notas = new double[aluno1.disciplinas.length][2];
		int indice = 0;
		
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
		
		for (int i = 0; i < aluno1.notas.length; i++) {
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota da disciplina " +aluno1.disciplinas[i]+ ": ");
				aluno1.notas[i][j] = read.nextInt();
			}
		}
		
		while (indice != 5) {
			System.out.println("\nSelecione a disciplina que deseja conferir sua nota: ");
			for (int i = 0; i < aluno1.disciplinas.length; i++) {
				System.out.println((i + 1)+ " - " +aluno1.disciplinas[i]);
			}
			System.out.println("4 - Mostrar Boletim Completo.");
			System.out.println("5 - Sair.");
			indice = read.nextInt();
			if (indice >= 1 && indice <= 3) {
				aluno1.verificarAprovacao(indice);
			}
			switch (indice) {
			case 4: aluno1.mostrarInformacoes();break;
			case 5: break;
			}
		}
		
		
		read.close();
	}
}
