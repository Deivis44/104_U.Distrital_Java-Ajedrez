package Main;

import Pieces.Piece;

import javax.sound.sampled.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Input extends MouseAdapter {
    
    Board board;
    Clip clickSound; // Clip para el sonido de clic;
    Clip errorSound; // Clip para el sonido de error

    public Input(Board board) {
        this.board = board;

        try {
            // Obtener el archivo de audio del sonido de clic
            AudioInputStream clickInputStream = AudioSystem.getAudioInputStream(Input.class.getResourceAsStream("/musica/efectos/click.wav"));
            // Cargar el clip de audio para el sonido de clic
            clickSound = AudioSystem.getClip();
            clickSound.open(clickInputStream);

            // Obtener el archivo de audio del sonido de error
            AudioInputStream errorInputStream = AudioSystem.getAudioInputStream(Input.class.getResourceAsStream("/musica/efectos/error.wav"));
            // Cargar el clip de audio para el sonido de error
            errorSound = AudioSystem.getClip();
            errorSound.open(errorInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int col = e.getX() / board.tileSize;
        int row = e.getY() / board.tileSize;

        Piece pieceXY = board.getPiece(col, row);

        if (pieceXY != null) {
            board.selectedPiece = pieceXY;
            reproducirSonido(clickSound);
        }
    }


    boolean turnoBlancas = true; 
    
    int contador = 1;
    @Override
    public void mouseReleased(MouseEvent e) {
        int col = e.getX() / board.tileSize;
        int row = e.getY() / board.tileSize;

        if (board.selectedPiece != null) {
            Move move = new Move(board, board.selectedPiece, col, row);

            if (board.isValidMove(move) && ((turnoBlancas && board.selectedPiece.isWhite) || (!turnoBlancas && !board.selectedPiece.isWhite))) {
                board.makeMove(move);
                System.out.println((contador++) + " Movimiento válido                     |");
                turnoBlancas = !turnoBlancas;
                reproducirSonido(clickSound);
            } else {
                board.selectedPiece.xPos = board.selectedPiece.col * board.tileSize;
                board.selectedPiece.yPos = board.selectedPiece.row * board.tileSize;
                reproducirSonido(errorSound);
            }
        }

        board.selectedPiece = null;
        board.repaint();
    }

    private void reproducirSonido(Clip clip) {
        if (clip != null) {
            clip.stop(); // Detener el sonido si se está reproduciendo
            clip.setFramePosition(0); // Reiniciar la reproducción desde el inicio
            clip.start(); // Reproducir el sonido
        }
    }
    

    @Override
    public void mouseDragged(MouseEvent e) {

        if (board.selectedPiece != null) {
            board.selectedPiece.xPos = e.getX() - board.tileSize / 2;
            board.selectedPiece.yPos = e.getY() - board.tileSize / 2;

            board.repaint();
        }
    }
}
