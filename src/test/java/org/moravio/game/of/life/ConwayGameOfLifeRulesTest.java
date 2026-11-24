package org.moravio.game.of.life;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConwayGameOfLifeRulesTest {
    Board board = new Board(3, 3);
    ConwayGameOfLifeRules gameOfLifeRules = new ConwayGameOfLifeRules();

    @Test
    public void aliveCellWithLessThanTwoNeighboursDies() {
        board.setAlive(0, 0);
        board.setAlive(0, 1);

        assertEquals(gameOfLifeRules.oneCellNextState(board,0,0), 0);
    }

    @Test
    public void aliveCellWithTwoNeighboursLives() {
        board.setAlive(0, 0);
        board.setAlive(0, 1);
        board.setAlive(0, 2);

        assertEquals(gameOfLifeRules.oneCellNextState(board,0,1), 1);
    }

    @Test
    public void aliveCellWithThreeNeighboursLives() {
        board.setAlive(0, 0);
        board.setAlive(0, 1);
        board.setAlive(0, 2);
        board.setAlive(1, 1);

        assertEquals(gameOfLifeRules.oneCellNextState(board,0,1), 1);
    }

    @Test
    public void aliveCellWithFourNeighboursDies() {
        board.setAlive(1, 0);
        board.setAlive(1, 1);
        board.setAlive(1, 2);
        board.setAlive(2, 1);
        board.setAlive(2, 2);

        assertEquals(gameOfLifeRules.oneCellNextState(board,1,1), 0);
    }

    @Test
    public void aliveCellWithFiveNeighboursDies() {
        board.setAlive(0, 2);
        board.setAlive(1, 0);
        board.setAlive(1, 1);
        board.setAlive(1, 2);
        board.setAlive(2, 1);
        board.setAlive(2, 2);

        assertEquals(gameOfLifeRules.oneCellNextState(board,1,1), 0);
    }

    @Test
    public void deadCellWithThreeNeighboursLives() {
        board.setAlive(0, 2);
        board.setAlive(0, 1);
        board.setAlive(1, 1);
        board.setAlive(1, 2);
        board.setAlive(2, 1);
        board.setAlive(2, 2);

        assertEquals(gameOfLifeRules.oneCellNextState(board,0,2), 1);
    }
}
