package clases;

import java.util.Date;

public class NeumaticosRallies extends NeumaticoEstandar {
	
	// Propiedades no heredadas
	float presion;
	public int profundidadDibujo;


	public NeumaticosRallies(String marca, Date caducidad, int dureza, String color, String dibujo, int profundidadDibujo, float presion) {
		super(marca, caducidad, dureza, color, dibujo);
		// TODO Auto-generated constructor stub
		
		this.profundidadDibujo = profundidadDibujo;
		this.presion = presion;
		
		
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
		System.out.println("Neumático " + durezaString + " para " + dibujo + ", " + marca + " de color " + color + " y caducidad " + caducidad + "; nivel de profundidad del Dibujo: " + profundidadDibujo + "; nivel de presión:  " + presion +".");
	}
}
