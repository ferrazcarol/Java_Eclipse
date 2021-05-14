
public class ContaBancaria {
	
	private int NumeroConta;
	private int DigitoVerificador;
	private String NomeTitular;
	private String CPF;
	private double Saldo;
	
	
	
	
	
	public int getNumeroConta() {
		return NumeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}
	public int getDigitoVerificador() {
		return DigitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		DigitoVerificador = digitoVerificador;
	}
	public String getNomeTitular() {
		return NomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSaldo() {
		return Saldo;
	}
	
	public void setSaldo( double Saldo) {
		this.Saldo = Saldo;
	}
	
	
	
	
	
	public void Depositar (double valorDeposito){
		Saldo = Saldo + valorDeposito;
	
	}
	
	public boolean Sacar (double ValorSaque) {
		boolean resultado;
		if (ValorsSaque > Saldo) {
			resultado = false;
			else {
				Saldo = Saldo - ValorSaque;
				return true;
			}
			
		}
	}
	
	void ExibirInformações () {
		System.out.println ("Número da conta: " +getNumeroConta()+ "-" +getDigitoVerificador());
		System.out.println ("Nome Titular: " + getNomeTitular() );
		System.out.println ("CPF: " +getCPF() );
		System.out.println ("Saldo: " +getSaldo() );
		
		
	}
	
	
	

}
