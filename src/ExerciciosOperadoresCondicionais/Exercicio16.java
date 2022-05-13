 package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("Informe o valor de a: ");
		a = read.nextDouble();
		
		if (a == 0) {
			System.out.println("Se o valor de A for igual a 0, não é uma equação do segundo grau.");
			System.exit(0);
		}
	
		System.out.println("Informe o valor de b: ");
		b = read.nextDouble(); 
		System.out.println("Informe o valor de c: ");
		c = read.nextDouble();
		delta = ((b*b)-(4*a*c));
		x1 = 0;
		x2 = 0;
		
		
		if (delta < 0) {
			System.out.println("Delta negativo.");
		} else if (delta == 0) {
			x1 =  (-b + Math.sqrt (delta))  / ( 2*a );
			x2 =  (-b - Math.sqrt (delta))  / ( 2*a );
			System.out.println("Delta = " +delta);
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		} else if (delta > 0) {
			x1 =  (-b + Math.sqrt (delta))  / ( 2*a );
			x2 =  (-b - Math.sqrt (delta))  / ( 2*a );
			System.out.println("Delta = " +delta);
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		}
		read.close();
	}
}
