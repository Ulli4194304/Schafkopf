package de.emg_haar.schafkopfdeluxe.game;

import java.util.LinkedList;

import de.emg_haar.schafkopfdeluxe.game.card.Card;

/**
 * Created by noah on 30.01.17.
 */

public class Mode {

    public enum MODE_TYPE
    {
        SAUSPIELEICHEL, SAUSPIELGRAS, SAUSPIELSCHELLEN, SOLOSCHELLEN, SOLOGRAS, SOLOHERZ, SOLOEICHEL, WENZ, RAMSCH
    }
    private MODE_TYPE mode_type;

    public Mode(MODE_TYPE m)
    {
        mode_type = m;
    }

    //spielbare Karten werden geckeckt und mit einer LinkedList zurücgegeben
    public LinkedList<Card> checkPlayable(LinkedList<Card> c)
    {
        if()
        {

        }
    }


}
