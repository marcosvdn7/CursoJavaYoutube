package ExerciciosMetodosAula27;

public class Aluno {

	String nome;
	String curso;
	String[] disciplinas;
	int [][] notas;
	int numMatricula;
	
	/*void verificarAprovacao() {
		double media;
		int somaNotas = 0;
		
		System.out.println("Nome do aluno " +nome);
		System.out.println("----------------------------------");
		System.out.println("Número de Matricula " +numMatricula);
		System.out.println("----------------------------------");
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.print(disciplinas[i]+ " - ");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j]+ (j == 1 ? ".\n" : " - "));
				somaNotas += notas[i][j];
			}
			media =(double) somaNotas / notas[0].length;
			System.out.println("Média - " +media+ ".");
			somaNotas = 0;
			if (media >= 7) {
				System.out.println("APROVADO!!");
				System.out.println("----------\n");
			} else {
				System.out.println("REPROVADO!!\n");
				System.out.println("-----------\n");
			}
		}
	}*/
	
	boolean verificarAprovacao(double media) {
		return media >= 7 ? true : false;
	}
	
}
