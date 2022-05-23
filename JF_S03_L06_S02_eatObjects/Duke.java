import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duke extends Animal
{
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.getRandomNumber(100) < 30)
        {
            turn(10);
        }
        else
        {
            turn(-10);
        }
        if(isAtEdge())
        {
            turn(180);
        }
        move(30);
        lookForCode();
    } 
    public void lookForCode()
    {
        if(canSee(Code.class))
        {
            eat(Code.class);
        }
    }
}
