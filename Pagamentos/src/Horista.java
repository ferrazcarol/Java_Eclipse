
public class Horista extends Funcionarios{
	
	double valorHora;
	int numHoras;
	
	
	public Horista(String nome, int numFuncional, double valorHora, int numHoras) {
		super(nome, numFuncional);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public int getNumHoras() {
		return numHoras;
	}


	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}


	@Override
	public double calcularSalario() {
		
		return valorHora * numHoras;
	}
	
	
	

}
