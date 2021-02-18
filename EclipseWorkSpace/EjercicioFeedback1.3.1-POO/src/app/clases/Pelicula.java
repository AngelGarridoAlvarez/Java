package app.clases;

public class Pelicula {
	
	//Propiedades
	
	public String nombre;
	public double duracion;
	public int edadMin;
	public String director;
	
	// Constructor
	
	public Pelicula(String nombre, double duracion, int edadMin, String director) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}
	
	public void mostrarDatos() {
		System.out.println("\nLa pelicula " + nombre + " tiene una duración de " + duracion + " minutos, una edad mínima recomendadad de " + edadMin + " años, y su director es " + director + ".");
	}

}
