
public class ExcepcionesComprobadas {
static int total = 0;
	public static void main(String args[]) {
		
		try {
			int sum = 0;
			for (String arg : args) {
				sum += Integer.parseInt(arg);
				total = sum;
			}
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException excepcionFormatoNumero) {
			System.err.println("uno de los elementos introducidos en la línea de comandos no es un integer");
		}
		chorrada();
		
	}
	static void chorrada(){
		System.out.println("Esto es una chorrada " + total);
	}
}
