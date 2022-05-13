package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Insira o primeiro número: ");
		double numero1 = read.nextDouble();
		System.out.println("Insira o segundo número: ");
		double numero2 = read.nextDouble();
		System.out.println("Insira o terceiro número: ");
		double numero3 = read.nextDouble();
		
		
		if (numero1 >= numero2 && numero2 >= numero3) {
			System.out.printf("O maior número é " +(int)numero1+ " e o menor é " +(int)numero3);
		} else if (numero1 >= numero2 && numero3 >= numero2) {
			System.out.println("O maior número é " +(int)numero1+ " e o menor é " +(int)numero2);
		} else if (numero3 >= numero2 && numero2 >= numero1) {
			System.out.println("O maior número é " +(int)numero3+ " e o menor é " +(int)numero1);
		} else if (numero3 >=numero2 && numero1 >= numero2) {
			System.out.println("O maior número é " +(int)numero3+ " e o menor é " +(int)numero2);
		} else if (numero2 >= numero1 && numero1 >= numero3) {
			System.out.println("O maior número é " +(int)numero2+ " e o menor é " +(int)numero3);
		} else if (numero2 >= numero1 && numero3 >= numero1) {
			System.out.println("O maior número é " +(int)numero2+ " e o menor é " +(int)numero1);
		} 
			read.close();
	}

}
