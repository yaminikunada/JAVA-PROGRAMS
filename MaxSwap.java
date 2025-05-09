import java.util.Scanner;
class MaxSwap
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,39,56,95,78,90};
		int max=Integer.MIN_VALUE,pos=0;
		for( int x=0;x<=a.length-1;x++)
		{
			if(a[x]>max)
			{
			 max=a[x];//95
			
			pos=x;//3
			}
						
		}
		for( int x=0;x<=a.length-1;x++)
		{
			if(x==0)
			a[pos]=a[x];//a[3]=a[0]//95=10
		}
               for( int x=0;x<=a.length-1;x++)
		{
			
		        if(x==0)
			a[x]=max;//a[0]==95
			  System.out.println("a["+x+"]"+a[x]);


		}
			}
}
