/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Digite o valor A (De 0 até 1000): ");
		a = ler.nextInt();
		
		System.out.print("Digite o valor B (De 0 até 20): ");
		b = ler.nextInt();
		
		if(a >= b){
			if(a >= 0 && a <= 1000){
				if(b >= 0 && b <= 20){
					if(a%b==0){
						System.out.print("É divisível");
					}
					else{
						System.out.print("Não é divisível");
					}
				}
				else{
					System.out.print("Valor de B é INVALIDO!");
				}
			}
			else{
				System.out.print("Valor de A é INVALIDO!");
			}
		}
		else{
			System.out.print("O valor de A precisa ser maior ou igual que o de B");
		}
	}
}

