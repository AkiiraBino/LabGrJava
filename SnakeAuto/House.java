import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class House extends Actor
{

    /**
     * Act - do whatever the House wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        lookForCode();
    }
    
    public boolean canSee(Class clss) {
    return getOneObjectAtOffset(0, 0, clss) != null;
}
 
//if there is the same problem with the eat method you can also add this method;
public void eat(Class clss) {
    Actor actor = getOneObjectAtOffset(0, 0, clss);
    if(actor != null) {
        getWorld().removeObject(actor);
    }
}
    
    public void lookForCode()
    {
        if(canSee(Auto.class))
        {
            eat(Auto.class);
            Greenfoot.playSound("crush.mp3");
        }
    }
}
