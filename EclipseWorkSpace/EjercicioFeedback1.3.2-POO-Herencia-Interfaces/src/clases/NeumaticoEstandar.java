package clases;
import java.util.Date;  

import Interfaces.Neumatico;
import Interfaces.Recambio;  


public class NeumaticoEstandar implements Neumatico, Recambio {
	
	// Propiedades
	
	public String marca;
	public int dureza;
	public String color;
	public String dibujo;
	public Date caducidad;
	public String durezaString;
	
	
	// Constructor
	
	public NeumaticoEstandar(String marca, Date caducidad, int dureza, String color, String dibujo) {
		this.marca = marca;
		this.caducidad = caducidad;
		this.dureza = dureza;
		this.color = color;
		this.dibujo = dibujo;		
	}
	
	
	// Métodos
	
	@Override
	public Date getCaducidad(){
		return this.caducidad;
	}
	
	@Override
	
	public void setCaducidad(Date caducidad){
		this.caducidad = caducidad;
	}
	
	@Override
	public int getDureza(){
		return dureza;}
	@Override
	public void setDureza(int dureza){
		this.dureza = dureza;}
		
	@Override
	public String getColor(){
		return color;
	}
	@Override
	public void setColor(String color){
		this.color = color;
	}
	
	@Override
	public String getDibujo(){
		return dibujo;
	}

	@Override
	public void setDibujo(String dibujo){
		this.dibujo = dibujo;
	}
	
	@Override
	public String getMarca() {
		return marca;
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	};
	
	
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
		System.out.println("Neumático " + durezaString + " para " + dibujo + ", " + marca + " de color " + color + " y caducidad " + caducidad + ".");
	}
	
	
	public void marcaCaducidad(){
		System.out.println("Marca: " + marca + "; Caducidad: " + caducidad);
	};
	
	public void dureza(){
		
	}



}
