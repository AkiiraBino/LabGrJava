import greenfoot.*;  

public class Wombat extends Animal
{
    int tiere = 4;
    int level = 1;
    boolean beine = true;
    public void act() 
    {
        
                    if(tiere == 0) 
                    {
                level++;

                for(int i = 1; i < 3*level; i++) 
                {
                    getWorld().addObject(new Leaf(), Greenfoot.getRandomNumber(430) + 20, Greenfoot.getRandomNumber(415) + 15);
                    tiere++;
                }
                
               getWorld().addObject(new Rock(), Greenfoot.getRandomNumber(430) + 20, Greenfoot.getRandomNumber(415) + 15); 
            }
        if(Food()) 
        { 
            int AllyScore = 0;
            MyWorld world = (MyWorld)getWorld();
            Counter counter = world.getA();
            counter.CountA(1);
            Greenfoot.playSound("eat.mp3");
            AllyScore++;
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            turn(-7);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            turn (7);
        }
        if (Greenfoot.isKeyDown("up")) 
        {
            move(5);
        }
    if (canSee(Rock.class)) 
    {
        move(-5);
    } 
    }    
}