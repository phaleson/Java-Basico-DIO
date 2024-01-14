import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);

	int numeroConta;
	String agencia, nomeCliente;
	Double saldo = 237.48;
	
    
    System.out.println("Digite seu numero de conta, e em seguida aperte Enter!");
	numeroConta = sc.nextInt();
	
	System.out.println("Digite sua agencia, e em seguida aperte Enter!");
	agencia = sc.next();
	
    System.out.println("Digite seu nome, e em seguida aperte Enter");
	nomeCliente = sc.next();
	
	
	System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " 
    + agencia + " conta " + numeroConta +" e seu saldo é " + saldo + " disponivel para saque.");
	
    
   
  
    }
}
