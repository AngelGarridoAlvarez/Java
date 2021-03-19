import java.util.ArrayList;

public class RecorrerArraylist {
	public static void main(String args[]) {
		ArrayList<String> movies = new ArrayList<>();
		// Le agregamos datos
		movies.add("Juego de tronos");
		movies.add("Star Trek");
		movies.add("Star Wars");

		// Método 1 - For Each
		System.out.println("Recorriendo con método 1");

		int contador = 0;
		for (String titulo : movies) {
			contador += 1;
			System.out.println(contador + ". " + titulo);
		}

		// Método 2 - Bucle For
		System.out.println("\nRecorriendo con método 2");

		for (int n = 0; n < movies.size(); n++) {
			String titulo = movies.get(n);
			System.out.println(titulo);
		}

		// Método 3 - invoca a forEach del ArrayList y le pasa una función que será
		// llamada por cada elemento.
		System.out.println("\nRecorriendo con método 3");

		movies.forEach((titulo) -> {
			System.out.println(titulo);
		});

	}
}
