package coleccionPeliculas;

public class Pelicula {
	
	// Propiedades
	
	public String titulo;
	public int duracion;
	public String protagonista;
	public String idioma;
	
	// Constructor
	
	public Pelicula(String titulo, int duracion, String protagonista, String idioma) {
		this.titulo = titulo;
		this.duracion = duracion; //Establezco que si no digo nada sean 120 min por defecto
		this.protagonista = protagonista;
		this.idioma = idioma;
	}
	
	// Métodos
	
	public void mostrarDatos() {
		System.out.println("\nPelícula: " + titulo + ", duración: " + duracion + " min, Protagonista: " + protagonista + ", idioma: " + idioma + "." );
	}
	
	// Getter y Setter

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
	

}
