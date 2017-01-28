package de.emg_haar.schafkopfdeluxe.game;

import java.util.LinkedList;
import java.util.Stack;


public class Player
{
    private LinkedList<Card> hand;
    private String name;
    private Game game;
    private int points;
    private boolean player;
    private boolean contra;
    private boolean re;

    public Player(String name)
    {
        this.name = name;
        game = null;
        points = 0;
        player = false;
        contra = false;
        re = false;
        hand = new LinkedList<>();
        //Was muss in Linked List rein?
        //Karten vielleicht? :D
    }

    public void setGame(Game g)
    {
        game = g;
    }

    public void setPlayer(boolean p)
    {
        player = p;
    }

    public boolean getPlayer()
    {
        return player;
    }

    public boolean getContra()
    {
        return contra;
    }

    public boolean getRe()
    {
        return re;
    }

    //Die Karten aus dem Stack werden auf die Hand gebracht
    public void addCards(Stack<Card> c)
    {
        hand.add(c.pop());
        hand.add(c.pop());
        hand.add(c.pop());
        hand.add(c.pop());
    }

    public LinkedList<Card> getHand()
    {
        return hand;
    }

    public String getName()
    {
        return name;
    }

    public void showPlayableCards(LinkedList<Card> l)
    {

    }
}
