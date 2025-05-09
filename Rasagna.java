 class Rasagna
{
	static public  void main(String args[])
	{
		System.out.println(10);
		Suji s= new Suji();
		s.isChild();
	}
	
 class Suji extends Rasagna
{
	
	
	final static void isChild()
	{
		System.out.println(100);
	}

}
}