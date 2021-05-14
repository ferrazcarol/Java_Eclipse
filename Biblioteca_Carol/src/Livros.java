public class Livros {
	
	String Titulo;
	String Autor;
	int AnoPublicacao;
	String Categoria;
	String Posicao;
	//String Disponibilidade;
	boolean disponivel;
	int ID;

	
	void InformacoesLivro () {
		System.out.println ("ID: " + ID);
		System.out.println ("TITULO: " + Titulo);
		System.out.println ("AUTOR: " + Autor);
		System.out.println ("ANO: " + AnoPublicacao);
		System.out.println ("CATEGORIA: " + Categoria);
		System.out.println ("POSICAO: " + Posicao);
		//System.out.println ("DISPONIBILIDADE: " + Disponibilidade );
		System.out.println ("--------------\\//------------------");
		
		if (disponivel==true) {
			System.out.println("Livro disponivel no acervo");
		}
		else {
			System.out.print("Livro emprestado, sorry!");
		}
		}
		
		
		
	}
	
	

