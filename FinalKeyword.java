class FinalKeywordExe
{
	
 public static void main(String args[])
	{
		A f=new B();

		f.add();
	}
}
 class A
{
  final void add()
   {
    

		System.out.println("add");
    } 
}
 class B extends A
{
	final void add(int x)
	{
		System.out.println(x);

	}
}