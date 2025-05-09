import java.util.Scanner;
class Factorialrange
{
 	public static void main(String args[])
	{
  
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=s.nextInt();
		for(int x=1;x<=num;x++)
		{
			int product=1;
		
			for(int start=1;start<=x;start++)
			{
			
				product*=start;

			}
			System.out.println("factoial of  "+num+"is "+product);
		}
	}
}