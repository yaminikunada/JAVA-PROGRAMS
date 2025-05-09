import java.util.LinkedList;
class ExampleLinkedList
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add("hai");
		ll.add(45);
		ll.add(8);
		ll.add(78);
		ll.add(78);
		ll.add(null);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		LinkedList la=new LinkedList();
		la.add("hey");
		la.add(89.79);
		la.add(76.4);
		la.addAll(ll);
		System.out.println(la);
			System.out.println(la.contains(0));
			System.out.println(la.isEmpty());
				System.out.println(la.size());
		la.add(4,"5.89");
			System.out.println(la);
		


	}
}
