package ExerciciosOperadoresCondicionais;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario, aumento, novoSalario;
		System.out.println("Informe o sal�rio do funcionario: ");
		salario = read.nextDouble();
		if (salario != (int)salario) {
			System.out.println(salario);
		}
		novoSalario = salario; 
		System.out.println((int)salario);
		
		
		
		if (salario <= 280) {
			aumento = 0.2 * salario;
			novoSalario += aumento;
			System.out.println("O salario anterior era de R$" +salario+ ".");
			System.out.println("O aumento ser� de 20%.");
			System.out.println("O valor do aumento ser� de R$" +aumento+ ".");
			System.out.println("o novo sal�rio ser� de R$" +novoSalario+ ".");
		} else if (salario > 280 && salario < 700) {
			aumento = 0.15 * salario;
			novoSalario += aumento;
			System.out.println("O salario anterior era de R$" +salario+ ".");
			System.out.println("O aumento ser� de 15%.");
			System.out.println("O valor do aumento ser� de R$" +aumento+ ".");
			System.out.println("o novo sal�rio ser� de R$" +novoSalario+ ".");
		} else if (salario >= 700 && salario < 1500) {
			aumento = 0.10 * salario;
			novoSalario += aumento;
			System.out.println("O salario anterior era de R$" +salario+ ".");
			System.out.println("O aumento ser� de 10%.");
			System.out.println("O valor do aumento ser� de R$" +aumento+ ".");
			System.out.println("o novo sal�rio ser� de R$" +novoSalario+ ".");
		} else {
			aumento = 0.05 * salario;
			novoSalario += aumento;
			System.out.println("O salario anterior era de R$" +salario+ ".");
			System.out.println("O aumento ser� de 5%.");
			System.out.println("O valor do aumento ser� de R$" +aumento+ ".");
			System.out.println("o novo sal�rio ser� de R$" +novoSalario+ ".");
		} 

		read.close();

	}

}
