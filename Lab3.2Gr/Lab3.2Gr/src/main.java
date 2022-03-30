import java.util.LinkedList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Iterator;

public class main {

	static public void main(String args[])
	{
		LinkedList<Complex> complexLinkedList = new LinkedList<Complex>();
		Complex[] complex= new Complex[10];
		for(int i = 0; i < 9; i++)
		{
			complex[i] = new Complex();
			complex[i].setImag(i + 2);
			complex[i].setReal(i + complex[i].getImag() / 2);
			complexLinkedList.addFirst(complex[i]);
		}
		ListIterator<Complex> itList = complexLinkedList.listIterator();
		TreeSet<Complex> complexTreeSet = new TreeSet<Complex>();
		while(itList.hasNext())
		{
			if(itList.next().getReal() > 5)
			{
				itList.previous();
				complexTreeSet.add(itList.next());			
			}
		}
		Iterator<Complex> itTree = complexTreeSet.iterator();
		Complex ctest = new Complex();
		while(itTree.hasNext())
		{
			ctest = itTree.next();
			System.out.println(ctest.getReal() + "+" + ctest.getImag() + "i");	
		}
	}
}
