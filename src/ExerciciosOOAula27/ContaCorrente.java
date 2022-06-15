package ExerciciosOOAula27;

import java.util.Scanner;

public class ContaCorrente {

	int numConta;
	double saldo;
	double limite;
	boolean especial;
	
	void sacar (int valor) {
		saldo -= valor;
		System.out.println("Saldo Final = " +saldo);
	}
	
	void depositar (int valor) {
		saldo += valor;
		System.out.println("Saldo Final = " +saldo);
	}
	
	void consultarSaldo () {
		System.out.println("Saldo Atual = " +saldo);
	}
	
	void consultarEspecial() {
		System.out.println("O cliente " +(especial == true ? "possui cheque especial." : "o cliente nao possui cheque especial."));
	}
		
	void movimentarConta(int opcao) {
		Scanner read = new Scanner(System.in);

		int valor = 0;
		switch (opcao) {
		case 1: System.out.println("Informe o valor que deseja sacar: ");
				valor = read.nextInt();
				saldo -= valor;
				System.out.println("Saldo Final = " +saldo);break;
		case 2: System.out.println("Informe o valor que deseja depositar: ");
				valor = read.nextInt();
				saldo += valor;
				System.out.println("Saldo Final = " +saldo+ "\n");break;
		case 3: System.out.println("Saldo Atual = " +saldo+ "\n");break;
		case 4: 
			if (especial == false) {
				System.out.println("O cliente nao possui cheque especial.\n");
			} else {
				System.out.println("O cliente possui cheque especial.\n");
			}
			break;
		}
	}
	
}
