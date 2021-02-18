package app.clases;

public class Espectador {

	// Propiedades

	public String nombre;
	public int edad;
	public double dinero;
	public String butaca;
	public String film;

	// Constructor

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.butaca = null;
		this.film = null;
	}

	// Métodos

	public void mostrarDatos() {
		if (butaca == null) {
			System.out.println("\nMe llamo " + nombre + " tengo " + edad + " años, llevo " + dinero
					+ " euros encima y no tengo entradas para el cine");
		} else {
			System.out.println("\nMe llamo " + nombre + " tengo " + edad + " años, llevo " + dinero
					+ " euros encima, voy a ver " + film + " y tengo la butaca " + butaca);
		}
	}

}
