package ExerciciosOperadoresCondicionais;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.0#");
		double litros, desconto, valorFinal, valorTotal;
		char combustivel;
		System.out.println("Informe o combustivel desejado (G - Gasolina, A - Alcool): ");
		combustivel = read.next().charAt(0);
		if (combustivel == 'G' || combustivel == 'g' || combustivel == 'A' || combustivel == 'a') {
		} else {
			System.out.println("Valor Inválido! Informe uma dos valores aceitos.");
			System.exit(0);
		}
		System.out.println("Informe a quantidade de litros desejada: ");
		litros = read.nextDouble();
		
		
		 
		 if (combustivel == 'G' || combustivel == 'g' && litros <= 20) {
			valorTotal = litros * 2.5;
			desconto = valorTotal * 0.04;
			valorFinal = valorTotal - desconto;
			System.out.println("O valor a ser pago é de R$" +format.format(valorFinal));
		} else if (combustivel == 'G' || combustivel == 'g' && litros > 20) {
			valorTotal = litros * 2.5;
			desconto = valorTotal * 0.06;
			valorFinal = valorTotal - desconto;
			System.out.println("O valor a ser pago e de R$" +format.format(valorFinal));
		} else if (combustivel == 'A' || combustivel == 'a' && litros <= 20) {
			valorTotal = litros * 1.9;
			desconto = valorTotal * 0.03;
			valorFinal = valorTotal - desconto;
			System.out.println("O valor a ser pago é de R$" +format.format(valorFinal));
		} else if (combustivel == 'A' || combustivel == 'a' && litros > 20) {
			valorTotal = litros * 1.9;
			desconto = valorTotal * 0.05;
			valorFinal = valorTotal - desconto;
			System.out.println("O valor a ser pago é de R$" +format.format(valorFinal));
		}
		
		

		read.close();

	}

}
