package A.Chess_Game.Piezas;

import java.awt.image.BufferedImage;

import A.Chess_Game.Tablero;

public class Rey extends Pieza {

    public Rey(Tablero tablero, int columnas, int filas, boolean isWhite) {
        super(tablero);
        this.columnas = columnas;
        this.filas = filas;
        this.posX = columnas * tablero.tamaño;
        this.posY = columnas * tablero.tamaño;

        this.isWhite = isWhite;
        this.name = "Rey";

        this.sprite = sheet.getSubimage(3 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(sheetScale, sheetScale, BufferedImage.SCALE_SMOOTH);

    }
}
