import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Eclipse, chegamos !!!!!");
		
		int a;
		
		System.out.println("Digite um valor inteiro: ");
		a = teclado.nextInt();
		
		
		System.out.println("O valor digitado foi: " + a);
	}
}
