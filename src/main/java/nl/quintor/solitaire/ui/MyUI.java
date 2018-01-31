package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.models.state.GameState;

import java.util.Collection;

public class MyUI implements UI {

    @Override
    public void setMessage(String message) {

    }

    @Override
    public void setErrorMessage(String message) {

    }

    @Override
    public void refresh(GameState gameState) {

    }

    @Override
    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves) {
        System.out.println(gameState);
        System.out.println(moves);
        return "" + gameState + "" + moves + "";
    }
}
