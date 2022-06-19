package ExerciciosMetodosAula27;

public class Aluno {

	String nome;
	String curso;
	String[] disciplinas;
	double [][] notas;
	int numMatricula;
	
	double verificarMedia(double somaValores,double qtdValores) {
		double media = somaValores / qtdValores;
		return media;
	}
	
	void mostrarInformacoes() {
		double somaNotas = 0;
		int qtdNotas = 0;
		System.out.println("---------------------------");
		System.out.println("      Nome Aluno: " +nome);
		System.out.println("   Número Matricula: " +numMatricula);
		System.out.println("      Curso: " +curso);
		System.out.println("---------------------------");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina: " +disciplinas[i]);
			qtdNotas = 0;
			somaNotas = 0;
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Nota " +(j + 1)+ ": " +notas[i][j]);
				somaNotas += notas[i][j];
				qtdNotas++;
			}
			System.out.println("Média: " +verificarMedia(somaNotas, qtdNotas));
			System.out.println("Situação: " +(verificarMedia(somaNotas, qtdNotas) >= 7 ? "APROVADO!!" : "REPROVADO!!"));
			System.out.println("---------------------------");
		}
	}
}
