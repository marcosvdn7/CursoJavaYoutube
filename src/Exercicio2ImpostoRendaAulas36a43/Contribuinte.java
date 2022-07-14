package Exercicio2ImpostoRendaAulas36a43;

public class Contribuinte {
	private String nome;
	private double rendaBruta;
	private double rendaLiquida;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public double getRendaLiquida() {
		return rendaLiquida;
	}

	public void setRendaLiquida(double rendaLiquida) {
		this.rendaLiquida = rendaLiquida;
	}

	public double calcularImposto() {
		
		return this.rendaLiquida;
	}
	
}
