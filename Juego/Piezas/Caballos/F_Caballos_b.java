package Juego.Piezas.Caballos;

import javax.swing.*;
import Juego.Tablero;

public class F_Caballos_b extends Tablero {

    public F_Caballos_b () {
    }

    public static JComponent crearCaballo1 () {
        ImageIcon imagenCaballo1 = new ImageIcon("imagenes/Piezas/v2/3_caballos/caballo1_b.png");
        JButton caballo1_b = new JButton(imagenCaballo1);
        caballo1_b.setBounds(180, 575, 60, 80);
        caballo1_b.setOpaque(false);
        caballo1_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(caballo1_b);
    }

    public static JComponent crearCaballo2 () {
        ImageIcon imagenCaballo2 = new ImageIcon("imagenes/Piezas/v2/3_caballos/caballo1_b.png");
        JButton caballo2_b = new JButton(imagenCaballo2);
        caballo2_b.setBounds(580, 575, 60, 80);
        caballo2_b.setOpaque(false);
        caballo2_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(caballo2_b);
    }
}