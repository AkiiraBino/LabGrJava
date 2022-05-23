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
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        move(2);
        lookForCode();
    } 
    /**
     * Look for Code. If Duke finds code, he eats it. 
     */
    public void lookForCode()
    {
        if(canSee(Code.class))
        {
            eat(Code.class);
            Greenfoot.playSound("chomp.wav");
        }
    }
}

