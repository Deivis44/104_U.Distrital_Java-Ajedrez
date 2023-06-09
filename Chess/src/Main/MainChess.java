package Main;

import Interfaz.MainInterfaz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class MainChess {

    private boolean musicPaused = false;
    private Clip clip; // musica en general
    private Clip clipClic; // Sonido de clic
    private FloatControl gainControl;
    private float volume = 0.0f; // Nivel de volumen inicial = 100%
    private List<String> canciones = Arrays.asList("battle1.wav", "battle2.wav", "icy.wav", "theme2.wav");
    private int indiceCancionActual = 0;
    private boolean reproduccionAleatoria = false;
    private boolean reproduccionEnBucle = false;

    public static JFrame frame = new JFrame();
    public void iniciar() {

        // titulo por consola
        final String copyRight = "Universidad Distrital - Ajedrez | © 2023";

        ImageIcon icono = new ImageIcon("imagenes/Recursos/icono.png");

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

        try {
            // Obtener el archivo de audio del sonido de clic
            AudioInputStream clickInputStream = AudioSystem.getAudioInputStream(Input.class.getResourceAsStream("/musica/efectos/mouse.wav"));
            // Cargar el clip de audio para el sonido de clic
            clipClic = AudioSystem.getClip();
            clipClic.open(clickInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        // ? seccion botones control
        ImageIcon imgBotonMusica = new ImageIcon("imagenes/Addons/musica.png");
        JButton botonMusica = new JButton(imgBotonMusica);
        botonMusica.setBounds(1220, 60, 50, 55);
        botonMusica.setOpaque(false); 
        botonMusica.setContentAreaFilled(false);
        botonMusica.setBorderPainted(false);
        imagen.add(botonMusica);

        botonMusica.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reproducirSonidoClic();
            }
        });

        ImageIcon imgBotonClose = new ImageIcon("imagenes/Addons/close.png");
        JButton botonClose = new JButton(imgBotonClose);
        botonClose.setBounds(1279, 60, 50, 55);
        botonClose.setOpaque(false);
        botonClose.setContentAreaFilled(false);
        botonClose.setBorderPainted(false);
        imagen.add(botonClose);
        botonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cierra la ventana actual
        
                String jaqueMate;
        
                if (Input.contador % 2 == 0) {
                    jaqueMate = "                                         |\n        ¡Jaque mate de blancas!          |\n";
                } else {
                    jaqueMate = "                                         |\n        ¡Jaque mate de negras!           |\n";
                }
        
                Input.logBuilder.append(jaqueMate).append(System.lineSeparator());
                Input.guardarLogEnArchivo("Chess_moves.txt");
            }
        });
        

        ImageIcon imgBotonInfo = new ImageIcon("imagenes/Addons/info.png");
        JButton botonInfo = new JButton(imgBotonInfo);
        botonInfo.setBounds(1215, 130, 120, 40);
        botonInfo.setOpaque(false);
        botonInfo.setContentAreaFilled(false);
        botonInfo.setBorderPainted(false);
        imagen.add(botonInfo);
        botonInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String videoURL = "https://www.youtube.com/watch?v=xGlpHZeNWUM";
                    Desktop.getDesktop().browse(new URI(videoURL));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });


        // ? seccion música
        ImageIcon imgBotonPausa = new ImageIcon("imagenes/Addons/pausa.png");
        JButton botonPausa = new JButton(imgBotonPausa);
        botonPausa.setBounds(1090, 65, 50, 50);
        botonPausa.setOpaque(false);
        botonPausa.setContentAreaFilled(false);
        botonPausa.setBorderPainted(false);
        imagen.add(botonPausa);

        botonPausa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reproducirSonidoClic();
            }
        });

        ImageIcon imgBotonMas = new ImageIcon("imagenes/Addons/mas.png");
        JButton botonMas = new JButton(imgBotonMas);
        botonMas.setBounds(1140, 65, 50, 50);
        botonMas.setOpaque(false);
        botonMas.setContentAreaFilled(false);
        botonMas.setBorderPainted(false);
        imagen.add(botonMas);

        botonMas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reproducirSonidoClic();
            }
        });

        ImageIcon imgBotonMenos = new ImageIcon("imagenes/Addons/menos.png");
        JButton botonMenos = new JButton(imgBotonMenos);
        botonMenos.setBounds(1040, 65, 50, 50);
        botonMenos.setOpaque(false);
        botonMenos.setContentAreaFilled(false);
        botonMenos.setBorderPainted(false);
        imagen.add(botonMenos);

        botonMenos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reproducirSonidoClic();
            }
        });


        // ? texareas
        JLabel player1 = new TransparentLabel(MainInterfaz.contenidoTextArea1);
        player1.setFont(new Font("Impact", Font.PLAIN, 24));
        player1.setHorizontalAlignment(SwingConstants.CENTER);
        player1.setBounds(940, 582, 90, 40);
        imagen.add(player1);

        JLabel player2 = new TransparentLabel(MainInterfaz.contenidoTextArea2);
        player2.setFont(new Font("Impact", Font.PLAIN, 24));
        player2.setHorizontalAlignment(SwingConstants.CENTER);
        player2.setBounds(1154, 582, 90, 40);
        imagen.add(player2);


        // ! inicializo tablero con todo el codigo del ajedrez
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

    private void reproducirSonidoClic() {
        if (clipClic != null) {
            clipClic.setFramePosition(0);
            clipClic.start();
        }
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

    private static class TransparentLabel extends JLabel {

        public TransparentLabel(String text) {
            super(text);
            setOpaque(false); // Hacer el JLabel transparente
        }

        @Override
        protected void paintComponent(Graphics g) {
            // Hacer que el fondo del JLabel sea transparente
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(new Color(0, 0, 0, 0)); // Color transparente
            g2d.fillRect(0, 0, getWidth(), getHeight());
            g2d.dispose();

            super.paintComponent(g);
        }
    }
}
