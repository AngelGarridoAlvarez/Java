* Desarrollar un programa en Java que permita la gestión de los neumáticos de una escudería de competición. 
* Esta escudería participa en varios tipos de carreras: 
	* circuitos
	* rallies
	* karts

*  Se pide hacer estructura de clases (El modelo) para los diferentes tipos de neumáticos.

*  Tener en cuenta lo visto de clases: herencias, interfaces, etc.


Características  neumáticos:

* Neumáticos de competición para pista: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios), adherencia (int), temperatura (float) 

* Neumáticos de competición para rallies: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios), presión (float), profundidadDibujo (int)

* Neumáticos de competición para karts: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios),  llanta (int)

Funcionabilidades del programa sea:
 * Poder impirmir por pantalla la marca del neumático y su cadudidad en una sola línea.
 * Un método para que si la dureza: 
 	* < 10 "blando", 
 	* 10 <= dureza <= 50 "medio" 
 	* dureza > 50 "duro"

 Cada clase debe disponer: 
 * constructor
 * permitir establecer (set) y recuperar (get) el valor de sus atributos
 * tener un método que permita mostrar la información del objeto. 
 
 Crear una clase test con el método main:
 	* donde se cree un objeto de cada tipo
 	* se muestren los datos de cada uno de los objetos creados.
 	* probar los métodos de dureza e impresión de marca y caducidad que nos pedía el cliente.

 	_________________________________________________________________________________________________
 	
 	**PLANTEAMIENTO DEL PROBLEMA**
 	
 	* Forzamos crear dos interfaces que contengan los métodos comunes a todas las clases de neumáticos para ver como una clase puede coger elemento de varias interfaces:
 		
 		* Interface Recambio
 			* Metódos get y set para la variable marca
 		* Interface Neumático
 			* Métodos get y set para caducidad, dureza, color, dibujo
 			* Método mostrarInfo();
 	
 	* Creamos la superclase NeumaticoEstandar:
 		* Recoje y sobreescribe los métodos de las dos interfaces.
 		* Añade métodos propios que no tienen que ser sobreescritos:
 			* marcaCaducidad(): imprimir por pantalla la marca y la caducidad
 			* dureza(): transforma el grado de dureza(int) en un String con un condicional
 		* El método mostrarInfo seguirá siendo un método abstracto ya que tiene que ser sobreescrito en las diferentes subclases
 	
 	
 	* Creamos 3 sublclases que heredan de NeumaticoEstandard y sobreescribe el método abstracto mostrarInfo()
 		
 		* NeumaticosPista --> adherencia (int), temperatura (float) 
 		
 		* NeumaticosRallies --> presión (float), profundidadDibujo (int)
 		
 		* NeumaticosKarts --> llanta (int)
 		
 		
 	
 	