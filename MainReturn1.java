class MainReturn1
{
	public static void main(String args[])
	{
		try
		{
			throw new ArithmeticException();
		}catch(Exception e)
		{
			e.printStackTrace();
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	}
}