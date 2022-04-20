import java.util.ArrayList;

public class Data <T extends Comparable<T>>{
	final int SIZE = 6;
	private ArrayList<T> list = new ArrayList<T>();
	private int lenght = 0;
	
	public int getLenght()
	{
		return lenght;
	}
	
	public void add(T value) throws DataException
	{

		if(lenght > SIZE - 1) throw new DataException("ADD Error. Lenght >= 6", lenght);
		list.add(value);	
		lenght++;
	}
	
	public void del() throws DataException
	{
		if(lenght == 0) throw new DataException("DEL Error. Lenght == 0", lenght);
		lenght--;
		list.remove(lenght);
	}
	
	public int getSum() throws DataException
	{
		if(lenght == 0) throw new DataException("SUM Error. Lenght == 0", lenght);
		int sum = 0;
		for(int i = 0; i < lenght; i++)
		{
			sum = sum + (int)list.get(i);
		}
		return sum;
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

class DataException extends Exception
{
	private int num;
	public int getNum()
	{
		return num;
	}
	public DataException(String message, int n)
	{
		super(message);
		num = n;
	}
}