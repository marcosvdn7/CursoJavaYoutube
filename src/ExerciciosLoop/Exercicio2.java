package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String usuario;
		String senha;
		System.out.println("Entre com o c�digo do usu�rio: ");
		usuario = read.nextLine();
		System.out.println("Entre com uma senha: ");
		senha = read.nextLine();
		
		while (senha.equalsIgnoreCase(usuario)) {
			System.out.println("O c�digo do usu�rio e a senha nao podem ser iguais. Informe uma senha diferente: ");
			senha = read.nextLine();
		}
		
		System.out.println("Usu�rio: " +usuario);
		System.out.println("Senha: " +senha);
		
		
		
		
		read.close();
	}
}

