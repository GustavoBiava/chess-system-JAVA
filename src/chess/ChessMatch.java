package chess;

import boardGame.Board;
import boardGame.Position;
import chess.enums.Color;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i = 0; i < mat.length; i++ ){
            for (int j = 0; j < mat.length; j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
         return mat;
    }

    public void initialSetup(){
        board.placePiece(new Rook(board, Color.BLACK),new Position(3,4));
    }


}
