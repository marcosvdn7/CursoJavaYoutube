package ExerciciosMetodosAula27;

public class Aluno {

	String nome;
	String curso;
	String[] disciplinas;
	double [][] notas;
	int numMatricula;
	
	boolean verificarAprovacao(double media) {
		return media >= 7 ? true : false;
	}
	
	void mostrarInformacoes() {
		System.out.println("-------------------------------");
		System.out.println("      Nome Aluno: " +nome);
		System.out.println("   Número Matricula: " +numMatricula);
		System.out.println("      Curso: " +curso);
		System.out.println("-------------------------------");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina: " +disciplinas[i]);
			for (int j = 0; j < notas[i].length - 1; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +notas[i][j]);
			}
			System.out.println("Média: " +notas[i][notas[i].length - 1]);
			System.out.println("Status: " +(verificarAprovacao(notas[i][notas[i].length - 1]) == true ? "APROVADO!!" : "REPROVADO!!"));
			System.out.println("-------------------------------");
		}
	}
}
