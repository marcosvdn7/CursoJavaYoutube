package ExemplosAula40Polimorfismo;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();
		
		pessoa.setEnderešo("Rua 1, Num 1");
		aluno.setEnderešo("Rua 2, Num 2");
		professor.setEnderešo("Rua 3, Num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}
