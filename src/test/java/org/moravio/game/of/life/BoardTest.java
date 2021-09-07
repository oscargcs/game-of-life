package org.moravio.game.of.life;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BoardTest {
    Board inputBoard = new Board(3, 3);
    Board outputBoard = new Board(3, 3);

    @Test
    public void countAliveNeighbours() {
        for (int i = 0; i < inputBoard.width; i++) {
            for (int j = 0; j < inputBoard.height; j++) {
                inputBoard.setAlive(i, j);
            }
        }

        assertEquals(inputBoard.countAliveNeighbours(2, 2), 3);
    }

    @Test
    public void aliveCellWithLessThanTwoNeighboursDies() {
        inputBoard.setAlive(0, 0);
        inputBoard.setAlive(0, 1);

        assertEquals(inputBoard.outputStateOneCell(0, 0), 0);
    }

    @Test
    public void aliveCellWithTwoNeighboursLives() {
        inputBoard.setAlive(0, 0);
        inputBoard.setAlive(0, 1);
        inputBoard.setAlive(0, 2);

        assertEquals(inputBoard.outputStateOneCell(0, 1), 1);
    }

    @Test
    public void aliveCellWithThreeNeighboursLives() {
        inputBoard.setAlive(0, 0);
        inputBoard.setAlive(0, 1);
        inputBoard.setAlive(0, 2);
        inputBoard.setAlive(1, 1);

        assertEquals(inputBoard.outputStateOneCell(0, 1), 1);
    }

    @Test
    public void aliveCellWithFourNeighboursDies() {
        inputBoard.setAlive(1, 0);
        inputBoard.setAlive(1, 1);
        inputBoard.setAlive(1, 2);
        inputBoard.setAlive(2, 1);
        inputBoard.setAlive(2, 2);

        assertEquals(inputBoard.outputStateOneCell(1, 1), 0);
    }

    @Test
    public void aliveCellWithFiveNeighboursDies() {
        inputBoard.setAlive(0, 2);
        inputBoard.setAlive(1, 0);
        inputBoard.setAlive(1, 1);
        inputBoard.setAlive(1, 2);
        inputBoard.setAlive(2, 1);
        inputBoard.setAlive(2, 2);

        assertEquals(inputBoard.outputStateOneCell(1, 1), 0);
    }

    @Test
    public void deadCellWithThreeNeighboursLives() {
        inputBoard.setAlive(0, 2);
        inputBoard.setAlive(0, 1);
        inputBoard.setAlive(1, 1);
        inputBoard.setAlive(1, 2);
        inputBoard.setAlive(2, 1);
        inputBoard.setAlive(2, 2);

        assertEquals(inputBoard.outputStateOneCell(0, 2), 1);
    }

    @Test
    public void outputStateAllCellsOscilator() {
        int j = 1;
        for (int i = 0; i < inputBoard.width; i++) {

            inputBoard.setAlive(i, j);

        }

        outputBoard.setAlive(1, 0);
        outputBoard.setAlive(1, 1);
        outputBoard.setAlive(1, 2);

        assertTrue(outputBoard.equalBoards(inputBoard.outputStateAllCells()));

    }

    @Test
    public void outputStateAllCellsBlock() {

        inputBoard.setAlive(0, 0);
        inputBoard.setAlive(0, 1);
        inputBoard.setAlive(1, 0);
        inputBoard.setAlive(1, 1);

        outputBoard.setAlive(0, 0);
        outputBoard.setAlive(0, 1);
        outputBoard.setAlive(1, 0);
        outputBoard.setAlive(1, 1);

        assertTrue(outputBoard.equalBoards(inputBoard.outputStateAllCells()));

    }

}
