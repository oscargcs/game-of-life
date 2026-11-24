package org.moravio.game.of.life;

public class ConwayGameOfLifeRules implements GameRules {
    @Override
    public int oneCellNextState(Board board, int x, int y) {
        int aliveNeighbours = board.countAliveNeighbours(x, y);

        if(aliveNeighbours == 3 || (board.isAlive(x, y) && aliveNeighbours == 2)) return 1;
        return 0;
    }
}
