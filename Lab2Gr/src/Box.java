
public class Box extends Shape{
	final public double limit = 100.0;

	static public double volumeBox = 0;
	
	private boolean add(Shape shape)
	{
		if(shape.getVolume() < limit - volumeBox)
		{
			return true;
		}
		return false;
	}
	
	public void setVolumeBox(Shape shape)
	{
		if(add(shape))
		{
			volumeBox += shape.getVolume();
			System.out.println("???????? ????? " + (limit - volumeBox));
		}
		else
		{
			System.out.println("??????? ?? ?????? ?? " + (shape.getVolume() - (limit - volumeBox)));
		}
	}
}
