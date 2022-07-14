package ExemplosAula38PalavraSuper;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.metodoQualquer();
		
		System.out.println(aluno.mostrarCpf());
		
//		Aluno aluno = new Aluno();
//		
//		aluno.setNome("Marcos");
//		
//		System.out.println(aluno.getNome());
//		
//		System.out.println(aluno.testarMetodos());
		
		//É possível declarar a classe Pessoa e instanciar como um objeto Aluno
		//porém esse objeto só vai ter acesso aos atributos da classe Pessoa.
		//Isso é chamado de super classe.
		
	}

}
