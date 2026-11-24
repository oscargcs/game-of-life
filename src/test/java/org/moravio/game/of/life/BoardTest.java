package org.moravio.game.of.life;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    Board inputBoard = new Board(3, 3);


    @Test
    public void countAliveNeighbours() {
        for (int i = 0; i < inputBoard.getWidth(); i++) {
            for (int j = 0; j < inputBoard.getHeight(); j++) {
                inputBoard.setAlive(i, j);
            }
        }

        assertEquals(inputBoard.countAliveNeighbours(2, 2), 3);
    }

}
