class  ExampleInnterface
{
	public static void main(String args[])
	{
		ExampleInnterface e=new ExampleInnterface();
		Exe exe=e.m2();
		exe.m1();
		
	}
	public Exe m2()
	{
		Exeimpl ex=new Exeimpl();
		return ex;
	}
}
 interface Exe
{
	public void m1();
}
class Exeimpl implements Exe
{
	public void m1()

	{
		System.out.println("iam in m1");
	}

}