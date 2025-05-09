import java.util.Scanner;
class LastToFirst
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements");

		for(int x=0;x<=a.length-1;x++)
			a[x]=sc.nextInt();//1 2 3
		LastToFirst last=new LastToFirst();

		int res[] =last.isCal(a);
		for(int x=0;x<=res.length-1;x++)
		
			System.out.println("a["+x+"]"+res[x]);

	}
int[] isCal(int a[])
	{
		int start=a[0];
		int last=a.length-1;
		a[0]=a[last];

		for(int x=1;x<=a.length-1;x++)//  2 3
		{	
			
			int temp=a[x];//2
			a[x]=start;//1=1
			start=temp;//				
					
		}
	return a;
	}
}