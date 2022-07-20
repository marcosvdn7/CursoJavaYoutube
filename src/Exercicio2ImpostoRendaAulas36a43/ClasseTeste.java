package Exercicio2ImpostoRendaAulas36a43;

import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		PessoaFisica[] pessoasFisicas = new PessoaFisica[3];
		
		PessoaJuridica[] pessoasJuridicas = new PessoaJuridica[3];
		
		for (int j = 0; j < 3; j++) {
			PessoaJuridica pessoaJuridica = new PessoaJuridica();
			
			System.out.println("informe o nome: ");
			pessoaJuridica.setNome(read.next());
			
			System.out.println("informe o salario bruto: ");
			pessoaJuridica.setRendaBruta(read.nextDouble());
			
			pessoasJuridicas[j] = pessoaJuridica;				
		}
		
		for (int i = 0; i < 3; i++) {
			PessoaFisica pessoaFisica = new PessoaFisica();
			
			System.out.println("informe o nome: ");
			pessoaFisica.setNome(read.next());
			
			System.out.println("informe o salario bruto: ");
			pessoaFisica.setRendaBruta(read.nextDouble());
			
			pessoasFisicas[i] = pessoaFisica;
		}
		
		System.out.println("Pessoa Fisica: ");
		for (PessoaFisica pessoaAux : pessoasFisicas) {
			System.out.println("Nome: " +pessoaAux.getNome());
			System.out.println("Valor a ser pago: " +pessoaAux.calcularImposto());
		}
		
		System.out.println("Pessoa Jurídica: ");
		for (PessoaJuridica pessoaAux : pessoasJuridicas) {
			System.out.println("Nome: " +pessoaAux.getNome());
			System.out.println("Valor a ser pago: " +pessoaAux.calcularImposto());
		}
		
		read.close();
	}
}
