package chess;

import boardGame.Board;
import boardGame.Piece;
import chess.enums.Color;

public abstract class  ChessPiece extends Piece {
    private Color color;

    public ChessPiece() {
        super();
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
