package org.moravio.game.of.life;

import org.junit.Assert;
import org.junit.Test;

public class GamesTest {
    Board initialBoard = new Board(3, 3);
    Board expectedNextBoard = new Board(3, 3);
    ConwayGameOfLifeRules gameOfLifeRules = new ConwayGameOfLifeRules();
    Game game = new Game(gameOfLifeRules);

    @Test
    public void outputStateAllCellsOscillator() {
        int j = 1;
        for (int i = 0; i < initialBoard.getWidth(); i++) {
            initialBoard.setAlive(i, j);
        }

        Board nextBoard = game.allCellsNextState(initialBoard);

        expectedNextBoard.setAlive(1, 0);
        expectedNextBoard.setAlive(1, 1);
        expectedNextBoard.setAlive(1, 2);

        Assert.assertTrue(expectedNextBoard.equals(nextBoard));
    }

    @Test
    public void outputStateAllCellsBlock() {

        initialBoard.setAlive(0, 0);
        initialBoard.setAlive(0, 1);
        initialBoard.setAlive(1, 0);
        initialBoard.setAlive(1, 1);

        Board nextBoard = game.allCellsNextState(initialBoard);

        expectedNextBoard.setAlive(0, 0);
        expectedNextBoard.setAlive(0, 1);
        expectedNextBoard.setAlive(1, 0);
        expectedNextBoard.setAlive(1, 1);

        Assert.assertTrue(expectedNextBoard.equals(nextBoard));
    }

}
