import java.util.Scanner;
class ArrayLastDuplicateElement
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
		System.out.println(" last duplicate element");
		int b[]=new int[a.length];
		for(int x=a.length-1;x>=0;x--)
		{
			if(b[x]==1)
			continue;
			int count=1;
			for(int y=a.length-1;y>=x+1;y--)
			{	
				if(a[x]==a[y])
				{
					count++;
				       b[y]=1;
				}
			}
			if(count>1 )
			{
				
				System.out.println(a[x]);
				break;
				
			}
		}
	}
}
				
		

