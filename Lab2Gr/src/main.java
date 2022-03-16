
public class main {

	public static void main(String args[])
	{
		Ball shapeBall = new Ball(2.0);
		Box box = new Box();
		box.setVolumeBox(shapeBall);
		Pyramid shapePyr = new Pyramid(15.0, 10.0);
		box.setVolumeBox(shapePyr);
		Cylinder shapeCyl = new Cylinder(2.0, 1.0);
		box.setVolumeBox(shapeCyl);
		Ball shapeBall2 = new Ball(4.0);
		box.setVolumeBox(shapeBall2);
		Ball shapeBall3 = new Ball(0.6);
		Ball shapeBall4 = new Ball(0.8);
		box.setVolumeBox(shapeBall3);
		box.setVolumeBox(shapeBall4);

	}
}
