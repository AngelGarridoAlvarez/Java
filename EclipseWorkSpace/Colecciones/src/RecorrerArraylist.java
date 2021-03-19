import java.util.ArrayList;

public class RecorrerArraylist {
	public static void main(String args[]) {
		ArrayList<String> movies = new ArrayList<>();
		// Le agregamos datos
		movies.add("Juego de tronos");
		movies.add("Star Trek");
		movies.add("Star Wars");

		// M�todo 1 - For Each
		System.out.println("Recorriendo con m�todo 1");

		int contador = 0;
		for (String titulo : movies) {
			contador += 1;
			System.out.println(contador + ". " + titulo);
		}

		// M�todo 2 - Bucle For
		System.out.println("\nRecorriendo con m�todo 2");

		for (int n = 0; n < movies.size(); n++) {
			String titulo = movies.get(n);
			System.out.println(titulo);
		}

		// M�todo 3 - invoca a forEach del ArrayList y le pasa una funci�n que ser�
		// llamada por cada elemento.
		System.out.println("\nRecorriendo con m�todo 3");

		movies.forEach((titulo) -> {
			System.out.println(titulo);
		});

	}
}
