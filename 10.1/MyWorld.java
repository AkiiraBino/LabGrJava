import greenfoot.*;  

public class MyWorld extends World
{
    private Counter DukeC;
    
    public MyWorld()
    {    
        // Create a new world and the objects that start the game.
        super(600, 500, 1);
        addObject(new Leaf(), 500, 100);
        addObject(new Leaf(), 190, 300);
        addObject(new Leaf(), 170, 400);
        addObject(new Leaf(), 30, 250);
        addObject(new Leaf(), 210, 100);
        addObject(new Rock(), 250, 350);
        addObject(new Rock(), 510, 150);
        addObject(new Wombat(), 300, 300);
        DukeC = new Counter();
        addObject(DukeC, 478, 20);
    }
    
    public Counter getA()
    {
        return DukeC;
    }
    
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000) < 7)
        {
            Leaf f = new Leaf();
            addObject(f, Greenfoot.getRandomNumber(500), 
                         Greenfoot.getRandomNumber(500));
        }
    }
}
