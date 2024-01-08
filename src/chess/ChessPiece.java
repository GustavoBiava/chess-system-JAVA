package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;
import chess.enums.Color;

public abstract class ChessPiece extends Piece {
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

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && color != p.getColor();
    }
}
