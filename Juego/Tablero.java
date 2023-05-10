package Juego;

import javax.swing.*;

import Juego.Piezas.Alfiles.*;
import Juego.Piezas.Caballos.*;
import Juego.Piezas.Peones.*;
import Juego.Piezas.Reinas.*;
import Juego.Piezas.Reyes.*;
import Juego.Piezas.Torres.*;

public class Tablero extends JFrame{
    
    public JPanel panelPrincipal;
    public static JLabel imagen;
    
    F_Alfiles_b alfiles_b;
    F_Alfiles_n alfiles_n;

    F_Caballos_b caballos_b;
    F_Caballos_n caballos_n;

    F_Peones_b peones_b;
    F_Peones_n peones_n;

    F_Reina_b reina_b;
    F_Reina_n reina_n;

    F_Rey_b rey_b;
    F_Rey_n rey_n;

    F_Torres_b torres_b;
    F_Torres_n torres_n;
    
    public Tablero() {
        setTitle("U Distrital - Ajedrez");
        
        setSize(1200, 844);
        setLocationRelativeTo(null); // pone la ventana en el centro de la pantalla
        // setBounds(posX, posY, largo, ancho);
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fondo_juego();
        crear_botones_musica();

        generarTorresBlancas();
        generarCaballosBlancos();
        generarAlfilesBlancos();
        generarReinaBlanca();
        generarReyBlanco();
        generarPeonesBlancos();

        generarPeonesNegros();
        generarTorresNegras();
        generarCaballosNegros();
        generarAlfilesNegros();
        generarReinaNegra();
        generarReyNegro();
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
        botonMusica.setBorderPainted(false);
    
        imagen.add(botonMusica);
        
        ImageIcon imgBotonSonidos = new ImageIcon("imagenes/Addons/sonidos.png");
        JButton botonSonidos = new JButton(imgBotonSonidos);
        botonSonidos.setBounds(1084, 60, 50, 55);
        botonSonidos.setOpaque(false);
        botonSonidos.setContentAreaFilled(false);
        botonSonidos.setBorderPainted(false);
    
        imagen.add(botonSonidos);
    }

    // ! creacion de botones de cada una de las piezas

    public void generarAlfilesBlancos () {
        F_Alfiles_b.crearAlfil1();
        F_Alfiles_b.crearAlfil2();
    }
    public void generarAlfilesNegros () {
        F_Alfiles_n.crearAlfil1();
        F_Alfiles_n.crearAlfil2();
    }

    public void generarCaballosBlancos () {
        F_Caballos_b.crearCaballo1();
        F_Caballos_b.crearCaballo2();
    }
    public void generarCaballosNegros () {
        F_Caballos_n.crearCaballo1();
        F_Caballos_n.crearCaballo2();
    }

    public void generarPeonesBlancos () {
        F_Peones_b.crearPeon1();
        F_Peones_b.crearPeon2();
        F_Peones_b.crearPeon3();
        F_Peones_b.crearPeon4();
        F_Peones_b.crearPeon5();
        F_Peones_b.crearPeon6();
        F_Peones_b.crearPeon7();
        F_Peones_b.crearPeon8();
    }
    public void generarPeonesNegros () {
        F_Peones_n.crearPeon1();
        F_Peones_n.crearPeon2();
        F_Peones_n.crearPeon3();
        F_Peones_n.crearPeon4();
        F_Peones_n.crearPeon5();
        F_Peones_n.crearPeon6();
        F_Peones_n.crearPeon7();
        F_Peones_n.crearPeon8();
    }

    public void generarReinaBlanca () {
        F_Reina_b.crearReina1();
    }
    public void generarReinaNegra () {
        F_Reina_n.crearReina1();
    }

    public void generarReyBlanco () {
        F_Rey_b.crearRey1();
    }
    public void generarReyNegro () {
        F_Rey_n.crearRey1();
    }

    public void generarTorresBlancas () {
        F_Torres_b.crearTorre1();
        F_Torres_b.crearTorre2();
    }
    public void generarTorresNegras () {
        F_Torres_n.crearTorre1();
        F_Torres_n.crearTorre2();
    }
}