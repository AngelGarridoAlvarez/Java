package EstructurasControl;

import java.util.Scanner;

public class IfElseParImpar {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("Elije un número y te diré si es par o impar");
        int numero = escanear.nextInt();


        if (numero % 2 == 0) {

            System.out.println(numero + " es par");

        } else {
            System.out.println(numero + " es impar");
        }
    }
}
