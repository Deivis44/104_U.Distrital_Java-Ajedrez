package Main;

import javax.swing.*;

import java.awt.*;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainChess {

    private Clip clip;
    private float volume = 0.0f; // Nivel de volumen inicial = 100%
    private List<String> canciones = Arrays.asList("battle1.wav", "battle2.wav", "icy.wav", "theme2.wav");
    private boolean musicPaused = false;
    private FloatControl gainControl;

    private int indiceCancionActual = 0;
    private boolean reproduccionAleatoria = false;
    private boolean reproduccionEnBucle = false;

    public void iniciar() {

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

        ImageIcon imgBotonPausa = new ImageIcon("imagenes/Addons/pausa.png");
        JButton botonPausa = new JButton(imgBotonPausa);
        botonPausa.setBounds(1090, 65, 50, 50);
        botonPausa.setOpaque(false);
        botonPausa.setContentAreaFilled(false);
        botonPausa.setBorderPainted(false);
        imagen.add(botonPausa);

        ImageIcon imgBotonMas = new ImageIcon("imagenes/Addons/mas.png");
        JButton botonMas = new JButton(imgBotonMas);
        botonMas.setBounds(1140, 65, 50, 50);
        botonMas.setOpaque(false);
        botonMas.setContentAreaFilled(false);
        botonMas.setBorderPainted(false);
        imagen.add(botonMas);

        ImageIcon imgBotonMenos = new ImageIcon("imagenes/Addons/menos.png");
        JButton botonMenos = new JButton(imgBotonMenos);
        botonMenos.setBounds(1040, 65, 50, 50);
        botonMenos.setOpaque(false);
        botonMenos.setContentAreaFilled(false);
        botonMenos.setBorderPainted(false);
        imagen.add(botonMenos);


        // inicializo tablero con todo el codigo del ajedrez
        Board board = new Board();
        board.setBounds(126, 85, 680, 680);
        imagen.add(board);

        frame.setVisible(true);

        try {
            // Obtener el archivo de audio
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(MainChess.class.getResourceAsStream("/musica/" + canciones.get(indiceCancionActual)));

            // Cargar el clip de audio
            clip = AudioSystem.getClip();
            clip.open(inputStream);

            // Obtener el control de volumen del clip
            gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            // Ajustar el volumen inicial
            gainControl.setValue(volume);

            // Reproducir en bucle continuo
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        botonPausa.addActionListener(e -> {
            if (musicPaused) {
                clip.start(); // Reanudar la reproducción de la música
                musicPaused = false;
            } else {
                clip.stop(); // Pausar la reproducción de la música
                musicPaused = true;
            }
        });

        botonMas.addActionListener(e -> {
            if (volume < 0.0f) {
                volume += 5.0f; // Incrementar el volumen en 5 decibelios
                gainControl.setValue(volume); // Aplicar el nuevo volumen al control
            }
        });

        botonMenos.addActionListener(e -> {
            if (volume > -80.0f) {
                volume -= 5.0f; // Decrementar el volumen en 5 decibelios
                gainControl.setValue(volume); // Aplicar el nuevo volumen al control
            }
        });

        botonMusica.addActionListener(e -> {
            reproducirSiguienteCancion();
        });
    }

    private void reproducirSiguienteCancion() {
        if (reproduccionAleatoria) {
            reproducirCancionAleatoria();
        } else if (reproduccionEnBucle) {
            reproducirCancionEnBucle();
        } else {
            reproducirCancionSiguiente();
        }
    }

    private void reproducirCancionSiguiente() {
        if (indiceCancionActual < canciones.size() - 1) {
            indiceCancionActual++;
        } else {
            indiceCancionActual = 0;
        }
        reproducirCancion(indiceCancionActual);
    }

    private void reproducirCancionAleatoria() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(canciones.size());
        reproducirCancion(indiceAleatorio);
    }

    private void reproducirCancionEnBucle() {
        reproducirCancion(indiceCancionActual);
    }

    private void reproducirCancion(int indice) {
        try {
            clip.stop();
            clip.close();

            AudioInputStream inputStream = AudioSystem.getAudioInputStream(MainChess.class.getResourceAsStream("/musica/" + canciones.get(indice)));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(volume);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }     
}
