import java.util.Scanner;

public class DesafioMultiplicacao {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	int valor1;
	int valor2;
	int prod;
	
    
    
	valor1 = sc.nextInt();
	
	System.out.println("Digite seu segundo valor");
	valor2 = sc.nextInt();
	
	prod = valor1 * valor2;
	
	System.out.println("O produto dos valores é " +prod);
	
    }
}    