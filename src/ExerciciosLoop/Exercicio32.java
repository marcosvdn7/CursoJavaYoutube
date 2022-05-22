package ExerciciosLoop;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int codigo, qtd, opcao;
		double valorCachorro = 0;
		double valorBauruSimp = 0;
		double valorBauruOvo = 0;
		double valorHamb = 0;
		double valorCheese = 0;
		double valorRefri = 0;
		double valorTotal = 0;
		
		do {
			System.out.println("Produto    -   Código   -   Preço.");
			System.out.println("Cachorro Quente - 100 - R$1,20");
			System.out.println("Bauru Simples   - 101 - R$1,30");
			System.out.println("Bauru com ovo   - 102 - R$1,50");
			System.out.println("Hamburger       - 103 - R$1,20");
			System.out.println("Cheeseburger    - 104 - R$1,30");
			System.out.println("Refrigerante    - 105 - R$1,00");
			System.out.println("Informe o código do produto desejado: ");
			codigo = read.nextInt();
			while (codigo < 100 || codigo > 105) {
				System.out.println("Codigo invalido! Insira um dos códigos abaixo.\n");
				System.out.println("Produto    -   Código   -   Preço.");
				System.out.println("Cachorro Quente - 100 - R$1,20");
				System.out.println("Bauru Simples   - 101 - R$1,30");
				System.out.println("Bauru com ovo   - 102 - R$1,50");
				System.out.println("Hamburger       - 103 - R$1,20");
				System.out.println("Cheeseburger    - 104 - R$1,30");
				System.out.println("Refrigerante    - 105 - R$1,00");
				System.out.println("Informe o código do produto desejado: ");
				codigo = read.nextInt();
			}
			if (codigo == 100) {
				System.out.println("Produto escolhido: Cachorro Quente.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorCachorro = qtd * 1.20;
				valorTotal += valorCachorro;
			} else if (codigo == 101) {
				System.out.println("Produto escolhido: Bauru Simples.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorBauruSimp = qtd * 1.30;
				valorTotal += valorBauruSimp;
			} else if (codigo == 102) {
				System.out.println("Produto escolhido: Cachorro com Ovo.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorBauruOvo = qtd * 1.50;
				valorTotal += valorBauruOvo;
			} else if (codigo == 103) {
				System.out.println("Produto escolhido: Hamburger.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorHamb = qtd * 1.20;
				valorTotal += valorHamb;
			} else if (codigo == 104) {
				System.out.println("Produto escolhido: Cheeseburger.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorCheese = qtd * 1.30;
				valorTotal += valorCheese;
			} else if (codigo == 105) {
				System.out.println("Produto escolhido: Refrigerante.");
				System.out.println("Informe a quantidade desejada: ");
				qtd = read.nextInt();
				valorRefri = qtd * 1;
				valorTotal += valorRefri;
			}
			System.out.println("Deseja escolher mais algum produto?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			opcao = read.nextInt();
			while (opcao != 1 && opcao != 2) {
				System.out.println("Opção inválida! Informe uma das opções fornecidas.");
				System.out.println("1 - Sim");
				System.out.println("2 - Não\n");
				opcao = read.nextInt();
			} if (opcao == 1) {
			} else if (opcao == 2) {
				break;
			}
		} while (opcao != 2);
		System.out.println("Valores Gastos.");
		if (valorCachorro > 0) {
			System.out.println("Cachorro Quente - R$" +valorCachorro);
		}
		if (valorBauruSimp > 0) {
			System.out.println("Bauru Simples - R$" +valorBauruSimp);
		}
		if (valorBauruOvo > 0) {
			System.out.println("Bauru com Ovo - R$" +valorBauruOvo);
		}
		if (valorHamb > 0) {
			System.out.println("Hamburger - R$" +valorHamb);
		}
		if (valorCheese > 0) {
			System.out.println("Cheeseburger - R$" +valorCheese);
		}
		if (valorRefri > 0) {
			System.out.println("Refrigerante - R$" +valorRefri);
		}
		System.out.println("O valor total da compra foi de R$" +valorTotal);

		read.close();

	}

}
