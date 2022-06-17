package ExerciciosMetodosAula27;

public class Exercicio1Lampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.cor = "Amarela";
		lampada.potencia = 7;
		lampada.garantiaMeses = 12;
		lampada.tipoLuz = "Amarela";
		lampada.tipos = new String[3];
		
		lampada.acender();
		
		System.out.println("A lampada esta " +(lampada.acesa == false ? "apagada." : "acesa."));
		
		lampada.apagar();
		
		System.out.println("A lampada esta " +(lampada.acesa == false ? "apagada." : "acesa."));
	}

}
