/* Guilherme Policarpo de Carvalho*/
import java.util.Scanner;

public class questao4 {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main (String[] args) {

    Scanner leia = new Scanner ( System.in );

    int inicio;
    int fim;
    int j;
    int f;

    System.out.print("Termo inicial da sequencia: ");
    inicio = leia.nextInt();
    System.out.print("Termo final da sequencia: ");
    fim = leia.nextInt();
    j = (fim-1);
    f = (inicio-1);

    for(int i=j;i>=f;i--) {
        System.out.print(questao4.fibo(i) + ", ");
    }
    }
}