/* Guilherme Policarpo de Carvalho */
import java.util.Random;

public class questao2 {

    public static void main(String[] args) {

        int[] valores = new int[10];
        Random gera = new Random();

        int i = 0;
        while (i < valores.length) {
            valores[i] = gera.nextInt(10);
            boolean colide = false;
            for (int j = 0; j < i; j++) {
                if (valores[i] == valores[j]) {
                    colide = true;
                    break;
                }
            }
            if (!colide) {
                i++;
            }
        }

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}