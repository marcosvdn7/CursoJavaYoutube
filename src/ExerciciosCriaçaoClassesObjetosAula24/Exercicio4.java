package ExerciciosCriaçaoClassesObjetosAula24;

import java.sql.Date;

public class Exercicio4 {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.genero = "Fantasia";
		livro.autor = "R.G.G. Martin";
		livro.titulo = "Game of Thrones";
		livro.ultimoLocatario = "Marcos";
		livro.qtdPaginas = 500;
		livro.dataEmprestimo = new Date(0);
		livro.emprestado = true;
		
		System.out.println(livro.dataEmprestimo);

	}

}
