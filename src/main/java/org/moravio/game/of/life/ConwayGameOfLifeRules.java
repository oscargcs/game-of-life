package org.moravio.game.of.life;

public class ConwayGameOfLifeRules implements GameRules {
    @Override
    public boolean oneCellNextState(Board board, int x, int y) {
        int aliveNeighbours = board.countAliveNeighbours(x, y);
        return aliveNeighbours == 3 || (board.isAlive(x, y) && aliveNeighbours == 2);
    }
}
