package ExerciciosMetodosAula27;

import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		classeTeste jogo = new classeTeste();
		jogo.tabuleiro = new char[3][3];
		jogo.fimJogo = false;
		int rodada = 1;
		int opcao;
		
		System.out.println("Jogo da Velha");
		System.out.println("-------------");
		System.out.println("Jogador 1 - X.");
		System.out.println("Jogador 2 - O.");
		
		while (jogo.fimJogo == false) {
			System.out.println("Rodada " +rodada);
			System.out.println("\nJogador " +(rodada % 2 != 0 ? "1 (X)" : "2 (O)")+ " fa?a sua jogada");
			jogo.mostrarTabuleiro();
			opcao = read.nextInt();
			while (opcao <= 0 || opcao > 9 || jogo.verificarJogada(opcao) == false) {
				System.out.println("Jogada inv?lida! Escolha uma op??o v?lida");
				opcao = read.nextInt();
			}
			jogo.fazerJogada(rodada, opcao);
			jogo.verificarGanhador();
			jogo.mostrarVencedor(rodada);
			rodada++;
			}
			
		read.close();

	}

}
