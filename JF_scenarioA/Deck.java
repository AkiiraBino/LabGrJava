import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor{


private ArrayList<Card> cards;
    //private boolean jokers;
    /** The number of sets of each of the suits. */
    private int spades, clubs, hearts, diamonds;
    private Card.Colour colour;
    /** The location of the picture of an empty deck (outline of a deck.) */
    private static final String EMPTY_DECK = "empty.png";
    private int showNum;

    
    
    /**
     * Create a customised deck of a certain colour
     * @param colour the colour of the deck
     * @param jokers true if jokers should be included, false otherwise
     */
    public Deck(Card.Colour colour, int spades, int clubs, int hearts, int diamonds)
    {
        this.colour = colour;
        this.diamonds = diamonds;
        this.clubs = clubs;
        this.spades = spades;
        this.hearts = hearts;
        setColour();
        fill();
        shuffle();
    }
    
    /**
     * Fill the deck with a complete set of cards. Get rid of any cards
     * still in the deck.
     */
    public void fill()
    {
        cards = new ArrayList<Card>();
        for(Card.Suit suit : Card.Suit.values()) {
            for(int i=0 ; i<num(suit) ; i++) {
                for(Card.Value value : Card.Value.values()) {
                    cards.add(new Card(colour, value, suit, false));
                }
            }
        }
        setColour();
    }
    
    /**
     * Get the number of sets needed of a particular suit.
     */
    private int num(Card.Suit suit) {
        if(suit==Card.Suit.CLUBS) {
            return clubs;
        }
        if(suit==Card.Suit.SPADES) {
            return spades;
        }
        if(suit==Card.Suit.DIAMONDS) {
            return diamonds;
        }
        if(suit==Card.Suit.HEARTS) {
            return hearts;
        }
        throw new RuntimeException("Invalid suit...");
    }
    
    /**
     * Draw a card from the deck.
     * @return the card that's been drawn, or null if no cards are left.
     */
    public Card drawCard()
    {
        if(getSize()==0) return null;
        Card card = cards.get(0);
        cards.remove(card);
        if(getSize()==0) {
            setImage(new GreenfootImage(Card.CARD_IMAGE_LOCATION+EMPTY_DECK));
        }
        return card;
    }
    
    /**
     * Draw a card from the deck.
     * @return the card that's been drawn, or null if no cards are left.
     */
    public Card drawFlippedCard()
    {
        if(getSize()==0) return null;
        Card card = cards.get(0);
        cards.remove(card);
        if(getSize()==0) {
            setImage(new GreenfootImage(Card.CARD_IMAGE_LOCATION+EMPTY_DECK));
        }
        return card;
    }
     
    
    /**
     * Puts a card into the deck.
     * @param card the card to put in the deck.
     */
    public void addCard(Card card)
    {
        cards.add(card);
    }
    
    /**
     * Shuffle the deck
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
        
    /**
     * Get the size of the deck
     * @return the number of cards left in the deck
     */
    public int getSize()
    {
        return cards.size();
    }

    /**
     * Set the deck to a certin colour
     */
    private void setColour()
    {
        if(colour==Card.Colour.BLUE) {
            setImage(new GreenfootImage("images/cards/blueflip.png"));
        }
        else {
            setImage(new GreenfootImage("images/cards/redflip.png"));
        }
    }  
}
