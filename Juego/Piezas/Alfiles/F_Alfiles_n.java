package Juego.Piezas.Alfiles;

import javax.swing.*;
import Juego.Tablero;

public class F_Alfiles_n extends Tablero {

    public F_Alfiles_n () {
    }

    public static JComponent crearAlfil1 () {
        ImageIcon imagenAlfil1 = new ImageIcon("imagenes/Piezas/v2/3_alfiles/alfil1_n.png");
        JButton alfil1_b = new JButton(imagenAlfil1);
        alfil1_b.setBounds(260, 90, 60, 80);
        alfil1_b.setOpaque(false);
        alfil1_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(alfil1_b);
    }

    public static JComponent crearAlfil2 () {
        ImageIcon imagenAlfil1 = new ImageIcon("imagenes/Piezas/v2/3_alfiles/alfil1_n.png");
        JButton alfil2_b = new JButton(imagenAlfil1);
        alfil2_b.setBounds(500, 90, 60, 80);
        alfil2_b.setOpaque(false);
        alfil2_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(alfil2_b);
    }
}