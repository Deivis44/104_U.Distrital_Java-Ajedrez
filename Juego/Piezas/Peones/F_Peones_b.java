package Juego.Piezas.Peones;

import javax.swing.*;
import Juego.Tablero;

public class F_Peones_b extends Tablero {

    public final static void peones_b () {
        int x=100;
        int y=515;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
            ImageIcon imagenCuadroX = new ImageIcon("imagenes/Piezas/v2/1_peones/peon1_b.png");
            JButton cuadroX = new JButton(imagenCuadroX);
            cuadroX.setBounds(x, y, 70, 80);
            cuadroX.setOpaque(false);
            cuadroX.setContentAreaFilled(false);
            // boton1.setBorderPainted(false);
            x += 80;
            imagen.add(cuadroX);

        }
            }
        }
}
