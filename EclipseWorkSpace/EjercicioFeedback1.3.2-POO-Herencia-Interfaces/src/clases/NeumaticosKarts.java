package clases;

import java.util.Date;

public class NeumaticosKarts extends NeumaticoEstandar {
	
	// Propiedades no heredadas
	public int llanta;


	public NeumaticosKarts(String marca, Date caducidad, int dureza, String color, String dibujo, int llanta) {
		super(marca, caducidad, dureza, color, dibujo);
		// TODO Auto-generated constructor stub
		
		this.llanta = llanta;
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
		System.out.println("La dureza del neum�tico es " + dureza + "; por lo tanto es un neum�tico " + durezaString + ".");
		System.out.println("Neum�tico " + durezaString + " para " + dibujo + ", " + marca + " de color " + color + " y caducidad " + caducidad + "; tama�o de llanta: " + llanta +".");
	}
}
