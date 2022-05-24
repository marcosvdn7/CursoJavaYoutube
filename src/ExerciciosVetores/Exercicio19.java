package ExerciciosVetores;

public class Exercicio19 {

	public static void main(String[] args) {
		double[] nota1 = new double[10];
		nota1[0] = 7.5;
		nota1[1] = 8.6;
		nota1[2] = 9.4;
		nota1[3] = 6.5;
		nota1[4] = 7.8;
		nota1[5] = 8.5;
		nota1[6] = 9.5;
		nota1[7] = 10;
		nota1[8] = 8.7;
		nota1[9] = 9;
		
		double[] nota2 = new double[10];
		nota2[0] = 8.5;
		nota2[1] = 9.4;
		nota2[2] = 7.4;
		nota2[3] = 7;
		nota2[4] = 6;
		nota2[5] = 5.6;
		nota2[6] = 10;
		nota2[7] = 10;
		nota2[8] = 9;
		nota2[9] = 6;
		
		double[] resul = new double[10];
		int count = 1;

		for (int i = 0; i < nota1.length; i++) {
			resul[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("A média do aluno " +count+ " é " +resul[i]+ ".");
			count++;
			if (resul[i] >= 7) {
				System.out.println("Aprovado.");
			} else {
				System.out.println("Reprovado.");
			}
		}
	}

}
