/* Guilherme Policarpo de Carvalho*/
public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		int a = (int) (Math.random() * 1000);
		int b = (int) (Math.random() * 20);
		
		if(a%b==0){
			System.out.print("É divisível");
		}
		else{
			System.out.print("Não é divisível");
		}
	}
}

