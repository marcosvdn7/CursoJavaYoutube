package ExemplosAula41ClassesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();
		
		final int numero = 0;
		
		System.out.println(numero);
		//pessoa.setEndere�o("Rua 1, Num 1");
		aluno.setEndere�o("Rua 2, Num 2");
		professor.setEndere�o("Rua 3, Num 3");
		
		aluno.imprimirEtiquetarEndereco();
		professor.imprimirEtiquetarEndereco();
	}

}
