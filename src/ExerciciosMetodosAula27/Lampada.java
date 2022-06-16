package ExerciciosMetodosAula27;

public class Lampada {
	
	public String modelo;
	public String tensao;
	public String cor;
	public String tipoLuz;
	public int potencia;
	public int garantiaMeses;
	public String[] tipos;
	public boolean acesa;

	public void acender() {
		acesa = true;
	}
	
	public void apagar() {
		acesa = false;
	}
}
