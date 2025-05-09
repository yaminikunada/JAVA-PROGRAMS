import java.util.Scanner;
class MethodTwin
{
	public static void main(String args[])
	{
		Twin twin=new Twin();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		//num=sc.nextInt();
		 
		String res=twin.calTwin();
		System.out.println(res);
 			}
}
class Twin
{
	String calTwin()
	{
		int num=10;
		               


		for(int x=1;x<=num;x++)//10
		{
			 int count=0;

			for(int start=2;start<=x/2;start++)//2
			{
				if(x%start==0)
				
					count++;//0
				

			}
			if(count==0 && x>=2)
			{
				int ncount=0;
				int temp=x+2;
				for(int start=2;start<=temp/2;start++)
			        {
				     if(temp%start==0)
				
					ncount++;
				}
				if(ncount==0 && temp>=2)
					return (x+"and"+temp+"are twin primes");
			}

			
		}
		return "not a prime";

		      
         }
}

		
