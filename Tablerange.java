import java.util.Scanner;
class Tablerange
{
	public static void main(String args[])
	{
	 	Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
			int num=x;
			while(num!=0)
			{
				int  rem=num%10;
				int table=rem;
				for(int start=1;start<=10;start++)
				{
					int product=table*start;
				        System.out.println(table+"x"+start+"="+product);
				}
				num=num/10;
			}
		
	}
}