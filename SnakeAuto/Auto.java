import lang.stride.*;
import java.util.*;
import java.io.*;
import greenfoot.*;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
public class Auto extends Actor
{

    /**
     * Act - do whatever the Auto wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean count = false;
    boolean soundanime = true;
    int sounddrift = 65;
    public void act()
    {
        if(soundanime)
        {
            Greenfoot.playSound("animecall.mp3");
            soundanime = !soundanime;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            if(sounddrift % 65 == 0)
            {
                Greenfoot.playSound("drift.mp3");
            }
            turn(-5);
            sounddrift++;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            if(sounddrift % 65 == 0)
            {
                Greenfoot.playSound("drift.mp3");
            }
            sounddrift++;
            turn(5);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            count = !count;
            move(3);
            if(count)
            {
                Greenfoot.playSound("carstart.mp3"); 
            }
            else
            {
                Greenfoot.playSound("carstop.mp3");
            }
            try
            {
                Thread.sleep(150);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
        if(count)
        {
            move(3);
        }
    }
}
