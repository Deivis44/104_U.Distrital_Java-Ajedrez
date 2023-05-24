---
description: '[23/05/23] | Botones, eventos, espacios de texto y nueva interfaz'
---

# Funcionalidades

## Botones

A partir de ahora el propósito inicial es corregir y mejorar los pequeños huecos que el código original generaba, pero de forma simultánea se trabajó en el diseño de una nueva interfaz que en realidad viene antes de la ejecución del ajedrez. Esta es para pedirle al jugador 1 y 2 su nombre, además de la elección del color de su pieza.

Teniendo en cuenta esto, tanto la interfaz de inicio como el juego adoptaron botones para el control de los elementos adicionales que se tienen en mente, como el de la música en el caso del ajedrez.

<figure><img src="../.gitbook/assets/image (5).png" alt=""><figcaption><p>Botón del control de sonidos, control de música, espacio para campos de texto y contadores de piezas</p></figcaption></figure>

{% hint style="info" %}
Los espacios en blanco corresponden a la visualización del nombre ingresados una vez que la ventana de inicio sea ejecutada (antes del ajedrez). Cuando la ventana del juego se inicialice habrá música de fondo con en lo posible efecto de sonido para los movimientos de las piezas. Estos elementos sonoros pueden ser suprimidos con los botones y en el transcurso del juego se podrá ver un contador de piezas capturadas por parte de ambos jugadores
{% endhint %}



## Interfaz inicial

Es común notar que en los juegos siempre hay una pantalla de carga para establecer algunas características generales del juego, en este caso se creyó una nueva interfaz medianamente interactiva para que los jugadores puedan añadir su nombre o “nick” en un área de texto, también se puede interactuar con la representación gráfica de los reyes que representan a ambos jugadores, ejecutando un movimiento de ataque cuando se le da clic.

También se quiere implementar música al inicio con el fin de hacer más dinámico el proceso de selección.

<figure><img src="../.gitbook/assets/image (6).png" alt=""><figcaption></figcaption></figure>
