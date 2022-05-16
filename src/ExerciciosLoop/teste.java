package ExerciciosLoop;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double numero;
		System.out.println("Informe um número: ");
		numero = read.nextDouble();
		
		if (numero % 1 > 0) {
			System.out.println("Não é um número inteiro.");
		} else {
			System.out.println("É um número inteiro.");
		}
		
		
		
		
		read.close();
	}
}

			
	


