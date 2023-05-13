package A.Juego.Piezas.Caballos;

import javax.swing.*;

import A.Juego.Tablero;

public class F_Caballos_n extends Tablero {

    public F_Caballos_n () {
    }

    public static JComponent crearCaballo1 () {
        ImageIcon imagenCaballo1 = new ImageIcon("imagenes/Piezas/v2/3_caballos/caballo1_n.png");
        JButton caballo1_n = new JButton(imagenCaballo1);
        caballo1_n.setBounds(180, 90, 60, 80);
        caballo1_n.setOpaque(false);
        caballo1_n.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(caballo1_n);
    }

    public static JComponent crearCaballo2 () {
        ImageIcon imagenCaballo2 = new ImageIcon("imagenes/Piezas/v2/3_caballos/caballo1_n.png");
        JButton caballo2_n = new JButton(imagenCaballo2);
        caballo2_n.setBounds(580, 90, 60, 80);
        caballo2_n.setOpaque(false);
        caballo2_n.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
        return (JComponent) imagen.add(caballo2_n);
    }
}
