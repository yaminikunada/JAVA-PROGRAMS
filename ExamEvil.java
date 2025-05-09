import java.util.Scanner;
class EvilNumber
{
	public static void main(String args[])
	{
		Evil evil=new Evil();
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter a number");
		evil.num=sc.nextInt();
		int res=evil.isEvil();
		if(res==evil.num)
			System.out.println("evil number");
		else
			System.out.println("automatic number");

		}
}
class Evil
{
	int num=0;
	int isEvil()
        {
		int rem=0,sum=0;
                int sqrt=num*num;
		System.out.println(sqrt);

		while(sqrt!=0)
		{
		 rem=sqrt%10;
		 sqrt=sqrt/10;
		 sum+=rem;

		System.out.println(sum);

		}
		
	 return sum;
	}
			
		

}