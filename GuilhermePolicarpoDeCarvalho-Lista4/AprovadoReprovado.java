/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class AprovadoReprovado {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Digite uma nota de 0 a 10: ");
		nota = ler.nextInt();
		
		if(nota >= 6 && nota <= 10){
			System.out.print("APROVADO");
		}
		
		if(nota <= 5 && nota > 0){
			System.out.print("REPROVADO");
		}
		
		if(nota > 10){
			System.out.print("VALOR INVALIDO");
		}
		
		if(nota < 0){
			System.out.print("VALOR INVALIDO");
		}
		
		
		
		
	}
}

