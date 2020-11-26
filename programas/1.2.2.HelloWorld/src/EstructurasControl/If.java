package EstructurasControl;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("¿Qué nota has sacado? (de 1 a 10)");
        int nota = escanear.nextInt();


        if (nota >= 7) {

            System.out.println("Has sacado muy buena nota");

        }
    }
}
