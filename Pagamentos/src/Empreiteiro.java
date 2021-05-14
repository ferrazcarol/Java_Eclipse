
public class Empreiteiro extends Funcionarios {
	
	
	double valorEmpreita;
	
	public Empreiteiro(String nome, int numFuncional, double valorEmpreita) {
		super(nome, numFuncional);
		this.valorEmpreita = valorEmpreita;
	}

	
	public double calcularSalario () {
		return valorEmpreita;
	}
	
	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	
	

}
