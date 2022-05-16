package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int anos = 0;
		double crescimentoA, crescimentoB;
		double taxaCrescimentoA;
		double taxaCrescimentoB;
		double populacaoA; 
		double populacaoB; 
		boolean validacao = false;
		
		do{
			System.out.println("Informe a população do país A: ");
			populacaoA = read.nextDouble();
			if (populacaoA > 0) {
				validacao = true;
			} else {
				System.out.println("População do país A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do{
			System.out.println("Informe a taxa de crescimento do país A(em porcentagem): ");
			taxaCrescimentoA = read.nextDouble();
			if (taxaCrescimentoA > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do país A deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a população do país B:");
			populacaoB = read.nextDouble();
			if (populacaoB > 0) {
				validacao = true;
			} else {
				System.out.println("População do país B deve ser maior que 0.");
			}
		} while (!validacao);
		
		validacao = false;
		
		do {
			System.out.println("Informe a taxa de crescimento do país B(em porcentagem): ");
			taxaCrescimentoB = read.nextDouble();
			if (taxaCrescimentoB > 0) {
				validacao = true;
			} else {
				System.out.println("Taxa de crescimento do país B deve ser maior que 0.");
			}
		} while(!validacao);
		
		crescimentoA = taxaCrescimentoA/100;
		crescimentoB = taxaCrescimentoB/100;
		
		if (populacaoA < populacaoB) {
			do {
				taxaCrescimentoA = populacaoA * crescimentoA;
				populacaoA = populacaoA + taxaCrescimentoA;
				taxaCrescimentoB = populacaoB * crescimentoB;
				populacaoB = populacaoB + taxaCrescimentoB;
				anos++;
			} while (populacaoA < populacaoB);
		} else if (populacaoB < populacaoA) {
			do {
				taxaCrescimentoA = populacaoA * crescimentoA;
				populacaoA = populacaoA + taxaCrescimentoA;
				taxaCrescimentoB = populacaoB * crescimentoB;
				populacaoB = populacaoB + taxaCrescimentoB;
				anos++;
			} while (populacaoB < populacaoA);
		}
		System.out.println("Levarão " +anos+ " ano(s) para que a população do país A alcance a do país B.");
		read.close();
	}
	
}
