![Java](java.jpg)

Resúmenes teóricos y ejercicios prácticos realizados por Ángel Garrido Álvarez durante el Máster en Diseño y Programación de Aplicaciones Java JEE - Universidad de Alcalá - Grupo Atrium. Profesores: Antonio Otero y Antonio Cardador

# Módulo 1

## 1 - Desarrollo de aplicaciones en JAVA

1.1. [ Introducción a la programación](#id111)

1.2. [IDE - Entorno de Desarrollo](#id112)

## 2 - Fundamentos de Programación en JAVA

2.1. [ Introducción a JAVA](#id121)

2.2. [ Programación con JAVA](#id122)

2.3. [ Estructuras de Control](#id123)

2.4. [ Arrays](#id124)


## 3 - POO - Programación Orientada a Objetos

3.1. [ POO - Programación Orientada a Objetos](#id131)

3.2. [ Clases Avanzadas](#id132)

3.3. [ Excepciones y Aserciones](#id133)

3.4. [ Colecciones](#id134)

## 4 - Mecanismos de Entrada / Salida

4.1. [Gestión de E/S por terminal y ficheros](#id141)

## 5 - Diseño de interfaces

5.1 [Diseño de interfaces gráficas con Swing](#id151)

## EJERCICIOS
* [EJERCICIOS ARRAYS](Ejercicios/1.2.4.Arrays)
* [EJERCICIOS POO](Ejercicios/1.3.1.POO)
* [EJERCICIOS HERENCIAS](Ejercicios/1.3.2.ClasesAvanzadas/Herencia)
* [EJERCICIOS Static y Final](Ejercicios/1.3.2.ClasesAvanzadas/StaticYFinal)
* [EJERCICIOS Clases Abstractas](Ejercicios/1.3.2.ClasesAvanzadas/ClasesAbstractas)
* [EJERCICIOS Interfaces](Ejercicios/1.3.2.ClasesAvanzadas/Interfaces)
* [EJERCICIOS ClasesEnvolventes](Ejercicios/1.3.2.ClasesAvanzadas/ClasesEnvolventes)

## EJERCICIOS FEEDBACK
* [**Ejercicio Feedback 1.2. - Estructuras de Control**](#id12e)
* [**Ejercicio Feedback 1.2.4 - Bucles**](#id124e)
* [**Ejercicio Feedback 1.3.1 - POO**](#id131e)
* [**Ejercicio Feedback 1.3.2 - POO - Clases Avanzadas**](#id132e)

_________________________________________________________________________________


# TEMA 1 - Desarrollo de aplicaciones en JAVA

## 1.1. Introducción a la programación <a name="id111"></a>

Existen muchos tipos de software: 
* instalados localmente
* En servidor 

Proyectos de software tienen ciclo de vida de desarrollo, pasos a seguir para desarrollar una aplicación que depende de metodología que utilicemos.

### Concepto: programa informático
**Programa**:
* conjunto de órdenes que se ejecutan en el ordenador para conseguir un objetivo.
* capaces de hacer tres tipos de operaciones:
    * Aritméticas.
    * Lógicas (comparación de valores).
    * Almacenar la información.

**Algoritmo**: 
* Conjunto de procedimientos con los que al ser procesados, se consigue una acción. 
* Pueden estar compuestos a través de textos, números o símbolos. 
* La expresión de uno o más algoritmos es lo que se define como programa.

**Ensamblador**
* Lenguaje de programación a bajo nivel.
* Se comunica con el hardware sin intermediaros.
* Utiliza directamente las instrucciones del microprocesador para definir los algoritmos.

**Implementación**
* Codificación de un algoritmo en un lenguaje que se comunica con la computadora, produciendo la ejecución de un programa.
* Codificación:
    * Bajo nivel: lenguajes con comandos y funciones cercanas al modo en el que procesa los datos una computadora (código máquina, ensamblador)
    * Alto nivel: lenguajes con sintaxis más cercana a la forma en la que nos comunicamos los humanos.

### Código fuente, código objeto y código ejecutable
**Código Fuente**: 
* conjunto de instrucciones escritas en un lenguaje de programación.
* no pueden ser directamente ejecutados por la computadora. 
* son posteriormente compilados o interpretados para su ejecución en los diferentes Sistemas Operativos. 
* Este proceso de traducción genera otro tipo de código que se define como el código objeto.
* Debe:
    * Ser fácil de leer y entendible por otros desarrolladores
    * Tener comentarios que expliquen su finalidad y componentes.
    * Realizar los procesos de la forma más simple posible.
    * Ser flexible a cambios para posteriores mantenimientos.
    * Funcional.

**Código Objeto**:
* Código máquina o binario que interpreta directamente la computadora. 
* Traducción del código fuente.
*  y crear el archivo ejecutable.
* El compilador:
    * Enlaza el código objeto del programa con otros programas.
    * Comprueba que el código no tenga errores
    * Crea el archivo ejecutable
    
**Código ejecutable** 
* Partiendo de los dos códigos anteriores, crea los archivos ejecutables para que nuestro sistema reconozca la aplicación. 
* Diferentes para cada SO


### Clasificación de lenguajes de programación por técnica utilizada

**Secuencial**: va ejecutando las sentencias en orden una detrás de otra.

**Estructurada**: 
* Utiliza estructuras de control
* es una programación secuencial pues ejecuta una seguida de otra
* incorpora estructuras selectivas para la toma de decisiones y estructuras repetitivas.  
* La mayor parte de los lenguajes actuales derivan de este tipo de programación, adaptándose a otros paradigmas.

 

**Modular**: 
* consta de varios módulos  que interactúan entre sí. 
* Un módulo principal coordina las llamadas al resto de módulos y pasa los datos necesarios por parámetros.

 

**Programación orientada a objetos (POO)**:
* cada  conjunto de datos es un objeto con sus atributos y métodos.
* aumenta la velocidad del desarrollo de programas gracias a la reutilización de las partes del código.


Todas se puede subdividir en programación declarativa e imperativa:
* **Programación imperativa**: programación estructurada, modular y POO.
    * Se escriben sentencias que modifican el estado de un programa. 
    * Se indica paso a paso, cada uno de los pasos y la toma de decisiones que deben ocurrir en la ejecución.

**Programación declarativa**:
    * la solución se alcanza mediante procesos internos del lenguaje
    * sin especificar exactamente el proceso para llevarlo a cabo
    

### Ingeniería de Software

* comprende todos los aspectos de la creación del software:
    * Definición, mantenimiento, etc.


* Software: Programas de ordenador y la documentación asociada. 

* Proceso del software: conjunto de actividades cuya meta es el desarrollo o evolución del software.

* Coste desarrollo software: 
    * 60 % desarrollo, 40 % pruebas
    * software personalizado: costos evolución > costos desarrollo.

 
* Métodos de desarrollo: Enfoques estructurados para el desarrollo de software que incluyen modelos de sistemas, notaciones, reglas, sugerencias de diseño y guías de procesos.


* CASE: Herramientas que intentan proporcionar ayuda automatizada a las actividades del proceso del software.

 
* Actividades del ciclo de vida de Software:  
    * Adquisición: preparación de la oferta para suministrar el software, seleccionaremos los agentes implicados en su realización.
    * Suministro: Contratos, identificación de los recursos necesarios para llevar a cabo el desarrollo.
    * Desarrollo: Actividades enfocadas a la creación del software: 
        * Análisis, diseño, codificación, pruebas, integración e implantación.
    * Explotación: Tiempo en el que la aplicación está en uso, en esta fase se da soporte operativo a los usuarios.
    * Mantenimiento: corrección errores, mejoras y adaptaciones a diferentes Hardware y SO.
 

* Procesos de soporte

    * Documentación: Registra la información de todas las tareas que se realizan en las diferentes fases y actividades del ciclo de vida.
    * Gestión de la Configuración: Actividades que controlan las modificaciones y cambios que se producen en las versiones de los elementos.
    * Aseguramiento de la calidad: Actividades para que el producto cumpla con los requisitos establecidos.
    * Verificación: Permiten determinar el correcto funcionamiento del producto.
    * Validación: Comprobar que el producto de software cumple con los requisitos establecidos, es decir cumple con los objetivos que se marcaron para su creación.
    * Revisión conjunta: Puesta en común de los diferentes grupos implicados en el proyecto para determinar y revisar las diferentes fases del ciclo de vida.
    * Auditorías: Actividades que se realizan en un determinado momento para comprobar que se están consiguiendo los objetivos propuestos: requisitos, cumplimento de los compromisos establecidos en el contrato, comprobar los plazos, etc.
    * Resolución de problemas: Resolución de problemas o disconformidades con los requisitos o con el contrato, que hayan surgido  durante la ejecución del proyecto.


* Procesos generales
    * Gestión: Planificación, seguimiento, revisiones…
    * Infraestructura: Recursos para la puesta en marcha del producto de software, tanto para su desarrollo como implantación y soporte futuro. Tanto en instalaciones, hardware, software, consumos, etc.
    * Mejora: Evaluar y mejorar cada uno de los procesos de vida del software.
    * Formación: Planes de formación para todos los agentes implicados en el proceso del ciclo de vida.

 

* Fases de desarrollo/Modelos del ciclo de viva de software

    * ayudan a organizar las diferentes etapas y actividades del ciclo de vida, diferenciando las etapas y actividades del ciclo de vida del software.

    * Modelo en cascada
         * Dividido en etapas que se realizan secuencialmente.
         * Una etapa no puede empezar hasta que no haya terminado la anterior. 
         * En cada fase generaremos toda la documentación necesaria para explicar lo realizado y las bases para el siguiente paso. 
         * Modelo dirigido por documentos.

         * Ventajas

            * Útil cuando se tienen claros los requisitos desde el principio.
            * Con equipos de trabajo pequeños o inexpertos, pues tiene una estructura de trabajo muy definida y se apoya en mucha documentación.
            * Cuando se realizan migraciones de software.

         * Inconvenientes
            * El tener que definir al inicio todos los requisitos no es realista, pues suelen aparecer nuevas necesidades a lo largo del desarrollo.
            * El cliente no ve el producto terminado hasta finalizar el proceso.
            * Es poco flexible a cambios.
 
    * Modelo iterativo
        * Modelo evolutivo que se basa en prototipos que se pueden probar. 
        * Ayuda a perfeccionar los requisitos del sistema.
        * Está compuesto por iteraciones.
        * en cada iteración se revisan y mejoran las diferentes partes del producto hasta llegar a la solución final.

        * Ventajas
            * Se pueden ir viendo los resultados durante el proceso.
            * Cuando el cliente no sabe lo que quiere y los requisitos no están bien definidos desde el principio .
            * Reduce el riesgo de no cumplir las necesidades de los usuarios.
            * Cuando los requisitos cambian durante el proceso.
            
        * Inconvenientes
            * El diseño del prototipo hace que los desarrolladores utilicen herramientas que faciliten la rápida generación de código, dejando a un lado la eficiencia, fiabilidad y otros  aspectos de calidad.
            * Probablemente no se tendrá un código óptimo.
            * Exige disponer de las herramientas específicas.

    * Modelo incremental
            * Es un modelo evolutivo que permite desarrollar versiones cada vez más completas del producto.
            * Parte de los elementos del  modelo en cascada, repitiendo los procesos con el objetivo de la construcción de prototipos.

        * Ventajas
            * Los clientes se involucran más en todo el proceso.
            * Se puede ir revisando el producto en toda la fase de desarrollo.
            * Fácil introducción de cambios.
            
        * Inconvenientes
            * Los incrementos deben de ser pequeños.
            * Se necesita un grado muy alto de planificación.
            * Difícil de documentar.


### Herramientas CASE (Computer Aided Software Engineering)
* aplicaciones que nos ayudan a aumentar la productividad en el desarrollo del software.
* Objetivos:
    * Aumentar la calidad del producto.
    * Reducir el tiempo y los costes.
    * Mejorar la planificación en los procesos de desarrollo.
    * Aumentar la biblioteca de conocimiento.
    * Automatizar procesos en un desarrollo.
    * Ayuda a la reutilización del código.
    * Facilitar el uso de metodologías de desarrollo.
 

* Clasificación según la fase del ciclo de vida en las que las que intervienen:
    * I-CASE (Integrated CASE): abarcan todas las fases del ciclo de vida del desarrollo de sistemas.
        * Herramientas de alto nivel, U-CASE (Upper CASE - CASE superior) o front-end: 
            * orientadas a la automatización y soporte de las actividades desarrolladas durante las primeras fases del desarrollo: Definición, análisis y diseño.
        * Herramientas de bajo nivel, L-CASE (Lower CASE - CASE inferior) o back-end:, dirigidas a las últimas fases del desarrollo: Implementación, pruebas y mantenimiento.



## 1.2. IDE - Entorno de Desarrollo <a name="id112"></a>

* Aplicación que nos ayuda en la tarea de creación de nuestros proyectos de software. 
* Es un editor de código, un compilador, un depurador y un constructor de interfaz gráfica (GUI).
 

* Editor de texto: Es la parte que nos permite escribir el código fuente del programa. 

* Una parte importante, es que no solo nos corregirá en caso de que detecte un error, sino que también nos mostrará sugerencias e indicaciones del posible fallo que estemos cometiendo.

* El Compilador: el código fuente tecleado por el programador (escrito en un lenguaje de alto nivel), necesita ser traducido a un programa escrito en lenguaje de bajo nivel (lenguaje máquina). El IDE realiza estas compilaciones de nuestro código para que podamos ir realizando pruebas de nuestro código mientras lo estamos desarrollando.

* El Intérprete: Los intérpretes se diferencian de los compiladores en que solo realizan la traducción a medida que se va ejecutando el código. En lenguajes interpretados como PHP o Javascript, el IDE va ejecutando el código línea a línea como si se tratara del entorno de producción (lo que se conoce como máquina virtual).

* Depurador (Debugger): El depurador es una herramienta que nos permite comprobar el funcionamiento de nuestro código, examina paso a paso, instrucción a instrucción, la ejecución de un programa y cambios que se produzcan en las variables del programa o en los registros del procesador. El depurador nos va a permitir detener el programa en un punto de ruptura para examinar los caminos o el valor de los datos que tienen en cada momento.

##### JDK
* Java Development Kit (JDK) es un software que provee herramientas de desarrollo para la creación de programas en Java. Puede instalarse en una computadora local o en una unidad de red.

* En la unidad de red se pueden tener las herramientas distribuidas en varias computadoras y trabajar como una sola aplicación.

_______________________________________________________________________________________________________________________________________________________________

# TEMA 2 - Fundamentos de Programación en JAVA

## 2.1. Introducción a JAVA <a name="id121"></a>
Java es un conjunto de: 
* un lenguaje
* una plataforma de desarrollo (JDK - Java Development Kit)
* un entorno de ejecución para los programas compilados (JRE - Java Runtime Environment)
    * Portabilidad: gratuito y disponible principales SO 
    
    * Los programas se compilan en un lenguaje intermedio, ByteCode que es interpretado por la máquina virtual (JVM) del entorno de ejecución (JRE) y así se obtiene la portabilidad. 
    
    * JRE intermediario entre el código ByteCode y los distintos sistemas operativos existentes.
    
    * un conjunto de librerías de desarrollo. (Java API - Java Application Programming Interface).

* Desarrollado por Sun Microsystems, 1995.
* Valorado por ser independiente del SO en el que trabaja.
    

 
### Proceso de edición y compilación.
* Se sigue el proceso: 
    * edición del código fuente (con el IDE)
    * compilación (con Javac - Java Compilator o con el IDE - comprueba que el código fuente se compone de palabras válidas en Java y que los comandos Java tienen una sintaxis correcta.) 
    * y ejecución (compilación genera un fichero de tipo class en Bytcode para que JVM lo interprete y ejecute la aplicación)

* El código fuente se compila para obtener el Bytecode que será interpretado por la JVM

### Codificación de programas Java.
 
* Legibilidad: fácil de entender y de leer.

* Corrección.- Un programa debe cumplir los requisitos funcionales y técnicos establecidos en la fase de especificación. Durante la fase de prueba se verificará.

* Eficiencia.- tiempo que tarda el programa en ejecutarse, recursos que consume.


## 2.2. Programación con JAVA <a name="id122"></a>


### Estructura general de un programa en Java.
```java
/*

* Este programa muestra el texto “Hola Mundo, programo en Java” por la consola.

*/

public class HolaMundo{ //Definición de la clase

    public static void main (String[] args){ //método principal

    System.out.println("Hola Mundo, programo en Java"); //Sentencias

    }

}
```

![img](img/public-static-void-main-string-args-2.png)

[fuente](https://www.journaldev.com/)

* In Java, void keyword is used with the method declaration to specify that this particular method is not going to return any value after completing its execution.
* The only difference between println() and print() method is that println() throws the cursor to the next line after printing the desired result whereas print() method keeps the cursor on the same line.
##### Programa en Java: calcular área y perímetro de un cuadrado:

```java

public class areayperimetro{

    public static void main (String[] args){

        // Declaramos las variables para trabajar con ellas.
        double lado =5.0, area, perimetro; //double: tipo de dato decimal doble
        area = lado*lado;
        perimetro = lado+lado+lado+lado; // o bien 4*lado;
        
        System.out.println("El area es: ",area);

        System.out.println("El perímetro es: ",perimetro);
    }
}

/*
El area es: 25.0
El perímetro es: 20.0
*/
```

### Saltos de línea y espacios:

* Los saltos de linea se hacen con \n 
```java
public class SoyAntonio {
    public static void main (String[] args){

        System.out.print("Hola");
        System.out.print(" ");
        System.out.print("soy Antonio");
        System.out.print("\nVS\n");//Meto dos saltos de línea
        System.out.print("Hola");
        System.out.print("soy Antonio");
    }
}

/*
Hola soy Antonio
VS
Holasoy Antonio
 */
```


### Variables
**Requisitos de los Identificadores de las Variables**

* Un identificador debe de comenzar con una letra que puede ser seguida de más letras o dígitos. Una letra es cualquier símbolo del alfabeto y un dígito son cualquier carácter entre ‘0’ y ‘9’. 
* Un identificador no puede llamarse igual que las palabras reservadas que tienen los lenguajes de programación. Por ejemplo no podemos usar un identificador llamado for o while.
* Un identificador escrito en minúscula es totalmente distinto del mismo identificador en mayúscula, es decir, pvp y PVP serían dos variables totalmente distintas. Java diferencia entre las letras mayúsculas y minúsculas.
* Los identificadores correspondientes a una clase deberán de empezar siempre con la primera en mayúscula y si se trata de nombres compuestos no se usara el _ para separar y cada nombre su primer carácter en mayúscula, como por ejemplo HolaMundo, Persona, Profesor, Academia …
* Los identificadores para variables y métodos deberán de comenzar siempre con el primer carácter en minúscula y no se debe de usar un _ para separar en caso de compuestos, como por ejemplo: sueldo, calcularSueldo, getNombre …

En Java hay que decir el tipo de dato que tiene cada variable

```java
public class variables {
    public static void main(String[] args) {
        int dia = 28;
        int mes = 7;
        int ano = 2018;

        System.out.println("día " + dia + " del mes " + mes + " de " + ano);
    }
}
```
También se puede expresar de las siguientes formas:

```java
public class variables {
    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;

        dia = 3;
        mes = 12;
        ano = 1979;
    }
}
```
```java
public class variables {
    public static void main(String[] args) {
        int dia, mes, ano;

        dia = 3;
        mes = 12;
        ano = 1979;
    }
}
```
### Tipos de datos

![tipos de datos](img/tipos_datos.jpg)

[fuente](https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=419:tipos-de-datos-java-tipos-primitivos-int-boolean-y-objeto-string-array-o-arreglo-variables-cu00621b&catid=68&Itemid=188)

Caracteres:
![caracteres](img/caracteres..png)
Fuente: Máster en Diseño y Programación de Aplicaciones Java JEE - Universidad de Alcalá

### OPERADORES 

#### OPERADORES MATEMÁTICOS
![operadores](img/Operadores%20Matemáticos.png)

#### OPERADORES INCREMENTO Y DECREMENTO
![operadores](img/operadores_incremento_decremento.png)

#### OPERADORES LÓGICOS 
![operadores](img/OperadoresLógicos.png)

#### OPERADORES RELACIONALES
![operadores](img/operadoresRelacionales.png)

#### OPERADORES CON DESPLAZAMIENTO
![operadores](img/operadoresDesplazamiento.png)


Fuente: Máster en Diseño y Programación de Aplicaciones Java JEE - Universidad de Alcalá


## 2.3. Estructuras de Control <a name="id123"></a>

**Estructuras Selectivas / Condicionales**
* if
* if else
* if else if
* Switch (solo valores int o char)
* Ternario (no recomendado - poca legibilidad código)

**Estructuras Iterativas / Bucles**
* while
* do-while
* for



[Ejemplos](EclipseWorkSpace/1.2.FundamentosJava/src)



_______________________________
[**Ejercicio Feedback 1.2.**](EclipseWorkSpace/EjercicioFeedback1/src/ejercicio1/Ejercicio1.java)<a name="id12e"></a>

Un centro de estudios nos ha solicitado que realicemos un algoritmo para saber la motivación que tienen los alumnos para estudiar programación.

Para ello quiere realizar una serie de preguntas y según la respuesta valorar su interés por estos estudios.

Cada respuesta tendrá un valor de 0 o 1 siendo el resultado el porcentaje total la suma de los valores obtenidos.

Si el valor obtenido en el primer intento es superior al 80% el ejercicio le dará la enhorabuena, si es inferior le pedirá volver a realizar el test con todas las preguntas dos veces mas. (El alumno solo podrá realizar la prueba tres veces).

Una vez realizado el test la tres veces, si la media de los resultados es inferior al 50%, se le pedirá que se lo comente a su profesor. Si es superior el programa terminara y le dará la enhorabuena.

Las preguntas para realizar son:

Te gustan las computadoras.  Si(1)  No(0)
Disfrutas con la resolución de problemas. Si(1) No(0)
Quieres trabajar en equipo. Si(1) No(0)
Te agrada aprender por descubrimiento o prefieres que te indiquen las cosas paso a paso. Si(1) No(0)
Eres creativo. Si(1) No(0)
Eres resolutivo. Si(1) No(0)
Te rindes al primer intento Si(0) No(0)
Estas dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida Si(1) No(0)

[**Solución**](EclipseWorkSpace/EjercicioFeedback1/src/ejercicio1/Ejercicio1.java)
___________________________________
* Programa principal java se compone de sentencias.

* Flujo de un programa: orden de ejecución de las sentencias

* Estructuras de control permiten modificar el flujo normal de un programa.
    * Selectivas.
    * Iterativas o repetitivas.
    
    
___________________________________
## 2.4. Arrays <a name="id124"></a>

* Se debe definir tamaño al inicio (elementos máximos)
* Todos los elementos del mismo tipo
* Una vez fijado el tamaño no se puede redimensionar

Tipos de array

```java
//Array con tipos primitivos

int numeros[]

//Array de objetos

Alumno alumnos[]
```

### Formas de declarar arrays:
```java
//Declaramos como variables tipo array num1 y num2, en este caso da = la colacación delos corchetes
int num1[];
 
int [] num2;
 
//En estos casos influye la colocación de los corchetes
int n1[], n2; //aquí n1 es un array pero n2 es un int
 
int[] n3,n4; //aquí n3 y n4 son arrays
```

### Formas de crear arrays:
```java
numeros = new int[5]; //array numeros puede contener 5 int

alumnos = new Alumno[3];// array Alumnos puede contener 5 objetos alumno
```
Intro: [Arrays.java](EclipseWorkSpace\1.2.FundamentosJava\src\arrays\Arrays.java)
```java
package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		
		//Creamos el array, es obligatorio dar un taño
		numeros = new int[5];
		
		
		//Almacenamos elementos en el array:
		
		numeros[0]= 10;
		numeros[1]= 20;
		numeros[2]= 30;
		numeros[3]= 40;
		numeros[4]= 50;
		
		
		System.out.println(numeros[0]); //10
		
		//Bucle For
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");//10 20 30 40 50 
		}
		
        System.out.print("\n");//Meto un salto de línea

		//Bucle For-each
		
		//En el bucle for each no se precisa indicar el indice de los elementos:
		
		int numeros2[] = {1,2,3,4,5,6};
		int numeros3[] = new int[] {7,8,9,10};
		
		for(int num : numeros2) {
			System.out.print(num + ", "); //1, 2, 3, 4, 5, 6, 

		};
        
		System.out.print("\n:-)\n");//Meto dos saltos de línea y una carita
		
		for(int numerito : numeros3) {
			System.out.print(numerito + " ~ "); 
		}

        //Salida por pantalla
        /*
        10
        10 20 30 40 50 
        1, 2, 3, 4, 5, 6, 
        :-)
        7 ~ 8 ~ 9 ~ 10 ~ 
        */

	}
}
```

### COPIAR ELEMENTOS DE UN ARRAY EN OTRO:

* System.arraycopy(array origen, posición inicio array origen, array destino, posición inicio array destino, nªde elementos a copiar)

**Ejemplo1:**

* Copiamos 3 elementos del array nums comenzando en el índice 2 y los pegamos en el array números a partir de la posición con índice 1.
```java
System.arraycopy(nums, 2, numeros, 1, 3)
```

**Ejemplo2:**

```java
		int numeritos1[] = { 1, 1, 1, 1, 1, 1 };
		int numeritos123[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.arraycopy(numeritos1, 0, numeritos123, 0, 6);

		// hacemos un for each para que me imprima todo por pantalla:

		for (int elemento : numeritos123) {
			System.out.print(elemento + ", "); //1, 1, 1, 1, 1, 1, 7, 8, 9, 10, 
        }
```java

```
### MATRICES: ARRAYS DE VARIAS DIMENSIONES: [Matrix.java](EclipseWorkSpace\1.2.FundamentosJava\src\arrays\Matrixays.java)

* Para declarar matrices utilizamos tantos grupos de corchetes como dimensiones queremos en el array.


    ```java
    // Declarar una variable de tipo array de dos dimensiones

    int [][] numeros;
    ```

### <u>Crear Matrices cuadradas:</u>

* = Nº de columnas para todas las filas

* En el siguiente ejemplo creamos la matriz números con 3 filas y 2 columnas y también creamos la matriz alumnos con 2 filas y 2 columnas.

```java
numeros = new int[3][2];
alumnos = new alumno[2][2];
```

### <u>Crear Matrices no cuadradas:</u>

* != Nº de columnas para todas las filas

* En el siguiente ejemplo creamos una matriz no cuadrada con 2 filas, la primera de ellas contendrá 3 columnas y la segunda contendrá 2 columnas.

```java
int [][] nums = new int[2][];

nums[0] = new int[3];
nums[1] = new int[2];
```

#### <u>Almacenar elementos en una matriz</u>

* Para almacenar elementos necesitamos acceder a sus índices fila y columna.

```java
// Almacenar elementos en una matriz

numeros[0][0] = 1;
numeros[0][1] = 2;
numeros[1][0] = 3;
numeros[1][1] = 4;
numeros[2][0] = 5;
numeros[2][1] = 6;
```

#### <u>Declarar, crear y almacenar elementos</u>

* Podemos unificar todas estas tareas en una sola instrucción:
    * ejemplo1 creamos una matriz cuadrada de 2 filas y 2 columnas
    * ejemplo2 creamos una matriz no cuadrada de 3 filas de 3, 4 y 2 columnas respectivamente

```java
int numeros1[][] = {{5,1}, {9,2}};
int numeros2[][] = {{5,1,3}, {9,2,8,5},  {3,7}};
```

#### <u>Acceder a un elemento</u>

* Accedemos al elemento 2 de la fila 1
```java
System.out.println(numeros[0][2])
```

### <u>Recorrer una matriz</u>


**BUCLE FOR**

Necesitamos de dos bucles anidados. El primero de ellos es el encargado de recorrer el array de las filas con el índice i mientras que el segundo es quien recorre el array de las columnas. Este código es válido para recorrer matrices cuadradas y no cuadradas.

```java
// Crear el array especificamos las filas y columnas

numeros = new int[3][2];


// Llenar de elementos el array

numeros[0][0] = 6;
numeros[0][1] = 2;
numeros[1][0] = 4;
numeros[1][1] = 3;
numeros[2][0] = 9;
numeros[2][1] = 8;

// Recorrer un array
for(int fila=0; fila<numeros.length; fila++){
    for(int col = 0; col<numeros[fila].length; col++){
        System.out.print(numeros[fila][col] + " ");
    }
System.out.println();
}
```

**BUCLE FOR-EACH**

Con el bucle for-each nuevamente necesitamos de dos bucles anidados. El primero nos devuelve los arrays de las columnas que recorremos en el bucle interno. El resultado que obtenemos es el que vemos a continuación.

```java
int numeros2[][] = {{5,1,3},
{9,2},
{3,7,3,6,9,1}};


for(int[] columnas : numeros2){
   for(int num : columnas){
      System.out.print(num + " ");
  }
System.out.println();

}
```
[EJERCICIOS ARRAYS](Ejercicios/1.2.4.Arrays)

[**Ejercicio Feedback 1.2.4 - Bucles**](EclipseWorkSpace/EjercicioFeedback1.2.4-Bucles/src/ejercicio124Bucles/ejercicio124Bucles.java/) 
<a name="id124e"></a>

Escriba un programa que te permita jugar a la “primitiva”.  Para facilitar la labor de depuración de errores, cada vez que el usuario introduzca un número se mostrará el boleto con los números que debe acertar.

Las condiciones del ejercicio son:

El programa debe generar una secuencia de números no repetidos como si fuera un boleto (9 números; mayores de 10 y menores de 100).

* ejemplo: 12 21 35 46 88 72 94 49 27

Después el usuario escribirá un numero, 

Si existe, mostrará lo siguiente: 

* 12 21 35 XX 88 72 94 49 27

Si no existe, mostrará lo siguiente:

* Número 78 no existe

* 12 21 35 46 88 72 94 49 27

Se puede salir de la aplicación cuando el usuario escriba 0.

En caso de tener todos los números tachados, se mostrará:

* Te ha tocado la primitiva. Eres millonario.

Existirá un número máximo de 15 intentos para acertar los números del boleto.

 

Ayuda: Para crear un número aleatorio en Java

```java
 int valor = Math.floor(Math.random()*99+10);
```

[**Solución**](EclipseWorkSpace/EjercicioFeedback1.2.4-Bucles/src/ejercicio124Bucles/ejercicio124Bucles.java/)

_________________________________________________________________________________
## TEMA 3 - POO - Programación Orientada a Objetos

## **3.1. POO - Programación Orientada a Objetos** <a name="id131"></a>

**POO (Programación Orientada a Objetos)**
* Las aplicaciones informáticas han aumentado su complejidad.
* Más manejable cuando se descompone en piezas más simples: los objetos.

* POO trabaja con una colección de objetos:
    * Se crean
    * Interaccionan
    * Y dejan de existir cuando no son útiles. 

**Clases vs objetos**:

* La  clase  es  el archivo  .java  para  definir  un  cliente  y los  objetos  son  los recursos dinámicos que se generan en la memoria.

* Las clases se pueden ver como una plantilla que representa un esquema simplificado. 
* Una clase equivale a una representación abstracta de un conjunto de objetos que comparten los mismos atributos y comportamientos.
* La plantilla a partir de la cual se va a generar el objeto.


* Un objeto es una instancia de una clase, que tiene una identidad propia y un estado. 
* La identidad del objeto se define a través de su identificador, mientras que el estado se define por el valor de sus atributos. 
* El comportamiento de un objeto viene determinado por el comportamiento de la clase a la que pertenece.
* Un objeto es un recurso dinámico que se crea y se almacena en memoria durante un tiempo determinado.
* A los objetos también se les conoce con el nombre de instancias de clase porque realmente esto es lo que son, una copia de la clase con unos valores determinados.
* El ciclo de vida de un objeto comienza con su declaración, su instanciación y su uso en los programas java, hasta que finalmente desaparece. Cuando el objeto desaparece, Java libera la memoria asignada al mismo y la reutiliza. El programador o desarrollador no debe de preocuparse en liberar la memoria que usan los objetos.


**CLASES**
* class NombreDeClase 
```java
class Circulo {
		int x;
		int y;
		int radio;
	}

```

**Instanciar objetos a partir de una clase**
```java
Circulo circulo1;
Circulo mi_circulo;
```
Pero para crear y asignar un espacio en memoria al objeto es necesario realizar la instanciación haciendo uso del operador new
```java
circulo1 = new Circulo();
mi_circulo = new Circulo();
```

**Declaraciones de Clases**

* Para declarar una clase nos debemos ajustar a la sintaxis de Java. Se debe seguir este orden:

1. Declaración del  paquete:  
    * Un  paquete  cumple  una  función  similar  a  una carpeta en Windows.
    * El paquete nos sirve para organizar nuestros recursos y además poder implementar niveles de acceso como veremos más adelante.
2. Importaciones: 
    * En una clase podremos utilizar otras clases ya creadas. 
    * Estas pueden ser  del  propio  API    o  también  clases  desarrolladas  por  terceras personas. 
    * Para poder acceder a otras clases es necesario importarlas previamente.
3. Declaración de la clase: 
    * Aquí se definirán los recursos de la clase.

```java
package unaClase;

public class Persona {

    //Propiedades o atributos:
    private String nombre;
    private String telf;
    private String nif;
    private int edad;

    //Constructor
    public Persona(){

    }

    //Método
    public void muestraDatos(){

        System.out.println("nif: " + nif + " nombre: " + nombre + " edad: " + edad);
    }
}
```

* Propiedades/Atributos/Campos: características de nuestra clase.
* Construcotres(de objetos): método especifico que se invoca cada vez que creamos un objeto tipo persona.
* Métodos; acciones que se pueden llevar a cabo sobre una persona.

**PROPIEDADES**
Propiedad:
* Variable golbal a la que se puede acceder desde cualquier otro recurso dentro de la misma clase.
* Según sea public, private o proteccted se podrá acceder desde otras clases o no.

Sintaxis para declarar una propiedad:
```
acceso tipo nombre
```
* Acceso:
    * private: solo se pueden acceder desde la propia clase que los define.
    * protected: solo se puede acceder desde la clase que lo define y desde las subclases.
    * public: se puede acceder libremente desde otras clases.

* Tipo: puede ser un tipo primitivo de Java o un identificar de  una clase.
* Nombre del atributo: debe de cumplir las normas de los identificadores y se recomienda usar sustantivos que representen la información que almacenan.

```java
public int numero;
private String nombre;
protected double medida;
long capital;
```

**Declaración de métodos**

* Podremos invocar  a  un  método  tantas  veces  como  se  quiera  por  lo  cual  nos  permite  una reutilización de código.
* Se pueden invocar desde otro recurso declarado en la misma clase y dependiendo de su acceso, se podrá llamar desde otras clases.

La sintaxis para declarar un método es la siguiente:

1. Si el método no devuelve ningún dato:
```
acceso void nombreMetodo(){
}
```

2. Si el método devuelve un dato:
```
acceso tipoDevuelto nombreMetodo(){
}
```

Ejemplo 1:
```java

public void mostrarDatos(){
// Lógica de negocio
}
 
private void abrirConexion(){
// Lógica de negocio
}
```

Ejemplo 2:
```java
public int sumar(int num1, int num2){ 
return n1 + n2;
}
 
public String getNombre(){
return nombre;
 
}
```
**VISIBILIDAD DE ACCESO**
Para declarar el acceso a un miembro de la casle podemos utilizar:

![Acceso a Métodos](img/accesoMétodos.jpg)

* Default es cuando no ponemos ningún identificador de acceso.

[Ejemplo Clases y Ojetos](EclipseWorkSpace/1.3.1.POO/Ejemplo_ClasesObjetos)

**ENCAPSULACIÓN DE CLASES**
* Una clase encapsulada es una clase que declara todas sus pripiedades como privadas.
* Solo se puede acceder a ella a traves de los métodos get() y set().

![Encapsulación de clases](img/encapsulación.png)


* Toda propiedad privada va a tener asociados dos métodos públicos (get y set). 
* Podemos modificar el valor de la propiedad (método set) o recuperar su valor (método get).

* Al generar  una instancia  de una clase no encapsulada,  como  las propiedades  son publicas, puedo acceder directamente a ellas y establecer cualquier valor mientras que sea un numero entero.

* Para evitar la introducción de datos erróneos optamos por encapsular la clase, de esta forma tengo que acceder a las propiedades a través del método setXXX() en el cual puedo  incorporar  la  lógica  de  negocio  necesaria  para  poder  controlar  si  el  valor introducido es correcto.


Veamos un ejemplo:

```java
public class Vehiculo {
    // Propiedades/ Atributos de la clase Vehiculo.
    // Al no especificar "public" en cada atributo, solo se puede acceder desde la clase
    String matricula;
	String marca;
	String modelo;
	String color;
	double tarifa;
	boolean disponibilidad;

	// Método constructor de la clase Vehiculo
	public Vehiculo (String matricula, String marca, String modelo, String Color, double tarifa){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = tarifa;
		this.disponibilidad = false;
	}
	//Definición de los métodos get
	public String getMatricula() {
		return this.matricula;
	}
	public String getMarta() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getColor() {
		return this.color;
	}
	public double getTarifa() {
		return this.tarifa;
	}
	public  boolean getDisponible() {
		return this.disponible;
	}
	// Definición de los metodos set
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad=disponibilidad;
}

```

En nuestro ejemplo, en la clase Vehículo vamos a necesitar un método get para cada uno de sus atributos y otro método set para los atributos que se puedan modificar una vez que se haya instanciado al objeto.


**CONSTRUCTORES**
* Para crear un objeto se usa el operador new. 
* Si no se ha definido un método constructor para la clase tendremos que instanciar al objeto indicando el nombre de la clase y a continuación los paréntesis ().

```java
circulo1 = new Circulo();
mi_circulo = new Circulo();
```

* En el caso de que la clase disponga de un método constructor no es posible instanciar un objeto usando la opción anterior, es decir, tendremos que usar al método constructor.
```java
Vehiculo mi_vehiculo = new Vehiculo(“5858 BPP”,”Renault”,”Megane Coupe”,”Naranja”,100.50);
```

* En una clase se pueden definir uno o más métodos constructores para inicializar los atributos de un objeto. 

* En nuestra clase Vehiculo se ha definido un método constructor que inicializa los atributos matricula, marca, modelo, color y tarifa como se puede observar a continuación:

![constructor vehículo](img/cosntructorVehiculo.png)

<u>Sobrecarga de constructores</u>

* En Java tanto con métodos como con constructores podemos sobrecargarlos (poner más de uno)
* Dependiendo del número de parámetros y el orden de los tipos se realizaran funciones independendientes.

![sobre carga constructor](img/constructoressobrecarga.png)

[EJERCICIOS POO](Ejercicios/1.3.1.POO)


[**Ejercicio Feedback 1.3.1 - Bucles**](EclipseWorkSpace/EjercicioFeedback1.3.1-POO) 
<a name="id131e"></a>

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


[**Solución**](EclipseWorkSpace/EjercicioFeedback1.3.1-POO)


_________________________________________________________________________________

## 3.2. Clases Avanzadas <a name="id132"></a>

**HERENCIA** 

<u>Herencia Sencilla / Herencia Simple</u>
* Una clase soolo puede heredar de otra, no de varias a la vez

<u>Ejemplo:</u>
* superclase/clase base/clase madre: Empleado
* subclase/clase derivada/clase hija: Gerente
* subclase de Gerente: Director (hereda de Gerente y de Empleado)

```java
//Clase Madre empleado
public class Empleado {
    public String nombre;
    public double salario;
    public Date fechaNacimiento;

    public String getDetails(){
        return "Nombre: " + nombre
    }
}

//Clase hija Gerente: hereda de la madre

public class Gerente extends Empleado {
    protected String departamento;
}

//Si lo hicieramos sin herencia pondríamos:
public class Empleado {
    public String nombre;
    public double salario;
    public Date fechaNacimiento;
    protected String departamento;

    public String getDetails(){
        return "Nombre: " + nombre
    }
}
```

Un subclase puede heredar de otra subclase, heredando todos los elementos de las clases superiores:
```java

public class Director extends Gerente {
    protected double vechicoloEmpresa;
    
    //Vemos que el método getDetails es diferente que en la clase madre Empleado, pero se sobreescribe al cumplir los 3 requisitos 
    public double aumentarComision(){ 
        return ... ;
    }
}
```

<u>Sobreescritura de Métodos</u>

Un método de una subclase puede sobreescribir al método de la clase madre si coinciden:
* El nombre del método.
* El tipo de retorno.
* La lista de argumentos en caso de que tenga.

Reglas adicionales sobreescritura de métodos
* No se puede hacer el método sobreescrito menos accesible.
* Si el método original no tiene clausula throws no se la podemos poner. 
    * Indica que si el método original no lanza excepciones, el sobreescrito tampoco.
* Si el método original SÍ tiene clausula throws:
    * Podemos quitar la clausula throws en el método sobreescrito.
    * Podemos dejar la clausula throws, pero esta debe lanzar las mismas excepciones o una subclase de ella.

```java
public class Gerente extends Empleado {
    protected String departamento;
    
    //Vemos que el método getDetails es diferente que en la clase madre Empleado, pero se sobreescribe al cumplir los 3 requisitos 
    public String getDetails(){ 
        return "Nombre: " + nombre + "\n
        Salario: " + salario  
    }
}
```
<u>Llamada a Métodos Sobreescritos</u>

* Un método de una subclase puede llamar a un método de una superclase utilizando la palabra clave super.
* El método no tiene por qué estar definido en la clase de nivel inmediatamente superior, puede heredarse de alguna clase situada más arriba en la jerarquía.


```java
public class Gerente extends Empleado {
    protected String departamento;
    
    public String getDetails(){ 
        //Llamamos al método de la superclase y añadimos info al método
        return super.getDetails() +
        "\nDepartamento: " + departamento;
    }
}
```

<u>Sobrecarga de Métodos</u>
* En algunos casos, puede que quiera escribir en la misma clase varios métodos que realizan la misma tarea básica pero con diferentes argumentos. 
* Java y otros lenguajes de programación permiten reutilizar un mismo nombre de método para varios métodos. 
* Esto sólo funciona si las circunstancias bajo las que se hace la llamada permiten distinguir cuál es el método necesario. 
    * Ejemplo: numero de argumentos y su tipo:

```java
public void println(int i);
public void println(float f);
public void println(String s);
```

* Cuando se escribe el código para llamar a uno de estos métodos, se elige el método adecuado en función del tipo de argumento o argumentos que se suministran.

<u>Sobrecarga de Constructores</u>

* Cuando se instancia un objeto, el programa puede ser capaz de suministrar varios constructores basándose en los datos del objeto que se está creando. 
* Por ejemplo, un sistema de nóminas podría ser capaz de crear un objeto Empleado si conoce todos los datos básicos sobre la persona: nombre, salario base y fecha de nacimiento.
* Puede que, en alguna ocasión, el sistema no conozca el salario base o la fecha de nacimiento.
    * Si hemos sobrecargado con contructores que contemplen estos casos, se poddrá crear un objeto unque no se conozca el salario o la fecha de nacimiento.

<u>Las sublcases no heredan sus constructores.</u>
* Las clases sólo pueden obtener un constructor de dos maneras: 
    * Debe escribirlo el programador,
    * Si éste no lo escribe, debe usar el constructor predeterminado.

[EJERCICIOS HERENCIAS](Ejercicios/1.3.2.ClasesAvanzadas/Herencia)


### **LA CLASE OBJECT - Métodos Heredados**

* La clase Object es la raíz de todas las clases en Java. 
* Si se declara una clase sin cláusula extends, el compilador agrega automáticamente el código extends Object a la declaración.
* Por tanto, cualquier objeto que declaremos hereda todos los métodos de la clase Object.

```java
public class Persona{
}

// Equivale a poner:

public class Persona extends Object{
}
```

**Métodos Heredados de la clase Object**

![metodos clase object](img/metodos_clase_object.png)

Los métodos equals y toString son los más utilizados:

<u>**Método equals**</u>
* El operador == realiza una comparación para determinar la equivalencia de dos términos. 

* La clase Object del paquete java.lang contiene el método public boolean equals(Object obj)

* compara dos objetos para comprobar su igualdad. 

* Si no se sobrescribe, el método equals() de un objeto devuelve true únicamente si las dos referencias comparadas se refieren al mismo objeto. 

* No obstante, la intención de equals() es comparar el contenido de dos objetos siempre que es posible. Ésta es la razón por la que se sobrescribe con frecuencia. 

* Por ejemplo, el método equals() en la clase String devuelve true únicamente si el argumento no es null y es un objeto String que representa la misma secuencia de caracteres que el objeto String con el que se ha llamado al método. 

* En conclusión, el operador == compara si dos variables contienen la misma referencia mientras que con el método equals podemos comparar las propiedades del objeto para verificar si son iguales o no. 

* Se debería sobrescribir el método hashCode cada vez que sobrescriba equals.
    * Devuelve el código hash asociado al objeto invocado
        * HashCode es un identificador de 32 bits que se almacena en un Hash en la instancia de la clase
        * Función criptográfica hash / “hash”
            * Algoritmo matemático que transforma cualquier bloque arbitrario de datos en una nueva serie de caracteres de longitud fija. 
            * Independientemente de la longitud de los datos de entrada, el valor hash de salida tendrá siempre la misma longitud.

    * Una implementación sencilla podría usar un XOR de bits en los códigos hash de los elementos cuya equivalencia se quiera comprobar.
        * Una operación bit a bit o bitwise opera sobre números binarios a nivel de sus bits individuales.
        * Ejemplos: NOT, AND, OR, XOR, EXOR (disyunción exclusiva)
        * XOR y desigualdad son sinónimos: A<>B

* En el siguiente ejemplo, la clase MyDate sobrescribe el método equals con @Override que compara los atributos de año, mes y día.

* También sobrescribimos con @Override el método hashCode implementa un XOR de bits de los atributos de fecha. 

* Esto hace que el código hash de los objetos iguales de MyDate tenga el mismo valor y ofrece la posibilidad de que fechas diferentes devuelvan valores diferentes.

**EJEMPLO**

* Creamos la clase MyDate:

```java
package app.ejemplo;

public class MyDate {
	
	private int dia;
	private int mes;
	private int anyo;
	
	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public MyDate(int dia, int mes, int anyo) {
        
        //la palabra super() siempre es la primera línea de un constructor e invoca al constructor de la clase superior que comparta el mismo tipo de parametrización.

        //Aunque nosotros no pongamos la palabra super() esta siempre será añadida salvo que nosotros la añadamos. 
        
        //Si nuestros constructores tienen parámetros debermos añadir las claúsulas super
		super(); 
    		
        this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (anyo != other.anyo)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
}
```
*  Creamos un programa que compara dos objetos MyDate que:
    * NO son idénticos, pero... 
    * Son iguales en cuanto a la comparación de año-mes-día:

```java
package app.ejemplo;

public class AppMain {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(14, 3, 1976);
		MyDate date2 = new MyDate(14, 3, 1976);

		if (date1 == date2) {
			System.out.println("date1 es identica a date2");
		} else {
			System.out.println("date1 no es identica a date2");
		}

		if (date1.equals(date2)) {
			System.out.println("date1 es igual a date2");
		} else {
			System.out.println("date1 no es igual a date2");
		}

		System.out.println("set date2 = date1");
		date2 = date1;

		if (date1 == date2) {
			System.out.println("date1 es identica a date2");
		} else {
			System.out.println("date1 no es identica a date2");
		}

	}

}
```
Respuesta por consola:

```console
date1 no es idéntica a date2
date1 es igual que date2
set date2 = date1;
date1 es idéntica a date2
```

<u>**Método toString**</u>

* El método toString convierte un objeto en una representación de cadena o String. 
* El compilador hace referencia a él cuando se produce una conversión automática de cadenas. 
* Por ejemplo, la llamada System.out.println():
```java
Fecha fecha = new Fecha(14, 3, 1976);
System.out.println(fecha);
		
//Es igual a:
		
Fecha fecha = new Fecha(14, 3, 1976);
System.out.println(fecha.toString());
```

* La clase Object define un método toString que devuelve el nombre de la clase y su dirección de referencia (normalmente de escasa utilidad). 
* Muchas clases sobrescriben toString para proporcionar información de mayor utilidad. 
* En el siguiente ejemplo creamos la clase Fecha sin sobreescribir el método toString:

```java
public class Fecha {
	
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha() {
		// TODO Auto-generated constructor stub
	}

	public Fecha(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

}
```
* En la clase principal, creamos una instancia de Fecha e imprimimos el objeto creado.

```java
	public static void main(String[] args) {
		Fecha fecha = new Fecha(14, 3, 1976);
		System.out.println(fecha);
		
	
		FechaConToString otraFecha = new FechaConToString(14, 3, 1976);
		System.out.println(otraFecha);

	}
```
* Al ejecutar la clase vemos como se imprime el objeto fecha. 
* Es una representación que no nos aporta ninguna información de utilidad: 
* sólo se muestra el paquete, el nombre de la clase y el código del objeto.

* Creamos la clase FechaConToString donde sobrescribimos el método toString usando con @Override para obtener una representación textual del objeto:
```java
public class FechaConToString {
	
	private int dia;
	private int mes;
	private int anyo;
	
	public FechaConToString() {
		// TODO Auto-generated constructor stub
	}

	public FechaConToString(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "FechaConToString [dia=" + dia + ", mes=" + mes + ", anyo="
				+ anyo + "]";
	}
}
```
Al generar la instancia de esta última clase e imprimirlo, vemos que esta vez muestra la representación textual del objeto, aportándonos una mayor información.

### **Recursos Estáticos**

* La palabra static declara miembros (atributos, métodos y clases anidadas) que están asociados a una clase en vez de a una instancia de la clase.


* Es decir, solo se puede acceder a estos métodos a través de la clase original y no a través de los objetos intanciados a partir de esa clase.

* Una variable statica pertenece a la clase, no a la instancia de la clase.

* Static modifier is used to create variables and methods that will exist independently of any instance created for the class. 

* Static members exists before any instance of the class is created.

* Also there will be only one copy of the static member.

* Utilizamos el nombre de la clase para invocar a sus métodos estáticos ya que estos métodos no dependen de las instancias de la clase.

* Si una variable static no se marca como private, es posible acceder a ella desde fuera de la clase. Para hacerlo, no se necesita ninguna instancia de la clase, basta hacer referencia a ella mediante el nombre de la clase.

```java
    Cricket.displayRuns(); //invocamos el método displayRuns de la clase Cricket
```

* A veces resulta útil tener una variable compartida por todas las instancias de una clase. <u>Utilidades:</u>
    * como base para la comunicación entre instancias.
    * llevar el control del número de instancias que se han creado.

    ![static](img/static.png)

<u>Ejemplo contador de las clases que se han creado</u>
```java
public class Cliente {
	
	// Propiedades de instancia
	private int codigo;
	private String nombre;
	private String email;
	
	// Propiedades de la clase
	public static int contador=0;
	
	static{
		// codigo para inicializar contador
	}
	
	public Cliente() {
		
		codigo = contador++;
		// TODO Auto-generated constructor stub
	}
}
```

* A cada objeto que se crea se le asigna un número de serie exclusivo que empieza desde 1 y continúa en sentido ascendente. 
* Todas las instancias comparten la variable counter.
* Cuando el constructor de un objeto incrementa counter, el siguiente objeto que se crea recibe el valor incrementado.

**Public vs Static vs Private vs Final**

* A public variable is accessible from anywhere (well, anywhere where the class is accessible).

* A private variable is only accessible inside the class.


* private static method means you can not invoke the method from outside the class as the method is private to the class.

* A final variable means that it cannot be modified once it is set.



**MÉTODOS ESTÁTICOS**
* Cuando no hay disponible ninguna instancia de un determinado objeto, es necesario acceder al código del programa. 

* Los métodos marcados con la palabra static pueden utilizarse de esta forma y algunas veces se denominan métodos de clase.

* Debe acceder a los métodos estáticos utilizando el nombre de la clase en lugar de una referencia al objeto

* Dado que puede llamar a un método static sin necesidad de tener una instancia de la clase a la que pertenece, no existe ningún valor this. 

    * un método static no puede acceder a ninguna variable salvo a las variables locales, los atributos static y sus parámetros. 

    * Cualquier intento de acceder a atributos que no sean estáticos provoca un error de compilación. 
    
    * Los atributos no estáticos se limitan a una instancia y sólo se puede acceder a ellos mediante referencias a esa instancia.

**Consideraciones sobre métodos estáticos**:
* No es posible sobrescribir un método static pero sí puede ocultarse. 

* Para poder sobrescribir un método, tiene que ser no estático. 

* La existencia de dos métodos estáticos con la misma firma en una jerarquía de clases simplemente significa que son dos métodos de clase independientes. 

* Si se aplica un método de clase a una referencia de objeto, el método llamado será el correspondiente a la clase para la que se haya declarado la variable.

* El método main() es un método static porque JVM no crea ninguna instancia de la clase cuando lo ejecuta. Por tanto, si tiene datos de miembros, debe crear un objeto para acceder a ellos.

**Recursos Finales**

* Cuando declaramos una propiedad final estamos creando una constante. 

* Es decir, una variable cuyo valor no se puede modificar. 


```java
public class Coche {

	private int kilometros;
	private final String bastidor; // Atributo estático
	private string matricula;
	
	public Coche(){
		this.bastidor = "885485DCV";  // Este dato no podra ser cambiado
		
	}

}
```

**Métodos Finales**
* Cuando declaramos un método como final, este no se puede sobrescribir.

```java
public final void mostrarInformacion(){
	
		System.out.println("Matricula: " + matricula + "Bastidor: " + bastidor +...)
	
}
```

**Clases Finales**
* Una clase final es una clase que no soporta herencia, esto es, no se puede crear una subclase de ella.

[EJERCICIOS Static y Final](Ejercicios/1.3.2.ClasesAvanzadas/StaticYFinal)

### **Clases Abstractas**

Muchas veces nos vamos a encontrar con el siguiente caso: 

* Creamos la superclase con un método que ya sabemos de antemano que se debe sobreescribir en la subclase porque su implementación debe variar.

*  El lenguaje Java permite diseñar las clases de modo que los métodos declarados en las superclases no proporcionen ninguna implementación. 

* Este tipo de métodos se denominan métodos abstractos. 

* La implementación del método viene proporcionada por las subclases. 
* Una clase que tenga uno o varios métodos abstractos se denomina clase abstracta. 

Ejemplo
```java
public abstract class Figura {
	
	private int x;
	private int y;
	
	public Figura() {
		
	}
	
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract  double area();


	public String posicion(){
		return "[ " + x+" , " + y +" ]";
	}

}
```
Hemos creado una clase Figura donde hemos declarado dos métodos: 
* El método mostrarPosición está implementado y  lo heredarán todas las subclases sin cambiar y su implementación.

* El método calcularArea es un método abstracto y por supuesto no está implementado. 

* Los métodos abstractos terminan en punto y coma (;) sin llave de apertura y cierre. 

* Si un método tiene llave de apertura y cierre ya está implementado aunque no tenga código en su interior.

* El motivo por el cual el método calcularArea es abstracto es porque sabemos que las subclases han de sobreescribir este método ya que la forma de calcular el área de cada figura es diferente.

* Si una clase tiene uno o más métodos abstractos, se debe declarar como abstracta. En caso contrario genera un error de compilación.

* Como el método heredado calcularArea es abstracto, por definición las subclases también lo son hasta que se implemente dicho método.

* No estamos obligados a implementarlo, pero si no lo hacemos debemos declarar las subclases como abstractas. 

* Qué problema tendremos entonces? Pues que una clase abstracta realmente es una clase inacabada por lo cual no se puede instanciar.

* En la clase Rectangulo implementamos el método calcularArea con el algoritmo adecuado para calcular el área de los rectángulos:
```java
public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * altura;
	}
}
```


* A continuación vemos la implementación del mismo método en la clase Circulo:
```java
public class Circulo extends Figura{
	
	private int radio;
	
	public Circulo(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}

}
```


Desde la clase principal creamos tres instancias:

* La primera de ellas, es una instancia de la clase Figura que genera un error de compilación puesto que dicha clase es abstracta y no se puede instanciar.

* Creamos una instancia de la clase Rectangulo donde pasamos los siguientes argumentos al constructor: puntos x e y, base y altura del rectángulo.

* También se crea una instancia de la clase Circulo con los siguientes datos: puntos x e y además del radio del circulo.

```java
public class Principal {
	
	public static void main(String[] args) {
		
		// La clase Figura es abstracta, esta inacabada
		// por la puedo instanciar
		//Figura f = new Figura();
		
		// Crear una clase anonima
		Figura f = new Figura() {
			double lado;
			
			@Override
			public double area() {
				// TODO Auto-generated method stub
				return lado * lado /2;
			}
			
		};
		
		
		
		// Crear la instancia de Circulo
		Circulo c = new Circulo(4, 6, 8);
		System.out.println(c.posicion());
		System.out.println("Area: " + c.area() );
	}

}
```
UML utiliza letras en cursiva para indicar elementos abstractos en los diagramas de clases. También se pueden marcar las clases abstractas con el indicador {abstract} en la sección de nombre.

![Clases Abstractas](img/ClasesAbstractas.png)


[EJERCICIOS Clases Abstractas](Ejercicios/1.3.2.ClasesAvanzadas/ClasesAbstractas)


### **Interfaces**

* En Java solo es posible la herencia simple: una clase tan sólo puede heredar de otra clase, nunca de varias. 

* Inferfaces: es la forma de simular una herencia múltiple. 

* Todos los métodos declarados en una interfaz son públicos (public) y abstractos (abstract). 

* Todos los atributos son public, static y final: sólo se pueden declarar atributos constantes.

* Los nombres de interfaz se utilizan como tipos de variables de referencia:
    * Un grupo de objetos que comparten la misma habilidad: pueden volar. 
    * Creo interfaz pública llamada ObjetoVolador que admite tres operaciones: despegar, aterrizar y volar.

![Interface](img/interface.png)

En el diagrama UML: 
* Las interfaces se marcan con el indicador <> en la sección de nombre. 
* Utilizamos una flecha discontinua para indicar la clase que implementa una interface.

Interface
```java
public interface ObjetoVolador{
	public void despegar();

	public void aterrizar();

	public void volar();
}
```
Clase
```java
public class Avion implements ObjetoVolador{
	public void despegar(){
		// Código
	};

	public void aterrizar(){
		// Código
	};

	public void volar(){
		// Código
	};
}
```

[EJEMPLOS DE INTERFACES](Ejercicios/Ejemplo_Interfaces)

**MULTIPLES INTERFACES**

* Una clase puede implementar varias interfaces.
* La clase Hidroavion amplía la clase Avion, con lo que hereda esa implementación de la interfaz ObjetoVolador. 
* La clase Hidroavión también implementa la interfaz Nautico.

![Interface](img/interfaces2.png)


CUANDO UTILIZAR INTERFACES

Las interfaces se utilizan para:

* Declarar métodos que serán implementados por una o varias clases.

* Dar a conocer la interfaz de programación de un objeto sin revelar el  verdadero cuerpo de la clase (esto puede ser útil al distribuir un paquete de clases a otros desarrolladores).

* Identificar las similitudes entre clases no relacionadas sin tener que establecer ninguna relación entre ellas.

* Simular la herencia múltiple declarando una clase que implemente varias interfaces.

CLASES ABSTRACTAS VS INTERFACES


* Generalmente, si nuestra clase abstracta solamente define métodos, lo mejor es crear una interfaz y reemplazarla. 

* Usamos la clase abstracta cuando queremos reutilizar comportamiento (código) en común entre varias clases similares.

DIFERENCIAS
* Tienen propósitos distintos. 
	* Las clases abstractas sirven para establecer una jerarquía de tipos y proveer un comportamiento básico. 
	* Las interfaces son definiciones de protocolos, determinan el comportamiento de un tipo. 

* Código: 
	* las clases abstractas pueden incluir código, definir atributos, tener métodos estáticos, etc. 
	* Las interfaces son sólo declaraciones de mensajes.

* las interfaces son mucho menos restrictivas que las clases abstractas 
	* No fuerzan nada más que lo necesario, solamente el protocolo.

	* Una clase abstracta podría definir un atributo de instancia, eso ya es una restricción de implementación,  ya que todas las subclases tienen como peso ese atributo (incluso si no lo usan). 
	
	* Solo podemos heredar de una clase. 
	
	* Podemos implementar todas las interfaces necesarias (clase polifacética).


[EJERCICIOS Interfaces](Ejercicios/1.3.2.ClasesAvanzadas/Interfaces)


### **Polimorfismo**

![Interface](img/polimorfismo1.png)

![Interface](img/polimorfismo2.png)

El lenguaje Java, orientado a POO, permite hacer referencia a un objeto con una variable que es uno de los tipos de una superclase:

```java
Empleado e = new Gerente()
```
* Utilizando la variable "e" solo se pueden acceder a las partes del objeto que son empleado.

* No nos permite asignar e.departamento = "Ventas"
	* la variable se declara como tipo Empleado
	* a pesar de que el objetop Gerente tiene ese atributo

### **Llamadas a métodos virtuales (polimorfismo)**

* "Java virtual method": 
	* son metodos que una subclase hereda de una clase padre y que pasan a ser sobrescritos dandole un comportamiento polimorfo. 
	* Este proceso tambien es comunmente llamado sobreescritura de metodos.

* Para que un metodo sea valido para ser sobreescrito no pueden ser de tipo staticos ni finales y como minimo deben tener protected como modificador de acceso.

Supongamos que tenemos la siguente Clase padre Mammal
```java
public class Mammal {


    public void swim() {
        System.out.println("A mammal swimming");
    }
}
```

Estas dos subclases Elephant y Hippo que heredan de Mammal y sobreescriben el metodo public void swim() de la misma.
```java
public class Elephant extends Mammal {

    @Override
    public void swim() {
        System.out.println("An Elephant swiming");
    }
}

public class Hippo extends Mammal {


    @Override
    public void swim() {
        System.out.println("A hippo swiming");
    }
}
```
Si ejecutamos el siguente ejemplo podemos ver como obtenemos resultados distintos llamando el mismo metodo de la clase Mammal cuando asignamos a la variable una nueva instancia de cada subtipo.
```java
public static void main(String ...args) {

        Mammal mammal = new Elephant();
        mammal.swim();

        mammal = new Hippo();
        mammal.swim();

    }
```
al final obtenemos.
```java
An Elephant swiming
A hippo swiming
BUILD SUCCESSFUL (total time: 1 second)
```
**COLECCIONES HETEROGÉNEAS**

* Colección Homogenea: Colecciones de objetos que tienen una clase común.
```java
MyDate[] dates = new MyDate[];
dates[0] = new MyDate(17, 08, 1951);
dates[1] = new MyDate(28, 07, 2018);
```

* COLECCIÓN HETEROGÉNEA:
* Una colección heterogénea es aquella que se compone de elementos dispares. 
*  Java incluye la clase Object que permite crear colecciones de todos los tipos de elementos porque todas las clases amplían la clase Object. 
* Todas ellas tienen una clase de origen común: la clase Object. 

Ejemplo:

```java
Empleado [] personal = new Empleado[1024];
personal[0] = new Gerente();
personal[1] = new Empleado();
personal[2] = new Ingeniero();
```

* Es posible escribir incluso un método de ordenación que coloque los empleados por orden de edad o salario, con independencia de que algunos de esos empleados sean gerentes.


OPERADOR INSTANCEOF

Nos sirve para diferenciar tipos de objetos.

Dado que es posible pasar objetos de un lugar a otro utilizando referencias a sus superclases, a veces conviene saber de qué objetos reales se dispone. Éste es el  propósito del operador instanceof.

Si recibe un objeto utilizando una referencia del tipo Empleado, puede que resulte ser un Gerente o un Ingeniero. Puede comprobarlo utilizando instanceof de la forma siguiente:

```java
public void hacerAlgo(Empleado e){
	if( e instanceof Gerente){
		// procesar un gerente
	} else if(e instanceof Ingeniero){
		// procesar in ingeniero
	} else {
		// Procesar cualquier otro empleado
	}
}
```
**CONVERSIÓN DE OBJETOS**
* En casos en los que:
	1. Se ha recibido una referencia a una clase de nivel superior y 
	2. se ha comprobado mediante el operador instanceof que el objeto es una subclase concreta

* es posible acceder a toda la funcionalidad del objeto convirtiendo la referencia.

```java
public void hacerAlgo(Empleado e){
	if ( e instanceof Gerente) {
		Gerente m = (Gerente) e;
		System.out.println("Éste es el gerente de " + m.getDepartamento());
	}
	// resto de la operación
}
```

* Si no realiza la conversión, el intento de ejecutar e.getDepartamento() fracasará porque el compilador no puede localizar ningún método llamado getDepartamento en la clase Empleado.

* Si no realiza la comprobación con instanceof, corre el riesgo de que falle la conversión. En general, cualquier intento de convertir una referencia a un objeto se somete a diferentes comprobaciones:

 

* Las conversiones en dirección ascendente dentro de la jerarquía de clases siempre están permitidas y, de hecho, no precisan el operador de conversión. Se pueden hacer mediante una simple asignación.

* En el caso de las conversiones en dirección descendente, el compilador debe poder considerar que la conversión es, al menos, posible. Por ejemplo, no se permitirá ningún intento de convertir una referencia a Gerente en una referencia a Ingeniero, porque el Ingeniero no es un Gerente. 

* La clase de destino de la conversión tiene que ser una subclase del tipo de referencia actual.

* Si el compilador permite la conversión, el tipo de objeto se comprueba durante el tiempo de ejecución. 

* Ejemplo: si se omite la comprobación instanceof en el código y el objeto que se va a convertir en realidad no es del tipo en el que se va a convertir, se producirá un error de tiempo de ejecución (excepción).



### **Tipos Enumerados**

* Una práctica habitual en programación es tener un número finito de nombres simbólicos que representan los valores de un atributo. 
* Por ejemplo, sería posible crear un conjunto de símbolos que representasen los palos de una baraja de cartas: PICAS, CORAZONES, TREBOLES y DIAMANTES. 
* Esta forma de representación se suele denominar tipo enumerado.

* Java SE incluye una modalidad de tipos enumerados que mantiene la seguridad de los tipos (typesafe enum). 
* En el siguiente ejemplo se muestra un tipo enumerado para representar los palos de una baraja de cartas. 
* Piense en el tipo Palo como en una clase con un conjunto finito de valores que reciben los nombres simbólicos incluidos en la definición del tipo. 
* Por ejemplo, Palo.PICAS es del tipo Palo.

```java
public enum Palo{
	
	PICAS,
	CORAZONES,
	TRBOLES,
	DIAMANTES
}
```
* El siguiente código muestra cómo la clase NaipeBaraja utiliza el tipo Palo para el tipo de datos del atributo palo.


![enumerados](img/enumerados.png)

Veamos otro ejemplo, queremos definir los diferentes estados civiles que puede tener una persona.


```java
public enum EstadoCivil {

	// Estaticos y finales
	SOLTERO, CASADO, VIUDO, DIVORCIADO;
	
}
```
Al crear la clase en el atributo estadoCivil indicaremos que es del tipo «EstadoCivil», por lo que solo podrá adquirir los valores tipificados en la clase Enum

```java
public class Persona {
	
	private String nombre;
	private int edad;
	private EstadoCivil estadoCivil;
	
	public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
		this.nombre = nombre;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad
				+ ", estadoCivil=" + estadoCivil + "]";
	}
	
}
```
Para crear el objeto siempre tenemos que definir cual de los valores de las opciones disponible tomara el atributo:

```java
public class Main {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("Juan", 23, EstadoCivil.SOLTERO);
		
		System.out.println(p);
	}

}
```
**TIPOS ENUMERADOS AVANZADOS**
* Existe otra forma de trabajar con tipos Enumerados para facilitar la lectura al usuario.
* en los ejempos anteriores mostraria el nombre simbolico, y puede que queramos imprimirlo con otro nombre.

* El siguiente código muestra una versión mejorada de una clase Enumerada con un atributo alias y un método ver. 
* Observe cómo se oculta la información de la forma adecuada con el atributo “private” y el método de acceso “public”.

```java
public enum PuntosCardinales {
	
	NORTE ('N'), 
	SUR ('S'), 
	ESTE ('E'), 
	OESTE ('O');
	
	private char alias;
	
    private PuntosCardinales(char letra){
    	alias = letra;
    }	
    
    public char ver(){
    	return alias;
    }
    
    public static void main(String[] args) {
    	
		PuntosCardinales p = PuntosCardinales.NORTE;
		System.out.println(p.ver());
		
	}
    
}
```

### **Clases Envolventes**

* Clases que proporcionan métodos que permiten manipular el tipo de dato primitivo como si fuese un objeto.
* El lenguaje Java no considera los tipos de datos primitivos como objetos. 
* Por ejemplo, los datos numéricos, booleanos y de caracteres se tratan de forma primitiva para mantener la eficiencia. 
* A fin de poder manejar los tipos primitivos como objetos, Java proporciona las llamadas clases envoltorio o clases envolventes. 
* Estos elementos quedan envueltos por un objeto que se crea en torno a ellos.
* Cada tipo primitivo en Java tiene una clase envoltorio asociada en el paquete java.lang. 
* Cada clase envoltorio encapsula un único valor primitivo.

* Las clases envolventes implementan objetos inmutables. 
	* Esto significa que, una vez inicializado el valor primitivo en su envoltorio, no hay forma de cambiar ese valor. 

Tabla de clases envolventes:

![Clases Envolventes](img/envolventes1.png)




* Las conversiones entre los tipos primitivos y sus clases envolventes se realizan con Boxing/Unboxing.

	* Boxing: Convertir un tipo primitivo en su clase Wrapper.
	* Unboxing: Convertir un objeto de una clase  Wrapper en su tipo primitivo.
```java
//Ejemplo de Boxing:

double x = 29.95;
Double y;
y = x; // boxing      

//Ejemplo de Unboxing:

double x;
Double y = 29.95;
x = y; // unboxing     
```
* Dada la gran cantidad de métodos de estas clases, lo recomendado es hacer uso de la [API de Java](https://docs.oracle.com/javase/10/docs/api/java/lang/Integer.html) para estudiar las opciones que tenemos.

* [API clase char](https://docs.oracle.com/javase/10/docs/api/java/lang/Integer.html)

```java
import java.util.Scanner;

public class MainJavaApplication {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String texto;
        int cuentaCifras = 0, cuentaLetras = 0;                                                                   
  
        System.out.println("Introduce texto ");
        texto = sc.nextLine();
  
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                cuentaCifras++;
            } else if (Character.isLetter(texto.charAt(i))) {
                cuentaLetras++;
            }
        }
  
        System.out.println("El texto contiene " + cuentaCifras + " dígitos");                                     
        System.out.println("El texto contiene " + cuentaLetras + " letras");
    }
}
```
**AUTOBOXING**

* El siguiente ejemplo contiene dos casos sencillos de conversión y recuperación automática de primitivos (autoboxing y autounboxing).

```java
public class Main {

	public static void main(String[] args) {
		
		int num = 4;
		
		// Java 1.4
		Integer numInt = new Integer(num); // Boxing
		int numero = numInt.intValue(); // UnBoxing
		
		
		// Java 5
		Integer numInt2 = num; // AutoBoxing
		int numero2 = numInt2; //AutoUnBoxing

	}

}
```
* El compilador de J2SE  ahora creará el objeto envoltorio automáticamente cuando se asigne un primitivo a una variable del tipo de clase envoltorio.

* Asimismo, el compilador extraerá el valor primitivo cuando realice la asignación de un objeto envoltorio a una variable de tipos primitivos. Esto puede hacerse al pasar parámetros a métodos o, incluso, dentro de las expresiones aritméticas.


[EJERCICIOS ClasesEnvolventes](Ejercicios/1.3.2.ClasesAvanzadas/ClasesEnvolventes)

[**Ejercicio Feedback 1.3.2 - POO - Clases Avanzadas**](EclipseWorkSpace/EjercicioFeedback1.3.2-POO-ClasesAvanzadas)
<a name="id132e"></a>

### **Librerías del JRE System Library**

* Una librería Java es un conjunto de clases que, por medio de sus métodos, resuelven tareas comunes para el desarrollo de software. 

* Cada librería está empaquetada en un archivo .jar y puede servir a múltiples proyectos.

* Las librerías de clases Java están organizadas en paquetes. Recuerda que un paquete es una carpeta en el sistema de archivos.

* Todos los proyectos, de manera implícita, tienen incluidas un conjunto de librerías, se trata de las librerías del “JRE System Library” o librerías del Sistema de Java Runtime Environment.

* La siguiente imagen resume la estructura de paquetes más importantes de la JRE SystemLibrary.

![librerías de Java](img/librerias.png)

Todas las clases de la JRE System Library están organizadas en dos grandes paquetes:

1. java: existente desde los orígenes de Java, pero todavía vigente y creciendo.
2. javax: apareció después del paquete java, es más moderno.

A continuación vamos a comentar brevemente los paquetes más importantes:

* java.lang
	* Contiene las clases fundamentales del lenguaje (Math, String, Integer, Long, etc.). Se carga de manera implícita, no es necesario importarlo.
	* [Documentación de Oracle sobre el paquete java.lang.](https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html)

* java.util
	* Contiene principalmente clases para manejo de distintos tipos de colecciones
	* (ArrayList, LinkedList, Stack, etc.).
	* [Documentación de Oracle sobre el paquete java.util.](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)

* java.io
	* Contiene todas las clases relacionadas con operaciones de entrada / salida
	* (File, FileInputStream, FileOutputStream, etc.).
	* [Documentación de Oracle sobre el paquete java.io.](https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html)

* java.math
	* Clases relacionadas con aritmética de enteros.
	* [Documentación de Oracle sobre el paquete java.math.](https://docs.oracle.com/javase/8/docs/api/java/math/package-summary.html)

* java.awt
	* Clases relacionadas con interfaces gráficas y dibujo de figuras. 
	* Se utiliza para el desarrollo de aplicaciones de escritorio a base de ventanas y diálogos.
	* [Documentación de Oracle sobre el paquete java.awt.](https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html)

* java.sql
	* Clases relacionadas con operaciones de acceso a bases de datos.
	* [Documentación de Oracle sobre el paquete java.sql.](https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html)

* java.net
	* Clases relacionadas con trabajo en red e Internet.
	* [Documentación de Oracle sobre el paquete java.net.](https://docs.oracle.com/javase/8/docs/api/java/net/package-summary.html)

* javax.swing
	* Clases de interfaz de usuario mejoradas con respecto a la librería java.awt.
	* [Documentación de Oracle sobre el paquete javax.swing.](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html)

* javax.imageio
	* Clases especiales para trabajar con imágenes.
	* [Documentación de Oracle sobre el paquete javax.imageio.](https://docs.oracle.com/javase/8/docs/api/javax/imageio/package-summary.html)

* javax.crypto
	* Clases especializadas en trabajos de criptografía.
	* [Documentación de Oracle sobre el paquete javax.crypto.](https://docs.oracle.com/javase/8/docs/api/javax/crypto/package-summary.html)

* javax.sql
	* Clases especializadas en la gestión de bases de datos del lado del servidor.
	* [Documentación de Oracle sobre el paquete javax.sql.](https://docs.oracle.com/javase/8/docs/api/javax/sql/package-summary.html)

* javax.xml
	* Clases especializadas en lectura y manipulación de documentos xml.
	* [Documentación de Oracle sobre el paquete javax.xml.](https://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/package-summary.html)


_________________________________________________________________________________

## 3.3. Excepciones y Aserciones <a name="id133"></a>

_________________________________________________________________________________

## 3.4. Colecciones <a name="id134"></a>
_________________________________________________________________________________


# TEMA 4 - Mecanismos de Entrada / Salida

## 4.1 - Gestión de E/S por terminal y ficheros<a name="id141"></a>


# TEMA 5 - Diseño de interfaces

## 5.1 - Diseño de interfaces gráficas con Swing<a name="id151"></a>

### POO en Eclipse con interfaz gráfica
*  [App ventana principal](EclipseWorkSpace/pruebaGraficos/src/pruebaGraficos/ventanaPrincipal.java)

* Necesitamos instalar windows builder para trabajar con Swing en el IDE Eclipse:

![img](img/01.png)

<u>Crear un proyecto para trabajar con Swig:</u>

* Archivo - nuevo proyecto - Otro - WindowBuilder - SWT Designer - SWT/JFace Java Project
![img](img/03.png)
![img](img/05.png)

* Es importante elegir JavaSE-1.8
![img](img/02.png)

* Agregamos una ventana a nuestro proyecto para poder trabajar de forma gráfica:
src - botón derecho - new - other
![img](img/06.png)
![img](img/07.png)

* Damos nombre a la ventana
![img](img/08.png)

*  Seleccionamos nuestra ventana y pulsamos en Design para ver la interfaz gráfica:
![img](img/09.png)

* Si ejecutamos nuestra aplicación ya nos va a saltar una ventana en el escritorio

* Podemos modificar las dimensiones de esa ventana de forma gráfica

* Podemos modificar sus propiedades con el menú

![img](img/10.png)

* ContentPane hace referencia al interior de la ventana donde voy a trabajar.

* Para poder trabajar aquí tene mos que arrastrar la propiedad "Layout - absolute layout" del menú de la imagen anterior, hasta el interior de la ventana

* En nuestra [App ventana principal](EclipseWorkSpace/pruebaGraficos/src/pruebaGraficos/ventanaPrincipal.java) probamos los diferentes componentes
![img](img/12.png)


### Dotar de funcionalidad a un botón:
![img](img/11.png)

**JOptionPane.showMessageDialog:** ventana emergente

* Introduzco la línea de código: JOptionPane.showMessageDialog(null, "Has pulsado el botón") en el códgio del botón;

* En un principio no me reconoce JOptionPane; es porque la importación no se ha hecho, en eclipse lo resuelvo con " CTRL + SHIFT + O " para que me haga todas las importaciones automaticamente.

```java
JButton btnNewButton = new JButton("JButton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Has pulsado el botón");
			}
		});
```

Transformamos el botón para que nos muesre en el Jtext la ciudad seleccionada en el comboBox;

```java
JButton btnNewButton = new JButton("JButton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Has pulsado el botón, se va a cambiar el texto de JTextField con la ciudad " + comboBox.getSelectedItem().toString() + " seleccionada.");
				txtJtextfieldEsUna.setText("La ciudad seleccionada es " + comboBox.getSelectedItem().toString());
			}
		});
```
