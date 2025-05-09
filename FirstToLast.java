import java.util.Scanner;
class FirstToLast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements");

		for(int x=0;x<=a.length-1;x++)
			a[x]=sc.nextInt();
		int  last=a[a.length-1];//30
		last=a[0];//10
		
		for(int x=a.length-1;x>=0;x--)//10 20 30
		{
			int temp=a[x];
			a[x]=last;
			last=temp;
		}
		
		for(int x=0;x<=a.length-1;x++)
		
			System.out.println("a["+x+"]"+a[x]);

	}
}	