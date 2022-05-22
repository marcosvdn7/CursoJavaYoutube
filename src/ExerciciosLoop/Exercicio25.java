package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio25 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtdProdutos;
		double valorProduto, troco, valorPago;
		double totalCompra = 0;
		boolean validacao = false;
		int novaCompra;
		String output;
		
		do {
			qtdProdutos = 1;
			output = "\nLojas Tabajara";
			output += "\n##############\n";
			do {
				while (qtdProdutos == 1) {
					System.out.println("Informe os valores dos produtos a serem comprados(Insira 0 para terminar a compra).");
					break;
				}
				System.out.println("Produto " +qtdProdutos+ ": ");
				valorProduto = read.nextDouble();
				if (valorProduto == 0) {
					continue;
				}
				output += "Produto " +qtdProdutos+ ": R$ " +valorProduto+ "\n";
				totalCompra += valorProduto;
				qtdProdutos++;
			} while (valorProduto != 0);
			output += "Total: R$ " +totalCompra+ "\n";
			System.out.printf("Informe o valor pago pelo cliente: ");
			valorPago = read.nextDouble();
			while (valorPago < totalCompra) {
				System.out.println("O valor pago precisa ser maior que o valor da compra!");
				System.out.println("Informe o novo valor pago: ");
				valorPago = read.nextDouble();
			}
			output += "Dinheiro: R$ " +valorPago+ "\n";
			troco = valorPago - totalCompra;
			output += "Troco: R$ " +troco+ "\n";
			System.out.println(output);
			System.out.println("Deseja informar uma nova compra?");
			System.out.println("1 - Sim.");
			System.out.println("2 - Não.");
			novaCompra = read.nextInt();
			while (novaCompra != 1 && novaCompra != 2) {
				System.out.println("Opção inválida! Selecione uma das opções fornecidas.");
				System.out.println("1 - Sim.");
				System.out.println("2 - Não.");
				novaCompra = read.nextInt();
			}
			if (novaCompra == 2) {
				validacao = true;
			}
		} while (!validacao);
		read.close();

	}

}
