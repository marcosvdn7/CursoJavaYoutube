package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = read.nextLine();
		while (nome.length() < 3) {
			System.out.println("O nome deve conter no mínimo 3 caracteres.");
			System.out.println("Insira novamente seu nome: ");
			nome = read.nextLine();
		}
		
		System.out.println("Informe sua idade: ");
		int idade = read.nextInt();
		while (idade < 0 || idade > 150) {
			System.out.println("A idade informada deve ser entre 0 e 150.");
			System.out.println("Insira novamente sua idade: ");
			idade = read.nextInt();		
		}
		
		System.out.println("Informe seu salário: ");
		double salario = read.nextDouble();
		while (salario < 0) {
			System.out.println("O salario informado deve ser maior ou igual a 0.");
			System.out.println("Informe novamente o salário: ");
			salario = read.nextInt();
		}
		
		System.out.println("Informe seu gênero: ");
		System.out.println("M - Masculino.");
		System.out.println("F - Feminino.");
		char genero = read.next().charAt(0);
		while (genero != 'M' && genero != 'm' && genero != 'F' && genero != 'f') {
			System.out.println("Genero não valido! Informe uma das opçoes disponíveis: ");
			genero = read.next().charAt(0);
		}
		
		System.out.println("Informe seu estado civil: ");
		System.out.println("1 - Solteiro(a).");
		System.out.println("2 - Casado(a).");
		System.out.println("3 - Viúvo(a).");
		System.out.println("4 - Divorciado(a).");
		int estadoCivil = read.nextInt();
		while (estadoCivil != 1 && estadoCivil != 2 && estadoCivil != 3 && estadoCivil != 4) {
			System.out.println("Estado civil inválido! Informe uma das opções disponíveis: ");
			estadoCivil = read.nextInt();
		}
		read.close();

	}

}
