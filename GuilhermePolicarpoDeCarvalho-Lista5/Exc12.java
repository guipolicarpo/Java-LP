/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc12 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigo;
		double preco;
		
		System.out.printf("Qual o valor do produto: R$");
		preco = ler.nextDouble();
		
		System.out.printf("Qual o código do produto: R$");
		codigo = ler.nextInt();
		
		switch(codigo){
			case 1:
			preco += preco * 0.10;
			System.out.println("Procedencia: Norte | Valor final: R$" + preco);
			break;
			
			case 2: case 5: case 9:
			preco += preco * 0.03;
			System.out.println("Procedencia: Sul | Valor final: R$" + preco);
			break;
			
			case 3: case 10: case 11: case 12: case 13: case 14: case 15:
			preco += preco * 0.012;
			System.out.println("Procedencia: Leste | Valor final: R$" + preco);
			break;
			
			case 7: case 20:
			preco += preco * 0.073;
			System.out.println("Procedencia: Oeste | Valor final: R$" + preco);
			break;
			
			default:
			preco += preco * 0.222;
			System.out.println("Procedencia: Importado | Valor final: R$" + preco);
			break;
		}
		
	}
}

