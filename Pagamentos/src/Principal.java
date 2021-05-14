import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	
	
	/*Funcionarios f1 = new Empreiteiro ("Ricardão", 123456,3500.00);
	System.out.println (f1.calcularSalario());
	
	Funcionarios f2 = new Chefe ("Pedro" , 45678, 6000.00, 200.00, 1000.00);
	System.out.println (f2.calcularSalario());
	
	Funcionarios f3 = new Horista ("Jorge" , 12344, 150.00, 100);
	System.out.println (f3.calcularSalario());
	
	Funcionarios f4 = new Comissionado ("Luisa" , 22989, 500.00 , 1000.00);
	System.out.println (f4.getNome() + f4.calcularSalario ()); */
	
	ArrayList<Funcionarios> lista;
	
	lista = new ArrayList <Funcionarios> ();
	
	lista.add(new Chefe( "jose", 27323, 8190.00, 25.00, 3715.00));
	lista.add(new Comissionado("pedro", 4567, 45.00, 67.00));
	lista.add(new Horista("igor", 8686, 260.00, 200));
	lista.add(new Empreiteiro("ian", 56788, 6789.00));
	
	
	for (int pos=0; pos<lista.size(); pos++) {
		Funcionarios f = lista.get(pos);
		System.out.println (f.getNome() + "-" + f.calcularSalario());
		
	}
	
	
}
}
