package ejercicio124Bucles;
/*
 * generar boleto (secuencia) de: 
 * 		9 n�meros
 * 		no repetidos
 * 		10 < n�meros <100
 * 		ejemplo: 12 21 35 46 88 72 94 49 27 (mostraremos los n�meros siempre en pantalla para depurar errores)
 * 
 * Se pide un n�mero al usuario: 35
 * 		Si existe 12 21 XX 46 88 72 94 49 27
 * 		Si no existe: El n�mero 78 no existe
 * 
 * Si pulsamos 0, salimos de la aplicaci�n
 * 
 * 
 * Si todos los n�meros tachados:
 * 		;
 * 
 * 14 intentos m�ximo
 * 
 * Ayuda: crear n�mero aleatorio en java:  
 * 		int valor = Math.floor(Math.random()*99+10);
 */

import java.util.Scanner;//importo el m�todo Scanner para poder recoger datos

public class ejercicio124Bucles {
	public static void main(String[] args) {

		// Creo objeto scan de la clase Scanner para recoger datos por consola
		Scanner scan = new Scanner(System.in);

		// VARIABLES
		int boleto[]; // Declaro la variable tipo array boleto
		String boletoString[]; // Declaro la variable boletoString para poder introducir letras
		boleto = new int[9]; // El array boleto puede contener 9 int
		boletoString = new String[9];
		int numeroElegido;
		int intento = 0; // para contar los intentos
		int intentoOk = 0; // para contar los intentos acertados

		// Asigno valores a cada elemento del boleto con un bucle for:

		for (int i = 0; i < boleto.length; i++) {
			// Generar valores aleatorios entre 2 n�meros: int r = (int) (Math.random() *
			// (upper - lower)) + lower;

			boleto[i] = (int) ((Math.random() * (99 - 11)) + 11);
			boletoString[i] = Integer.toString(boleto[i]);
		}

		// Compruebo que todos los valores del array son diferentes, si hay dos n�meros iguales, lo muestro por pantalla y salgo de la aplicaci�n

		for (int i1 = 0; i1 < boleto.length; i1++) {
			for (int i2 = 0; i2 < boleto.length; i2++) {
				if ((boleto[i1] == Integer.parseInt(boletoString[i2])) && (i1 != i2)) {

					System.out.println("El boleto es: ");
					System.out.println(boleto[0] + " " + boleto[1] + " " + boleto[2] + " " + boleto[3] + " " + boleto[4]
							+ " " + boleto[5] + " " + boleto[6] + " " + boleto[7] + " " + boleto[8]);

					System.out
							.println("El valor " + boleto[i1] + " est� repetido en las posiciones " + i1 + " y " + i2);
					System.out.println(
							"Reinicia la aplicaci�n hasta que te salga un boleto v�lido sin elementos repetidos");
					System.exit(0);

				}
			}

		}

		// Imprimo boleto por pantalla:

		System.out.println("El boleto es: ");
		System.out.println(boleto[0] + " " + boleto[1] + " " + boleto[2] + " " + boleto[3] + " " + boleto[4] + " "
				+ boleto[5] + " " + boleto[6] + " " + boleto[7] + " " + boleto[8]);

		// Mientras se cumplan las condiciones del while (14 intentos) me van a pedir
		// que introduzca un n�mero

		while ((intento < 14) && (intentoOk < 9)) {
			System.out.println("Introduce un n�mero mayor que 10 y menor que 99; te quedan "
					+ (14 - intento) + " intentos.");
			numeroElegido = scan.nextInt();
			
			// Si pulsamos 0, salimos de la applicaci�n
			
			if (numeroElegido == 0) {
				System.out.println("Has pulsado 0: 'Salir de la aplicaci�n'");
				System.exit(0);
			
			// Si pulsamos un valor != 0 continua con la aplicaci�n
			} else {
				intento += 1;
				for (int i = 0; i < boleto.length; i++) {
					if (numeroElegido == boleto[i]) {
						System.out.println("Has acertado!");
						intentoOk += 1;
						boletoString[i] = "XX";
					}
				}
				System.out.println(boletoString[0] + " " + boletoString[1] + " " + boletoString[2] + " "
						+ boletoString[3] + " " + boletoString[4] + " " + boletoString[5] + " " + boletoString[6] + " "
						+ boletoString[7] + " " + boletoString[8]);
			}
		}
		;

		if (intentoOk == 9) {
			System.out.println("Te ha tocado la primitiva. Eres millonario.");
		} else {
			System.out.println("Has alcanzado los 14 intentos permitidos, mejor dedicate a otra cosa.");

		}
	}
}