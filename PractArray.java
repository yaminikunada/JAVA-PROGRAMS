import java.util.Scanner;
class PracArray
{
	public static void main(String args[])
	{
		ExArr a=new ExArr();
		a.add((byte)10);
	}
}
class ExArr
{
	void add()
	{
		System.out.println("iam in void");
	}
        void add(int x)
	{
		System.out.println("iam in void int ");
	}
	void add(short x)
	{
		System.out.println("iam in void short");
	}
	void add(long x)
	{
		System.out.println("iam in void long");
	}
	void add(byte x)
	{
		
		System.out.println("iam in void byte");
	}
	void add(double x)
	{
		System.out.println("iam in void double");
	}
}


