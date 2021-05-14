
public class Chefe extends Funcionarios {

	double salarioBase;
	double adicionalFuncao;
	double beneficioTerno;
	
	public Chefe(String nome, int numFuncional, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(nome, numFuncional);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	
	public double calcularSalario () {
	
		
	return this.salarioBase + this.salarioBase * this.adicionalFuncao/100 + this.beneficioTerno;
		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	
	
	
}
