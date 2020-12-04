package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("¿Qué nota has sacado? (de 1 a 10)");
        int nota = escanear.nextInt();


        if (nota < 5) {
            System.out.println("Has sacado un " + nota + " has suspendido");
        } else if (nota <= 6) {
            System.out.println("Has sacado un " + nota +" has Aprobado por los pelos");
        } else if (nota <= 8) {
            System.out.println("Has sacado un " + nota +" ¡guau! tienes un notable");
        } else if (nota <= 10) {
            System.out.println("Has sacado un " + nota +" tienes sobresaliente, Puto Amo");
        }

    }
}