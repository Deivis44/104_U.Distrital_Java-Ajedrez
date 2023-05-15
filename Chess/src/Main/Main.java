package Main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        final String copyRight = "Universidad Distrital - Ajedrez | © 2023 by Santiago Pineda & David Muñoz";

        ImageIcon icono = new ImageIcon("imagenes/Recursos/icono.png");

        JFrame frame = new JFrame();
        frame.setIconImage(icono.getImage());
        frame.setTitle(copyRight);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(1400,940));
        frame.setLocationRelativeTo(null);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon fondo = new ImageIcon("imagenes/Previews/layout-juego7.png"); 
        JLabel imagen = new JLabel(fondo);
        imagen.setVisible(true);
        frame.add(imagen);

        Board board = new Board();
        board.setBounds(126, 85, 680, 680);
        imagen.add(board);

        frame.setVisible(true);
    }
}