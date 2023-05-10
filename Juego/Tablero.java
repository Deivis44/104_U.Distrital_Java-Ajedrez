package Juego;

import javax.swing.*;
import Juego.Peones.F_Peones_b;
import Juego.Peones.F_Peones_n;

public class Tablero extends JFrame{
    
    public JPanel panelPrincipal;
    public static JLabel imagen;
    
    F_Peones_b peones_b;
    F_Peones_n peones_n;
    
    public Tablero() {
        setTitle("U Distrital - Ajedrez");
        
        setSize(1200, 844);
        setLocationRelativeTo(null); // pone la ventana en el centro de la pantalla
        // setBounds(posX, posY, largo, ancho);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        fondo_juego();
        crear_botones_musica();
        generarPeones();
        generarTorres();
    }
    
    public void fondo_juego() {
        panelPrincipal = new JPanel();
        this.getContentPane().add(panelPrincipal);
        
        ImageIcon fondo = new ImageIcon("imagenes/Previews/layout-juego5.png"); 
        imagen = new JLabel(fondo);
        
        panelPrincipal.add(imagen);
    }
    
    private void crear_botones_musica () {
        ImageIcon imgBotonMusica = new ImageIcon("imagenes/Addons/musica.png");
        JButton botonMusica = new JButton(imgBotonMusica);
        botonMusica.setBounds(1026, 60, 50, 55);
        botonMusica.setOpaque(false); 
        botonMusica.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
    
        imagen.add(botonMusica);
        
        ImageIcon imgBotonSonidos = new ImageIcon("imagenes/Addons/sonidos.png");
        JButton botonSonidos = new JButton(imgBotonSonidos);
        botonSonidos.setBounds(1086, 60, 50, 55);
        botonSonidos.setOpaque(false);
        botonSonidos.setContentAreaFilled(false);
        // boton1.setBorderPainted(false);
    
        imagen.add(botonSonidos);
    }

    // ! creacion de botones de cada una de las piezas

    public void generarAlfiles () {

    }

    public void generarCaballos () {

    }

    public void generarPeones () {
        F_Peones_b.crearPeon1();
        F_Peones_b.crearPeon2();
        F_Peones_b.crearPeon3();
        F_Peones_b.crearPeon4();
        F_Peones_b.crearPeon5();
        F_Peones_b.crearPeon6();
        F_Peones_b.crearPeon7();
        F_Peones_b.crearPeon8();
        
        F_Peones_n.crearPeon1();
        F_Peones_n.crearPeon2();
        F_Peones_n.crearPeon3();
        F_Peones_n.crearPeon4();
        F_Peones_n.crearPeon5();
        F_Peones_n.crearPeon6();
        F_Peones_n.crearPeon7();
        F_Peones_n.crearPeon8();
    }

    public void generarReinas () {

    }

    public void generarReyes () {

    }

    public void generarTorres () {

    }
    
}