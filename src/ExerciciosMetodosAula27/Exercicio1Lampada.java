package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio1Lampada {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.cor = "Amarela";
		lampada.potencia = 7;
		lampada.garantiaMeses = 12;
		lampada.tipoLuz = "Amarela";
		lampada.tipos = new String[3];
		int opcao;
		
		System.out.println("Deseja apagar ou acender a lâmpada?");
		System.out.println("1 - Acender.");
		System.out.println("2 - Apagar.");
		opcao = read.nextInt();
		switch(opcao) {
		case 1: lampada.acender();break;
		case 2: lampada.apagar();break;
		}
		
		System.out.println("A lampada " +(lampada.acesa ? "acendeu." : "apagou."));
		
		read.close();
	}
}
