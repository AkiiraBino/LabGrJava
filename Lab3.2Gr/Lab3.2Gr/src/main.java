import java.util.LinkedList;
import java.util.Collection;
import java.util.TreeSet;

public class main {

	static public void main(String args[])
	{
		LinkedList<Complex> comlpexLinkedList = new LinkedList<Complex>();
		Complex[] complex= new Complex[3];
		for(int i = 0; i < 3; i++)
		{
			complex[i] = new Complex();
			complex[i].setImag(i + 2);
			complex[i].setReal(i + complex[i].getImag() % 2);
			comlpexLinkedList.addFirst(complex[i]);
		}
		TreeSet<Complex> complexTreeSet = new TreeSet<Complex>();
		for(int i = 0; i < 3; i++)
		{
			if(comlpexLinkedList.getFirst().getReal() > 2)
			{
				complexTreeSet.add(comlpexLinkedList.getFirst());
			}
		}
		for(int i = 0; i < 3; i++)
		{
			System.out.println(complexTreeSet.first().getReal() + "+" + complexTreeSet.first().getImag() + "i");
		}
	}
}
