import java.util.Scanner;

class ConsPrime
{
	public static void main(String args[])
	{
		Prime p=new Prime();
			p.isCheck();
			p.calCheck();
	}
}
class Prime
{
	int num;
int count=0;
	Prime()
	{
		Scanner sc=new Scanner(System.in);
                 num=sc.nextInt();
	}
	int isCheck()
	{
		int count=0;

		for(int x=1;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
			}
		}
	return count;
	}
	void calCheck()
	{
		int res=isCheck();
		if(res==1&&num>=2)
		 System.out.println("prime");
		else
		     System.out.println("not prime");
	}

}
