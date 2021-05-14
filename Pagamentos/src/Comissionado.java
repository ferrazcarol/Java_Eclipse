
public class Comissionado extends Funcionarios{
	
	double salarioBase;
	double comissao;
	
	public Comissionado(String nome, int numFuncional, double salarioBase, double comissao) {
		super(nome, numFuncional);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase * salarioBase * comissao /100;
	}
	
	

}
