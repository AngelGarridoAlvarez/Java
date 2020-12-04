package Intro;

import java.util.Scanner;

public class EntradaSalidaConsola {

    public static void main(String[] args) {

        System.out.println("Dime tu nombre y te dirÈ quien eres: ");

        Scanner sc = new Scanner(System.in); //genero el objeto sc de la clase Scanner, (System.in) indica que la entrada es por la consola
        String nombre = sc.nextLine(); //la variable nombre que es de tipo string la obtengo con el m√©todo nextLline de la clase Scanner que ha heredado el objeto sc

        System.out.println("tu nombre es " + nombre);
        System.out.println("la primera letra de tu nombre es " + nombre.charAt(0));

        System.out.println("Inserta un n√∫mero");
        float numero1 = sc.nextInt();
        System.out.println("Inserta otro n√∫mero");
        float numero2 = sc.nextInt();

        System.out.println("numero1 + numero2 = " + (numero1 + numero2));
        System.out.println("numero1 - numero2 = " + (numero1 - numero2));
        System.out.println("numero1 x numero2 = " + (numero1 * numero2));
        System.out.println("numero1 : numero2 = " + (numero1 / numero2));

        System.out.println("Dime el precio y te calculo el precio + IVA");
        double  precio = sc.nextDouble();
        double IVA = (precio * 1.21) - precio;
        double IvaRedondeado = Math.round(IVA*100.0)/100.0;

        System.out.println("El precio con IVA es " + precio * 1.21 + ", est·s pagando al estado " + IvaRedondeado + "Ä");




    }
}
