package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio22 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double qtdMaca, qtdMorango, totalKg, valorMaca, valorMorango, valorTotal, valorFinal, desconto;
		double totalMorango, totalMaca;
		System.out.println("Informe a quantidade de maçãs em kg: ");
		qtdMaca = read.nextDouble();
		System.out.println("Informe a quantidade de morangos em kg: ");
		qtdMorango = read.nextDouble();
		totalKg = qtdMorango + qtdMaca;
		
		if (qtdMorango <= 5) {
			valorMorango = 2.5;
		} else {
			valorMorango = 2.2;
		}
		if (qtdMaca <= 5) {
			valorMaca = 1.8;
		} else {
			valorMaca = 1.5;
		}
		totalMaca = qtdMaca * valorMaca;
		totalMorango = qtdMorango * valorMorango;
		valorTotal = totalMorango + totalMaca;
		
		if (totalKg > 8 || valorTotal > 25) {
			desconto = valorTotal * 0.10;
			valorFinal = valorTotal - desconto;
			System.out.println("O valor a ser pago é de R$" +valorFinal);
		} else {
			System.out.println("O valor a ser pago é de R$" +valorTotal);
		}
		
		
		
		read.close();

	}

}
