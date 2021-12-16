/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc2 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.print("Digite um número: ");
		n = ler.nextDouble();
		
		if(n >= 0){
			System.out.println("POSITIVO!");
		}else{
			System.out.println("NEGATIVO!");
		}
	}
}

