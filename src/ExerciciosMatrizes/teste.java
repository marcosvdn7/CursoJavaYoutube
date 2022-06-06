package ExerciciosMatrizes;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		String[] jogador = {"O", "X"};
		String[] verificar = new String[10];
		int opcao = 0;
		boolean fim = false;
		int turno = 0;
		int indiceJogador = 0;
		
		System.out.println("Jogo da velha");
		
		for (; fim == false;) {
			for (int i = 0, num = 1; i < tabuleiro.length; i++) {
				System.out.print("");
				for (int j = 0; j < tabuleiro[i].length; j++) {
					tabuleiro[i][j] = "" +num;
					System.out.print(tabuleiro[i][j]+ " | ");
					num++;
				}
			}
				System.out.println("\nJogador " +(indiceJogador + 1)+ " faça sua jogada.");
				while (opcao < 1 || opcao > 9 || verificar[opcao].equals(jogador[0]) || verificar[opcao].equals(jogador[1])) {
					for (int i = 0, num = 1; i < tabuleiro.length; i++) {
						System.out.print("");
						for (int j = 0; j < tabuleiro[i].length; j++) {
							tabuleiro[i][j] = "" +num;
							System.out.print(tabuleiro[i][j]+ " | ");
							num++;
						}
					}
					System.out.println("Escolha um campo válido!");
					opcao = read.nextInt();
				}
				switch (opcao) {
				case 1: tabuleiro[0][0] = jogador[indiceJogador];break;
				case 2: tabuleiro[0][1] = jogador[indiceJogador];break;
				case 3: tabuleiro[0][2] = jogador[indiceJogador];break;
				case 4: tabuleiro[1][0] = jogador[indiceJogador];break;
				case 5: tabuleiro[1][1] = jogador[indiceJogador];break;
				case 6: tabuleiro[1][2] = jogador[indiceJogador];break;
				case 7: tabuleiro[2][0] = jogador[indiceJogador];break;
				case 8: tabuleiro[2][1] = jogador[indiceJogador];break;
				case 9: tabuleiro[2][2] = jogador[indiceJogador];break;
				}
				for (int k = 0, l = 0, j = 0; j <= 1; j++) {
					if (tabuleiro[k][l] == jogador[j] && tabuleiro[k][l + 1] == jogador[j] && tabuleiro[k][l + 2] == jogador[j] ||
						tabuleiro[k + 1][l] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 1][l + 2] == jogador[j] ||
						tabuleiro[k + 2][l] == jogador[j] && tabuleiro[k + 2][l + 1] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l] == jogador[j] && tabuleiro[k + 1][l] == jogador[j] && tabuleiro[k + 2][l] == jogador[0] || 
						tabuleiro[k][l + 1] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l + 1] == jogador[j] ||
						tabuleiro[k][l + 2] == jogador[j] && tabuleiro[k + 1][l + 2] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l + 2] == jogador[j] ||
						tabuleiro[k][l + 2] == jogador[j] && tabuleiro[k + 1][l + 1] == jogador[j] && tabuleiro[k + 2][l] == jogador[j]){
							for (int i = 0, num = 1; i < tabuleiro.length; i++) {
								System.out.print("");
								for (j = 0; j < tabuleiro[i].length; j++) {
									tabuleiro[i][j] = "" +num;
									System.out.print(tabuleiro[i][j]+ " | ");
									num++;
								}
							}
						System.out.println("\nO Jogador " +(indiceJogador + 1)+ " venceu!");
						fim = true;
					}
				}
				turno++;
				if (turno == 9 && fim == false) {
						for (int i = 0, num = 1; i < tabuleiro.length; i++) {
							System.out.print("");
							for (int j = 0; j < tabuleiro[i].length; j++) {
								tabuleiro[i][j] = "" +num;
								System.out.print(tabuleiro[i][j]+ " | ");
								num++;
							}
						} 
					System.out.println("O jogo empatou!");
					fim = true;
				}
				int j = 0;
				if (indiceJogador == 1) {
					indiceJogador = 0;
				} else if (indiceJogador == 0) {
					indiceJogador = 1;
				}
			}
		
			read.close();
			
		} 
}
	
