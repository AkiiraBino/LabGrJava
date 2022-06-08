import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shard extends Actor
{
    int t = 255;
    int s = 0;
    double g = 0;
    public Shard(int r, int g, int b)
    {
        GreenfootImage img = new GreenfootImage(10,10);
        img.setColor(new Color(r,g,b,t));
        img.fillOval(0, 0, 10, 10);
        setImage(img);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    /**
     * Act - do whatever the Shard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        t--;
        if(t==0)
        getWorld().removeObject(this);
        if(isAtEdge()==false)
        {
            getImage().setTransparency(t);
            move(5);
            s++;
            g+=0.07;
            setLocation(getX(), getY()+(int)g);
            if(s==1)
            setRotation(Greenfoot.getRandomNumber(360));
            if(s==2)
            setRotation(Greenfoot.getRandomNumber(360));
            if(s==3)
            setRotation(Greenfoot.getRandomNumber(360));
            if(s==4)
            setRotation(Greenfoot.getRandomNumber(360));
        }
        if(isAtEdge())
        getWorld().removeObject(this);
    }    
}
