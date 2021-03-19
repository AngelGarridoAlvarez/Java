import java.util.Scanner;

public class Ejemplo4 {
	static float num1;
	static float num2;

	public static void main(String args[]) {
		String error = null;
		try {
			Scanner entradaEscaner = new Scanner(System.in);

			error = "dividendo";
			System.out.println("Introduce el dividendo");
			String dividendo = entradaEscaner.nextLine();
			num1 = Float.parseFloat(dividendo);

			error = "divisor";
			System.out.println("Introduce el divisor");
			String divisor = entradaEscaner.nextLine();
			num2 = Float.parseFloat(divisor);

			if (num1 > num2) {
				System.out.println("Dividendo es mayor que divisor, cociente es mayor que la unidad");
			}

			float cociente = num1 / num2;
			System.out.println("El cociente es " + cociente);

		} catch (NumberFormatException excepcionFormatoNumero) {
			System.err.println("El " + error + " que has introducido no es un válido");

		}
		multiplicar();

	}

	private static void multiplicar() {
		System.out.println(num1 * num2);
	}

	static void rango(float num1, float num2) throws ExcepcionIntervalo {
		if ((num1 > 100) || (num2 < -5)) {
			throw new ExcepcionIntervalo("Números fuera del intervalo");
		}
	}
}