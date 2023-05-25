package Interfaz;

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.IOException;

public class MainInterfaz {
    public static void main(String[] args) {

        try {

            // ? musica
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(MainInterfaz.class.getResourceAsStream("/musica/theme1.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop

            // ventana
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

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}