class Modelcheck
{
	public static void  main(String args[])
	{ 
		Model mod=new Model();
		mod.calMod1(10);
		mod.calMod1(20, "hai");

	}

}
class Model
{
	void calMod1(int x)
	{
		System.out.println("int ="+x);
	}
	void calMod1(double x)
	{
		System.out.println("double ="+x);
	}
	void calMod1(int x,int y)
	{
		System.out.println(x+" "+y);
	}
	void calMod1(int x,String s)
	{
		System.out.println(x+" "+s);
	}
	void calMod1(int x,String s,char c)
	{
		System.out.println(x+ " "+s+" "+c);
	}
	void calMod1(String s,double x)
	{
		System.out.println(s+" "+x);
	}
	
}


