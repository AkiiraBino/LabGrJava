import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DukeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DukeWorld extends World
{
    /**
     * Constructor for objects of class DukeWorld.
     * 
     */
    public DukeWorld()
    {    
        // Create a new world and the objects that start the game.
        super(600, 600, 1);
        addObject(new Duke(), 200, 150);
        addObject(new Code(), 300, 100);
        addObject(new Code(), 300, 200);
        addObject(new Code(), 300, 300);
        addObject(new Code(), 300, 400);
        addObject(new Code(), 300, 500);
        addObject(new Code(), 300, 150);
        addObject(new Code(), 300, 250);
        addObject(new Code(), 300, 350);
        addObject(new Code(), 300, 430);
        addObject(new Code(), 300, 480);
    }
}
