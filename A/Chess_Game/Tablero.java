package A.Chess_Game;

import java.awt.*;
import javax.swing.*;

import A.Chess_Game.Piezas.Pieza;
import A.Chess_Game.Piezas.Rey;

import java.util.ArrayList;

public class Tablero extends JPanel{

    public int tamaño = 80;

    int columnas = 8;
    int filas = 8;

    ArrayList<Pieza> listaPiezas = new ArrayList<>();

    public Tablero() {
        this.setPreferredSize(new Dimension(columnas * tamaño, filas * tamaño));
    }

    public void addPiezas() {
        listaPiezas.add(new Rey(this, 2, 0, false));
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                g2d.setColor((c + f) % 2 == 0 ? Color.BLACK : Color.WHITE); // new Color(0, 0, 0, 0)
                g2d.fillRect(c * 80, f * 70, tamaño, tamaño);
            }
        }

        for (Pieza pieza: listaPiezas) {
            pieza.paint(g2d);
        }
    }
}
