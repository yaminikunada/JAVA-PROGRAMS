import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorExe
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(10,20,40,76,89,80,34));
		ListIterator<Integer> itr= al.listIterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
		}

		while(itr.hasPrevious())
		{
		System.out.println(itr.previous());
		}
		
	}
}