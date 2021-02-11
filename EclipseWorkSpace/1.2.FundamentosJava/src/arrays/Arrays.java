package arrays;

public class Arrays {

	public static void main(String[] args) {
		//** **
		int numeros[];

		// Defino diferentes tipos de arays y el orden no me afecta
		int num1[];
		int[] num2;

		// Si defino varios elementos en una linea si me afecta el orden de los corchetes
		int n1[], n2; //n1 es un array de int, pero n2 es un int 
		int[] n3, n4; //en este caso n3 y n4 son arrays
		
		
		//Creamos el array, es obligatorio dar un taño
		numeros = new int[5];
		
		
		//Almacenamos elementos en el array:
		
		numeros[0]= 10;
		numeros[1]= 20;
		numeros[2]= 30;
		numeros[3]= 40;
		numeros[4]= 50;
		
		
		System.out.println(numeros[0]); //10
		
		//Bucle For
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");//10 20 30 40 50 
		}
		
        System.out.print("\n");//Meto dos saltos de línea

		//Bucle For-each
		
		//En el bucle for each no se precisa indicar el indice de los elementos:
		
		int numeros2[] = {1,2,3,4,5,6};
		int numeros3[] = new int[] {7,8,9,10};
		
		for(int num : numeros2) {
			System.out.print(num + ", ");
		};
        
		System.out.print("\n:-)\n");//Meto dos saltos de línea
		
		for(int numerito : numeros3) {
			System.out.print(numerito + " ~ ");
		}


	}

}
