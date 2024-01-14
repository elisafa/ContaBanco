import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		String nomeCliente;
		int numeroConta;
		String agencia;
		double saldo;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = sc.nextLine();
		
		System.out.print("Por favor, digite o número da conta: ");
		numeroConta = sc.nextInt();
		
		System.out.print("Por favor, digite o número da Agência: ");
		agencia = sc.next();	
		
		System.out.print("Por favor, digite o saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá "+  nomeCliente +
				", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
				", conta " + numeroConta + 
				" e seu saldo " + saldo + 
				" já está disponível para saque");
		
		sc.close();

	}

}
