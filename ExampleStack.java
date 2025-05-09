import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

import java.util.Vector;
import java.util.Stack;
class ExampleStack
{
	public static void main(String args[])
	{
		Stack <Integer>s=new Stack<>();
		s.add(12);
		//s.add(7.8);
		s.add(99);
		//s.add("hello");
		s.add(99);
		s.add(null);
		s.add(null);
		System.out.println(s);
	}
}
class ExampleVector	
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add(20);
		v.add(78.9);
		v.add(null);
		v.add(20);
		v.add(null);
		v.add("hello");
		
		System.out.println(v);
	}
}
class ExampleHashSet	
{
	public static void main(String args[])
	{
		HashSet h=new HashSet();		
		h.add(12);
		h.add(8.9);
		h.add(8.9);
		h.add("helo");
		h.add(null);
		h.add(null);
		System.out.println(h);
	}
}
class ExampleLinkedHashSet	
{
	public static void main(String args[])
	{
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		lh.add(12);
		//lh.add(8.9);
		//lh.add(7.8);
		//lh.add("helo");
		lh.add(null);
		lh.add(null);
		//lh.add(7.8);

		System.out.println(lh);
	}
}

class ExampleTreeSet	
{
	public static void main(String args[])
	{
		TreeSet <Integer>t=new TreeSet<>();
		t.add(12);
		//t.add(8.9);
		//t.add("hello");
		//t.add(null);
		//t.add(null);
		t.add(8);
		t.add(8);
		System.out.println(t);
	}
}
class ExamplePriorityQueue	
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.add(12);
		//p.add(8.9);
		//p.add("hello");
		//p.add(null);
		//p.add(null);
		p.add(8);
		p.add(8);
		System.out.println(p);
	}
}

class ExampleArrayDeque	
{
	public static void main(String args[])
	{
		ArrayDeque<Number> d=new ArrayDeque<>();
		d.add(12);
		d.add(8.9);
		//d.add("hello");
		//d.add(null);
		//d.add(null);
		d.add(8);
		d.add(8);
		System.out.println(d);
	}
}

			