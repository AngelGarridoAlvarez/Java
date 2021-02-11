package arrays;

public class Matrix {

	public static void main(String[] args) {

		// Declarar una variable de tipo array de dos dimensiones

		int[][] numeros;

		// Creamos la matriz cuadrada números con 3 filas y 2 columnas.

		numeros = new int[3][2];

		// Almacenar elementos en una matriz

		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[1][0] = 3;
		numeros[1][1] = 4;
		numeros[2][0] = 5;
		numeros[2][1] = 6;

		System.out.println(numeros[0][0] + " Hola"); // 1 Hola

		// Podemos unificar todas estas tareas en una sola instrucción:
		int numeros1[][] = { { 5, 1 }, { 9, 2 } };
		int numeros2[][] = { { 5, 1, 3 }, { 9, 2, 8, 5 }, { 3, 7 } };

		System.out.println(numeros1[0][0] + " Hello"); // 5 Hello
		System.out.println(numeros2[0][1] + " What's up Bro!"); // 1 What's up Bro!
		
		System.out.print("\n:-)\n");// Meto dos saltos de línea y una carita

		// Recorrer una matriz con for:

		for (int fila = 0; fila < numeros.length; fila++) {
			for (int col = 0; col < numeros[fila].length; col++) {
				System.out.print(numeros[fila][col] + " ");
			}
			System.out.println("");
		}
		/*
		 * 1 2 
		 * 3 4 
		 * 5 6
		 */

		System.out.print("\n:-)\n");// Meto dos saltos de línea y una carita

		// Recorrer una matriz con for-each:

		for (int[] columnas : numeros2) {
			for (int num : columnas) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		/*
		 * 5 1 3 
		 * 9 2 8 5 
		 * 3 7 */
	}

}
