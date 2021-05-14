import java.util.Scanner;
public class Transacoes {
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);
		
		double valor, sacar;
		
		ContaBancaria CB1;
        CB1 = new ContaBancaria ();
		

        CB1.setNumeroConta(1234);
        CB1.setDigitoVerificador(1);
        CB1.setNomeTitular("Caroline");
        CB1.setCPF("56789089");
        CB1.setSaldo(30456.89);
        
        
        //ColetarInfo Deposito
        
        System.out.println("Digite o valor que deseja depositar: ");
        valor = teclado.nextDouble();
        CB1.Depositar(valor);
        
        // ColetarInfo Sacar
        System.out.println("Digite o valor que deseja sacar: ");
        sacar = teclado.nextDouble();
        CB1.Sacar(sacar);
        
        CB1.ExibirInformações();
		
	}

}
