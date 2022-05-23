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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        int[][] array = new int[3][2];
        array[0][0] = 200;
        array[0][1] = 200;
        array[1][0] = 200;
        array[1][1] = 400;
        array[2][0] = 300;
        array[2][1] = 400;
        addObject(new Predator(), array[0][0], array[0][1]);
        addObject(new Victim(), array[1][0], array[1][1]);
        addObject(new Victim(), array[2][0], array[2][1]);
    }
}
