package ExerciciosLoop;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double numero;
		System.out.println("Informe um n�mero: ");
		numero = read.nextDouble();
		
		if (numero % 1 > 0) {
			System.out.println("N�o � um n�mero inteiro.");
		} else {
			System.out.println("� um n�mero inteiro.");
		}
		
		
		
		
		read.close();
	}
}

			
	


