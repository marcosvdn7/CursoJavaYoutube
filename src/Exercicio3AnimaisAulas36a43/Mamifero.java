package Exercicio3AnimaisAulas36a43;

public class Mamifero extends Animal {

	private String alimento;
	
	public Mamifero() {
		super.setAmbiente("Terra");
	}
	
	public Mamifero(String nome, String cor, String ambiente, double comprimento, int numPatas, double velocidade) {
		super(nome, cor, ambiente, comprimento, numPatas, velocidade);
		super.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void emitirSom() {
		System.out.println();
	}
	
}
