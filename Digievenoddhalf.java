import java.util.Scanner;
class DigiEvenOddHalf
{
 	public static void main(String args[])
	{
		  Scanner s=new Scanner(System.in);		
		  int num=s.nextInt();
		int count=0,temp=num;
		 while(num!=0)
		{
			
		  int rem=num%10;
			count++;
			num=num/10;
		}
		num=temp;

		if(count%2==0)
		{
			int rem=num%10;
			int power=(int)Math.pow(rem,count);
			System.out.println(num);
			num=num/power;
		}
		else
		{
			int rem=num%10;
			int power=(int)Math.pow(rem,count);
			System.out.println(num);
			num=num/power;
		}
	}
}