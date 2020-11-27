package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("¿Qué nota has sacado? (de 1 a 10)");
        int nota = escanear.nextInt();


        if (nota >= 7) {

            System.out.println("Has sacado muy buena nota");

        } else {
            System.out.println("Podías haberte esforzado más");
        }
    }
}
