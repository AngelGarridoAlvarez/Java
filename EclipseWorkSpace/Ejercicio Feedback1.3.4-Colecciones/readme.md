# Ejericcio Feedback 1.3.4. Colecciones

## Descripci�n

Crea un programa para almacenar los datos de objetos pel�culas y los almacene en una colecci�n de Java.

El programa debe tener un peque�o men� que nos solicite las siguientes opciones:

1. Insertar Pel�cula.
2. Ver datos de una pelicula (indicando la posici�n en la lista con un n�mero).
3. N�mero total de pel�culas en la lista. 
4. Imprimir todas las peliculas.
5. Salir.

En la opci�n de insertar una pelicula el programa pedira los siguientes datos uno a uno:
T�tulo, duraci�n, protagonista, idioma. 

## Planteamiento del problema
	
* Crear clase Pelicula.java
	* Propiedades/Atributos
		* titulo
		* duracion
		* protagonista
		* idioma
	* M�todos
		* geter y seter
		* .mostrarDatos() --> mostrar cada atributo de la pel�cula

		
* Crear clase controladora Main.java
	* Crear Colecci�n de objetos pel�culas (ArrayList)
	* Crear men� con funcionalidades:
		* Insertar Pel�cula
		* Ver datos de una pel�cula indicando la posic�n en la lista con un n�mero
		* Imprimir todas las pel�culas
		* Salir
		