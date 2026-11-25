package org.moravio.game.of.life;

public class Game {

    private final GameRules rules;

    public Game(GameRules rules) {
        this.rules = rules;
    }

    public Board allCellsNextState(Board board) {
        Board nextBoard = new Board(board.getWidth(), board.getHeight());

        for (int x = 0; x < board.getWidth(); x++) {
            for (int y = 0; y < board.getHeight(); y++) {
                if (rules.oneCellNextState(board, x, y)) {
                    nextBoard.setAlive(x, y);
                }
            }
        }

        return nextBoard;
    }
}