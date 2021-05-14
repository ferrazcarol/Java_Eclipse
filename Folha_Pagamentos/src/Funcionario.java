
public class Funcionario {
	private int numeroFuncional;
	private String Nome;
	private String Email;
	private double Salario;
	
	
	
	//public Funcionario(int numeroFuncional, String nome, String email, double salario) {
		//this.numeroFuncional = numeroFuncional;
		//Nome = nome;
		//Email = email;
		//Salario = salario;
	//}



	public int getNumeroFuncional() {
		return numeroFuncional;
	}



	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	
	public void ReajustarSalario (double SalarioReajust) {
		
		
		Salario = Salario + Salario * SalarioReajust/100;

		
		
	}
	
	
	
	public String exibirInfo () {
		String info = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+"\n"+
					  " Folha de Pagamentos "+"\n"+
					  "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+"\n"+
					  "Funcional: " + numeroFuncional +"\n"+
					  "Nome Funcionário: " + Nome +"\n"+
					  "E-mail: "+ Email +"\n"+
					  "Salário: " + String.format(" %.2f", Salario);
		
		
		return info;
		
	}
	
	public double calcularImposto () {
		double imposto;
		if (Salario <= 2000) {
			imposto =0;

        }else if (Salario > 2000 && Salario <= 3000) {
        	imposto =  Salario * 15/ 100;
        	
        }else if (Salario > 3000 && Salario <=4500) {
        	imposto =  Salario * 25/ 100;
        	
        }
		
        else {
        	imposto =2250;
        }
		
		return imposto;
}
}
