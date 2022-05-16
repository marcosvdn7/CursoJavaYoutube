package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe uma nota de 0 a 10: ");
		double nota = read.nextDouble();
		
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Informe novamente: ");
			nota = read.nextDouble();
		}
		
		System.out.println("A nota informada foi " +nota);

		read.close();
		
		
	}

}
