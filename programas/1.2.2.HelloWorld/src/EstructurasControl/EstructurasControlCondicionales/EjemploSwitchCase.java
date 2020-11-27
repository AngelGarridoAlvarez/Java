package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner; //Importo la libería Scanner para poder recoger datos por consola

public class EjemploSwitchCase {

    public static void main(String[] args) {

        //Declaro un objeto Scaner que me ayude a recoger datos por consola:
        Scanner escanear = new Scanner(System.in);

        System.out.println("Elije un número del 1 al 7");
        int numero = escanear.nextInt();


        // java 1.4 byte, short, int, char
        // java 5 byte, short, int, char, enum
        // java 7 byte, short, int, char, enum, String
        switch (numero) {
            case 1:
                System.out.println("El " + numero + " es lunes");
                break;

            case 2:
                System.out.println("El " + numero + " es martes");
                break;

            case 3:
                System.out.println("El " + numero + " es miercoles");
                break;

            case 4:
                System.out.println("El " + numero + " es jueves");
                break;

            case 5:
                System.out.println("El " + numero + " es viernes");
                break;

            case 6:
                System.out.println("El " + numero + " es sabado");
                break;

            case 7:
                System.out.println("El " + numero + " es domingo");
                break;


            default:
                System.out.println("No es un dia valido");
                break;
        }
    }

}
