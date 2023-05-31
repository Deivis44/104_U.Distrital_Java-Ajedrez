package Interfaz;


import Intro.MainIntro;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;

public class MainInterfaz {

    public JTextArea textArea1;
    public JTextArea textArea2;
    public static String contenidoTextArea1;
    public static String contenidoTextArea2;

    public JTextArea textArea;

    public void iniciar() {

        // ! musica
        final Clip[] clip = new Clip[1]; // Declarar un arreglo final de Clip para acceder a él desde el ActionListener
        try {
            // música
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(MainInterfaz.class.getResourceAsStream("/musica/theme1.wav"));
            clip[0] = AudioSystem.getClip();
            clip[0].open(inputStream);
            clip[0].loop(Clip.LOOP_CONTINUOUSLY); // Loop
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        // ? JFrame
        ImageIcon icono = new ImageIcon("Chess/src/Interfaz/Imagenes/icon.png");
        final String title = "| CHESS |  Elije a tu personaje";

        JFrame frame = new JFrame();
        frame.setIconImage(icono.getImage());
        frame.setTitle(title);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(1200,715));
        frame.setLocationRelativeTo(null);
        
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon fondo = new ImageIcon("Chess/src/Interfaz/Imagenes/dragon_resize2.gif");
        JLabel imagen = new JLabel(fondo);
        imagen.setVisible(true);
        frame.add(imagen);

        frame.setVisible(true);


        // titulo
        ImageIcon titulo = new ImageIcon("Chess/src/Interfaz/Addons/title.gif");
        JLabel imgtitulo1 = new JLabel(titulo);
        imgtitulo1.setBounds(0, 48, 470, 185);
        imgtitulo1.setVisible(true);
        imagen.add(imgtitulo1);
        
        // puntero rey1
        ImageIcon flecha1 = new ImageIcon("Chess/src/Interfaz/Addons/arrow.gif");
        JLabel imgflecha1 = new JLabel(flecha1);
        imgflecha1.setBounds(725, 340, 50, 50);
        imgflecha1.setVisible(true);
        imagen.add(imgflecha1);

        // puntero rey2
        ImageIcon flecha2 = new ImageIcon("Chess/src/Interfaz/Addons/arrow.gif");
        JLabel imgflecha2 = new JLabel(flecha2);
        imgflecha2.setBounds(895, 340, 50, 50);
        imgflecha2.setVisible(true);
        imagen.add(imgflecha2);

        // rey blanco
        ImageIcon rey1 = new ImageIcon("Chess/src/Interfaz/Sprites/Rey Blanco/idle.gif");
        JLabel imgrey1 = new JLabel(rey1);
        imgrey1.setBounds(680, 400, 120, 120);
        imgrey1.setVisible(true);
        imagen.add(imgrey1);

        // rey negro
        ImageIcon rey2 = new ImageIcon("Chess/src/Interfaz/Sprites/Rey Negro/idle.gif");
        JButton imgrey2 = new JButton(rey2);
        imgrey2.setBounds(875, 400, 120, 120);
        imgrey2.setOpaque(false);
        imgrey2.setContentAreaFilled(false);
        imgrey2.setBorderPainted(false);
        imgrey2.setVisible(true);
        imagen.add(imgrey2);


        // botones
        ImageIcon imgPlay = new ImageIcon("imagenes/Addons/play.png");
        JButton btnPlay = new JButton(imgPlay);
        btnPlay.setBounds(36, 563, 150, 90);
        btnPlay.setOpaque(false); 
        btnPlay.setContentAreaFilled(false);
        btnPlay.setBorderPainted(false);
        btnPlay.setVisible(true);
        imagen.add(btnPlay);

        btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clip[0] != null && clip[0].isRunning()) {
                    clip[0].stop(); // Detiene la reproducción del audio
                }

                frame.dispose(); // Cierra la ventana actual

                // Obtener el contenido de los JTextAreas
                contenidoTextArea1 = textArea1.getText();
                contenidoTextArea2 = textArea2.getText();

                // Código para abrir la nueva ventana
                MainIntro intro = new MainIntro();
                intro.iniciar();
            }
        });
        

        // ImageIcon imgP1 = new ImageIcon("imagenes/Addons/player1.png");
        // JLabel P1 = new JLabel(imgP1);
        // P1.setBounds(196, 608, 105, 45);
        // P1.setVisible(true);
        // imagen.add(P1);

        // ImageIcon imgP2 = new ImageIcon("imagenes/Addons/player2.png");
        // JLabel P2 = new JLabel(imgP2);
        // P2.setBounds(309, 608, 105, 45);
        // P2.setVisible(true);
        // imagen.add(P2);

        // Text Area personalizado con imagen de fondo
        textArea1 = new CustomTextArea("imagenes/Addons/player1.png");
        textArea1.setBounds(196, 608, 105, 45);
        imagen.add(textArea1);

        textArea2 = new CustomTextArea("imagenes/Addons/player2.png");
        textArea2.setBounds(309, 608, 105, 45);
        imagen.add(textArea2);
    }

    private static class CustomTextArea extends JTextArea {

        private BufferedImage backgroundImage;

        public CustomTextArea(String imageFilePath) {
            // Cargar la imagen de fondo
            try {
                backgroundImage = ImageIO.read(new File(imageFilePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            setOpaque(false); // Hacer que el JTextArea sea transparente
            setFont(new Font("Impact", Font.PLAIN, 30)); // Establecer la fuente del texto
            
        }

        @Override
        protected void paintComponent(Graphics g) {
            // Dibujar la imagen de fondo
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
            super.paintComponent(g);
        }
    }
}