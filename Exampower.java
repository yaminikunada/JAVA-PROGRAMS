import java.util.Scanner;
class PowerNumber
{
	public static void main(String args[])
	{
		Power pow=new Power();
		Scanner sc=new Scanner(System.in);
		 pow.num=sc.nextInt();
		
		System.out.println(pow.isPower());	
	}
}
class Power
{ 	int num=0;
	int sum=0,product=1;

	String isPower()
	{ 
		while(num!=0)
		{
		int rem=num%10;
		sum=sum+rem;
	       product=product*rem;
		num=num/10;
		}
	if(sum==product)
		return "power number";
		else
	          return "not power number";
	}
}

	