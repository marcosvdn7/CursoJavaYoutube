package ExerciciosLoop;

public class Exercicio16 {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 1;
		int resultado;
		
		for (int i = 0 ; i < 16 ; i++) {
			System.out.print(num+ " ");
			resultado = num + num2;
			num = num2;
			num2 = resultado;
		}

	}

}
