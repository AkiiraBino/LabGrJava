
public class Cylinder extends Sofr {
	public double height;

	Cylinder(double r, double h)
	{
		super(r);
		height = h;
		volume = PI * radius * radius * height;
	}
	
}
