/*
       Inicializaci�n;

            while (condici�n) {

                        bloque_de_sentencias;

                        actualizaci�n;

            }
 */

package EstructurasControl.EstructurasControlBucles;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //Sentencias Previas
        Scanner scaneo = new Scanner(System.in);

        System.out.println("�En qu� n�mero quieres que empiece?");
        int numeroInicial = scaneo.nextInt();

        System.out.println("�En qu� n�mero quieres que acabe? (tiene que ser mayor que el anterior claro...");
        int numeroFinal = scaneo.nextInt();

        //Condici�n
        while (numeroInicial<=numeroFinal){

            //Sentencias del While
            System.out.println(numeroInicial);
            //Actualizaci�n
            numeroInicial ++;
        }
    }
}
