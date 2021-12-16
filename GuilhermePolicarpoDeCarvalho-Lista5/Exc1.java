/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;
public class Exc1 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double n;
		
		System.out.print("Digite um número: ");
		n = ler.nextDouble();
		
		if(n > 10){
			System.out.println("É MAIOR QUE 10!");
		}else{
			System.out.println("NÃO É MAIOR QUE 10!");
		}
	}
}

