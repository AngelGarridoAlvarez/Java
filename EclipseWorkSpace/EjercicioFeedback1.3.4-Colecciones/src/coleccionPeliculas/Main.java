package coleccionPeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//importo el m�todo Scanner para poder recoger datos

public class Main {

	public static void main(String[] args) {
		// Creo un objeto miScan de la clase Scanner para recoger datos por consola
		Scanner miScan = new Scanner(System.in);

		// Creo colecci�n de objetos Pelicula

		List<Pelicula> peliculasList = new ArrayList<Pelicula>();
		peliculasList.add(new Pelicula("Jurassic Park", 121, "Alan Grant", "English"));
		peliculasList.add(new Pelicula("Terminator II: Judgment Day ", 135, "Jhon Connor", "English"));
		peliculasList.add(new Pelicula("There's Something About Mary ", 119, "Cameron Diaz", "English"));
		peliculasList.add(new Pelicula("Beetlejuice", 93, "Michael Keaton", "English"));

		boolean exit = false;
		while (exit == false) {
			// Men� con funcionalidades
			System.out.println(
					"\n\nBienvenido a la APP arrayList de pel�culas, elige una de las siguientes opciones (introduce un n�mero del 1 al 5) :\n\n1. Insertar Pel�cula\n2. Ver datos de Pel�cula\n3. Saber el n�mero total de pel�culas\n4. Imprimir todas las Pel�culas\n5. Salir\n\n Introduce el n�mero de la opci�n:");

			int opcion = miScan.nextInt();
			miScan.nextLine(); // cuando introduces un n�mero en un next int tambi�n se introduce un salto de
								// l�nea \n al dar "enter" que no consume nextInt(), introducimos este
								// nextLine() para que consuma ese salto de l�nea

			switch (opcion) {
			case 1:

				System.out.println("OPCI�N 1 - Insertar Pel�cula\n");

				System.out.println("Introduce el t�tulo:\n");
				String titulo = miScan.nextLine();

				System.out.println("Introduce la duraci�n (minutos):\n");
				int duracion = miScan.nextInt();
				miScan.nextLine();

				System.out.println("Introduce el nombre del protagonista:\n");
				String protagonista = miScan.nextLine();

				System.out.println("Introduce el idioma:\n");
				String idioma = miScan.nextLine();

				peliculasList.add(new Pelicula(titulo, duracion, protagonista, idioma));

				System.out.println("Mostrando todos los objetos pel�cula");
				int contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
					System.out.println("\nPel�cula " + contador + ": \nT�tulo: " + pelicula.titulo + "\nDuraci�n: "
							+ pelicula.duracion + " minutos \nProtagonista: " + pelicula.protagonista + "\nidioma:"
							+ pelicula.idioma);
				}
				break;

			case 2:
				System.out.println("OPCI�N 2 - Ver datos de la pel�cula");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
				}
				System.out.println("Hay " + contador + " pel�culas; elige un n�mero del 1 al " + contador
						+ " para mostrar los datos de la pel�cula por pantalla");
				int numPelicula = miScan.nextInt();
				miScan.nextLine();

				System.out.println("T�tulo: " + peliculasList.get(numPelicula - 1).getTitulo() + "\n" + "Duraci�n: "
						+ peliculasList.get(numPelicula - 1).getDuracion() + "\n" + "Portagonista: "
						+ peliculasList.get(numPelicula - 1).getProtagonista() + "\n" + "Idioma: "
						+ peliculasList.get(numPelicula - 1).getIdioma() + "\n");
				break;

			case 3:
				System.out.println("OPCI�N 3 - N�mero total de pel�culas en la lista");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
				}
				System.out.println("Hay " + contador + " pel�culas en la lista");

				break;

			case 4:
				System.out.println("OPCI�N 4 - Mostrando todos los objetos pel�cula");
				contador = 0;
				for (Pelicula pelicula : peliculasList) {
					contador += 1;
					System.out.println("\nPel�cula " + contador + ": \nT�tulo: " + pelicula.titulo + "\nDuraci�n: "
							+ pelicula.duracion + " minutos \nProtagonista: " + pelicula.protagonista + "\nidioma:"
							+ pelicula.idioma);
				}
				break;

			case 5:
				exit = true;

				break;

			default:
				System.out.println("El valor introducido no es valido, vuelve a iniciar la aplicaci�n");

				break;

			}
		}

		System.out.println("OPCI�N 5 - Salir\n\nBYE BYE!!!");
		System.exit(0);

	}

}
