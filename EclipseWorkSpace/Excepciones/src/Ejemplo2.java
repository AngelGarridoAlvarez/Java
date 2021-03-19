
public class Ejemplo2 {
	public static void main(String args[]) {
		try {
			int sum = 0;
			for (String arg : args) {
				sum += Integer.parseInt(arg);
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException excepcionFormatoNumero) {
			System.err.println("uno de los elementos introducidos en la línea de comandos no es un integer");
		}
	}
}

//IDE ECLIPSE: Run --> Run configurations --> pestaña Arguments --> program arguments --> 1 two 3 4

//uno de los elementos introducidos en la línea de comandos no es un integer
