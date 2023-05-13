package A.Juego.Piezas.Torres;

import javax.swing.*;

import A.Juego.Tablero;

public class F_Torres_b extends Tablero {

    public F_Torres_b() {
    }
    
    public static JComponent crearTorre1 () {
        ImageIcon imagenTorre1 = new ImageIcon("imagenes/Piezas/v2/5_torres/torre1_b.png");
        JButton torre1_b = new JButton(imagenTorre1);
        torre1_b.setBounds(100, 575, 60, 80);
        torre1_b.setOpaque(false);
        torre1_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(torre1_b);
    }

    public static JComponent crearTorre2 () {
        ImageIcon imagenTorre2 = new ImageIcon("imagenes/Piezas/v2/5_torres/torre1_b.png");
        JButton torre2_b = new JButton(imagenTorre2);
        torre2_b.setBounds(660, 575, 60, 80);
        torre2_b.setOpaque(false);
        torre2_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(torre2_b);
    }
}
