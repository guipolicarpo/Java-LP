/* Guilherme Policarpo de Carvalho*/
public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		int precoProduto1 = (int) (Math.random() * 1001);
		int precoProduto2 = (int) (Math.random() * 1001);
		
		if(precoProduto1 < precoProduto2){
			System.out.println("O produto 1 é mais barato!");
		}
		
		if(precoProduto1 > precoProduto2){
			System.out.println("O produto 2 é mais barato!");
		}
		
		if(precoProduto1 == precoProduto2){
			System.out.println("Os preços dos dois produtos são iguais!");
		}
	}
}

