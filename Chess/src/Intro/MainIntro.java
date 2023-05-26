package Intro;

import Main.MainChess;

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.IOException;
import java.awt.event.*;

public class MainIntro {

    private JFrame frame;
    private JLabel currentLabel;
    private ImageIcon[] images = {
            new ImageIcon("Chess/src/Intro/Imagenes/1.gif"),
            new ImageIcon("Chess/src/Intro/Imagenes/2.gif"),
            new ImageIcon("Chess/src/Intro/Imagenes/3.gif"),
            new ImageIcon("Chess/src/Intro/Imagenes/4.gif"),
            new ImageIcon("Chess/src/Intro/Imagenes/5.gif")
    };
    private int currentIndex = 0;

    private Clip clip;

    public MainIntro() {
        ImageIcon icono = new ImageIcon("imagenes/Recursos/icono3.png");
        final String title = "| CHESS |  Elije a tu personaje";

        frame = new JFrame();
        frame.setTitle(title);
        frame.setIconImage(icono.getImage());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1200, 900);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        currentLabel = new JLabel();
        currentLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentLabel.setVerticalAlignment(SwingConstants.CENTER);
        frame.add(currentLabel, BorderLayout.CENTER);

        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showNextImage();
            }
        });

        showNextImage();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        stopMusic();
                        MainChess main = new MainChess();
                        main.iniciar();
                    }
                });
            }
        });

        frame.setVisible(true);

        // Reproducir la canción de fondo
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(MainIntro.class.getResourceAsStream("/musica/title.wav"));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private void showNextImage() {
        if (currentIndex < images.length) {
            currentLabel.setIcon(images[currentIndex]);
            currentIndex++;
        } else {
            frame.dispose();
        }
    }

    private void stopMusic() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainIntro();
            }
        });
    }
}