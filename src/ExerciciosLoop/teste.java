package ExerciciosLoop;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int i = 1;
		double resultado = 1;
		System.out.println("Digite um n�mero inteiro positivo: ");
		num = read.nextInt();
		
		while (i <= num) {
			if (num <= 1) {
				System.out.println("N�o � um n�mero primo.");
				break;
			}
			resultado = num % i;
			i++;
		}
		if (resultado == 0) {
			System.out.println(num+ " � um n�mero primo.");
		} else {
			System.out.println(num+ " n�o � um n�mero primo.");
		}
	
		read.close();
	}
}

			
	


