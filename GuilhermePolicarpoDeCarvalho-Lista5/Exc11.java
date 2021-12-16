/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc11 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lers = new Scanner(System.in);
		
		int n1, n2;
		char op;
		double resposta;
		
		System.out.printf("Digite o numero 1: ");
		n1 = ler.nextInt();
		System.out.printf("Digite o numero 2: ");
		n2 = ler.nextInt();
		System.out.printf("Digite a operação (+, -, *, /): ");
		op = lers.nextLine().charAt(0);
		
		switch(op){
			case '+':
			resposta = n1 + n2;
			System.out.println("Resultado: " + resposta);
			break;
			
			case '-':
			resposta = n1 - n2;
			System.out.println("Resultado: " + resposta);
			break;
			
			case '*':
			resposta = n1 * n2;
			System.out.println("Resultado: " + resposta);
			break;
			
			case '/':
			resposta = n1 / n2;
			System.out.println("Resultado: " + resposta);
			break;
			
			default:
			System.out.printf("Operação Inválida");
			break;
		}
	}
}

