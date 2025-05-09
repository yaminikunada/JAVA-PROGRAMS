import java.util.Scanner;
class ModelPalin
{
 	public static void main(String args[])
	{
		Palin palin=new Palin();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");

		int num=sc.nextInt();
		int res=palin.calPalin(num,0);
		System.out.println(palin.isPalin(res));
	}
}
class Palin
{ 	
	int temp;
	int  calPalin(int num,int rev)
	{
		 temp=num;

		while(num!=0)
		{
		 int rem=num%10;
	         rev=rev*10+rem;
		 num/=10;
		}
 	return rev;
	}
	String isPalin(int rev)
	{
		//temp=num;
		if(rev==temp)
		 return "palindrome";
		else
		 return "not palindrome";
	}
}