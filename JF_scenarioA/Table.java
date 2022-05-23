import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */




public class Table extends World
{
    public Deck mainDeck;
    /**
     * Constructor for objects of class Table.
     * 
     */
    public Table()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        //create the deck of cards to draw from
        mainDeck = new Deck(Card.Colour.BLUE, 1, 1, 1, 1);
        addObject(mainDeck, 600, 500);
        addObject(
    }
}
