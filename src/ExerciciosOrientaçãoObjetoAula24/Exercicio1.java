package ExerciciosOrientaçãoObjetoAula24;

public class Exercicio1 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.cor = "Amarela";
		lampada.potencia = 7;
		lampada.garantiaMeses = 12;
		lampada.tipoLuz = "Amarela";
		lampada.tipos = new String[5];
		String[] tipos = {"Abajur", "Lampeões", "Luminárias", "Pendentes", "Refletores"};
		
		for (int i = 0; i < tipos.length; i++) {
			System.out.println(tipos[i]);
		}
	}

}
