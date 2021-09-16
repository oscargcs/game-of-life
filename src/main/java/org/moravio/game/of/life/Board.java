package org.moravio.game.of.life;

public class Board {

    int width;
    int height;
    int[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setAlive(int x, int y) {
        this.board[x][y] = 1;
    }


    public int countAliveNeighbours(int x, int y) {
        int count = 0;

        for (int a = x - 1; (a <= x + 1); a++) {
            if (a >= 0 && a <= this.width - 1) {
                for (int b = y - 1; b <= y + 1; b++) {
                    if (b >= 0 && b <= this.height - 1) {
                        if (this.board[a][b] == 1 && !((a == x) && (b == y))) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }


    public int outputStateOneCell(int x, int y) {
        int nextState = 0;
        int aliveNeighbours = countAliveNeighbours(x, y);

        if (this.board[x][y] == 1 && (aliveNeighbours == 2 || aliveNeighbours == 3) || (this.board[x][y] == 0 && aliveNeighbours == 3)) {
            nextState = 1;
        }

        return nextState;
    }

    public Board outputStateAllCells() {
        Board outputBoard = new Board(this.width, this.height);

        for (int x = 0; x < this.width; x++) {
            for (int y = 0; y < this.height; y++) {
                int state = outputStateOneCell(x, y);
                outputBoard.getBoard()[x][y] = state;
            }
        }
        return outputBoard;
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

    public void printBoard() {
        for (int y = 0; y < height; y++) {
            String line = "|";
            for (int x = 0; x < width; x++) {
                if (this.board[x][y] == 0) {
                    line += "0";
                } else {
                    line += "1";
                }
            }
            line += "|";
            System.out.println(line);
        }
    }
}
