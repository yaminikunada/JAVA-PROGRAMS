import java.util.Scanner;
class Strongnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		while(n!=0)
		{ 
			int fact=1,sum=0;
			int rem=n%10;
			for(int start=1;start<=rem;start++)
			{
				
				 fact*=start;
				
			}
			if(rem==fact)
				System.out.println(rem+" strong number");
               		n=n/10;
		}
	}
}
