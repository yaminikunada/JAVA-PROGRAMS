import java.util.ArrayList;
class  Generic
{
	public static void main(String arg[])
	{
		Integer i=10;
		Short s= 12;
		Byte b=20;
		Long l=89l;
		Float f=35.5f;
		Double d=89.79;
		ArrayList<Number> al=new ArrayList<>();
		al.add(i);
		al.add(s);
		al.add(b);
		al.add(l);
		al.add(f);
		al.add(d);

		System.out.println(al);
	}
}