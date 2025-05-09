import java.util.Scanner;
class AutoNumber
{
	public static void main(String args[])
	{
		Auto auto=new Auto();
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter a number");
		auto.num=sc.nextInt();
		int r=auto.isAuto();
		
		if(r==auto.num)
			System.out.println("automatic number");
		else
			System.out.println("not automatic number");


	}
}
class Auto
{
	int num=0;
	int sqrt=0, count=0;
	int temp= sqrt;


	int isAuto()
	{

		int sqrt=0, count=0,temp=sqrt;
		  int res=0;

		sqrt=num*num;
				while(sqrt!=0)
		{
			sqrt/=10;
			count++;
		 System.out.println(count);
		 // System.out.println(sqrt);
		
               // int res=0;
		
		while(temp!=0)
		{
		  int rem=temp%10;
			int power=(int)Math.pow(rem,count);
			System.out.println(power);
			temp = temp/power;


	      	 System.out.println(temp);	 
		}
		}
	return temp;	
	}
}
	
