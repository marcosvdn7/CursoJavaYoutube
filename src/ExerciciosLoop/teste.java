package ExerciciosLoop;
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num;
		int i = 1;
		double resultado = 1;
		System.out.println("Digite um número inteiro positivo: ");
		num = read.nextInt();
		
		while (i <= num) {
			if (num <= 1) {
				System.out.println("Não é um número primo.");
				break;
			}
			resultado = num % i;
			i++;
		}
		if (resultado == 0) {
			System.out.println(num+ " é um número primo.");
		} else {
			System.out.println(num+ " não é um número primo.");
		}
	
		read.close();
	}
}

			
	


