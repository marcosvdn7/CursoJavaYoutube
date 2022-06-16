package ExerciciosOOAula27;

public class ContaCorrente {

	int numConta;
	double saldo;
	double limite;
	boolean especial;
	
	void sacar (double valor) {
		double resto = 0;
		if (valor > saldo + limite && saldo >= 0) {
			System.out.println("Voc� nao possui saldo suficiente para essa transa��o!\n");
		} else if (valor <= saldo) {
			saldo -= valor;
			System.out.println("O saque no valor de " +valor+ " foi efetuado com sucesso!\n");
		} else if (valor > saldo && especial == false || limite <= 0) {
				System.out.println("Voc� nao possui saldo suficiente para essa transa��o!\n");
		} else if (valor > saldo && especial == true && limite > 0) {
			if (saldo > 0) {
				resto = valor - saldo;
				saldo -= valor;
				limite = limite - resto;
				System.out.println("O saque no valor de " +valor+ " foi efetuado com sucesso!\n");	
			} else if (saldo <= 0 && valor <= limite) {
				limite -= valor;
				saldo -= valor;
				System.out.println("O saque no valor de " +valor+ " foi efetuado com sucesso!\n");
			} else if (saldo <= 0 && valor > limite){
				System.out.println("Voc� nao possui saldo suficiente para essa transa��o!\n");
			}
		}
	} 
	
	void depositar (double valor, double limiteMax) {
		if (especial == true && limite < limiteMax) {
			valor -= valor * 0.2; 
			limite += valor;
			saldo += valor;
			if (limite > limiteMax) {
				valor = limite - limiteMax;
				saldo += valor;
			} 
		} else if (especial == true && limite == limiteMax) {
			saldo += valor;
		}
		System.out.println("Deposito no valor de R$" +valor+ " feito com sucesso!");
	}
	
	void consultarSaldo () {
		System.out.println("Saldo Atual = " +saldo);
	}
	
	void consultarEspecial(double limiteMax) {
		System.out.println("O cliente " +(especial == true ? "possui cheque especial.\nValor: " +limite+".\nValor Atual: " +limite : "o cliente nao possui cheque especial."));
	}
}
