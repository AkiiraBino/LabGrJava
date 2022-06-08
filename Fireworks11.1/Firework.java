import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Firework here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Firework extends Actor
{
    int s =0;
    int b = Greenfoot.getRandomNumber(100)+100;
    int i =0;
    int td = 800-(Greenfoot.getRandomNumber(400)+300);
    String c = "";
    public Firework()
    {
        int[] x = {0,35,17};
        int[] y = {20,20,0};
        int[] xs1 = {6,6,31,31};
        int[] ys1 = {60, 50, 40, 50};
        int[] xs2 = {6,6,31,31};
        int[] ys2 = {40, 30, 20, 30};
        GreenfootImage img = new GreenfootImage(35,60);
        img.setColor(Color.WHITE);
        img.fillRect(6, 20, 25, 40);
        img.setColor(Color.RED);
        img.fillPolygon(x, y, 3);
        img.fillPolygon(xs1, ys1, 4);
        img.fillPolygon(xs2, ys2, 4);        
        setImage(img);
    }
    /**
     * Act - do whatever the Firework wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(s<15)
        s++;
        setLocation(getX(), getY()-s);
        int r = Greenfoot.getRandomNumber(250);
        int g = Greenfoot.getRandomNumber(250);
        int b = Greenfoot.getRandomNumber(250);
        if(getY()<td)
        {
            for(i=0; i<b; i++) getWorld().addObject(new Shard(r,g,b), getX(), getY());
            if(i==b)
            getWorld().removeObject(this);
        }
        if(i!=b)
        {
            int c1 = Greenfoot.getRandomNumber(3);    
            int c2 = Greenfoot.getRandomNumber(3);   
            int c3 = Greenfoot.getRandomNumber(3);   
            getWorld().addObject(new Trail(c1), getX()+(Greenfoot.getRandomNumber(20)-10), getY());
            getWorld().addObject(new Trail(c2), getX()+(Greenfoot.getRandomNumber(25)-12), getY());
            getWorld().addObject(new Trail(c3), getX()+(Greenfoot.getRandomNumber(25)-12), getY());
        }
    }    
}
