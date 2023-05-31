||||
| :- | :-: | -: |

*Documento de requerimiento*

David Santiago Muñoz Fernández - 20222020054

Santiago Pineda Anaya - 20222020055

**AJEDREZ**

El problema consistía en la creación de un ajedrez funcional en el cual se tenga una pantalla de presentación con un botón de inicio y dos “<a name="_int_qgie4fvg"></a>Labels” donde se pueda escribir el nombre, luego un corto que muestre la historia del juego posterior a eso una pantalla con el ajedrez en el cual tenga un botón para bajar la música y aumentarla otro para cambiarla, un botón que lleve a un video de cómo se juega y otro para cerrar el ajedrez en caso de jaque, y en ultimas imprimir un (.<a name="_int_xetiy3fy"></a>txt) con la cantidad de movimiento con los cuales se terminó la partida ya sea para negras o blancas generando una animación de muerte del rey ya  el final de juego después de oprimir ese botón de salida en caso de jaque mate.



1. Análisis conceptual
   1. ` `¿Qué es un ajedrez?

El ajedrez en uno de los juegos más antiguos, creado por el humano el cual ha dejado a lo largo de la historia problemas celebres y partidas memorables, el ajedrez es un juego de mesa estratégico y competitivo de dos jugadores, cada jugador controla por decirlo así un ejército un rey, una reina, dos alfiles, dos caballos, dos torres y dos peones, en el cual se tiene “ataques llamados jaque y un ataque definitivo denominado jaque mate dados todos al rey siendo la pieza fundamental del juego, conocido como uno de los juegos más completos a nivel estratégico debido a que los individuos buscan prever las jugadas del otro para así ganar la partida en el momento que el rey este en jaque y sin ningún movimiento.

*Gráfica1. Tablero de ajedrez, creación propia.*

1. Análisis programación

**Problema:** creación de un ajedrez funcional, con jaques y jaque mate basado en un botón de salida, con interfaces graficas para los nombres y otras opciones en general.

|**Cliente**|Docente – estudiantes|
| - | - |
|**Usuario**|Cualquier persona que desee jugar una partida de ajedrez y quiera saber en cuantos movimientos gano una partida  |
|**Requerimiento funcional**|<p>1. Movimiento valido según las reglas del ajedrez de todas las piezas por ejemplo los peones a la salida se pueden mover dos hacia adelante y después solo 1 hacia adelante.</p><p></p><p>2. Generación de la combinación de piezas entiéndase como enroque, peón al paso, jaque y jaque mate.</p><p></p><p></p><p>3. Generar un archivo txt el cual muestre la cantidad de movimientos validos en los cuales se ganó la partida.</p>|
|**Mundo del problema**|En el enunciado no se explica realmente el mundo del problema el cuna consiste en la lógica de generar el tablero como una matriz 8 x8 en la cual se le agrega la posición de la pieza, además de lógica implementada en las piezas tales como que el rey se puede mover uno hacia arriba menos 1 hacia atrás por ejemplo más adelante se tomara más adelante el código de las piezas, también la validación para que no se salga del tablero además de la implementación  de los turnos siendo la lógica necesaria a saber para implementar los booleanos necesarios |
|**Requerimiento no funcional**|La generación de una pantalla de inicio en el cual se tenga los nombres de los jugadores en un label cada uno, la generación de un video de historia del juego, generación de botones para cambiar la música para incrementarla y decrecerla, botón para a un tutorial y cerrar la ventana en caso de jaque, y una animación de muerte de un rey |


|**Nombre**|` `Movimientos de piezas |
| - | - |
|**Resumen**|Dado en evento al mouse generar el movimiento de las piezas|
|**Entradas**|
|*Evento clic del mouse* |
|**Resultados**|
|Movimiento valido de una pieza dentro del tablero  |


|**Nombre**|1. Mostrar resultados|
| - | - |
|**Resumen**|Como salida el programa debe generar dos cosas al final del código la animación e la muerte del rey y un txt con el número de movimientos validos hasta el jaque mate |
|**Entradas**|
|*Evento del boton x para cerrar la ventana en caso de jaque e*|
|**Resultados**|
|Generar un txt el cual diga los movimientos validos hasta el jaque mate, y una animación de la muerte de un rey como salida final|


