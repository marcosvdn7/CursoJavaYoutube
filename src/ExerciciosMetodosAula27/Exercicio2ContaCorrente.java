package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio2ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		Scanner read = new Scanner(System.in);
		conta1.saldo = 2000;
		
		int opcao = 0;
		boolean encerrar = false;
		int valor;
		double limiteMax = conta1.limite;
		
		System.out.println("Informe o número da conta: ");
		conta1.numConta = read.nextInt();
		System.out.println("Essa conta utiliza cheque especial?");
		System.out.println("1 - Sim.");
		System.out.println("2 - Não.");
		opcao = read.nextInt();
		switch (opcao) {
		case 1: System.out.println("Qual o limite do cheque especial?");
				conta1.limite = read.nextDouble();
				limiteMax = conta1.limite;
				conta1.especial = true;break;
		default: conta1.especial = false;break;
		}
		
		
		while (encerrar == false) {
			System.out.println("-------------------------------");
			System.out.println("Numero da conta: " +conta1.numConta);
			System.out.println("Possui cheque especial? " +(conta1.especial == true ? "Sim.\nLimite Especial: R$" +conta1.limite : "Não."));
			System.out.println("Saldo Atual: R$" +conta1.saldo);
			System.out.println("Escolha uma das opções: ");
			System.out.println("1 - Sacar.");
			System.out.println("2 - Depositar.");
			System.out.println("3 - Consultar Saldo.");
			System.out.println("4 - Consultar Cheque Especial.");
			System.out.println("5 - Sair.");
			System.out.println("-------------------------------\n");
			opcao = read.nextInt();
			if (opcao == 1 || opcao == 2) {
				System.out.println("Informe a quantidade que deseja " +(opcao == 1 ? "sacar: " : "depositar: "));
				valor = read.nextInt();
				switch(opcao) {
				case 1: 
					if (conta1.sacar(valor)) {
						System.out.println("O saque no valor de R$" +valor+ " foi realizado com sucesso!\n");break;
					} else {
						System.out.println("Não foi possível realizar o saque! Tente novamente.\n");break;
					}
				case 2:	conta1.depositar(valor, limiteMax); 
					 	System.out.println("O depósito no valor de R$" +valor+ " foi realizado com sucesso!");break;
				} 
			}
			switch (opcao) {
			case 3: conta1.consultarSaldo();break;
			case 4: System.out.println(conta1.consultarEspecial() == true ? "Essa conta está usando o cheque especial." : "Essa conta não está usando cheque especial.");break;
			case 5: encerrar = true;
			}
		}
		
		read.close();
	}
}
