package Juego.Piezas.Reinas;

import javax.swing.*;
import Juego.Tablero;

public class F_Reina_n extends Tablero {

    public F_Reina_n() {
    }
    
    public static JComponent crearReina1 () {
        ImageIcon imagenReina1 = new ImageIcon("imagenes/Piezas/v2/9_reinas/reina1_n.png");
        JButton reina1_n = new JButton(imagenReina1);
        reina1_n.setBounds(340, 90, 60, 80);
        reina1_n.setOpaque(false);
        reina1_n.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(reina1_n);
    }
}