package org.moravio.game.of.life;

public interface GameRules {
    boolean oneCellNextState(Board board, int x, int y);
}
