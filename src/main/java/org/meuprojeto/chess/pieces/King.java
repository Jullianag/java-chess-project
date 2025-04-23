package org.meuprojeto.chess.pieces;

import org.meuprojeto.boardgame.Board;
import org.meuprojeto.chess.ChessPiece;
import org.meuprojeto.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
