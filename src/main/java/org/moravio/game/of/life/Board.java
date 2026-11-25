package org.moravio.game.of.life;

public class Board {

    private final int width;
    private final int height;
    private final boolean[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new boolean[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setAlive(int x, int y) {
        this.board[x][y] = true;
    }

    public boolean isAlive(int x, int y) { return board[x][y];}

    public int countAliveNeighbours(int x, int y) {
        int count = 0;

        for (int a = x - 1; (a <= x + 1); a++) {
            if (a >= 0 && a <= this.width - 1) {
                for (int b = y - 1; b <= y + 1; b++) {
                    if (b >= 0 && b <= this.height - 1) {
                        if (this.isAlive(a,b) && !((a == x) && (b == y))) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public boolean equals(Object anObject) {
        if (anObject instanceof Board) {
            Board board = (Board) anObject;

            for (int x = 0; x < this.width; x++) {
                for (int y = 0; y < this.height; y++) {
                    if (this.board[x][y] != board.getBoard()[x][y]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
