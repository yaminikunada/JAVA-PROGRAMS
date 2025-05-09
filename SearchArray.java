import java.util.Scanner;

class SearchArray
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int such=s.nextInt();
		int a[]={12,89,34,56,78};
		int res=0;
		for(int x=0;x<=a.length-1;x++)
		{
			res=a[x];
	          if(such==a[x])
	          {
		     System.out.println("such present in array");
			break;
		    }
		}
		if(res==such)
			
			 System.out.println("such present in array");
		else
			 System.out.println("such not present in array");
			
			

				
	}
}