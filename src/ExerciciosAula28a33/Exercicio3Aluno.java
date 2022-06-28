package ExerciciosAula28a33;

import java.util.Scanner;

public class Exercicio3Aluno {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		int opcao = 0;
		String[] disciplinas = new String[3];
		double[][] notas = new double[3][2];
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.setNome(read.next());;
		System.out.println("Informe o número de matrícula do aluno: ");
		aluno1.setNumMatricula(read.nextInt());
		System.out.println("Informe o curso em que o aluno está matriculado: ");
		aluno1.setCurso(read.next());
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Informe a " +(i + 1)+ "ª disciplina: ");
			disciplinas[i] = read.next();
			aluno1.setDisciplinas(disciplinas);
		}
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Informe a " +(j + 1)+ "ª nota da disciplina " +disciplinas[i]+ ": ");
				notas[i][j] = read.nextInt();
				aluno1.setNotas(notas);
			}
		}
		
		while (opcao != disciplinas.length + 2) {
			System.out.println("\nSelecione a disciplina que deseja conferir sua nota: ");
			for (int i = 0; i < disciplinas.length; i++) {
				System.out.println((i + 1)+ " - " +disciplinas[i]);
			}
			System.out.println(disciplinas.length + 1+ " - Mostrar Boletim Completo.");
			System.out.println(disciplinas.length + 2+ " - Sair.");
			opcao = read.nextInt();
			if (opcao <= disciplinas.length) {
				System.out.println("---------------------------");
				System.out.println("Disciplina: " +aluno1.getDisciplinas()[opcao - 1]);
					for (int i = 0; i < notas[i].length; i++) {
						System.out.println("Nota " +(i + 1)+ ": " +aluno1.getNotas()[opcao - 1][i]);
					}
					System.out.println("Média: " +aluno1.verificarMedia(opcao - 1));
					System.out.println("Situação: " +(aluno1.verificarAprovacao(opcao - 1) == true ? "APROVADO!!" : "REPROVADO!!"));
					System.out.println("---------------------------");
			} else if (opcao == disciplinas.length + 1) {
				aluno1.mostrarInformacoes();
			}
		}
		read.close();

	}

}
