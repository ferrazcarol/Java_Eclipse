
public class PostoGasolina {
public static void main (String args []) {
	
	
	BombaGasolina bomba = new BombaGasolina();
	
	bomba.setNomeCombustivel("Alcool");
	bomba.setPrecoLitro(3.39);
	//bomba.setQtdLitros(30);
	//bomba.setTotalPagar(100.0);
	
	
	bomba.AbastecerLitros(30);
	
	System.out.println (bomba.exibirInfo());
	
	bomba.AbastecerValor(50);
	
	System.out.println (bomba.exibirInfo());
	
	
	
}
}
