

public class Complex implements Comparable<Complex> {

	private Integer imaginary;
	private Integer real;
	
	Complex()
	{
		
	}
	
	public int getReal()
	{
		return real;
	}
	public int getImag()
	{
		return imaginary;
	}
	public void setReal(int r)
	{
		real = r;
	}
	public void setImag(int i)
	{
		imaginary = i;
	}
	
	public int compareTo(Complex volume)
	{
		return real.compareTo(volume.getReal());
	}
	
	public int compareTo(int volume)
	{
		return real.compareTo(volume);
	}
	
}
