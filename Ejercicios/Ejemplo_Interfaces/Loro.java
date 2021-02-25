package app.ejemplo;

public class Loro extends Animal implements Volador, ProductoVenta {
	
	// ..... propiedades
	private double precio;

	public Loro() {
		// TODO Auto-generated constructor stub
	}
	
	public Loro(String raza, boolean vacunado) {
		super(raza, vacunado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public void volar() {
		System.out.println("El loro vuela");	
	}
	
	// .... metodos

}
