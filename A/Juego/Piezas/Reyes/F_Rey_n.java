package A.Juego.Piezas.Reyes;

import javax.swing.*;

import A.Juego.Tablero;

public class F_Rey_n extends Tablero {

    public F_Rey_n () {
    }
    
    public static JComponent crearRey1 () {
        ImageIcon imagenRey1 = new ImageIcon("imagenes/Piezas/v2/reyes/rey1_n.png");
        JButton rey_b = new JButton(imagenRey1);
        rey_b.setBounds(420, 90, 60, 80);
        rey_b.setOpaque(false);
        rey_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(rey_b);
    }
}