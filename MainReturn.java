class MainReturn
{
	public static void main(String args[])
	{
		MainReturn m= new MainReturn();
		System.out.println(m.m1());
	}
	public String m1()
	{
		try
		{
			System.out.println(10/0);
			return"try";
		}catch(Exception e)
		{
			return"catch";
		}
		finally
		{
			return"finally";
		}
	}
}