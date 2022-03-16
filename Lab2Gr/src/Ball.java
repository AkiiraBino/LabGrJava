
public class Ball extends Sofr{

	Ball(double r)
	{
		radius = r;
		volume = (4 * PI * radius * radius * radius) / 3.0;	
	}
	
	public double getRadius()
	{
		return radius;
	}
}
