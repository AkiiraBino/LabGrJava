public class main {
	
	public static void main(String args[])
	{
		try {
			Data<Integer> data = new Data<Integer>();
			data.add(5);
			data.add(2);
			data.add(6);
			data.add(8);
			data.add(2);
			data.add(6);
			data.add(8);
			data.add(8);
		}
		catch(DataException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getNum());
		}
		
		try {	
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
			System.out.println(dataMyClass.getLenght());
		}
		catch(DataException ex)
		{	
			System.out.println(ex.getMessage());
			System.out.println(ex.getNum());
		}
		try {
			Data<Integer> data = new Data<Integer>();
			data.add(5);
			data.add(2);
			data.add(6);
			System.out.println(data.getLenght());
			data.del();
			data.del();
			data.del();
			data.del();
			System.out.println(data.getLenght());		
		}
		catch(DataException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getNum());
		}
		
		try {
			Data<Integer> data = new Data<Integer>();
			data.add(5);
			data.add(2);
			data.add(6);
			System.out.println(data.getLenght());
			data.del();
			data.del();
			data.del();
			System.out.println(data.getLenght());	
			System.out.println(data.getSum());
		}
		catch(DataException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getNum());
		}
		
		try {
			Data<Integer> data = new Data<Integer>();
			data.add(5);
			data.add(2);
			data.add(6);
			System.out.println(data.getLenght());
			System.out.println(data.getSum());
		}
		catch(DataException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getNum());
		}
		
		
	}
}