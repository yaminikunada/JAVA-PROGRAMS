import java.util.Scanner;
class NegativeCopy
{
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int len=sc.nextInt();
		System.out.println("enter elements:");
		int a[]=new int[len];
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		NegativeCopy copy=new NegativeCopy();
		int res[]=copy.isCopy(a,0);
		System.out.println("b array elements");
                for(int x=0;x<=res.length-1;x++)
		{
			System.out.println("b["+x+"]"+res[x]);
		}
	}

  int[] isCopy(int arr[],int count)
	{ 
		System.out.println("a array elements");

            	for(int x=0;x<arr.length;x++)
		{
			if(arr[x]<0)
			{
				System.out.println("a["+x+"]"+arr[x]);


				count++;
			}
		}
		int b[]=new int[count];
		int y=0;
		//int y=b.length-1;
		for(int x=arr.length-1;x>=0;x--)
		//for(int x=0;x<a.length;x++)
		{
			if(arr[x]<0)
			{
				b[y]=arr[x];
				y++;
				//y--;
			}
		}
	  return b;		
	}
}		

            





 