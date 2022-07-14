package ExemplosAula39HerançaModAcesso;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String curso, double[] notas) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCursos(String curso) {
		this.curso = curso;
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
	
	public void metodoQualquer() {
		this.setCpf("098.666.259-31");
		
		super.nomeVisibilidade = "asfuahsfui";
		
		super.setCpf("098.666.259-31");		
	}
	
	public String mostrarCpf() {
		return super.getCpf();
	}
}
