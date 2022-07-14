package Exercicio2ImpostoRendaAulas36a43;

public class PessoaJuridica extends Contribuinte {

	private Contribuinte[] contribuintes;
	
	public PessoaJuridica() {
		this.contribuintes = new Contribuinte[3];
	}

	public Contribuinte[] getContribuintes() {
		return contribuintes;
	}

	public void setContribuintes(Contribuinte[] contribuintes) {
		this.contribuintes = contribuintes;
	}
	
	public double calcularImposto() {
		super.setRendaLiquida(super.getRendaBruta() - 0.10);
		
		return super.getRendaLiquida();
	}
}