**Historia de usuario**

|**Historia de usuario Nro.**|1|Titulo:|Eventos de mouse |
| - | - | - | - |
|<p>** </p><p>**Descripción**</p>|Como:|Usuario|
||Quiero:|Presionar la pieza y generar un movimiento valido |
||Para:|Generar una partida de ajedrez |
|**Criterios de aceptación**|<p>Las piezas no pueden salir del tablero </p><p>Las piezas no pueden generar movimiento errados tal que un rey se muevas más de una casilla, o la reina salte las piezas como un caballo, el caballo no pueda saltar piezas o no se genere un mate bajo las reglas del juego, es decir que cuando sea mate el rey se pueda mover   </p>|


|**Historia de usuario Nro.**|1|Titulo:|Calcular el total|
| - | - | - | - |
|<p>** </p><p>**Descripción**</p>|Como:|Usuario|
||Quiero:|Que cuando la x se oprima se genere la salida del programa y al oprimir su botón Genere el link par aun video explicativo de como jugar.|
||Para:|Terminar el programa |
|**Criterios de aceptación**|<p>Generar un txt al oprimir ese botón x y la animación de muerte de un rey </p><p></p><p>Generar un video de explicación para generar un juego limpio a pesar de las restricciones </p><p></p>|


|**Historia de usuario Nro.**|1|Titulo:|Introducción al programa |
| - | - | - | - |
|<p>** </p><p>**Descripción**</p>|Como:|Usuario|
||Quiero:|Al iniciar el programa quiero que se genere una interface para la seleccionar del color de piezas, además de un video introductorio al juego |
||Para:|Tener un contexto del juego |
|**Criterios de aceptación**|` `Poder saltar el contexto mediante clicks,ademas poner el nombre en el label de la pieza deseada para seleccionar el color de pieza |

























2. Diseño

UML: <https://github.com/Deivis44/Udistrital_Java-Ajedrez/blob/main/INFORME%20%26%20UML/UML_FINAL.pdf>


|**Entidad – Clase**|***Descripción***|
| - | - |
|<p>Main</p><p> </p>|Es la clase principal, suministra la iniciación de todos los componentes esenciales del programa a través de la clase “Controlador” que a su vez inicia la clase “Vista”, en este caso hay una interfaz de usuario para que pueda colocar su nombre tanto el jugador 1 como jugador 2, y una vez esto esté terminado inicia otra ventana que realiza una sucesión de imágenes a modo de emular una historia con respecto a el juego, reflejando el comportamiento estándar de un videojuego.|
|Board|Es una clase esencial puesto que es la encargada de utilizar e implementar todas las clases útiles y necesarias para que el juego como tal pueda inicializarse, ya que en realidad este está encima de un <a name="_int_pmcgdqzy"></a>frame que tiene otras funcionalidades como música y botones para su control, es por esto que el <a name="_int_5kjonthr"></a>board adopta y complementa cada herramienta como las clases de las piezas, el movimiento del mouse, los jaques y demás.|


3. Codificación de la solución

*Link código*: <https://github.com/Deivis44/Udistrital_Java-Ajedrez>


*Clases importadas*

