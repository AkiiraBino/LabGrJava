
public class Philosopher implements Runnable{

	Plate plate;
	Philosopher(Plate plate)
	{
		this.plate = plate;
	}
	public void run() 
	{
		for(int i = 0; i < 4; i++)
		{
			try 
			{
				
				synchronized(plate)
				{
					Plate.eat();
					rest();
				}		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
	public void rest() throws InterruptedException
	{
		int t = (int)(Math.random() * 500);
		System.out.println("Sleep... " + Thread.currentThread().getName() + " " + t + "мс" +"\n");
		try		
		{
			Thread.sleep(t);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
