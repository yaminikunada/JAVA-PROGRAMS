import java.util.Scanner;
class ArrayCountDuplicateElement
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
		System.out.println(" number of duplicate elements");
		int b[]=new int[a.length];
		int ncount=0;
		for(int x=0;x<=a.length-1;x++)
		{
			/*if(b[x]==1)
			continue;*/
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{	
				if(a[x]==a[y])
				{
					count++;
				       //b[y]=1;
				}
			}
			if(count>1 )
			{
				ncount++;
			
			}
		}
		System.out.println(ncount);
	}
}
				
		

