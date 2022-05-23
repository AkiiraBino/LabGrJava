
public class Main {

	public static void main(String args[])
	{
		Plate plate = new Plate();
		Philosopher p1 = new Philosopher(plate);
		Philosopher p2 = new Philosopher(plate);
		Philosopher p3 = new Philosopher(plate);
		Philosopher p4 = new Philosopher(plate);
		Thread t1= new Thread (p1, "t1");
		Thread t2= new Thread (p2, "t2");
		Thread t3= new Thread (p3, "t3");
		Thread t4= new Thread (p4, "t4");
		Fork f1 = new Fork(p1, p2);
		Fork f2 = new Fork(p1, p3);
		Fork f3 = new Fork(p2, p3);
		Fork f4 = new Fork(p3, p4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
