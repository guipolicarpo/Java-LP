/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc4 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2;
		double arit;
		
		System.out.printf("Informe a nota 1: ");
		nota1 = ler.nextInt();
		System.out.printf("Informe a nota 2: ");
		nota2 = ler.nextInt();
		
		arit = (nota1+nota2)/2;
		
		if(arit >= 6){
			System.out.printf("Aprovador! Média final: " + arit);
		}
		else{
			System.out.printf("Reprovado! Média final: " + arit);
		}
	}
}

