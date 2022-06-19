package ExerciciosMetodosAula27;

public class ContaCorrente2 {

	int numConta;
	double saldo;
	double limite;
	boolean especial;
	
	void sacar (double valor) {
		double resto = 0;
		if (valor > saldo + limite && saldo >= 0) {
			System.out.println("Você nao possui saldo suficiente para essa transação!\n");
		} else if (valor <= saldo) {
			saldo -= valor;
			System.out.println("O saque no valor de " +valor+ " foi efetuado com sucesso!\n");
		} else if (valor > saldo && especial == false || limite <= 0) {
				System.out.println("Você nao possui saldo suficiente para essa transação!\n");
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
				System.out.println("Você nao possui saldo suficiente para essa transação!\n");
			}
		}
	} 
	
	void depositar (double valor, double limiteMax) {
		if (especial == true && limite < limiteMax) {
			//valor -= valor * 0.2; 
			limite += valor;
			saldo += valor;
			if (limite > limiteMax) {
				limite = limiteMax;
			}
		} else if (limite == limiteMax || especial == false){
			saldo += valor;
		}
		System.out.println("Deposito no valor de R$" +valor+ " feito com sucesso!\n");
	}
	
	void consultarSaldo () {
		System.out.println("Saldo Atual = " +saldo+ "\n");
	}
	
	void consultarEspecial(boolean especial) {
		System.out.println("O cliente possui cheque especial? " +(especial == true ? "Sim.\nValor Atual: " +limite : "Não."));
	}
}
