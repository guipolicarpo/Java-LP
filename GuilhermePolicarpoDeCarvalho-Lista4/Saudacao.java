/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int hora;
		int opc;
		
		System.out.println("1- Informar manualmente | 2- Gerar aleatoriamente");
		opc = ler.nextInt();
		
		if(opc == 1 || opc == 2){
			if(opc == 1){
			System.out.println("Informa a hora de 0 às 23: ");
			hora = ler.nextInt();
			
			if(hora >= -1){
				if(hora <=23){
					if(hora >= 0 && hora <=6){
						System.out.println("Zzzzz");
					}
			
					if(hora >= 7 && hora <=11){
						System.out.println("Bom dia");
					}
			
					if(hora >= 12 && hora <=17){
						System.out.println("Boa tarde");
					}		
			
					if(hora >= 18 && hora <=23){
						System.out.println("Boa noite");
					}		
				}else{
				System.out.println("Informe um horário válido");
				}
			}
			else{
				System.out.println("Informe um horário válido");
			}
		}
		if(opc == 2){
			hora = (int) (Math.random() * 23);
			
			if(hora >= 0 && hora <=6){
				System.out.println("Zzzzz");
			}
			
			if(hora >= 7 && hora <=11){
				System.out.println("Bom dia");
			}
			
			if(hora >= 12 && hora <=17){
				System.out.println("Boa tarde");
			}		
			
			if(hora >= 18 && hora <=23){
				System.out.println("Boa noite");
			}
		}
		}
		else{
			System.out.println("Escolha uma opção válida");
		}
		
	}
}

