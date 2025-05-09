import java.util.Scanner;
class Amstrongeach
{
	public static void main(String args[])
	{
		Scanner s=new  Scanner(System.in);
		
		System.out.println(" enter a number");
		int n=s.nextInt();
             	for(int x=1;x<=n;x++)
		{
			int num=x,sum=0,temp=num,count=0;
			while(num!=0)
			{
				 num=num/10;
				count++;
			}
				num=temp;
				while(num!=0)
				{
					int rem=num%10;
					int  power=(int)Math.pow(rem,count);
					sum+=power;
					num=num/10;
				}
		
				if(sum==temp)
					System.out.println(temp+" is an amtrong number");
		}
	}
}
			