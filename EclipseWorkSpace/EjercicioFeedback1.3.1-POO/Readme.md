**Planteamiento del problema**

app.main se encuentra el programa principal, que ejecuta varias pruebas para ver si todo funciona correctamente.
app.clases se encuentran las 4 clases que he creado:


1. Crear clase Cine:
	* Pel�cula
	* Precio
	* Asientos
	* M�todos
		* .mostrarDatos()
		* .mostrarAsientos()
		* .asignarAsiento()
		
	
2. Crear clase Pel�cula
	* T�tulo
	* Duraci�n
	* Edad m�nima
	* Director
	* M�todos
		* .mostrarDatos()


3. Crear clase Espectador
	* Nombre
	* Edad
	* Dinero disponible
		* M�todos
		* .mostrarDatos()

4. Crear una clase Asiento
	* Fila
	* Columna
	* idAsiento (representaci�n gr�fica)
	
	
P.D. Me he quedado con ganas de hacer que los asientos se asignen aleatoriamente, pero quer�a seguir avanzando con el m�ster y no invertir m�s tiempo en este problema... lo perfecto es enemigo de lo bueno
	____________________________________________________________
	
	Enunciado



Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala) tiene un conjunto de asientos (8 filas por 9 columnas, por ejemplo).

Del cine nos interesa conocer la pel�cula que se est� reproduciendo y el precio de la entrada en el cine.

De las pel�culas nos interesa saber el t�tulo, duraci�n, edad m�nima y director.

Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.

Los asientos son etiquetados por una letra (columna) y un n�mero (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. Tambi�n deberemos saber si est� ocupado o no el asiento.

 

8A 8B 8C 8D 8E 8F 8G 8H 8I

7A 7B 7C 7D 7E 7F 7G 7H 7I

6A 6B 6C 6D 6E 6F 6G 6H 6I

5A 5B 5C 5D 5E 5F 5G 5H 5I

4A 4B 4C 4D 4E 4F 4G 4H 4I

3A 3B 3C 3D 3E 3F 3G 3H 3I

2A 2B 2C 2D 2E 2F 2G 2H 2I

1A 1B 1C 1D 1E 1F 1G 1H 1I

 

Realizaremos una peque�a simulaci�n, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).

En esta versi�n sentaremos a los espectadores de uno en uno.

Solo se podr� sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la pel�cula, en caso de que el asiento este ocupado le buscamos uno libre.

Los datos del espectador y la pel�cula pueden ser totalmente aleatorios.
	
