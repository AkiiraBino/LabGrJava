import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(400, 800, 1);
        addObject(new Auto(), 200, 700);
        addObject(new House(), 50, 700);
        addObject(new House(), 50, 600);
        addObject(new House(), 50, 500);
        addObject(new House(), 50, 400);
        addObject(new House(), 50, 300);
        addObject(new House(), 50, 200);
        addObject(new House(), 50, 100);
        addObject(new House(), 350, 700);
        addObject(new House(), 350, 600);
        addObject(new House(), 350, 500);
        addObject(new House(), 350, 400);
        addObject(new House(), 350, 300);
        addObject(new House(), 350, 200);
        addObject(new House(), 350, 100);
        addObject(new House(), 200, 600);
        addObject(new House(), 125, 600);
        addObject(new House(), 200, 400);
        addObject(new House(), 275, 400);
        addObject(new House(), 200, 200);
        addObject(new House(), 125, 200);
    }
}
