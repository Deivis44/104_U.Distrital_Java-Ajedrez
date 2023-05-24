---
description: >-
  [14/05/23] | Adaptación del nuevo motor funcional del ajedrez a la interfaz de
  usuario propuesta
---

# Layout final

## Cambios

Una vez aplicado y analizado el código del joven, adaptamos y añadimos algunas mejoras a lo largo del proceso, por sobre todo encontramos algunos baches y adicionales que podrían nutrir y mejorar el código para hacerlo a prueba de tontos. Entre ellos destaca:



1. Algunas piezas se podían salir del tablero, ya que en realidad la forma de trabajar del tablero es creando una matriz a partir de una imagen, pero no existía la limitación de que alguna ficha superara el límite propuesto.
2. La coronación existía, pero solo hacía que el peón adquiriera la forma de la reina cuando en realidad se supone que el jugador puede elegir la pieza a su gusto (excluyendo la misma)
3. Había Jaque para ambos reyes, pero nunca un mate, pero existía la posibilidad de matar a la otra pieza; sin embargo, la idea es que apenas este pase, surja una pantalla final del ganador del juego (Personaje 1 o Personaje 2).



## Nuevo diseño

<figure><img src="../.gitbook/assets/layout-juego7.png" alt=""><figcaption></figcaption></figure>

{% hint style="info" %}
El espacio en blanco pertenece a las clases aparte que fueron codificadas para generar el tablero de ajedrez y todas sus funcionalidades. Una vez todo hecho se trae todo el proceso a la ventana de ejecución
{% endhint %}

<figure><img src="../.gitbook/assets/image (8).png" alt=""><figcaption><p>Ajedrez en ejecución</p></figcaption></figure>
