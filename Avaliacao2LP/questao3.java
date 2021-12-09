/* Guilherme Policarpo de Carvalho */

import java.util.Random;

public class questao3 {
    public static void main(String[] args) {

        Random r = new Random();

        int a, zero = 0, um = 0;
        String binario = "";

        for(int c = 1; c <= 5; c++){
            a = r.nextInt(2);
            binario = Integer.toString(a);

            if(a == 0){
                System.out.print(binario);
                zero++;
            }

            if(a == 1){
                System.out.print(binario);
                um++;
            }
            
        }

        System.out.printf("\n\nQuantidade de Zeros: " + zero);
        System.out.printf("\nQuantidade de Uns: " + um);
        System.out.printf("\nQuantidade total: " + (um+zero));

    }
}
