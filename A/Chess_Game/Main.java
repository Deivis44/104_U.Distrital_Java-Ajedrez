package A.Chess_Game;

import javax.swing.*;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame();
        ventana.getContentPane().setBackground(Color.BLACK);
        ventana.setTitle("U Distrital - Ajedrez");
        ventana.setMinimumSize(new Dimension(1200,840));
        ventana.setLocationRelativeTo(null);

        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(3);

        ImageIcon fondo = new ImageIcon("imagenes/Previews/layout-juego5.png"); 
        JLabel imagen = new JLabel(fondo);
        imagen.setVisible(true);
        ventana.add(imagen);
        
        Tablero tablero = new Tablero();
        tablero.setBounds(80, 110, 700, 700);
        imagen.add(tablero);
        
        ventana.setVisible(true);
    }
}
