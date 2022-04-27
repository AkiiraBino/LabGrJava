import java.io.*;

public class Data implements Serializable {

	private String name, surname;
	private int yearBirth;
	
	
	Data()
	{
		name = " ";
		surname = " ";
		yearBirth = 0;
	}
	
	Data(String n, String sn, int yB)
	{
		name = n;
		surname = sn;
		yearBirth = yB;
	}
	
	public void printData()
	{
		System.out.println(name + surname + yearBirth);
	}
	
	public void setNSY(String n, String sn, int yB)
	{
		name = n;
		surname = sn;
		yearBirth = yB;
	}
	
	public void save(String name)
	{
		try 
		{
			FileOutputStream OFile = new FileOutputStream(name);
			ObjectOutputStream objectOS = new ObjectOutputStream(OFile);
			objectOS.writeObject(this);
			objectOS.flush();
			objectOS.close();
			System.out.println("Successful save");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void read(String name)
	{
		try 
		{
			FileInputStream IFile = new FileInputStream(name);
			ObjectInputStream objectIS = new ObjectInputStream(IFile);
			Data value = (Data)objectIS.readObject();
			objectIS.close();
			System.out.println(value.name + " " + value.surname + " " + value.yearBirth);
			System.out.println("Successful read");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void saveArray(String name, Data array[], int lenght)
	{
		try 
		{
			FileOutputStream OFile = new FileOutputStream(name);
			ObjectOutputStream objectOS = new ObjectOutputStream(OFile);
			for(int i = 0; i < lenght; i++)
			{
				objectOS.writeObject(array[i]);	
			}
			objectOS.flush();
			objectOS.close();
			System.out.println("Successful save");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void readArray(String name, int lenght)
	{
		try 
		{
			FileInputStream IFile = new FileInputStream(name);
			ObjectInputStream objectIS = new ObjectInputStream(IFile);
			Data value = new Data();
			for(int i = 0; i < lenght; i++)
			{
				value = (Data)objectIS.readObject();
				System.out.println(value.name + " " + value.surname + " " + value.yearBirth);	
			}
			objectIS.close();
			System.out.println("Successful read");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void saveArrayTXT(String name, Data array[], int lenght)
	{
		try 
		{
			FileWriter WFile = new FileWriter(name);
			for(int i = 0; i < lenght; i++)
			{
				WFile.write(array[i].name + " " +array[i].surname + " " + array[i].yearBirth + "\n");	
			}
			WFile.flush();
			WFile.close();
			System.out.println("Successful save TXT");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void readArrayTXT(String name, Data array[], int lenght)
	{
		try 
		{
			BufferedReader BRFile = new BufferedReader(new FileReader(name));
			for(int i = 0; i < lenght; i++)
			{
				System.out.println(BRFile.readLine());
			}
			BRFile.close();
			System.out.println("Successful read TXT");
		} catch (Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
}
