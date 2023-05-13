package A.Chess_Game.Piezas;

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;

import A.Chess_Game.Tablero;

import java.awt.image.BufferedImage;

public class Pieza {
    
    public int columnas, filas;
    public int posX, posY;

    public boolean isWhite;
    public String name;
    public int value;

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));
         } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    protected int sheetScale = sheet.getWidth()/6;

    Image sprite;
    Tablero tablero;

    public Pieza(Tablero tablero) {
        this.tablero = tablero;
    }

    public void paint(Graphics2D g2d) {
        g2d.drawImage(sprite, posX, posY, null);
    }
}
