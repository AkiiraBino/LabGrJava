import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Predator extends Actor
{

    /**
     * Act - do whatever the Predator wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if (isAtEdge())
        {
            turn(30);
        }
        removeTouching(Victim.class);
    }
}
