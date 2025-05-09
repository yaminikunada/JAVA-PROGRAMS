import java.util.Scanner;
class EvenOddArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[a.length];
		System.out.println("a elements are:");
       		int y=0;

		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
			if(a[x]%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		System.out.println("b elements are:");
		for(int x=0;x<=a.length;x++)
		{
			if(a[x]%2!=0)
			{
				b[y]=a[x];
				y++;
			}
			
		
					System.out.println(b[y]);
		
		}
			
	}
}	