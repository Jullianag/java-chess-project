package org.meuprojeto.chess.pieces;

import org.meuprojeto.boardgame.Board;
import org.meuprojeto.chess.ChessPiece;
import org.meuprojeto.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