- ` `**java.awt.\***: Este paquete proporciona clases para la creación de interfaces de usuario (UI) y la manipulación de gráficos en Java. Incluye clases para ventanas, componentes, gráficos, colores, eventos, etc.
- **javax.swing.\***: Este paquete es una extensión del paquete **java.awt** y proporciona componentes de interfaz de usuario (UI) adicionales, como botones, etiquetas, paneles, cuadros de diálogo, etc., que son más flexibles y personalizables que los componentes de AWT.
- **java.awt.event.ActionEvent** y **java.awt.event.ActionListener**: Estas clases son parte del paquete **java.awt.event** y se utilizan para manejar eventos de acción en componentes de la interfaz de usuario. **ActionEvent** representa un evento de acción, mientras que **ActionListener** es una interfaz que debe implementarse para recibir y manejar los eventos de acción.
- **java.awt.image.BufferedImage**: Esta clase pertenece al paquete **java.awt.image** y se utiliza para manipular imágenes en formato de mapa de bits. Proporciona métodos para crear, cargar y manipular imágenes, así como para acceder y modificar los píxeles individuales de la imagen.
- **javax.imageio.ImageIO**: Esta clase se encuentra en el paquete **javax.imageio** y se utiliza para leer y escribir imágenes en varios formatos de archivo. Proporciona métodos estáticos para cargar imágenes desde archivos y guardar imágenes en archivos.
- **javax.sound.sampled.\***: Este paquete proporciona clases y interfaces para trabajar con sonidos en Java. Incluye clases para reproducir, grabar y manipular audio en formatos como WAV y MIDI.
- **java.io.File** y **java.io.IOException**: Estas clases son parte del paquete **java.io** y se utilizan para realizar operaciones de entrada/salida en archivos y directorios. **File** representa un archivo o directorio en el sistema de archivos, mientras que **IOException** es una excepción lanzada en caso de error de entrada/salida.
- **java.util.ArrayList** y **java.util.List**: Estas clases son parte del paquete **java.util** y se utilizan para trabajar con listas dinámicas en Java. **ArrayList** es una implementación de la interfaz **List** y proporciona métodos para agregar, eliminar y acceder a elementos en una lista.
- **java.awt.event.MouseAdapter** y **java.awt.event.MouseEvent**: Estas clases son parte del paquete **java.awt.event** y se utilizan para manejar eventos del mouse en la interfaz de usuario. **MouseAdapter** es una clase adaptadora que proporciona implementaciones predeterminadas de los métodos de la interfaz de escucha de eventos del mouse, mientras que **MouseEvent** representa un evento del mouse.
- **java.io.BufferedWriter** y **java.io.FileWriter**: Estas clases son parte del paquete **java.io** y se utilizan para escribir texto en archivos de manera eficiente. **BufferedWriter** es una clase que proporciona un búfer de escritura para mejorar el rendimiento de las operaciones de escritura, y **FileWriter** es una clase que se utiliza para escribir caracteres en un archivo.
- **java.util.Arrays**: Esta clase es parte del paquete **java.util** y proporciona métodos estáticos para manipular matrices (arrays) en Java. Incluye métodos para ordenar, buscar y realizar operaciones de comparación en matrices.
- **java.util.Random**: Esta clase es parte del paquete **java.util** y se utiliza para generar números aleatorios en Java. Proporciona métodos para generar valores aleatorios de diferentes tipos numéricos y establecer una semilla para generar secuencias repetibles de números aleatorios.
- **java.awt.Desktop** y **java.net.URI**: Estas clases son parte de los paquetes **java.awt** y **java.net**, respectivamente, y se utilizan para interactuar con el escritorio y abrir enlaces URI en el navegador web predeterminado. **Desktop** proporciona métodos para abrir archivos, URLs y realizar otras acciones en el entorno de escritorio, mientras que **URI** representa una referencia uniforme de recursos y se utiliza para trabajar con identificadores de recursos uniformes, como enlaces web.


4. Testeo


|**Entrada** |` `En el label poner los nombres para las selección de piezas, además de oprimir en el play para iniciar el juego |
| - | - |
|**Salida**||




*Casos de prueba (visibles)*

|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|Click en la introducción para saltarla ||


|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|La parición del movimiento posible de la pieza cuando esta se mueva||


|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|La muestra de los nombres de la interface a el juego ||


|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|Generación del .txt ||







|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|Las piezas no se salgan del tablero|Le devolución de las piezas al tablero si se intentan salir o si hacen un movimiento invalido|


|**Entradas de ejemplo**|**Salida de ejemplo**|
| - | - |
|Al oprimir los botones se tiene que generar con el de menos decrecer la música, con el de más crecer la música. el del centro pausar, el de la nota musical cambiar la música. el de “x” cerrar la ventana, el de interrogación enviar al video explicativo ||

||||
| :- | :-: | -: |