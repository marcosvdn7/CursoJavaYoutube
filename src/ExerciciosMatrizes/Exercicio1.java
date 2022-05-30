package ExerciciosMatrizes;

public class Exercicio1 {

	public static void main(String[] args) {
		int[][] m = new int[4][4];
		int maior = 0;
		int indice1 = 0;
		int indice2 = 0;
		
		for (int i = 0; i < m.length; i++) {
			System.out.println("Linha " +i);
			for (int j = 0; j < m[i].length; j++) {
				m [i][j] = (int)(Math.round(Math.random() * 9));
				System.out.println("Coluna " +j+ ": " +m[i][j]);
				if (m[i][j] > maior) {
					maior = m[i][j];
					indice1 = i;
					indice2 = j;
				}
			}
			System.out.println();
		}
		
		System.out.print("O maior número encontrado na matriz m foi " +maior+ ", encontrado na linha " +indice1+ " e na coluna " +indice2+ ".");

	}

}
