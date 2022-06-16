package ExerciciosCriaçaoClassesObjetosAula24;

public class Lampada {
	
		public String modelo;
		public String tensao;
		public String cor;
		public String tipoLuz;
		public int potencia;
		public int garantiaMeses;
		public String[] tipos;

		public void acenderApagar(boolean aceso) {
			if (aceso == false) {
				System.out.println("A luz apagou.");
			} else {
				System.out.println("A luz acendeu.");
			}
		}
}
