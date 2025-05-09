import java.util.Scanner;
class EvilNumber
{
	public static void main(String args[])
	{
		Evil evil=new Evil();
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int res=evil.isEvil(num);
		int re1=evil.calEvil(res,0);
		System.out.println(evil.ifCondition(res1,num));
		
	}
}
class Evil
{
	int isEvil(int num)
        {
		int sqrt=(int)Math.sqrt(num);
		return sqrt;
	}
	int calEvil(int sqrt,int sum)
	{
		isEvil();
		while(sqrt!=0)
		{
		int rem=sqrt%10;
		//int rev=rev*10+rem;
		sum+=rem;
		sqrt=sqrt/10;
		}
	 return sum;
	}
	String ifCondition(sum,num)
	{
		if(sum==num)
			return "evil number";
		else
			return "automatic number"
	} 
		
		

}