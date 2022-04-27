
public class main {

	public static void main(String args[])
	{
		Data data = new Data("Shevchenko", "Ivan", 2002);
		data.save("file.dat");
		data.read("file.dat");
		
		Data[] dataArray = new Data[3];
		for(int i = 0; i < 3; i++)
		{
			dataArray[i] = new Data();
		}
		dataArray[0].setNSY("Kacshenko", "Dmitrii", 2002);
		dataArray[1].setNSY("Koltunov", "Sergey", 2003);
		dataArray[2].setNSY("Pustotina", "Vlada", 2007);
		dataArray[0].saveArray("file2.dat", dataArray, 3);
		dataArray[0].readArray("file2.dat", 3);
		dataArray[0].saveArrayTXT("Untitled 1.txt", dataArray, 3);
		dataArray[0].readArrayTXT("Untitled 1.txt", dataArray, 3);
	}
}
