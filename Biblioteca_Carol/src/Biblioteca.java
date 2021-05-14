import java.util.Scanner;

public class Biblioteca {
	public static void main (String args[]) {

		
		
		Livros L1, L2, L3;
		L1 = new Livros ();
		L2 = new Livros ();
		L3 = new Livros ();
		
		L1.ID = 20;
		L1.Titulo = "O homem que não foi a Lua";
		L1.Autor = "Joseph Arnold";
		L1.AnoPublicacao =2020;
		L1.Categoria = "Ficção";
		L1.Posicao = "2 - 1";
		L1.disponivel = true;
		
		L2.ID = 2;
		L2.Autor = "Alice Carter";
		L2.AnoPublicacao =2006;
		L2.Categoria = "Romance";
		L2.Posicao = "3 - 4";
		L2.disponivel = false;
		
		L3.ID = 567;
		L3.Autor = "Henry Mark";
		L3.AnoPublicacao =2009;
		L3.Categoria = "Exatas";
		L3.Posicao = "10 - 9";
		L3.disponivel = true;
		
	
		
		System.out.println ("Biblioteca Nacional da Carol");
		System.out.println ("****************************");
		
		

		
		//if (valor == 1) {
			L1.InformacoesLivro();	
			
		//}
		//else if(valor==2){
			L2.InformacoesLivro();
			
		//}
		//else if (valor==3) {
			L3.InformacoesLivro();
		//}
		
		
		//else {
		
		//}
	
		
			
		
		
	}
}

