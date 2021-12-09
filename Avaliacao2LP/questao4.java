/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
import java.util.Random;

public class questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner ( System.in );
        Scanner lers = new Scanner ( System.in );
        Random r = new Random();

        int fim, fim2 = 0, pais, p;

        double[] eua = new double[3];
        eua [0] = 7.312;
        eua [1] = 5.17;
        eua [2] = 1;

        double[] canada = new double[3];
        canada [0] = 9.299;
        canada [1] = 4.03;
        canada [2] = 1;

        double[] mexico = new double[3];
        mexico [0] = 6.924;
        mexico [1] = 0.26;
        mexico [2] = 2;

        String p1 = "Qual pais voce mais tem vontade de conhecer?: ";
        String p2 = "Voce fala ingles?: ";
        String p3 = "Voce fala espanhol?: ";
        String p4 = "Voce ja fez uma viagem internacional?: ";
        String p5 = "Voce ja viajou de aviao?: ";
        String recebep = "";

        System.out.println("BEM VINDO A POLICARPO DESTINOS!!!\n");
        
        do{

            System.out.printf("Escolha um pais para saber sua distancia, idioma e valor de moeda: (1 - EUA | 2 - CANADA | 3 - MEXICO): ");
            pais = ler.nextInt();

            switch (pais) {
                case 1:
                    System.out.printf("\nDistancia: " + eua [0] + "km");
                    System.out.printf("\nValor do Dolar: R$" + eua [1]);
                    if(eua [2] == 1){
                        System.out.printf("\nIdioma: Ingles");
                    }
                    if(eua [2] == 2){
                        System.out.printf("\nIdioma: Espanhol");
                    }
                    
                    break;

                case 2:
                    System.out.printf("\nDistancia: " + canada [0] + "km");
                    System.out.printf("\nValor do Dolar Canadense: R$" + canada [1]);
                    if(canada [2] == 1){
                        System.out.printf("\nIdioma: Ingles");
                    }
                    if(canada [2] == 2){
                        System.out.printf("\nIdioma: Espanhol");
                    }

                    break;

                case 3:
                    System.out.printf("\nDistancia: " + mexico [0] + "km");
                    System.out.printf("\nValor do Peso Mexicano: R$" + mexico [1]);
                    if(mexico [2] == 1){
                        System.out.printf("\nIdioma: Ingles");
                    }
                    if(mexico [2] == 2){
                        System.out.printf("\nIdioma: Espanhol");
                    }

                    break;
            }

            System.out.printf("\n\nDigite '0' para encerrar a busca ou '1' para continuar buscando: ");
            fim = ler.nextInt();

            if(fim != 0 && fim != 1){
                System.out.print("\nVALOR INVALIDO! Fim do programa.");
                System.exit(0);
            }
            

        }while(fim != 0);

        while(fim2 == 0){
            System.out.println("\n\nAjude-nos respondendo algumas perguntas!");

            for(int c = 1; c <= 3; c++){
                p = r.nextInt(4);

                if(p == 0){
                    System.out.printf("\n" + p1);
                    recebep = lers.nextLine();
                }
    
                if(p == 1){
                    System.out.printf("\n" + p2);
                    recebep = lers.nextLine();
                }
    
                if(p == 2){
                    System.out.printf("\n" + p3);
                    recebep = lers.nextLine();
                }

                if(p == 3){
                    System.out.printf("\n" + p4);
                    recebep = lers.nextLine();
                }

                if(p == 4){
                    System.out.printf("\n" + p5);
                    recebep = lers.nextLine();
                }
            }          

            System.out.println("\nMuito obrigado por responder nossa pesquisa! BOA VIAGEM :)");
            fim2++;
        }    
    }
}