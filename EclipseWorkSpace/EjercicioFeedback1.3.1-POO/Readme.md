**Enunciado**

Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala) tiene un conjunto de asientos (8 filas por 9 columnas, por ejemplo).

Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine.

De las películas nos interesa saber el título, duración, edad mínima y director.

Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.

Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. También deberemos saber si está ocupado o no el asiento.

8 A 8 B 8 C 8 D 8 E 8 F 8 G 8 H 8 I

7 A 7 B 7 C 7 D 7 E 7 F 7 G 7 H 7 I

6 A 6 B 6 C 6 D 6 E 6 F 6 G 6 H 6 I

5 A 5 B 5 C 5 D 5 E 5 F 5 G 5 H 5 I

4 A 4 B 4 C 4 D 4 E 4 F 4 G 4 H 4 I

3 A 3 B 3 C 3 D 3 E 3 F 3 G 3 H 3 I

2 A 2 B 2 C 2 D 2 E 2 F 2 G 2 H 2 I

1 A 1 B 1 C 1 D 1 E 1 F 1 G 1 H 1 I

Realizaremos una pequeña simulación, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).

En esta versión sentaremos a los espectadores de uno en uno.

Solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la película, en caso de que el asiento este ocupado le buscamos uno libre.

Los datos del espectador y la película pueden ser totalmente aleatorios.

**Planteamiento del problema**

app.main se encuentra el programa principal, que ejecuta varias pruebas para ver si todo funciona correctamente.
app.clases se encuentran las 4 clases que he creado:


1. Crear clase Cine:
	* Pelicula
	* Precio
	* Asientos
	* Métodos
		* .mostrarDatos()
		* .mostrarAsientos()
		* .asignarAsiento()
		
	
2. Crear clase Pelicula
	* Titulo
	* Duracion
	* Edad minima
	* Director
	* Metodos
		* .mostrarDatos()


3. Crear clase Espectador
	* Nombre
	* Edad
	* Dinero disponible
		* Metodos
		* .mostrarDatos()

4. Crear una clase Asiento
	* Fila
	* Columna
	* idAsiento (representacion grafica)
	
	
	____________________________________________________________
	
	Enunciado



Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala) tiene un conjunto de asientos (8 filas por 9 columnas, por ejemplo).

Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine.

De las películas nos interesa saber el título, duración, edad mínima y director.

Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.

Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. También deberemos saber si está ocupado o no el asiento.

 

8A 8B 8C 8D 8E 8F 8G 8H 8I

7A 7B 7C 7D 7E 7F 7G 7H 7I

6A 6B 6C 6D 6E 6F 6G 6H 6I

5A 5B 5C 5D 5E 5F 5G 5H 5I

4A 4B 4C 4D 4E 4F 4G 4H 4I

3A 3B 3C 3D 3E 3F 3G 3H 3I

2A 2B 2C 2D 2E 2F 2G 2H 2I

1A 1B 1C 1D 1E 1F 1G 1H 1I

 

Realizaremos una pequeña simulación, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).

En esta versión sentaremos a los espectadores de uno en uno.

Solo se podrá sentar si tienen el suficiente dinero, hay espacio libre y tiene edad para ver la película, en caso de que el asiento este ocupado le buscamos uno libre.

Los datos del espectador y la película pueden ser totalmente aleatorios.
	
