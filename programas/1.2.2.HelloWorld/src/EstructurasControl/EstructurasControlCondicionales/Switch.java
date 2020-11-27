// los case solo pueden devolver valores int o char


package EstructurasControl.EstructurasControlCondicionales;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.println("¿Qué nota has sacado? (de 0 a 10)");
        int nota = escanear.nextInt();


        switch (nota) {

            case 0:
                System.out.println("Vaya putisima mierda, ¿eres tonto?");
                break;

            case 1:
                System.out.println("Voy a vomitar");
                break;

            case 2:
                System.out.println("Que hacías durante el examen?, pensar en patitos y mariposas");
                break;

            case 3:
                System.out.println("Se confirma que eres tonto");
                break;

            case 4:
                System.out.println("Mediocre");
                break;

            case 5:
                System.out.println("Conformista");
                break;

            case 6:
                System.out.println("La nota de los pringaos");
                break;

            case 7:
                System.out.println("Quieres ser listo pero no puedes");
                break;

            case 8:
                System.out.println("Si sacas todo 8 estaría bien");
                break;

            case 9:
                System.out.println("Enhorabuena");
                break;

            case 10:
                System.out.println("No esperaba menos de ti");
                break;

            default:
                System.out.println("El valor introducido no es valido");
                break;
        }
    }
}