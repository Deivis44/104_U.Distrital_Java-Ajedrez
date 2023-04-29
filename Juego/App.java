package Juego;

import javax.swing.JFrame;

public class App

{

public static void main(String[] args)

{

// crea un panel que contiene nuestro dibujo

PanelEtiqueta panelE = new PanelEtiqueta();

// crea un nuevo marco para contener el panel

JFrame aplicacion = new JFrame("Prueba de Etiqueta");

aplicacion.add(panelE); // agrega el panel al marc

aplicacion.setSize(1200, 800); // establece el tamaño del marco

aplicacion.setVisible(true);//hace el marco visible

// establece el marco para salir cuando se cierre

aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

} // fin de la clase App