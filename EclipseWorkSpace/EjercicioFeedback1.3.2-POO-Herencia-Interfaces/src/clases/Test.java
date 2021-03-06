package clases;
import java.text.SimpleDateFormat;
import java.util.Date;  



public class Test {
	
	public static void main(String[] args) {
	
	//Probamos que nuestra superclase funciona correctamente creando un nuevo NeumáticoEstandar y usando el método mostrar info:
		
	NeumaticoEstandar neumatico1 = new NeumaticoEstandar("Michelin", new Date("2021/12/31"), 5, "negro con contorno blanco", "mojado");
	
	neumatico1.mostrarInfo();
	
	//Respuesta de consola:
		/* 	
	 	La dureza del neumático es 5; por lo tanto es un neumático blando.
		Neumático blando para mojado, Michelin de color negro con contorno blanco y caducidad Fri Dec 31 00:00:00 CET 2021.

		*/
	
	//Creamos un objeto de cada tipo:
	
	NeumaticosKarts neumatico2 = new NeumaticosKarts("Dunlop", new Date("2030/09/25"), 20, "gris oscuro casi negro", "Mojado", 19);
	NeumaticosRallies neumatico3 = new NeumaticosRallies("Hankook", new Date("2037/05/11"), 60, "gris claro casi blanco", "seco", 2, 3);
	NeumaticosPista neumatico4 = new NeumaticosPista("Yokohama", new Date("2032/08/17"), 5, "negro black", "intermedios", 2, 35);
	
	//Mostramos los datos de los neumáticos
	
	neumatico2.mostrarInfo();
	neumatico3.mostrarInfo();
	neumatico4.mostrarInfo();
	
	//El método que traslada el valor númerico de la dureza a blando, duro, e intermedio lo hemos integrado dentro de mostrarInfo();
	
	//Probar los métodos de impresión de marca y caducidad que nos pedía el cliente.

	
	neumatico2.marcaCaducidad();
	neumatico3.marcaCaducidad();
	neumatico4.marcaCaducidad();
	


	}
}
