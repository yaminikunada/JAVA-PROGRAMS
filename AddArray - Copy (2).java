import java.util.Scanner;
class AddArray
{
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		AddArray add=new AddArray();
		System.out.println("enter a size");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("enter elements:");

		for(int x=0;x<a.length;x++)
		{
		  a[x]=sc.nextInt();

		}
		int res[]=add.isAdd(a);
		
               for(int x=0;x<res.length;x++)
		{

			System.out.println("b["+x+"]"+res[x]);
		}
		
	}

int[] isAdd(int arr[]) 
	{
		
		int b[]=new int[arr.length];
		for(int x=0;x<arr.length;x++)
		{
			if(x==0)
			{
			b[x]=arr[x]+arr[x+1];
			
			}
			else if(x>0 && x<arr.length-1)
			{
			  b[x]=arr[x-1]+arr[x+1];
			}
			else if(x==arr.length-1)
			{
			  b[x]=arr[x]+arr[x-1];
			
			}

			
		}			
         return b;
	}
		
	
}