package clases;

import java.util.Date;

public class NeumaticosPista extends NeumaticoEstandar {
	
	// Propiedades no heredadas
	float temperatura;
	public int adherencia;


	public NeumaticosPista(String marca, Date caducidad, int dureza, String color, String dibujo, int adherencia, float temperatura) {
		super(marca, caducidad, dureza, color, dibujo);
		// TODO Auto-generated constructor stub
		
		this.adherencia = adherencia;
		this.temperatura = temperatura;

	}
	@Override
	public void mostrarInfo(){
		if(dureza < 10) {
			durezaString = "blando";
		} else if((10 <= dureza) && (dureza <= 50)) {
			durezaString = "medio";
		} else {
			durezaString = "duro";
		}
		System.out.println("La dureza del neumático es " + dureza + "; por lo tanto es un neumático " + durezaString + ".");
		System.out.println("Neumático " + durezaString + " para " + dibujo + ", " + marca + " de color " + color + " y caducidad " + caducidad + "; nivel de adherencia: " + adherencia + "; temperatura:  " + temperatura +".");
	}
}
