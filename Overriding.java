class Overriding
{
	public static void main(String args[])
	{
		Parent parent;
		parent=new Child();
		parent.m1(10.0);
		parent.m2();
		parent.m3("hai");
		//parent.m4();
		parent.m5();
	}
}
class Parent
{
	  void m1(double a)
	{
		System.out.println("parent-m1 "+a);
	}
	public void m2()
	{
		System.out.println("parent-m2");
	}
	protected void m3(String x)
	{
		System.out.println("parent-m3 "+x);
	}
	protected void m5()
	{
		System.out.println("parent-m5");
	}


}
class Child extends Parent
{
	 public void m1(int a)
	{
		System.out.println("child-m1 "+a);
	}
        public void m3(String x)
	{
		System.out.println("child-m3 "+x);
	}
	/*public void m4()
	{
		System.out.println("child-m4");
	}*/


}

