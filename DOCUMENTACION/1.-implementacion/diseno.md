---
description: '[27/04/23] | Interfaz y aplicación'
cover: >-
  https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/00f280f8-0416-483f-bfa1-ef143c271d9e/dequx4w-86f1e7c9-47d2-40de-b185-5df5ce9a0c46.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzAwZjI4MGY4LTA0MTYtNDgzZi1iZmExLWVmMTQzYzI3MWQ5ZVwvZGVxdXg0dy04NmYxZTdjOS00N2QyLTQwZGUtYjE4NS01ZGY1Y2U5YTBjNDYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.AzinLuJbwkpbtzhnc6pYd7r9UjaR1wM24e3Boj_tET0
coverY: 39
---

# Diseño

## Piezas

Luego de entrar un poco más en contexto con respecto a las herramientas que pueden ser usadas, encontramos la biblioteca java.Swing que nos permitirá interactuar con elementos gráficos brindando una interfaz gráfica de usuario amigable que se basa en el estilo que queríamos implementar.

{% tabs %}
{% tab title="Primera opción" %}
{% embed url="https://nulltale.itch.io/chess" %}

<figure><img src="../.gitbook/assets/image (12).png" alt=""><figcaption></figcaption></figure>
{% endtab %}

{% tab title="Segunda opción" %}
{% embed url="https://bzgamedev.itch.io/pixel-art-chess-set" %}

<figure><img src="../.gitbook/assets/image (1).png" alt=""><figcaption></figcaption></figure>
{% endtab %}
{% endtabs %}

Teniendo en cuenta que no disponíamos de la habilidad para crear por nuestra cuenta piezas de ajedrez con este estilo, recurrimos a diversas páginas web que proporcionan contenido gratuito para recursos como estos. El autor de los mismos ofrece todos los demás elementos visuales para producir nuestro tablero de ajedrez bajo la misma temática.

{% hint style="info" %}
Optamos por la segunda opción, aunque trabajaremos con algunos elementos de la primera también. La segunda opción dispone de una variedad más amplia de caracteristicas graficas para una interfaz de usuario mucho mas personalizada. Ademas se le puede agregar un efecto de movimiento a cada ficha como si tuviera movimiento, similar a los sprites.

<img src="../.gitbook/assets/ChessSetPreview.gif" alt="" data-size="original"><img src="../.gitbook/assets/ChessSetPreview2.gif" alt="" data-size="original">
{% endhint %}

## Tablero

<figure><img src="../.gitbook/assets/image (10).png" alt=""><figcaption></figcaption></figure>

### Adicionales

<figure><img src="../.gitbook/assets/image (3).png" alt=""><figcaption></figcaption></figure>

Con la ayuda de estas pequeñas interfaces adicionales podemos brindar y agregar acciones a cada una de ellas para que el usuario pueda interactuar brindando una mejor experiencia

{% embed url="https://github.com/Deivis44/Udistrital_Java-Ajedrez/tree/main/imagenes" %}
Cada uno de los elementos será separado de la imagen completa y guardado en la carpeta principal del proyecto que contiene todos los archivos de ejecución&#x20;
{% endembed %}
