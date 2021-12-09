/* Guilherme Policarpo de Carvalho*/
public class questao5 {
	
	public static void main (String[] args) {

        int hora = (int) (Math.random() * 24);

        if (hora >= 0 && hora <= 6) {
            System.out.print("Zzzzz");
        } else if (hora >= 7 && hora <= 11) {
            System.out.print("Bom dia");
        }else if (hora >= 12 && hora <= 17) {
            System.out.print("Boa tarde");
        }else{
            System.out.print("Boa noite");
        }

    }
    
}
