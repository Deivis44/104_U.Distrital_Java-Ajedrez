package A.Juego.Piezas.Peones;

import javax.swing.*;

import A.Juego.Tablero;

public class F_Peones_n extends Tablero {

    public final static void peones_n () {
        int x=95;
        int y=165;
        for (int i = 0; i < 8; i++) {
            ImageIcon imgPeon1_n = new ImageIcon("imagenes/Piezas/v2/1_peones/peon1_n.png");                
            JButton peon1_n = new JButton(imgPeon1_n);
            peon1_n.setBounds(x, y, 70, 80);
            peon1_n.setOpaque(false);
            peon1_n.setContentAreaFilled(false);
            // peon1_n.setBorderPainted(false);
            x += 80;
            imagen.add(peon1_n);

        }
    }

}