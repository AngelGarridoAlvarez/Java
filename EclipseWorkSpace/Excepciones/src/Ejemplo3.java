
public class Ejemplo3 {
	public static void main(String args[]) {
		int sum = 0;
		for (String arg : args) {
			try {
				sum += Integer.parseInt(arg);
			} catch (NumberFormatException excepcionFormatoNumero) {
				System.err.println(
						"[" + arg + "] no es un ineteger y no se incluir� en la suma");
			}
		}
		System.out.println("Sum = " + sum);
	}
}
/*
 
 [two] no es un ineteger y no se incluir� en la suma
[four] no es un ineteger y no se incluir� en la suma
Sum = 4
*/