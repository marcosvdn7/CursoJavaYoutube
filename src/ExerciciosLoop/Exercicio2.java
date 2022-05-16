package ExerciciosLoop;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String usuario;
		String senha;
		System.out.println("Entre com um nome de usuário: ");
		usuario = read.nextLine();
		System.out.println("Entre com uma senha: ");
		senha = read.nextLine();
		
		while (senha.equalsIgnoreCase(usuario)) {
			System.out.println("O nome de usuário e a senha nao podm ser iguais. Informe uma senha diferente: ");
			senha = read.nextLine();
		}
		
		System.out.println("Usuário: " +usuario);
		System.out.println("Senha: " +senha);
		
		
		
		
		read.close();
	}
}

