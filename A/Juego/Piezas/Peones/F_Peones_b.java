package A.Juego.Piezas.Peones;

import javax.swing.*;

import A.Juego.Tablero;

public class F_Peones_b extends Tablero  {

    public final static void peones_b () {
        int x=95;
        int y=515;
        for (int i = 0; i < 8; i++) {
            ImageIcon imgPeon1_b = new ImageIcon("imagenes/Piezas/v2/1_peones/peon1_b.png");
            JButton peon1_b = new JButton(imgPeon1_b);
            peon1_b.setBounds(x, y, 70, 80);
            peon1_b.setOpaque(false);
            peon1_b.setContentAreaFilled(false);
            peon1_b.setBorderPainted(false);
            x += 80;
            imagen.add(peon1_b);

        }
    }
}