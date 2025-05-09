class Rethrowing
{
	public static void main(String args[])
	{
		try
		{
		     Rethrowing e= new Rethrowing();
		     e.exe();
		     System.out.println("Rethrowing");
		}catch(Exception e)
		{
			  System.out.println("iam handled");
		}

	}
	public void exe()
	{
		try
		{
			throw new ArithmeticException();
		}catch(Exception e)
		{
			throw(e);
		}
	}
}