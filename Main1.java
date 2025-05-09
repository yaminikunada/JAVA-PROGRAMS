class Main1
{
	public void m1(byte x)
	{
		System.out.println(x);
	}

	public static void main(String args[])
	{
		Main1 main=new Main1();
		//main.m1((char)(97));
		//main.m1((char)(97.0));
		main.m1((byte)('A'));

	}
}