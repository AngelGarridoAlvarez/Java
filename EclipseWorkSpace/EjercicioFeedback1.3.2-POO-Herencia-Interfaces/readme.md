* Desarrollar un programa en Java que permita la gesti�n de los neum�ticos de una escuder�a de competici�n. 
* Esta escuder�a participa en varios tipos de carreras: 
	* circuitos
	* rallies
	* karts

*  Se pide hacer estructura de clases (El modelo) para los diferentes tipos de neum�ticos.

*  Tener en cuenta lo visto de clases: herencias, interfaces, etc.


Caracter�sticas  neum�ticos:

* Neum�ticos de competici�n para pista: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios), adherencia (int), temperatura (float) 

* Neum�ticos de competici�n para rallies: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios), presi�n (float), profundidadDibujo (int)

* Neum�ticos de competici�n para karts: 
	* Marca (String), caducidad (String o Date), dureza (int), color (String), dibujo (Pueden ser de Mojado, seco o intermedios),  llanta (int)

Funcionabilidades del programa sea:
 * Poder impirmir por pantalla la marca del neum�tico y su cadudidad en una sola l�nea.
 * Un m�todo para que si la dureza: 
 	* < 10 "blando", 
 	* 10 <= dureza <= 50 "medio" 
 	* dureza > 50 "duro"

 Cada clase debe disponer: 
 * constructor
 * permitir establecer (set) y recuperar (get) el valor de sus atributos
 * tener un m�todo que permita mostrar la informaci�n del objeto. 
 
 Crear una clase test con el m�todo main:
 	* donde se cree un objeto de cada tipo
 	* se muestren los datos de cada uno de los objetos creados.
 	* probar los m�todos de dureza e impresi�n de marca y caducidad que nos ped�a el cliente.

 	_________________________________________________________________________________________________
 	
 	**PLANTEAMIENTO DEL PROBLEMA**
 	
 	* Forzamos crear dos interfaces que contengan los m�todos comunes a todas las clases de neum�ticos para ver como una clase puede coger elemento de varias interfaces:
 		
 		* Interface Recambio
 			* Met�dos get y set para la variable marca
 		* Interface Neum�tico
 			* M�todos get y set para caducidad, dureza, color, dibujo
 			* M�todo mostrarInfo();
 	
 	* Creamos la superclase NeumaticoEstandar:
 		* Recoje y sobreescribe los m�todos de las dos interfaces.
 		* A�ade m�todos propios que no tienen que ser sobreescritos:
 			* marcaCaducidad(): imprimir por pantalla la marca y la caducidad
 			* dureza(): transforma el grado de dureza(int) en un String con un condicional
 		* El m�todo mostrarInfo seguir� siendo un m�todo abstracto ya que tiene que ser sobreescrito en las diferentes subclases
 	
 	
 	* Creamos 3 sublclases que heredan de NeumaticoEstandard y sobreescribe el m�todo abstracto mostrarInfo()
 		
 		* NeumaticosPista --> adherencia (int), temperatura (float) 
 		
 		* NeumaticosRallies --> presi�n (float), profundidadDibujo (int)
 		
 		* NeumaticosKarts --> llanta (int)
 		
 		
 	
 	