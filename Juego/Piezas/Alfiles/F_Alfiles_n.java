package Juego.Piezas.Alfiles;

import javax.swing.*;
import Juego.Tablero;

public class F_Alfiles_n extends Tablero {

    public final static void alfiles_n () {
        int x=260;
        int y=90;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
            ImageIcon imagenCuadroX = new ImageIcon("imagenes/Piezas/v2/3_alfiles/alfil1_n.png");
            JButton cuadroX = new JButton(imagenCuadroX);
            cuadroX.setBounds(x, y, 60, 80);
            cuadroX.setOpaque(false);
            cuadroX.setContentAreaFilled(false);
            // boton1.setBorderPainted(false);
            x += 240;
            imagen.add(cuadroX);

        }
            }
        }
     }
