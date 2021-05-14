
public class Folha_Pagamento_Funcionario {
	public static void main (String args[]) {
		
		Funcionario f1, f2,f3;
		f1 = new Funcionario ();
		f2 = new Funcionario ();
		f3 = new Funcionario ();
		
		f1.setNumeroFuncional(98789082);
		f1.setNome("Joseph dos Santos");
		f1.setEmail("joseph@xxx.com.br");
		f1.setSalario(4000.90);
		
		f2.setNumeroFuncional(21233133);
		f2.setNome("Maria da Padroeira");
		f2.setEmail("p.maria@xxx.com.br");
		f2.setSalario(1800.00);
		
		f3.setNumeroFuncional(66666222);
		f3.setNome("Ian Charles");
		f3.setEmail("charlesian@xxx.com.br");
		f3.setSalario(2000.00);
		
		
		
		f1.ReajustarSalario(15);
		f2.ReajustarSalario(20);
		f3.ReajustarSalario(40);
		
		
		
		System.out.println (f1.exibirInfo());
		System.out.println (f2.exibirInfo());
		System.out.println (f3.exibirInfo());
		
		
		
		
	}

	
}
