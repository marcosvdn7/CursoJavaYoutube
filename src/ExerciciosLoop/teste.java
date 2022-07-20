package ExerciciosLoop;
import java.util.InputMismatchException;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int x = 0;
		int y = 0;
		double r = 0;
		boolean encerrar = false;
		
		while (true) {
			try {
				System.out.println("Informe o primeiro valor: ");
				x = read.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				y = read.nextInt();
				
				r = x / y;
				
				System.out.println(r);
				
				break;
				
			} catch (InputMismatchException | ArithmeticException exception) {
				System.out.println("Informe números inteiro diferente de 0.");
			}
		}
		read.close();
	}
}

			
	


