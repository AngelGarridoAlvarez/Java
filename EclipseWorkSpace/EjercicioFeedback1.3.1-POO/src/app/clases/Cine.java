package app.clases;

public class Cine {

	// Propiedades
	public Pelicula pelicula;
	public double precio;
	public int aforo;

	// Creamos la matriz asientos dentro de las propiedados
	public Asiento[][] asientos = new Asiento[8][9];

	// Constructor
	public Cine(Pelicula pelicula, double precio) {

		this.pelicula = pelicula;
		this.precio = precio;
		this.aforo = 72;

		// Creo objetos Asiento dentro del constructor (todos mis cines van a
		// tener los mismos asientos)

		asientos[0][0] = new Asiento(8, "A", true);
		asientos[0][1] = new Asiento(8, "B", true);
		asientos[0][2] = new Asiento(8, "C", true);
		asientos[0][3] = new Asiento(8, "D", true);
		asientos[0][4] = new Asiento(8, "E", true);
		asientos[0][5] = new Asiento(8, "F", true);
		asientos[0][6] = new Asiento(8, "G", true);
		asientos[0][7] = new Asiento(8, "H", true);
		asientos[0][8] = new Asiento(8, "I", true);

		asientos[1][0] = new Asiento(7, "A", true);
		asientos[1][1] = new Asiento(7, "B", true);
		asientos[1][2] = new Asiento(7, "C", true);
		asientos[1][3] = new Asiento(7, "D", true);
		asientos[1][4] = new Asiento(7, "E", true);
		asientos[1][5] = new Asiento(7, "F", true);
		asientos[1][6] = new Asiento(7, "G", true);
		asientos[1][7] = new Asiento(7, "H", true);
		asientos[1][8] = new Asiento(7, "I", true);

		asientos[2][0] = new Asiento(6, "A", true);
		asientos[2][1] = new Asiento(6, "B", true);
		asientos[2][2] = new Asiento(6, "C", true);
		asientos[2][3] = new Asiento(6, "D", true);
		asientos[2][4] = new Asiento(6, "E", true);
		asientos[2][5] = new Asiento(6, "F", true);
		asientos[2][6] = new Asiento(6, "G", true);
		asientos[2][7] = new Asiento(6, "H", true);
		asientos[2][8] = new Asiento(6, "I", true);

		asientos[3][0] = new Asiento(5, "A", true);
		asientos[3][1] = new Asiento(5, "B", true);
		asientos[3][2] = new Asiento(5, "C", true);
		asientos[3][3] = new Asiento(5, "D", true);
		asientos[3][4] = new Asiento(5, "E", true);
		asientos[3][5] = new Asiento(5, "F", true);
		asientos[3][6] = new Asiento(5, "G", true);
		asientos[3][7] = new Asiento(5, "H", true);
		asientos[3][8] = new Asiento(5, "I", true);

		asientos[4][0] = new Asiento(4, "A", true);
		asientos[4][1] = new Asiento(4, "B", true);
		asientos[4][2] = new Asiento(4, "C", true);
		asientos[4][3] = new Asiento(4, "D", true);
		asientos[4][4] = new Asiento(4, "E", true);
		asientos[4][5] = new Asiento(4, "F", true);
		asientos[4][6] = new Asiento(4, "G", true);
		asientos[4][7] = new Asiento(4, "H", true);
		asientos[4][8] = new Asiento(4, "I", true);

		asientos[5][0] = new Asiento(3, "A", true);
		asientos[5][1] = new Asiento(3, "B", true);
		asientos[5][2] = new Asiento(3, "C", true);
		asientos[5][3] = new Asiento(3, "D", true);
		asientos[5][4] = new Asiento(3, "E", true);
		asientos[5][5] = new Asiento(3, "F", true);
		asientos[5][6] = new Asiento(3, "G", true);
		asientos[5][7] = new Asiento(3, "H", true);
		asientos[5][8] = new Asiento(3, "I", true);

		asientos[6][0] = new Asiento(2, "A", true);
		asientos[6][1] = new Asiento(2, "B", true);
		asientos[6][2] = new Asiento(2, "C", true);
		asientos[6][3] = new Asiento(2, "D", true);
		asientos[6][4] = new Asiento(2, "E", true);
		asientos[6][5] = new Asiento(2, "F", true);
		asientos[6][6] = new Asiento(2, "G", true);
		asientos[6][7] = new Asiento(2, "H", true);
		asientos[6][8] = new Asiento(2, "I", true);

		asientos[7][0] = new Asiento(1, "A", true);
		asientos[7][1] = new Asiento(1, "B", true);
		asientos[7][2] = new Asiento(1, "C", true);
		asientos[7][3] = new Asiento(1, "D", true);
		asientos[7][4] = new Asiento(1, "E", true);
		asientos[7][5] = new Asiento(1, "F", true);
		asientos[7][6] = new Asiento(1, "G", true);
		asientos[7][7] = new Asiento(1, "H", true);
		asientos[7][8] = new Asiento(1, "I", true);
	}

	// Métodos

	public void mostrarDatos() {
		System.out.println("\nEn este cine echan " + pelicula.nombre + " y la entrada cuesta " + precio + "€");
	}

	// El método mostrar asientos me muestra los asientos según la disposición
	// indicada marcando XX en aquellos que están ocupados

	public void mostrarAsientos() {
		System.out.println(("\n") + "Hay " + aforo + " asientos disponibles para " + pelicula.nombre + ". Los asientos ocupados están marcados con XX :" + ("\n"));
		for (int fila = 0; fila < asientos.length; fila++) {
			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[0][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[1][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[2][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[3][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[4][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[5][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[6][col].idAsiento + " ");
			}
			System.out.println("");

			for (int col = 0; col <= asientos.length; col++) {
				System.out.print(asientos[7][col].idAsiento + " ");
			}
			System.out.println("\n\n");
			break;
		}
	}

	public void asignarAsiento(Espectador espectador) {
		if (espectador.edad <= pelicula.edadMin) {
			System.out.println(("\n") + "Lo sentimos " + espectador.nombre + " tiene " + espectador.edad
					+ " años y la edad mínima para ver " + pelicula.nombre + " es de " + pelicula.edadMin + " años.");
		} else if (espectador.dinero < precio) {
			System.out.println(("\n") + "Lo sentimos " + espectador.nombre + " tiene " + espectador.dinero
					+ " euros y la entrada de " + pelicula.nombre + " cuesta " + precio + " euros.");
		} else if (aforo == 0) {
			System.out.println(("\n") + "Lo sentimos, ya no quedan entradas disponibles para " + pelicula.nombre);
		} else {
			
			
			outerloop: // para poder finalizar el bucle en la primera iteración
			for (int fila = 0; fila < asientos.length; fila++) {
				for (int col = 0; col <= asientos.length; col++) {
					if (asientos[fila][col].disponible == true) {
						System.out.println(("\n") + "El asiento " + asientos[fila][col].idAsiento
								+ " ha sido asignado a " + espectador.nombre);
						asientos[fila][col].disponible = false;
						espectador.butaca =  asientos[fila][col].idAsiento;
						espectador.film = pelicula.nombre;
						asientos[fila][col].idAsiento = "XX";
						aforo -= 1;
						break outerloop; // interrumpimos el bucle una vez encuentra un asiento libre
					}
				}
			}
		}
	}
}
