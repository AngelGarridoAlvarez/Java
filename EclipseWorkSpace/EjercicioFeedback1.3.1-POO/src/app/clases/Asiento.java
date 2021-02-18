package app.clases;

public class Asiento {

	// Propiedades

	public int fila;
	public String columna;
	public boolean disponible;
	public String idAsiento;

	// Constructor

	public Asiento(int fila, String columna, boolean disponible) {

		this.fila = fila;
		this.columna = columna;
		this.disponible = true;
		this.idAsiento = Integer.toString(fila) + columna;
	}

	// M�todos

	public void disponibilidad() {
		if (disponible == true) {
			System.out.println("El asiento " + idAsiento + "est� disponible");
		} else {
			System.out.println("El asiento " + idAsiento + "est� ocupado");
		}
	}

}
