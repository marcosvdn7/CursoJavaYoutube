package ExemplosAula41ClassesAbstratas;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		String endereco = "Enderešo do Professor: \n";
		endereco += super.getEnderešo();
		
		return endereco;
	}
	
	public void imprimirEtiquetarEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}
	
}
