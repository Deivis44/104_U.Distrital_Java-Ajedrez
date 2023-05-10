package Juego.Piezas.Torres;

import javax.swing.*;
import Juego.Tablero;

public class F_Torres_n extends Tablero {

    public F_Torres_n() {
    }
    
    public static JComponent crearTorre1 () {
        ImageIcon imagenTorre1 = new ImageIcon("imagenes/Piezas/v2/5_torres/torre1_n.png");
        JButton torre1_n = new JButton(imagenTorre1);
        torre1_n.setBounds(100, 90, 60, 80);
        torre1_n.setOpaque(false);
        torre1_n.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(torre1_n);
    }

    public static JComponent crearTorre2 () {
        ImageIcon imagenTorre2 = new ImageIcon("imagenes/Piezas/v2/5_torres/torre1_n.png");
        JButton torre2_n = new JButton(imagenTorre2);
        torre2_n.setBounds(660, 90, 60, 80);
        torre2_n.setOpaque(false);
        torre2_n.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(torre2_n);
    }
}
