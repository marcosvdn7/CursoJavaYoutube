package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero: ");
		double numero1 = read.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		double numero2 = read.nextDouble();
		System.out.println("Insira o terceiro n�mero: ");
		double numero3 = read.nextDouble();
		
		
		if (numero1 >= numero2 && numero2 >= numero3) {
			System.out.printf("O maior n�mero � " +(int)numero1+ " e o menor � " +(int)numero3);
		} else if (numero1 >= numero2 && numero3 >= numero2) {
			System.out.println("O maior n�mero � " +(int)numero1+ " e o menor � " +(int)numero2);
		} else if (numero3 >= numero2 && numero2 >= numero1) {
			System.out.println("O maior n�mero � " +(int)numero3+ " e o menor � " +(int)numero1);
		} else if (numero3 >=numero2 && numero1 >= numero2) {
			System.out.println("O maior n�mero � " +(int)numero3+ " e o menor � " +(int)numero2);
		} else if (numero2 >= numero1 && numero1 >= numero3) {
			System.out.println("O maior n�mero � " +(int)numero2+ " e o menor � " +(int)numero3);
		} else if (numero2 >= numero1 && numero3 >= numero1) {
			System.out.println("O maior n�mero � " +(int)numero2+ " e o menor � " +(int)numero1);
		} 
			read.close();
	}

}
