import java.util.Scanner;
class Positeration
{
	public static void main(String args[])
	{
		Scanner  s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0,temp=num;
		while(num!=0)//123
		{
			//int rem=num%10;
			num=num/10;
			count++;//3
		}
		int ncount=s.nextInt();
		num=temp;
		while(num!=0)//1
		{
			int rem =num%10;
			//ncount++;//1<3
			if(ncount<=count)
				System.out.println(rem);
			ncount++;//1
			if(rem
			num=num/10;
			if
		}
	}
}