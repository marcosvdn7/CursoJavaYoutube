package ExemplosAula38PalavraSuper;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
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

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
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
