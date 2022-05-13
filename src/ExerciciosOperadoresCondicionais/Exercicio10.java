package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char turno;
		System.out.println("Informe o turno que você estuda: ");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		turno = read.next().charAt(0);
		
		if (turno == 'M' || turno == 'm') {
			System.out.println("Bom dia!");
		} else if (turno == 'V' || turno == 'v') {
			System.out.println("Boa tarde!");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor Inválido!");
		}

		read.close();

	}

}
