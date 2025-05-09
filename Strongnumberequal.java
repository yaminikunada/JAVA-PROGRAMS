import java.util.Scanner;
class Strongnumberequal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(" enter a number:");
		int n= s.nextInt();
		int sum=0,temp=n;
		while(n!=0)
		{ 
			int fact=1;
	               int rem=n%10;
			for(int start=1;start<=rem;start++)
			{
				
				 fact*=start;
				
			}
			sum+=fact;
			n=n/10;
		}
                n=temp;
   			if(n==sum)
				System.out.println(n+" strong number");
			else
				System.out.println(n+" not a strong number");
		
		
               		
	
	}
}