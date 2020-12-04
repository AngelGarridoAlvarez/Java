//condicion_logica ? valor_si_verdadero: valor_si_falso;

package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args){
        System.out.println("¿Edad?");

        Scanner escaneo = new Scanner(System.in);
        int edad = escaneo.nextInt();

        String texto;

        texto = edad<18 ? "eres menor de edad" : "eres mayor de edad";

        System.out.println(texto);

    }
}
