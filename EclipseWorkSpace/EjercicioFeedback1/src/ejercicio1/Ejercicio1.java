package ejercicio1;
/*
 * 3 intentos
 * Si motivacionAlumno >= 80% --> Enhorabuena
 * Si motivacionAlumno < 80% --> repetir test 2 veces más
 * Si motivacionAlumnoTotal / 3 < 50% --> comentar a profesor
 * Si motivacionAlumnoTotal / 3 > 50% --> Enhorabuena
 */

import java.util.Scanner;//importo el m�todo Scanner para poder recoger datos

public class Ejercicio1 {
    public static void main(String[] args) {

        //Creo objeto scan de la clase Scanner para recoger datos por consola
        Scanner scan = new Scanner(System.in);

        //VARIABLES
        double motivacionAlumno = 0;//motivaci�n de cada test
        double motivacionTotal = 0;//motivaci�n acumulada de m�s de un test
        String pregunta;
        String respuesta;
        String respuestaErronea = "Solo puedes responder exactamente \"si\" o \"no\"";
        int contador = 0;//para contar cuantas veces he hecho el test

        //Mientras se cumplan las condiciones del while() se van a repetir los test
        while ((((motivacionAlumno / 8) * 100) <= 80) && (contador < 3) || contador == 2) {
            motivacionAlumno = 0;

            //Despues de realizar un test completo, vamos a dar feedback al usuario seg�n el n�mero del contador usando if else if:
            if (contador == 1) {
                System.out.println("El resultado del test es inferior al 80%, tienes que repetir dos veces más el test");
            } else if (contador == 2) {
                System.out.println("Tienes que repetir el test una �ltima vez");

            }

            //PREGUNTAS:

            //P1
            pregunta = "�Te gustan las computadoras?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }

            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //P2
            pregunta = "�Disfrutas con la resoluci�n de problemas?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }

            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //P3
            pregunta = "�Quieres trabajar en equipo?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }

            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //P4
            pregunta = "�Te agrada aprender por descubrimiento (si) o prefieres que te indiquen las cosas paso a paso (no)?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }

            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //P5
            pregunta = "�Eres creativo?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }

            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //P6
            pregunta = "�Eres resolutivo?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }


            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }


            //P7
            pregunta = "�Te rindes al primer intento?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }


            if (respuesta.equals("no")) { //aqu� suma punto si dice no
                motivacionAlumno += 1;
            }


            //P8
            pregunta = "�Est�s dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida?";
            System.out.println(pregunta);
            respuesta = scan.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(respuestaErronea);
                System.out.println(pregunta);
                respuesta = scan.nextLine();
            }


            if (respuesta.equals("si")) {
                motivacionAlumno += 1;
            }

            //Fin de las preguntas
            contador += 1; //cada vez que se haga un test +1 al contador
            motivacionTotal += motivacionAlumno;
            System.out.println("El resultado del �ltimo test es del " + ((motivacionAlumno / 8) * 100) + "%");
        }

        //Salgo del bucle

        System.out.println("La motivaci�n total del alumno es del " + ((motivacionTotal / (8 * contador) * 100) + "%"));

        if (contador == 1 || ((motivacionTotal /(8 * contador) * 100)) >= 50) {
            System.out.println("CONGRATULATIONS!!!, t� si que est�s motivado");
        } else {
            System.out.println("Sorry, :-( te falta de motivaci�n, tienes que ponerte en contacto con tu profesor");
        }


    }
}
