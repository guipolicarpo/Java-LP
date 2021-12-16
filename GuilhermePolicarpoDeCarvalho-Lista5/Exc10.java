/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Exc10 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario, vendas;
		
		System.out.printf("Salário do vendedor: R$");
		salario = ler.nextDouble();
		
		System.out.printf("Valor total de vendas: R$");
		vendas = ler.nextDouble();
		
		if(vendas <= 1500 ){
			vendas = vendas*0.03;
		}
		else{
			vendas = vendas*0.05;
		}
		
		salario+= vendas;
		
		System.out.printf("Salário total: R$" + salario);
	}
}

