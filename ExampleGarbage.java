class Main
{
  	@Override
	protected void finalize() throws throwable
	{
		System.out.println("finalize method");
	}
}
class ExampleGarbage
{
	public static void main(String args[])
	{
		Main m1=new Main();
		Main m2=new Main();
		m1=null;
		m2=null;
		System.gc();
		System.out.println("end of main method");
	}
}
