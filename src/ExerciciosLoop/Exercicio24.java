package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double precoPao;
		int qtdProdutos = 1;
		System.out.println("Informe o valor do p�o: ");
		precoPao = read.nextDouble();
		
		while (qtdProdutos <= 50) {
			if (qtdProdutos == 1) {
				System.out.println("\nPre�o do p�o: R$" +precoPao+ ".");
				System.out.println("Panificadora P�o de Ontem - Tabela de pre�os.");
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
