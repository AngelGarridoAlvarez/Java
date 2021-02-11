

public class Clase11_12_20 {

	public static void main(String[] args) {

		int[] array_numeros = new int[10];

		// Voy a cargar manualmente el array.

		array_numeros[0] = 1;
		array_numeros[1] = 2;
		array_numeros[2] = 3;
		array_numeros[3] = 4;
		array_numeros[4] = 5;
		array_numeros[5] = 6;
		array_numeros[6] = 7;
		array_numeros[7] = 8;
		array_numeros[8] = 9;
		array_numeros[9] = 10;
		// array_numeros[10]=11; -> Me daría error si hicera esto, he dicho que tiene
		// tamaño 10

		System.out.println(array_numeros[0]);

		int i = 0;
		while (i <= 9) {
			System.out.println("El contenido de la casilla " + i + " es " + array_numeros[i]);
			i++;
		}
		
		//Generamos un array llamado vector con 50 posiciones
		int [] vector = new int[50];
		
		for (int b = 0; b<15; b++) {
			vector[b]=(int)(Math.random()*100+1);
			System.out.println(vector[b]);
		}
		
		
	}

}
