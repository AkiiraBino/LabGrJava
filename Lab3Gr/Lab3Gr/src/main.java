
public class main {
	
	public static void main(String args[])
	{
		Data<Integer> data = new Data<Integer>();
		data.add(5);
		data.add(2);
		data.add(6);
		data.add(8);
		System.out.println(data.compare(3));
		System.out.println(data.equal(2));
		MyClass myclass = new MyClass("Ivan", 19);
		MyClass myclass4 = new MyClass("Maksim", 17);
		MyClass myclass3 = new MyClass("Dima", 20);
		MyClass myclass2 = new MyClass("Evpatii", 18);
		Data<MyClass> dataMyClass = new Data<MyClass>();
		dataMyClass.add(myclass);
		dataMyClass.add(myclass2);
		dataMyClass.add(myclass3);
		System.out.println(dataMyClass.compare(myclass4));
		System.out.println(dataMyClass.equal(myclass4));
		System.out.println(data.getLenght());
		data.del();
		System.out.println(data.getLenght());
		System.out.println(dataMyClass.getLenght());
		data.del();
		System.out.println(dataMyClass.getLenght());
		
	}
}
