import greenfoot.*;  

public class Animal extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    public boolean TouchEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
        public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    public boolean Food()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            return true;
        }
        return false;
    }
        public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
    }
        public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
}
