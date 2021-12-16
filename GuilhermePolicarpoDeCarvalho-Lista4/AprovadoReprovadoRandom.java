/* Guilherme Policarpo de Carvalho*/
public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int) (Math.random() * 11);
		
		if(nota >= 6){
			System.out.println("APROVADO");
		}
		else{
			System.out.println("REPROVADO");
		}
	}
}

