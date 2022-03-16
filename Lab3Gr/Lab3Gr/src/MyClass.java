
public class MyClass implements Comparable<MyClass>, Cloneable {

	private String name;
	private Integer age;
	
	MyClass()
	{
		
	}
	
	MyClass(String n, Integer a)
	{
		name = n;
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(Integer a)
	{
		age = a;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public int compareTo(MyClass a)
	{
		Integer num = a.getAge();
		return age.compareTo(num);
	}

	
	
}
