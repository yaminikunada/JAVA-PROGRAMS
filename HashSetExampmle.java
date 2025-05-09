import java.util.ArrayList;
class HashSetExampmle
{
	public static void main(String arg[])
	{
		ArrayList al= new ArrayList();
		al.add(34);
		al.add(7.8);
		al.add(89.7f);
		al.add("hello");
		al.add(7.8);
		al.add(null);
		System.out.println(al);
		al.remove("hello");
		System.out.println(al);
		ArrayList ab= new ArrayList();

		ab.add("hai");
		ab.add(90);
		ab.addAll(al);
		ab.removeAll(al);
		System.out.println(ab);
		System.out.println(ab.contains("hai"));
		System.out.println(ab.size());
		System.out.println(ab.isEmpty());
		ab.add(2,"bye");
		System.out.println(ab);
		al.clear();
		System.out.println(al);








	}
}