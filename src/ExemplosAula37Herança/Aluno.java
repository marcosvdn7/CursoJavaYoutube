package ExemplosAula37Herança;

public class Aluno extends Pessoa {

	private String[] cursos;
	private double[] notas;
	
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double caucularMedia() {
		return 0;
	}
	
	public boolean verificarAprovacao() {
		return true;
	}
	
}
