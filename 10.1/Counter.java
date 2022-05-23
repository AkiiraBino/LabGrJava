import greenfoot.*; 

public class Counter extends Actor
{
    private int eScore = 0;
    private int aScore = 0;
    int ScoreToWin = 10;
    
    public Counter()
    {
        setImage(new GreenfootImage("0", 40, Color.BLACK, Color.BLACK));
    }
    
    public void CountA(int amount)
    {   
        aScore += amount;
        setImage(new GreenfootImage("" + aScore, 40, Color.WHITE, Color.BLACK));
    }
    
    public void CountE(int amount)
    {   
        eScore += amount;
        setImage(new GreenfootImage("" + eScore, 40, Color.RED, Color.BLACK));
    }
        public void act()
    {
        if (aScore == ScoreToWin)
        {
            Win win = new Win();
            getWorld().addObject(win, 250, 250);
            Greenfoot.playSound("win.mp3");
            Greenfoot.stop();
        }
    }
}
