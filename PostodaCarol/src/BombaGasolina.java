
public class BombaGasolina {
	
	private String NomeCombustivel;
	private double PrecoLitro;
	private double QtdLitros;
	private double TotalPagar;
	
	
	
	/// Métodos
	public void AbastecerLitros (double Litros) {
		QtdLitros = Litros;
		this.TotalPagar = PrecoLitro * QtdLitros;
	}
	
	public void AbastecerValor (double Total) {
		TotalPagar = Total;
		QtdLitros = TotalPagar / PrecoLitro;
	}
	
	public String exibirInfo() {
		String info = "Bem-vindo ao Posto da Kérolaineeeee" + "\n" +
					  "Tipo Combustivel: " + NomeCombustivel + "\n" +
					  "Preço Litro: " + PrecoLitro + "\n" +
					  "Quantidade Litros: " +QtdLitros + "\n" +
					 String.format ("Total a pagar: R$ %.3f \n", TotalPagar);
		
		return info;
		
		
	}
	
	/// Getters and Setters
	public String getNomeCombustivel() {
		return NomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		NomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return PrecoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		PrecoLitro = precoLitro;
	}
	public double getQtdLitros() {
		return QtdLitros;
	}
	public void setQtdLitros(double qtdLitros) {
		QtdLitros = qtdLitros;
	}
	public double getTotalPagar() {
		return TotalPagar;
	}
	//public void setTotalPagar(double totalPagar) {
		//TotalPagar = totalPagar;
	//}
	
	

	
	
	
}
