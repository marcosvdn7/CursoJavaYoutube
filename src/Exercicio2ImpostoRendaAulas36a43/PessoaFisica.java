package Exercicio2ImpostoRendaAulas36a43;

public class PessoaFisica extends Contribuinte {
	
	private Contribuinte[] contribuintes;
	
	public PessoaFisica() {
		this.contribuintes = new Contribuinte[3];
	}

	public Contribuinte[] getContribuintes() {
		return contribuintes;
	}

	public void setContribuintes(Contribuinte[] contribuintes) {
		this.contribuintes = contribuintes;
	}
	
	public double calcularImposto() {
		if (super.getRendaBruta() >= 1400.01 && super.getRendaBruta() <= 2099) {
			super.setRendaLiquida(super.getRendaBruta() - 0.10);
			return super.getRendaLiquida();
		} else if (super.getRendaBruta() >= 2100 && super.getRendaBruta() <= 2099){
			
		}
		
		return super.getRendaLiquida();
	}
}
