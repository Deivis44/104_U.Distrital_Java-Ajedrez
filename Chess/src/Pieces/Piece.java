package Pieces;

import Main.Board;

import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Piece {

    public int col, row;
    public int xPos, yPos;

    public boolean isWhite;
    public String name;
    public int value;

    public boolean isFistMove = true;

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(new FileInputStream("Chess/src/Images/pieces2.png")); // or "Udistrital_Java_Ajedrez/Chess/src/Images/pieces.png"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    protected int getSheetScale = sheet.getWidth()/6;
    protected int sheetScale = sheet.getWidth()/6;

    Image sprite;
    Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public boolean isValidMovement(int col, int row) {return true;}
    public boolean moveCollidesWithPiece(int col, int row) {return false;}

    public void paint(Graphics2D g2d) {
        g2d.drawImage(sprite, xPos, yPos, null);
    }
}