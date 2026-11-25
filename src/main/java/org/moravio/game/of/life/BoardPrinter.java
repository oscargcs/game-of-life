package org.moravio.game.of.life;

public class BoardPrinter {
    public void printBoard(Board board) {
        for (int y = 0; y < board.getHeight(); y++) {
            StringBuilder line = new StringBuilder("|");

            for (int x = 0; x < board.getWidth(); x++) {
                line.append(board.getBoard()[x][y] ? "1" : "0");
            }

            line.append("|");
            System.out.println(line);
        }
    }
}
