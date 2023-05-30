package Main;

import Pieces.Piece;

import javax.sound.sampled.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Input extends MouseAdapter {
    
    private Board board;
    private boolean turnoBlancas = true;
    private int contador = 1;
    private StringBuilder logBuilder = new StringBuilder();
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


        
    @Override
public void mouseReleased(MouseEvent e) {
    int col = e.getX() / board.tileSize;
    int row = e.getY() / board.tileSize;

    if (board.selectedPiece != null) {
        Move move = new Move(board, board.selectedPiece, col, row);

        if (board.isValidMove(move) && ((turnoBlancas && board.selectedPiece.isWhite) || (!turnoBlancas && !board.selectedPiece.isWhite))) {
            board.makeMove(move);

            String movimiento;
            if (contador < 10) {
                movimiento = String.format("[%d ] Movimiento ", contador);
            } else {
                movimiento = String.format("[%d] Movimiento ", contador);
            }

            if (contador % 2 == 0) {
                movimiento += "blancas: válido          |";
            } else {
                movimiento += "negras: válido           |";
            }

            System.out.println(movimiento);
            logBuilder.append(movimiento).append(System.lineSeparator());
            contador++;

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

    guardarLogEnArchivo("Chess_moves.txt"); // Guardar el registro en un archivo de texto
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

    private void guardarLogEnArchivo(String fileName) {
        String currentDir = System.getProperty("user.dir");
        String filePath = currentDir + "/" + fileName;
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("\nCHESS JAVA - UD ------------------------ |\n                                         |\n"); // Línea de título
    
            writer.write(logBuilder.toString()); // Líneas de movimiento
            System.out.println("\n_archivo .txt modificado_\n");
        } catch (IOException e) {
            System.out.println("\n_error en la modificación del .txt_: \n" + e.getMessage());
        }
    }
}
