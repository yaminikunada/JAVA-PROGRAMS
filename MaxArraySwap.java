import java.util.Scanner;
class MaxArraySwap
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
		MaxArraySwap max=new MaxArraySwap();


		max.isCal(a,0);
	
	}
void isCal(int a[],int pos)
{
		
		for(int x=0;x<a.length-1;x++)
		{	


			if(a[x-1+1]>a[x+1])//20>6
			{
				pos=a[x+1];//0
			
			   a[x+1]=a[x];//1=0
				a[x]=pos;
			}

		}
		
		for(int x=0;x<=a.length-1;x++)
		
			System.out.println("a["+x+"]"+a[x]);


	}
}