/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc3 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double maca;
		
		System.out.print("Quantas maças comprar?: ");
		maca = ler.nextDouble();
		
		if(maca < 12){
			maca*=1.30;
			System.out.print("Valor total da compra: R$" + maca);
		}
		
		if(maca >= 12){
			maca*=1;
			System.out.print("Valor total da compra: R$" + maca);
		}
	}
}

