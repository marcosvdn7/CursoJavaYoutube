package ExerciciosMetodosAula27;

public class classeTeste {

	char[][] tabuleiro = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	char[] sinalJogadores = {'X', 'O'};
	char[] camposJogados = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	boolean fimJogo;
	int opcao;
	int rodada = 0;
	
	void fazerJogada(int rodada, int opcao) {
		char sinal;
		if (rodada % 2 != 0) {
			sinal =  sinalJogadores[0];
		} else {
			sinal = sinalJogadores[1];
		}
		camposJogados[opcao - 1] = sinal;
		switch (opcao) {
		case 1: tabuleiro[0][0] = sinal;break;
		case 2: tabuleiro[0][1] = sinal;break;
		case 3: tabuleiro[0][2] = sinal;break;
		case 4: tabuleiro[1][0] = sinal;break;
		case 5: tabuleiro[1][1] = sinal;break;
		case 6: tabuleiro[1][2] = sinal;break;
		case 7: tabuleiro[2][0] = sinal;break;
		case 8: tabuleiro[2][1] = sinal;break;
		case 9: tabuleiro[2][2] = sinal;break;
		}
	}
	
	boolean verificarJogada(int opcao) {
		if (camposJogados[opcao - 1] == sinalJogadores[0] || camposJogados[opcao - 1] == sinalJogadores[1]) {
			return false;
		} else {
			return true;
		}
	}
	
	void mostrarTabuleiro() {
		int num = 1;
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.print(" -------------\n");
			System.out.print(" | ");
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (camposJogados[opcao] == sinalJogadores[0] || camposJogados[opcao] == sinalJogadores[1]) {
					tabuleiro[i][j] = camposJogados[num - 1];
					System.out.print(tabuleiro[i][j]+ " | ");
					num++;
				} else {
					System.out.print(tabuleiro[i][j]+ " | ");
					num++;
				}
			}
			System.out.println(num == 10 ? "\n -------------" : "");
		}
	}	
	
	void verificarGanhador() {
		for (int i = 0; i < 2; i++) {
			if (tabuleiro[0][0] == sinalJogadores[i] && tabuleiro[0][1] == sinalJogadores[i] && tabuleiro[0][2] == sinalJogadores[i] ||
				tabuleiro[1][0] == sinalJogadores[i] && tabuleiro[1][1] == sinalJogadores[i] && tabuleiro[1][2] == sinalJogadores[i] ||
				tabuleiro[2][0] == sinalJogadores[i] && tabuleiro[2][1] == sinalJogadores[i] && tabuleiro[2][2] == sinalJogadores[i] ||
				tabuleiro[0][0] == sinalJogadores[i] && tabuleiro[1][0] == sinalJogadores[i] && tabuleiro[2][0] == sinalJogadores[i] || 
				tabuleiro[0][1] == sinalJogadores[i] && tabuleiro[1][1] == sinalJogadores[i] && tabuleiro[2][1] == sinalJogadores[i] ||
				tabuleiro[0][2] == sinalJogadores[i] && tabuleiro[1][2] == sinalJogadores[i] && tabuleiro[2][2] == sinalJogadores[i] ||
				tabuleiro[0][0] == sinalJogadores[i] && tabuleiro[1][1] == sinalJogadores[i] && tabuleiro[2][2] == sinalJogadores[i] ||
				tabuleiro[0][2] == sinalJogadores[i] && tabuleiro[1][1] == sinalJogadores[i] && tabuleiro[2][0] == sinalJogadores[i]){
				fimJogo = true;
			}
			if (rodada > 9) {
				fimJogo = true;
			}
		}
	}
	
	void mostrarVencedor(int rodada) {
		if (fimJogo == true) {
			mostrarTabuleiro();
			System.out.println("O Jogador " +(rodada % 2 != 0 ? "1" : "2")+ " venceu.");
		} else if (fimJogo == false && rodada == 9) {
			System.out.println("O jogo empatou!");
			mostrarTabuleiro();
			fimJogo = true;
		}
	}
	
	/*void verificarGanhador2() {
		for (int i = 0, j = 0, count = 0, jogador = 1; count < 3;) {
			if (tabuleiro[i][j] == sinalJogadores[jogador] && tabuleiro[i][j+1] == sinalJogadores[jogador] && tabuleiro[i][j+2] == sinalJogadores[jogador]){
				fimJogo = true;
				break;
			} else if (tabuleiro[0][0] == sinalJogadores[jogador] && tabuleiro[1][1] == sinalJogadores[jogador] && tabuleiro[2][2] == sinalJogadores[jogador] ||
					   tabuleiro[0][2] == sinalJogadores[jogador] && tabuleiro[1][1] == sinalJogadores[jogador] && tabuleiro[2][0] == sinalJogadores[jogador]){
				fimJogo = true;
				break;
			}
			if (jogador == 1) {
				jogador = 2;
			} else if (jogador == 2) {
				jogador = 1;
				count++;
				i++;
			}
			if (count == 3) {
				count = 0;
				i = 0;
			}
		}
	}*/
}
