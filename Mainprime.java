import java.util.Scanner;
class Checkprime
{
	public static void main(String args[])
	{
	PrimeOrNot prime1=new PrimeOrNot();
	 Scanner sc=new Scanner(System.in);
	 prime1.num=sc.nextInt();
	prime1.calFactor();
	prime1.calPrime();
	}
}
class PrimeOrNot
{
	int num,count=0;
	void calFactor()
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
				break;
			}
		}
	}
	void calPrime()
	{
		System.out.println(count==0&&num>=2?"PRIME NUMBER":"NOT A PRIME NUMBER");
	}
}
	