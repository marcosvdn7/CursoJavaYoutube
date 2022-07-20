package Exercicio2ImpostoRendaAulas36a43;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public PessoaJuridica() {
	}

	public String getCnpj() {
		return cnpj;
	}
 
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public double calcularImposto() {
		
		return super.getRendaBruta() * 0.1;
	}
}
