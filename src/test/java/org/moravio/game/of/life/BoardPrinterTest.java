package org.moravio.game.of.life;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BoardPrinterTest {
    @Test
    public void printBoard_shouldPrintExpectedBoard() {
        BoardPrinter boardPrinter = new BoardPrinter();
        Board board = new Board(3, 3);
        board.setAlive(1, 0);
        board.setAlive(0, 1);
        board.setAlive(1, 1);
        board.setAlive(2, 1);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(output));
            boardPrinter.printBoard(board);
        } finally {
            System.setOut(originalOut);
        }

        String expected = "|010|" + System.lineSeparator()
                + "|111|" + System.lineSeparator()
                + "|000|" + System.lineSeparator();


        assertEquals(expected, output.toString());
    }
}
