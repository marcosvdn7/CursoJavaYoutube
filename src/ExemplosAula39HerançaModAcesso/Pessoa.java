package ExemplosAula39HeranšaModAcesso;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	protected String nomeVisibilidade;//protected serve para que as subclasses 
									  //possam acessar os atributos da superclasse
									  //independente de onde estiverem, as classes
									  //do mesmo pacote tbm pode acessar esse atributo
									  //mesmo nao sendo uma subclasse.
	
	public Pessoa(String nome, String endereco, String telefone, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	public Pessoa() {
		super();
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return endereco;
	}

	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double testarMetodos() {
		return 8;
	}
	
}
