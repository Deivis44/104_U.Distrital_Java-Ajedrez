---
description: '[28/04/23] Interfaz de usuario para cuando empiece la partida'
cover: >-
  https://images.unsplash.com/photo-1600132806608-231446b2e7af?crop=entropy&cs=srgb&fm=jpg&ixid=MnwxOTcwMjR8MHwxfHNlYXJjaHwzfHxsYXlvdXR8ZW58MHx8fHwxNjgyNzMyNzY0&ixlib=rb-4.0.3&q=85
coverY: 0
---

# Layout y add-ons

## Recursos

Teniendo en cuenta los elementos que nos brinda el paquete de java.Swing, crearemos el layout correspondiente con los elementos gráficos de los cuales disponemos. Para ello, creamos una interfaz gráfica por default que el usuario encontrara siempre que ejecute el programa.

<figure><img src="../.gitbook/assets/image (9).png" alt="" width="455"><figcaption></figcaption></figure>

### Proceso

<figure><img src="../.gitbook/assets/image (6).png" alt=""><figcaption><p>Desarrollo del layout</p></figcaption></figure>

A partir de medidas específicas y por medio de aplicaciones para el manejo de imágenes como Photoshop e Illustrator, proponemos una vista previa del juego como tal, organizada por paneles para que se implementen de igual forma en el ejecutable de Java. Con ayuda de los paneles, añadiremos unos dentro de otros, logrando formar el formato deseado. Hay que tener en cuenta, sin embargo, que esto solo es una imagen, y para que el usuario pueda interactuar con los supuestos botones que ve, se generara una capa superior que no tendrá visibilidad con la cual es usuario podrá interactuar siempre que de clic a un supuesto botón.

<figure><img src="../.gitbook/assets/layout-medidas.png" alt=""><figcaption><p>Medidas en píxeles de la ventana predeterminada para la ejecución del juego (1200 x 800)</p></figcaption></figure>

{% tabs %}
{% tab title="Preview 1" %}
<figure><img src="../.gitbook/assets/layout-juego1.png" alt=""><figcaption><p>Tablero sin notación y sin contadores</p></figcaption></figure>
{% endtab %}

{% tab title="Preview 2" %}
<figure><img src="../.gitbook/assets/layout-juego2.png" alt=""><figcaption><p>Tablero sin notación y con contadores</p></figcaption></figure>
{% endtab %}

{% tab title="Preview 3" %}
<figure><img src="../.gitbook/assets/layout-juego3.png" alt=""><figcaption><p>Tablero con notación y sin contadores</p></figcaption></figure>
{% endtab %}

{% tab title="Preview 4" %}
<figure><img src="../.gitbook/assets/layout-juego4.png" alt=""><figcaption><p>Tablero con notación y contadores</p></figcaption></figure>
{% endtab %}
{% endtabs %}

{% hint style="info" %}
Los puntos que sobresalen alrededor de las piezas del jugador 1 y jugador 2, hacen de contadores para la cantidad de piezas que cada jugador haya capturado, por ende, si el jugador 1 ha capturado 3 peones, el pequeño círculo que sobresale para en la imagen de los peones negros será el número 3. Cabe recalcar que los contadores varían por pieza y el rey no está incluido.
{% endhint %}

## Cambios

{% hint style="danger" %}
Se tenía, como idea, darle la oportunidad al usuario de intercambiar visualmente los tableros, pero surgió un problema ante ello y es que esto modificaba por completo la visualización de nuestro programa, obligándonos a fabricar una interfaz gráfica nueva que podía resultar en algo poco eficiente.
{% endhint %}

{% hint style="success" %}
Sin embargo, hay adicionales que buscamos implementar como los botones superiores que permitirán al usuario en dado caso reproducir música de fondo o eliminar los efectos de sonido, así mismo, devolverlos.
{% endhint %}

{% embed url="https://www.youtube.com/watch?t=288s&v=5bn3Jmvep1k" %}
Hay contenido gratuito al que podemos acceder para ambientar un poco más el juego, siguiendo un estilo retro por el diseño pixel art. En dado caso de poder implementarlo; usaremos algunas de las canciones aquí presentes. Igualmente, el jugador tiene la opción de desactivarla, así como los efectos de sonido de las piezas y demás elementos.
{% endembed %}
