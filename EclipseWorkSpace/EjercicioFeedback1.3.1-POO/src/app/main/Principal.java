package app.main;

import app.clases.*;

public class Principal {

	public static void main(String[] args) {
		
		//Creo 3 peliculas: con diferentes edades recomendadas
		//Pelicula(nombre, duración, edad mínima, director)
		
		Pelicula pelicula1 = new Pelicula("Jurassic Park", 121, 13, "Steven Spielberg");
		Pelicula pelicula2 = new Pelicula("Terminator 2 - El juicio final", 135, 18, "James Cameron");
		Pelicula pelicula3 = new Pelicula("Cars", 116, 0, "John Lasseter");
		
		
		//Creo Espectadores 3 espectadores con diferentes edades y presupuestos
		// Espectador(nombre, edad, dinero)
		
		Espectador espectador1 = new Espectador("Kiko el Rico", 20, 10);
		Espectador espectador2 = new Espectador("Ramona Pobretona", 14, 5);
		Espectador espectador3 = new Espectador("Billy el niño", 9, 12);
		

		//Creo 3 cines, en cada uno se visualiza una película y la entrada tiene precios distintos:
		
		Cine cine1 = new Cine(pelicula1, 9.5);
		Cine cine2 = new Cine(pelicula2, 5);
		Cine cine3 = new Cine(pelicula3, 11.3);


		//Usamos el método mostrarDatos() de la clase Espectador para comprobar los datos de los espectadores creados
		
		espectador1.mostrarDatos();
		espectador2.mostrarDatos();
		espectador3.mostrarDatos();

		
		//Usamos el método mostrarDatos() de la clase Cine para comprobar los datos de los cines creados

		cine1.mostrarDatos();
		cine2.mostrarDatos();		
		cine3.mostrarDatos();
		
		//Usamos el método mostrarDatos() de la clase Pelicula para comprobar los datos de las películas creadas

		pelicula1.mostrarDatos();
		pelicula2.mostrarDatos();		
		pelicula3.mostrarDatos();
		
		
		//Comprobamos el estado de la sala antes de asignar ningún asiento
	
		cine1.mostrarAsientos();
		
		//Usamos el método asignarAsiento de la clase Cine para comprobar que se asignan asientos y que funcionan los filtros de edad y dinero
		
		cine1.asignarAsiento(espectador1);
		cine1.asignarAsiento(espectador2); //no se le asigna porque no tiene dinero suficiente
		cine1.asignarAsiento(espectador3); //no se le asigna porque no tiene la edad mínima
		
		//Comprobamos los datos del espectador1 después de asignar un asiento:
		espectador1.mostrarDatos();
		
		//Comprobamos el estado de la sala después de asignar un asiento
		
			cine1.mostrarAsientos();
			
		// Creamos otros 72 espectadores para sobrepasar el aforo de la sala
			
			Espectador []miEspectador = new Espectador[72]; //Creamos un array de espectadores
			
			for(int i = 0; i<=71; i++) {
				miEspectador[i] = new Espectador("espectadorX", 20, 10);
			}
		
		// Asignamos asientos a los 72 espectadores, uno ya está ocupado por espectador1, por lo que el último tiene que quedarse sin entrada
			for(int i = 0; i<=71; i++) {
			cine1.asignarAsiento(miEspectador[i]);
			}
			
			//Comprobamos el estado de la sala después de asignar todos los asientos
			
			cine1.mostrarAsientos();
			

	}
}