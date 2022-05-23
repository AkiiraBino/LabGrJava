

public class Plate {

	
	public static void eat() throws InterruptedException
	{
		System.out.println("Eat... " + Thread.currentThread().getName() + "\n");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
