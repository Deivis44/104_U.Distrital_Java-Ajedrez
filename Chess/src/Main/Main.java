package Main;

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {

            final String copyRight = "Universidad Distrital - Ajedrez | © 2023";

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

            // añado botones
            ImageIcon imgBotonMusica = new ImageIcon("imagenes/Addons/musica.png");
            JButton botonMusica = new JButton(imgBotonMusica);
            botonMusica.setBounds(1225, 60, 50, 55);
            botonMusica.setOpaque(false); 
            botonMusica.setContentAreaFilled(false);
            botonMusica.setBorderPainted(false);
            imagen.add(botonMusica);

            ImageIcon imgBotonSonidos = new ImageIcon("imagenes/Addons/sonidos.png");
            JButton botonSonidos = new JButton(imgBotonSonidos);
            botonSonidos.setBounds(1280, 60, 50, 55);
            botonSonidos.setOpaque(false);
            botonSonidos.setContentAreaFilled(false);
            botonSonidos.setBorderPainted(false);
            imagen.add(botonSonidos);


            // inicializo tablero con todo el codigo del ajedrez
            Board board = new Board();
            board.setBounds(126, 85, 680, 680);
            imagen.add(board);

            frame.setVisible(true);

            // ? musica
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Main.class.getResourceAsStream("/Interfaz/musica/theme2.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        
    }
}