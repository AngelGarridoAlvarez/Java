/*
       Inicialización;

            while (condición) {

                        bloque_de_sentencias;

                        actualización;

            }
 */

package EstructurasControl.EstructurasControlBucles;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //Sentencias Previas
        Scanner scaneo = new Scanner(System.in);

        System.out.println("¿En qué número quieres que empiece?");
        int numeroInicial = scaneo.nextInt();

        System.out.println("¿En qué número quieres que acabe? (tiene que ser mayor que el anterior claro...");
        int numeroFinal = scaneo.nextInt();

        //Condición
        while (numeroInicial<=numeroFinal){

            //Sentencias del While
            System.out.println(numeroInicial);
            //Actualización
            numeroInicial ++;
        }
    }
}
