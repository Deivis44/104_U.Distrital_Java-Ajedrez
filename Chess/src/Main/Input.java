package Main;

import Pieces.Piece;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Input extends MouseAdapter {
    
    Board board;
    public Input(Board board) {
        this.board = board;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        int i = 680;
        int j = 680;
        
        if ( i<=680 && i>0 && j<=680 && j>0  ) {

        int col = e.getX() / board.tileSize;
        int row = e.getY() / board.tileSize;

        Piece pieceXY = board.getPiece(col, row);

        if (pieceXY != null) {
            board.selectedPiece = pieceXY;
        }
          } else{
            System.out.print("A");
          }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        int i = 680;
        int j = 680;
        
        if ( i<=680 && i>0 && j<=680 && j>0  ) {

        int col = e.getX() / board.tileSize;
        int row = e.getY() / board.tileSize;

        if (board.selectedPiece != null) {
            Move move = new Move(board, board.selectedPiece, col, row);

            if (board.isValidMove(move)) {
                System.out.println("hi");
                board.makeMove(move);
            } else {
                board.selectedPiece.xPos = board.selectedPiece.col * board.tileSize;
                board.selectedPiece.yPos = board.selectedPiece.row * board.tileSize;
            }
        }

        board.selectedPiece = null;
        board.repaint();

    } else{
        System.out.print("A");
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
