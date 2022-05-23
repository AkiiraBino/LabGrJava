
public class Fork {
	private boolean use;
	Philosopher philosopher1, philosopher2;
	Fork(Philosopher p1, Philosopher p2)
	{
		philosopher1 = p1;
		philosopher2 = p2;
		use = false;
	}
	public boolean getUse()
	{
		return use;
	}
	public void setUse(boolean u)
	{
		use = u;
	}
}
