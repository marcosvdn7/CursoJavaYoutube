package ExerciciosMetodosAula27;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		JogoVelha jogo = new JogoVelha();
		jogo.tabuleiro = new String[3][3];
		jogo.fimJogo = false;
		int rodada = 0;
		int opcao;
		
		System.out.println("Jogo da Velha");
		System.out.println("-------------");
		System.out.println("Jogador 1 - X.");
		System.out.println("Jogador 2 - O.");
		
		while (jogo.fimJogo == false) {
			rodada++;
			jogo.mostrarTabuleiro();
			System.out.println("\nJogador " +(rodada % 2 != 0 ? "1" : "2")+ " fa�a sua jogada");
			opcao = read.nextInt();
			while (opcao <= 0 || opcao > 9 || jogo.verificarJogada(opcao) == false) {
				System.out.println("Jogada inv�lida! Escolha uma op��o v�lida");
				opcao = read.nextInt();
			}
			jogo.fazerJogada(rodada, opcao);
			jogo.verificarGanhador();
			jogo.mostrarVencedor(rodada);
			}
			
		read.close();
	}

}
