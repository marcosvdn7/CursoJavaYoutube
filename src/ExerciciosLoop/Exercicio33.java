package ExerciciosLoop;

public class Exercicio33 {

	public static void main(String[] args) {
		double num = 1;
		double num2 = 1;
		double soma = 0;
		
		System.out.print("S = ");
		
		while (num <= 7) {
			soma += num / num2;
			System.out.print((int)num+ "/" +(int)num2+ " + ");
			num++;
			num2 += 2;
		}
		System.out.println("\nValor da soma: " +soma);
	}

}
