package Exercicio3AnimaisAulas36a43;

public class Peixe extends Animal {

	private String[] caracteristicas;
	
	public Peixe() {
		super.setNumPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzenta");
		caracteristicas = new String[2];
		caracteristicas[0] = "Barbatanas";
		caracteristicas[1] = "Cauda";
	}
	
	public Peixe(String nome, String cor, String ambiente, double comprimento, int numPatas, double velocidade) {
		super(nome, cor, ambiente, comprimento, numPatas, velocidade);
		super.setNumPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzenta");
		caracteristicas = new String[2];
		caracteristicas[0] = "Barbatanas";
		caracteristicas[1] = "Cauda";
	}
	
	public String[] getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String[] caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public void emitirSom() {
		System.out.println("Glub Glub");
	}
	
	public String toString() {
		String print = "";
		print += "Nome: " +super.getNome();
		print += "Cor: " +super.getCor();
		print += "Ambiente: " +super.getAmbiente();
		return "";
	}
}
