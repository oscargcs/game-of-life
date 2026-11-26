# Conway's Game of Life

A Java implementation of Conway's Game of Life, a cellular automaton devised by mathematician John Conway.

## Game Rules

The universe oe of two possible states: **alive** or **dead**.

Every cell interacts f the Game of Life is an infinite, two-dimensional orthogonal grid of square cells. Each cell can be in onwith its eight neighbours, which are the cells horizontally, vertically, or diagonally adjacent to it.

At each step in time (generation), the following transitions occur:

- **Underpopulation:** Any live cell with fewer than two live neighbours dies.
- **Survival:** Any live cell with two or three live neighbours survives to the next generation.
- **Overpopulation:** Any live cell with more than three live neighbours dies.
- **Reproduction:** Any dead cell with exactly three live neighbours becomes a live cell.

These four rules determine the state of every cell in the next generation.

## Implementation

This project implements the Game of Life using Java.

## Running the Tests

Open the project in an IDE such as IntelliJ IDEA and run the test suite using the IDE's test runner.

Alternatively, run the tests from the command line using Maven:

mvn test