---
description: >-
  [06/05/23] – [14/05/23] | Desarrollo del funcionamiento y decodificación del
  ajedrez
cover: >-
  https://images.unsplash.com/photo-1516259762381-22954d7d3ad2?crop=entropy&cs=srgb&fm=jpg&ixid=M3wxOTcwMjR8MHwxfHNlYXJjaHwxfHxjb2RlfGVufDB8fHx8MTY4NDg3NDQ3OXww&ixlib=rb-4.0.3&q=85
coverY: 0
---

# Creación de la lógica del ajedrez

## Recursos

Luego de múltiples intentos entre ambos miembros del equipo nos topamos en un bucle al no poder mecanizar e idealizar todo el funcionamiento de un ajedrez, logramos desarrollar una base y poner las piezas en el tablero, pero todo el problema inicio una vez nos dimos cuenta de que todo debía estar dentro de una matriz para que las piezas pudieran moverse, aparte de ello; los eventos para el clic y movimiento del mouse seguían siendo un recurso de las bibliotecas de Java del cual no teníamos mucho dominio.

{% tabs %}
{% tab title="Intento #1" %}
<figure><img src="../.gitbook/assets/image (12).png" alt=""><figcaption></figcaption></figure>
{% endtab %}

{% tab title="Intento #2" %}
<figure><img src="../.gitbook/assets/Captura de pantalla 2023-05-14 195730.png" alt=""><figcaption></figcaption></figure>
{% endtab %}

{% tab title="Intento #3" %}
<figure><img src="../.gitbook/assets/image (1).png" alt=""><figcaption></figcaption></figure>
{% endtab %}
{% endtabs %}



Finalmente, recurrimos a analizar de múltiples proyectos subidos a la nube de precisamente un ajedrez en Java y en particular todos tenían su particularidad, pero nada más por fuera de lo normal, aparte de un bot para jugar contra el PC. Sin embargo, no encontramos forma de adaptar las ideas que encontramos a nuestra interfaz del tablero, pero luego de muchos experimentos fallidos nos topamos con la siguiente lista de reproducción de un joven que hizo su propio ajedrez y lo explicaba paso a paso.

{% embed url="https://youtube.com/playlist?list=PLl7KmbUadlDdXBA9TTVjpGguPoiXqF11R" %}

{% hint style="info" %}
Fue un proceso enriquecedor, ya antes de utilizar su código, nos dedicamos a analizar cada elemento y proceso de la realización del proyecto, permitiéndonos así darnos cuenta de nuestros errores y de igual forma brindándonos una base sobre como en realidad tenía que funcionar la base de todo un ajedrez.
{% endhint %}

{% hint style="warning" %}
El desarrollo del código se vio inmerso en múltiples IDE dedicados al lenguaje de programación Java, como IntelliJ y NetBeans, principalmente por sus herramientas versátiles y el debug del código.
{% endhint %}
