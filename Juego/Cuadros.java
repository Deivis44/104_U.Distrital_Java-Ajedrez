package Juego;

import javax.swing.*;

public class Cuadros extends Tablero {
    
    public Cuadros () {
    }
    
    public static void crearCuadro1 (int x, int y) {
        
        for (int ii = 0; ii < 8; ii++) {
            ImageIcon imagenCuadroX = new ImageIcon("imagenes/Piezas/v2/1_peones/peon1_b.png");
            JButton cuadroX = new JButton(imagenCuadroX);
            cuadroX.setBounds(x, y, 70, 80);
            cuadroX.setOpaque(false);
            cuadroX.setContentAreaFilled(false);
            // boton1.setBorderPainted(false);
            x += 80;
            imagen.add(cuadroX);

            for (int jj = 0; jj < 8; jj++) {
                    ImageIcon imagenCuadroY = new ImageIcon("imagenes/Piezas/v2/1_peones/peon1_n.png");
                    JButton cuadroY = new JButton(imagenCuadroY);
                    cuadroY.setBounds(x, y, 70, 80);
                    cuadroY.setOpaque(false);
                    cuadroY.setContentAreaFilled(false);
                    // boton1.setBorderPainted(false);
                    y += 100;
                    imagen.add(cuadroY);
                }
            }
        }
    }
