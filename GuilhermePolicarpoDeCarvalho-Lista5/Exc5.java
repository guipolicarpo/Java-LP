/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc5 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);	
		int anoa;
		int anon;
		
		System.out.printf("Digite o ano atual: ");
		anoa = ler.nextInt();
		
		System.out.print("Digite o ano de nascimento: ");
		anon = ler.nextInt();
		
		if(anoa - anon >= 18){
			System.out.printf("Pode votar!");
		}
		else{
			System.out.printf("Não pode votar!");
		}
	}
}

