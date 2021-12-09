/* Guilherme Policarpo de Carvalho*/
public class questao2 {
	
	public static void main (String[] args) {
		
		for (int i = 1; i <= 10; i++){		
		 System.out.print("\n" +i + ", ");

			if(i %2 == 1){
				for (int n1 = i+1; n1 <= 10; n1++){ 
					System.out.print( n1 + " ");
				}
			}

			if (i %2 == 0) {
				for (int n2 = 1; n2 < i; n2++){ 
					System.out.print( n2 + " ");
				}
			}
			
		}
	}
}