package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double precoPao;
		int qtdProdutos = 1;
		System.out.println("Informe o valor do pão: ");
		precoPao = read.nextDouble();
		
		while (qtdProdutos <= 50) {
			if (qtdProdutos == 1) {
				System.out.println("\nPreço do pão: R$" +precoPao+ ".");
				System.out.println("Panificadora Pão de Ontem - Tabela de preços.");
				System.out.println("##############################################");
			}
			System.out.println(qtdProdutos+ " - R$ " +precoPao);
			precoPao /= qtdProdutos;
			qtdProdutos++;
			precoPao *= qtdProdutos;			
		}

		read.close();

	}

}
