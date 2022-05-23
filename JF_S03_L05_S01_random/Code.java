import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Code here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Code extends Animal
{
    /**
     * Act - do whatever the Code wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.getRandomNumber(100) < 11)
        {
            if(Greenfoot.getRandomNumber(2) < 1)
            {
                turn(20);
            }
            else
            {
                turn(-20);
            }
        }
        if(isAtEdge())
        {
            turn(180);
        }
        move(10);
    }    
}
