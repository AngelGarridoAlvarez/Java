package arrays;

public class Arrays {

	public static void main(String[] args) {
		// ** **
		int numeros[];

		// Defino diferentes tipos de arays y el orden no me afecta
		int num1[];
		int[] num2;

		// Si defino varios elementos en una linea si me afecta el orden de los
		// corchetes
		int n1[], n2; // n1 es un array de int, pero n2 es un int
		int[] n3, n4; // en este caso n3 y n4 son arrays

		// Creamos el array, es obligatorio dar un tamaño
		numeros = new int[5];

		// Almacenamos elementos en el array:

		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;

		System.out.println(numeros[0]); // 10

		// Bucle For

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");// 10 20 30 40 50
		}

		System.out.print("\n");// Meto un salto de línea

		// Bucle For-each

		// En el bucle for each no se precisa indicar el indice de los elementos:

		int numeros2[] = { 1, 2, 3, 4, 5, 6 };
		int numeros3[] = new int[] { 7, 8, 9, 10 };

		for (int num : numeros2) {
			System.out.print(num + ", ");
		}
		;

		System.out.print("\n:-)\n");// Meto dos saltos de línea y una carita

		for (int numerito : numeros3) {
			System.out.print(numerito + " ~ ");
		}
		
		System.out.print("\n" + "COPIAR ELEMENTOS DE UN ARRAU EN OTRO" + "\n");// Meto dos saltos de línea y una carita


		// COPIAR ELEMENTOS DE UN ARRAY EN OTRO:

		// * public static void arraycopy(Object src, int srcPos, Object dest, int
		// destPos, int length)
		// * System.arraycopy(array origen, posición inicio array origen, array destino,
		// posición inicio array destino, nªde elementos a copiar)

		// Ejemplo1:
		// * Copiamos 3 elementos del array nums comenzando en el índice 2 y los pegamos
		// en el array números a partir de la posición con índice 1.
		// * System.arraycopy(nums, 2, numeros, 1, 3)

		// Ejemplo2:

		int numeritos1[] = { 1, 1, 1, 1, 1, 1 };
		int numeritos123[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.arraycopy(numeritos1, 0, numeritos123, 0, 6);

		// hacemos un for each para que me imprima todo por pantalla:

		for (int elemento : numeritos123) {
			System.out.print(elemento + ", ");
		}

	}

}
