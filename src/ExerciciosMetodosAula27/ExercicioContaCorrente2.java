package ExerciciosMetodosAula27;

import java.util.Scanner;

public class ExercicioContaCorrente2 {

	public static void main(String[] args) {
		ContaCorrente2 conta1 = new ContaCorrente2();
		Scanner read = new Scanner(System.in);
		conta1.saldo = 2000;
		
		int opcao = 0;
		boolean encerrar = false;
		int valor;
		double limiteMax = conta1.limite;
		
		System.out.println("Informe o n?mero da conta: ");
		conta1.numConta = read.nextInt();
		System.out.println("Essa conta utiliza cheque especial?");
		System.out.println("1 - Sim.");
		System.out.println("2 - N?o.");
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
			System.out.println("Possui cheque especial? " +(conta1.especial == true ? "Sim.\nLimite Especial: " +conta1.limite : "N?o."));
			System.out.println("Saldo Atual: " +conta1.saldo);
			System.out.println("Escolha uma das op??es: ");
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
				case 1: conta1.sacar(valor);break;
				case 2:	conta1.depositar(valor, limiteMax);break;
				} 
			}
			switch (opcao) {
			case 3: conta1.consultarSaldo();break;
			case 4: conta1.consultarEspecial(conta1.especial);break;
			case 5: encerrar = true;
			}
		}
		
		read.close();

	}

}
