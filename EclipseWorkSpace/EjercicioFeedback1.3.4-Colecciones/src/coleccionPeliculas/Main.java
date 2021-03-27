package coleccionPeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//importo el método Scanner para poder recoger datos

public class Main {

	public static void main(String[] args) {
		// Creo un objeto miScan de la clase Scanner para recoger datos por consola
		Scanner miScan = new Scanner(System.in);

		// Creo colección de objetos Pelicula

		List<Pelicula> peliculasList = new ArrayList<Pelicula>();
		peliculasList.add(new Pelicula("Jurassic Park", 121, "Alan Grant", "English"));
		peliculasList.add(new Pelicula("Terminator II: Judgment Day ", 135, "Jhon Connor", "English"));
		peliculasList.add(new Pelicula("There's Something About Mary ", 119, "Cameron Diaz", "English"));
		peliculasList.add(new Pelicula("Beetlejuice", 93, "Michael Keaton", "English"));

		boolean exit = false;
		while (exit == false) {
			// Menú con funcionalidades
			System.out.println(
					"\n\nBienvenido a la APP arrayList de películas, elige una de las siguientes opciones (introduce un número del 1 al 5) :\n\n1. Insertar Película\n2. Ver datos de Película\n3. Saber el número total de películas\n4. Imprimir todas las Películas\n5. Salir\n\n Introduce el número de la opción:");

			int opcion = miScan.nextInt();
			miScan.nextLine(); // cuando introduces un número en un next int también se introduce un salto de
								// línea \n al dar "enter" que no consume nextInt(), introducimos este
								// nextLine() para que consuma ese salto de línea

			switch (opcion) {
			case 1:

				System.out.println("OPCIÓN 1 - Insertar Película\n");

				System.out.println("Introduce el título:\n");
				String titulo = miScan.nextLine();

				System.out.println("Introduce la duración (minutos):\n");
				int duracion = miScan.nextInt();
				miScan.nextLine();

				System.out.println("Introduce el nombre del protagonista:\n");
				String protagonista = miScan.nextLine();

				System.out.println("Introduce el idioma:\n");
				String idioma = miScan.nextLine();

				peliculasList.add(new Pelicula(titulo, duracion, protagonista, idioma));

				System.out.println("Mostrando todos los objetos película");
				int contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
					System.out.println("\nPelícula " + contador + ": \nTítulo: " + pelicula.titulo + "\nDuración: "
							+ pelicula.duracion + " minutos \nProtagonista: " + pelicula.protagonista + "\nidioma:"
							+ pelicula.idioma);
				}
				break;

			case 2:
				System.out.println("OPCIÓN 2 - Ver datos de la película");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
				}
				System.out.println("Hay " + contador + " películas; elige un número del 1 al " + contador
						+ " para mostrar los datos de la película por pantalla");
				int numPelicula = miScan.nextInt();
				miScan.nextLine();

				System.out.println("Título: " + peliculasList.get(numPelicula - 1).getTitulo() + "\n" + "Duración: "
						+ peliculasList.get(numPelicula - 1).getDuracion() + "\n" + "Portagonista: "
						+ peliculasList.get(numPelicula - 1).getProtagonista() + "\n" + "Idioma: "
						+ peliculasList.get(numPelicula - 1).getIdioma() + "\n");
				break;

			case 3:
				System.out.println("OPCIÓN 3 - Número total de películas en la lista");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
				}
				System.out.println("Hay " + contador + " películas en la lista");

				break;

			case 4:
				System.out.println("OPCIÓN 4 - Mostrando todos los objetos película");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
					System.out.println("\nPelícula " + contador + ": \nTítulo: " + pelicula.titulo + "\nDuración: "
							+ pelicula.duracion + " minutos \nProtagonista: " + pelicula.protagonista + "\nidioma:"
							+ pelicula.idioma);
				}
				break;

			case 5:
				exit = true;

				break;

			default:
				System.out.println("El valor introducido no es valido, vuelve a iniciar la aplicación");

				break;

			}
		}

		System.out.println("OPCIÓN 5 - Salir\n\nBYE BYE!!!");
		System.exit(0);

	}

}
