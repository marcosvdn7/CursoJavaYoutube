package ExerciciosVetores;

public class Exercicio22 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int count0 = 0;
		int count1 = 0;
		double percent1;
		double percent0;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			if (vetorA[i] == 0) {
				count0++;
			} else {
				count1++;
			}
			System.out.print((int)vetorA[i]+ " ");
		} 
		//percent1 = (count1 / vetorA.length) * 100;
		//percent0 = (count0 / vetorA.length) * 100;
		
		percent1 = (count1 * 100) / vetorA.length;
		percent0 = (count0 * 100) / vetorA.length;
		
		System.out.println("\n" +(int)percent1+ "% dos números são iguais a 1.");
		System.out.println((int)percent0+ "% dos números são iguais a 0.");
	}

}
