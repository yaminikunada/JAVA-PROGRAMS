import java.util.Scanner;
class ArrayMaxDuplicateElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size  ");

		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("enter array elements are ");

		for(int x=0;x<=a.length-1;x++)
		
			a[x]=sc.nextInt();
		System.out.println(" maximum duplicate element");
		int b[]=new int[a.length];
		int t=0;

		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==1)
			continue;
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[x]==a[y])
				{
					count++;
				       b[y]=1;
				}
			}
			if(count>1 )
			{
								
				if(a[x]>t)//10>0 30>10
				{
				  t=a[x];//10 30
				
				}
			}
		}
		System.out.println(t);

	}
}
				

