package Juego.Piezas.Reinas;

import javax.swing.*;
import Juego.Tablero;

public class F_Reina_b extends Tablero {

    public F_Reina_b () {
    }
    
    public static JComponent crearReina1 () {
        ImageIcon imagenReina1 = new ImageIcon("imagenes/Piezas/v2/9_reinas/reina1_b.png");
        JButton reina1_b = new JButton(imagenReina1);
        reina1_b.setBounds(340, 575, 60, 80);
        reina1_b.setOpaque(false);
        reina1_b.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(reina1_b);
    }
}
