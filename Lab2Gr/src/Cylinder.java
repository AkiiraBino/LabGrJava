
public class Cylinder extends Sofr {
	protected double height;

	Cylinder(double r, double h)
	{
		radius = r;
		height = h;
		volume = PI * radius * radius * height;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
}
