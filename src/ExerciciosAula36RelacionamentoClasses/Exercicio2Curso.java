package ExerciciosAula36RelacionamentoClasses;

import java.util.Scanner;

public class Exercicio2Curso {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Curso curso = new Curso("Java", 5);
		
		Aluno[] alunos = new Aluno[curso.getAlunos().length];
		
		int mediaTurma = 0;
		int qtdNotas = 4;
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			Aluno aluno = new Aluno(qtdNotas);
			System.out.println("Informe o nome do " +(i + 1)+ "� aluno: ");
			aluno.setNome(read.nextLine());
			System.out.println("Informe o numero de matricula de " +aluno.getNome()+ ": ");
			aluno.setNumMatricula(read.nextLine());
			alunos[i] = aluno;
			for (int j = 0; j < aluno.getNotas().length; j++) {
				System.out.println("Informe a " +(j + 1)+ "� nota de " +aluno.getNome()+ ": ");
				aluno.setNotas(j, read.nextDouble());
			}
		}
		
		curso.setAlunos(alunos);
		
		for (int i = 0; i < curso.getAlunos().length; i++) {
			System.out.println("-------------------------------");
			System.out.println("Aluno: " +curso.getAlunos()[i].getNome()+ ".");
			for (int j = 0; j < curso.getAlunos()[i].getNotas().length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +curso.getAlunos()[i].getNotas()[j]+ ".");
			}
			System.out.println("Média: " +curso.getAlunos()[i].verificarMedia());
			System.out.println("Situação: " +(curso.getAlunos()[i].verificarMedia() >= 7 ? "APROVADO!" : "REPROVADO!"));
			mediaTurma += curso.getAlunos()[i].verificarMedia();
		}
		
		mediaTurma /= curso.getAlunos().length;
		System.out.println("-------------------------------");
		System.out.println("Média da turma: " +mediaTurma);
		System.out.println("-------------------------------");
		
		read.close();
	}

}
