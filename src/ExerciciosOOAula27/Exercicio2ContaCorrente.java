package ExerciciosOOAula27;

import java.util.Scanner;

public class Exercicio2ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		Scanner read = new Scanner(System.in);

		conta1.especial = true;
		System.out.println("Informe o número da conta: ");
		conta1.numConta = read.nextInt();
		conta1.limite = 1000;
		conta1.saldo = 2400;
		
		int opcao = 0;
		boolean encerrar = false;
		int valor;
		
		while (encerrar == false) {
			System.out.println("Escolha uma das opções: ");
			System.out.println("1 - Sacar.");
			System.out.println("2 - Depositar.");
			System.out.println("3 - Consultar Saldo.");
			System.out.println("4 - Consultar Cheque Especial.");
			System.out.println("5 - Sair.");
			opcao = read.nextInt();
			if (opcao == 1 || opcao == 2) {
				System.out.println("Informe a quantidade que deseja " +(opcao == 1 ? "sacar: " : "depositar: "));
				valor = read.nextInt();
				switch(opcao) {
				case 1: conta1.sacar(valor);break;
				case 2:	conta1.depositar(valor);break;
				} 
			}
			switch (opcao) {
			case 3: conta1.consultarSaldo();break;
			case 4: conta1.consultarEspecial();break;
			case 5: encerrar = true;
			}
		}
		
		/*System.out.println("\nConta " +conta1.numConta);
		
		while (encerrar == false) {
			System.out.println("\nEscolha um das opçoes: ");
			System.out.println("1 - Sacar.");
			System.out.println("2 - Depositar.");
			System.out.println("3 - Consultar Saldo.");
			System.out.println("4 - Verificar Cheque Especial.");
			System.out.println("5 - Encerrar.");
			opcao = read.nextInt();
			conta1.movimentarConta(opcao);
			if (opcao >= 5) {
				encerrar = true;
			}
		}*/
		read.close();
	}
}
