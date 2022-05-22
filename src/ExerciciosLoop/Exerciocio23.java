package ExerciciosLoop;
public class Exerciocio23 {

	public static void main(String[] args) {
		double valor = 1.99;
		int qtdProdutos = 1;
		
		while (qtdProdutos <= 50) {
			System.out.println(qtdProdutos+ " - R$ " +valor);
			valor = 1.99;
			qtdProdutos++;
			valor *= qtdProdutos;
		}

	}

}
