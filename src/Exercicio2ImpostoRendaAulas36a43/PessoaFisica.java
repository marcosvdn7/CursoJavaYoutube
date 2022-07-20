package Exercicio2ImpostoRendaAulas36a43;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	
	public PessoaFisica() {
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calcularImposto() {
		if (super.getRendaBruta() <= 1400) {
			return 0;
		} else if (super.getRendaBruta() > 1400 && super.getRendaBruta() <= 2100) {
			return (super.getRendaBruta() * 0.1) - 100;
		} else if (super.getRendaBruta() > 2100 && super.getRendaBruta() <= 2800) {
			return (super.getRendaBruta() * 0.15) - 270;
		} else if (super.getRendaBruta() > 2800 && super.getRendaBruta() <= 3600) {
			return (super.getRendaBruta() * 0.25) - 500;
		}
			
		return (super.getRendaBruta() * 0.30) - 700;
	}
}
