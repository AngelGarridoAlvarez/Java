# Ejericcio Feedback 1.3.4. Colecciones

## Descripción

Crea un programa para almacenar los datos de objetos películas y los almacene en una colección de Java.

El programa debe tener un pequeño menú que nos solicite las siguientes opciones:

1. Insertar Película.
2. Ver datos de una pelicula (indicando la posición en la lista con un número).
3. Número total de películas en la lista. 
4. Imprimir todas las peliculas.
5. Salir.

En la opción de insertar una pelicula el programa pedira los siguientes datos uno a uno:
Título, duración, protagonista, idioma. 

## Planteamiento del problema
	
* Crear clase Pelicula.java
	* Propiedades/Atributos
		* titulo
		* duracion
		* protagonista
		* idioma
	* Métodos
		* geter y seter
		* .mostrarDatos() --> mostrar cada atributo de la película

		
* Crear clase controladora Main.java
	* Crear Colección de objetos películas (ArrayList)
	* Crear menú con funcionalidades:
		* Insertar Película
		* Ver datos de una película indicando la posicón en la lista con un número
		* Imprimir todas las películas
		* Salir
		