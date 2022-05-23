import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.lang.*;

/**
 * A playing card.
 * 
 * @author Willie McCabe
 * @version 06/08/12
 */
public class Card  extends Actor
{

    /** The suits a card can belong to */
    public enum Suit {CLUBS, HEARTS, SPADES, DIAMONDS};
    /** The numbers a card can take */
    public enum Value {
    ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
    
    private int numValue; 
 
    Value(int numValue) { 
        this.numValue = numValue; 
    } 
 
   
}
   
   
    /** The colours a card can be */
    public enum Colour {RED, BLUE};

    protected static final String CARD_IMAGE_LOCATION = "images/cards/";
    private Colour colour;
    private Suit suit;
    private Value value;
    private boolean flipped;   
    private boolean blank;
    
      
        
    /**
     * Generate a card with a colour, suit and value
     * @param colour the colour of the card
     * @param value the value of the card
     * @param suit the suit of the card
     * @param flipped true if the card is face down, false otherwise
     */
    public Card(Colour colour, Value value, Suit suit, boolean flipped) {
        this.colour = colour;
        this.value = value;
        this.suit = suit;
        this.flipped = flipped;
        draw();
    }
    
       
    /**
     * Generate a blank card for placement in rows 
     
     */
    public Card(boolean blank) {
        if (blank) {
            this.blank = blank;
            setImage(new GreenfootImage("images/cards/empty.png")); 
        }else
        {
            setImage(new GreenfootImage("images/cards/blueflip.png"));
        }
    }
    
      
      
    /**
     * Select the image of the card based on its suit, value and colour
     * and draw it.
     */
    protected void draw() {
        String fileName = CARD_IMAGE_LOCATION;
        
       
        if(flipped) {
            fileName += colour;
            fileName += "flip";
        }
        else {
            fileName += value;
            fileName += suit;
        }
    
        fileName += ".png";
        fileName = fileName.toLowerCase();
        setImage(new GreenfootImage(fileName));
    }
    
    /**
     * Set whether the card is flipped over or not
     * @param flipped true if the card is face down, false otherwise
     */
    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
        draw();
    }
    
    
    /**
     * Determine whether the card is flipped or not
     * @return true if the card is face down, false otherwise
     */
    public boolean isFlipped() {
        return flipped;
    }
    
    /**
     * Get the colour of the card
     * @return the colour of the card
     */
    public Colour getColour() {
        return colour;
    }
    
    /**
     * Get the value of the card
     * @return the value of the card
     */
    public Value getValue() {
        return value;
    }
    
    
    /**
     * Get the numeric value of the card
     * @return the value of the card
     */
    public int getNumValue() {
        return value.numValue; 
    }
    
    
    /**
     * Get the suit of the card
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }
    
    
    
    /**
     * Remove and add the object to the world
     */
    private void reAdd() {
        int x = getX();
        int y = getY();
        int rotation = getRotation();
        World world = getWorld();
        world.removeObject(this);
        world.addObject(this, x, y);
    }
}

