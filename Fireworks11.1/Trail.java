import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trail extends Actor
{
    int t =255;
    public Trail(int c)
    {
        GreenfootImage img = new GreenfootImage(10,10);
        if(c==0)
        img.setColor(Color.BLUE);
        if(c==2)
        img.setColor(Color.ORANGE);
        img.fillOval(0,0,10,10);
        setImage(img);
    }
    /**
     * Act - do whatever the Trail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        t-=5;
        getImage().setTransparency(t);
        if(t<5)       
        getWorld().removeObject(this);  
        if(t>5)
        {
            setLocation(getX()+(Greenfoot.getRandomNumber(3)-1), getY()+1);
            if(isAtEdge())
            getWorld().removeObject(this);
        }
    }    
}
