import java.util.Scanner;
class Primerange
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=s.nextInt();
		for(int x=1;x<=num;x++)
		{
			int factors=0,count=0;
			for(int start=1;start<=x/2;start++)
			{
				if(x%start==0)
				  count++;
			}
			System.out.println(count==1?+x+" is a prime number":+x+" is not a prime number");
		}
	}
}

