package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;
import chess.enums.Color;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

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

    public int getMoveCount() {
        return moveCount;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && color != p.getColor();
    }

    protected void decreaseCount() {
        moveCount--;
    }

    protected void increaseCount() {
        moveCount++;
    }
}
