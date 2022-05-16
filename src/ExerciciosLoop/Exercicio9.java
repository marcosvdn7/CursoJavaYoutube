package ExerciciosLoop;

public class Exercicio9 {

	public static void main(String[] args) {
		int i = 0;
		double verificacao;
		while (i < 50){
			verificacao = i % 2;
			i++;
			if (verificacao == 0) {
				System.out.println(i);
			}
		}
	}

}
