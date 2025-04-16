package org.meuprojeto.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    // para criarmos uma peça informaremos o tabuleiro
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
