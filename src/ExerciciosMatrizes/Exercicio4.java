package ExerciciosMatrizes;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		boolean validacao = false;
		
		int[][] calendario = new int[30][24];
		int opcao, dia, hora;
		
		for (int i = 0; i < calendario.length;) {
			System.out.println("Deseja alterar ou consultar algum compromisso?");
			System.out.println("1 - Alterar.");
			System.out.println("2 - Consultar.");
			System.out.println("3 - Encerrar Programa.");
			opcao = read.nextInt();
			switch (opcao) {
			case 1: 
				while (opcao != 10) {
					System.out.println("Informe o dia que deseja alterar: ");
					dia = read.nextInt();
					
				}
			}
			
		}

		read.close();

	}

}
