package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner;

public class IfElseParImpar {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("Elije un n�mero y te dir� si es par o impar");
        int numero = escanear.nextInt();


        if (numero % 2 == 0) {

            System.out.println(numero + " es par");

        } else {
            System.out.println(numero + " es impar");
        }
    }
}
