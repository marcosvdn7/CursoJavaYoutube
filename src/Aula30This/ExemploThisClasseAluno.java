package Aula30This;

public class ExemploThisClasseAluno {
	
	String nome;
	String curso;
	String[] disciplinas;
	double [][] notas;
	int numMatricula;
	
	public ExemploThisClasseAluno(String nome, String curso, String[] disciplinas, double[][] notas, int numMatricula) {
		this.nome = nome;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
		this.numMatricula = numMatricula;
	}
	
	double verificarMedia(int indice) {
		double somaNotas = 0;
		for (int i = 0; i < this.notas[indice].length; i++) {
			somaNotas += this.notas[indice][i];
		}
		return somaNotas / this.notas[indice].length;
	}
	
	boolean verificarAprovacao(int indice) {
		if (this.verificarMedia(indice) >= 7) {
			return true;
		}
		return false;
	}
	
	void mostrarInformacoes() {
		boolean aprovacaoGeral = true;
		System.out.println("---------------------------");
		System.out.println("      Nome Aluno: " +nome);
		System.out.println("   Número Matricula: " +numMatricula);
		System.out.println("      Curso: " +curso);
		System.out.println("---------------------------");
		for (int i = 0; i < this.disciplinas.length; i++) {
			System.out.println("Disciplina: " +this.disciplinas[i]);
			for (int j = 0; j < this.notas[i].length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +this.notas[i][j]);
			}
			if (this.verificarMedia(i) <= 7) {
				aprovacaoGeral = false;
			}
			System.out.println("Média: " +this.verificarMedia(i));
			System.out.println("Situação: " +(this.verificarMedia(i) >= 7 ? "APROVADO!!" : "REPROVADO!!"));
			System.out.println("---------------------------");
		}
		System.out.println("Situação Geral: " +(aprovacaoGeral == true ? "APROVADO!!" : "REPROVADO!!"));
		System.out.println("---------------------------");
	}
}
