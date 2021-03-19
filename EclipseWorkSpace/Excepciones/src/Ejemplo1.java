
public class Ejemplo1 {
	public static void main (String args[]) {
		int sum = 0;
		for (String arg: args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("Sum = " + sum);
	}

}
//Sum = 0


// Introducimos los arguementos en el menú de eclipse Run configurations --> pestaña Arguments --> program arguments --> escribo los argumentos separados por "espacio":
// 1 2 4 6
// Sum = 10
//Run configurations --> pestaña Arguments --> program arguments --> 1 two 3 4
/*

Exception in thread "main" java.lang.NumberFormatException: For input string: "two"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at Ejemplo1.main(Ejemplo1.java:6)
 
 */
