import java.util.Scanner;
class ConsPalin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter number ");
		int num=sc.nextInt();
		Palin p=new Palin(num);
		
		p.isPalin();
		p.calPalin();
	}
}
class Palin
{
	int num,rev,temp;
	Palin(int num)
	{
		
		this.num=num;
		 temp=num;

        }
		int isPalin()
	{	while(num!=0)
		{
			int rem=num%10;
			 rev=rev*10+rem;
			num/=10;
		}
			return rev;
	}
	
	void calPalin()
	{
		int res=isPalin();
		if(res==temp)
			 System.out.println( temp+" it is a palindrome");
		else
			 System.out.println(temp+" not a palindrome");
	}
}

			