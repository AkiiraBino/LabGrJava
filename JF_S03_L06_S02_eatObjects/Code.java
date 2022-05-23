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
        move(10);
        if(isAtEdge())
        {
            turn(180);
        }
        if(Greenfoot.getRandomNumber(220) < 1)
        {
        World world = getWorld();
        int x = getX();
        int y = getY();
        world.addObject(new Code(), x, y);  
        }
    }
 
}
