package controlador;

import datos.ListaDinamica;
import datos.PilaEstatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaEstatica<Integer> numeros = new PilaEstatica<Integer>();
		
		numeros.insertar(25);
		numeros.insertar(125);
		numeros.insertar(5);
		numeros.insertar(325);
		numeros.insertar(425);
		numeros.insertar(625);
		numeros.insertar(725);
		numeros.insertar(925);
		
		
		System.out.println(numeros.extraer());
		System.out.println(numeros.extraer());
		System.out.println(numeros.extraer());
		System.out.println(numeros.extraer());
		System.out.println(numeros.extraer());
		System.out.println(numeros.extraer());
		
		
		
		
		
		
		
	}

}
