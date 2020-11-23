# Java

Resúmenes teóricos y ejercicios prácticos realizados por Ángel Garrido Álvarez durante el Máster en Diseño y Programación de Aplicaciones Java JEE - Universidad de Alcalá

## Indice

### Módulo 1 - TEMA 1 - Desarrollo de aplicaciones en JAVA
1.1.1. [ Introducción a la programación](#id111)
1.1.2. [IDE - Entorno de Desarrollo](#id112)



### Módulo 1 - TEMA 1 - Desarrollo de aplicaciones en JAVA

#### 1.1.1. [ Introducción a la programación] <a name="id111"></a>

Existen muchos tipos de software: 
* instalados localmente
* En servidor 

Proyectos de software tienen ciclo de vida de desarrollo, pasos a seguir para desarrollar una aplicación que depende de metodología que utilicemos.

##### Concepto: programa informático
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

###### Código fuente, código objeto y código ejecutable
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


###### Clasificación de lenguajes de programación por técnica utilizada

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
    

##### Ingeniería de Software

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


##### Herramientas CASE (Computer Aided Software Engineering)
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



#### 1.1.2. [IDE - Entorno de Desarrollo] <a name="id112"></a>

* Aplicación que nos ayuda en la tarea de creación de nuestros proyectos de software. 
* Es un editor de código, un compilador, un depurador y un constructor de interfaz gráfica (GUI).
 

* Editor de texto: Es la parte que nos permite escribir el código fuente del programa. 

* Una parte importante, es que no solo nos corregirá en caso de que detecte un error, sino que también nos mostrará sugerencias e indicaciones del posible fallo que estemos cometiendo.

* El Compilador: el código fuente tecleado por el programador (escrito en un lenguaje de alto nivel), necesita ser traducido a un programa escrito en lenguaje de bajo nivel (lenguaje máquina). El IDE realiza estas compilaciones de nuestro código para que podamos ir realizando pruebas de nuestro código mientras lo estamos desarrollando.

* El Intérprete: Los intérpretes se diferencian de los compiladores en que solo realizan la traducción a medida que se va ejecutando el código. En lenguajes interpretados como PHP o Javascript, el IDE va ejecutando el código línea a línea como si se tratara del entorno de producción (lo que se conoce como máquina virtual).

* Depurador (Debugger): El depurador es una herramienta que nos permite comprobar el funcionamiento de nuestro código, examina paso a paso, instrucción a instrucción, la ejecución de un programa y cambios que se produzcan en las variables del programa o en los registros del procesador. El depurador nos va a permitir detener el programa en un punto de ruptura para examinar los caminos o el valor de los datos que tienen en cada momento.
