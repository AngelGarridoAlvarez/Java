package app.test;

import app.fechas.FechaEncapsulada;
import app.fechas.FechaMala;

public class Principal {

	public static void main(String[] args) {
		
		// Crear una fecha mala
		FechaMala fechaMala = new FechaMala();
		fechaMala.dia = 78;
		fechaMala.mes = -6;
		fechaMala.anyo = -12;
		fechaMala.mostrarFecha();
		
		FechaEncapsulada fechaBuena = new FechaEncapsulada();
		fechaBuena.setDia(78);
		fechaBuena.setMes(6);
		fechaBuena.setAnyo(2014);
		fechaBuena.mostrarFecha();

	}

}
