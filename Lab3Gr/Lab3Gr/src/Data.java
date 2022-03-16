import java.util.ArrayList;

public class Data <T extends Comparable<T>>{
	final int SIZE = 10;
	private ArrayList<T> list = new ArrayList<T>();
	private int lenght = 0;
	
	public int getLenght()
	{
		return lenght;
	}
	
	public void add(T value)
	{

		if(lenght < SIZE - 1)
		{
			list.add(value);	
			lenght++;
		}
		else
		{
			System.out.println("Size < lenght");
		}
	}
	
	
	public void del()
	{
		if(lenght != 0)
		{
			lenght--;
			list.remove(lenght);
		}
		else
		{
			System.out.println("Lenght == 0");
		}
	}
	
	
	
	public int compare(T value)
	{
		int num = 0;
		for(T val : list)
		{
			if(val.compareTo(value) < 0)
			{
				num++;
			}
			
		}
		return num;
	}
	
	public boolean equal(T value)
	{
		for(T val : list)
		{
			if(val.compareTo(value) == 0)
			{
				return true;
			}
			
		}
		return false;
	}

	
	
}
