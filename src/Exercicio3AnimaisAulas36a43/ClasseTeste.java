package Exercicio3AnimaisAulas36a43;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Peixe peixe = new Peixe("Tubar�o - Branco", "Branco", "�gua", 300, 0, 1.5);
		
		Mamifero camelo = new Mamifero("Camelo", "Amarelo", "Terra", 150, 4, 2);
		
		Mamifero ursoCanada = new Mamifero("Urso do Canad�", "Vermelho", "Terra", 180, 4, 0.5);
		ursoCanada.setAlimento("Mel");

	}

}
