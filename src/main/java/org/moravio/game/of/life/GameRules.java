package org.moravio.game.of.life;

public interface GameRules {
    int oneCellNextState(Board board, int x, int y);
}
