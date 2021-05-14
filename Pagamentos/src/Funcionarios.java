
public abstract class Funcionarios {
	protected String nome;
	protected int numFuncional;
	
	
	public Funcionarios(String nome, int numFuncional) {
		super();
		this.nome = nome;
		this.numFuncional = numFuncional;
	}
	
	
	public abstract double calcularSalario();


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumFuncional() {
		return numFuncional;
	}


	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}
	
	
	
	
	
	
}
