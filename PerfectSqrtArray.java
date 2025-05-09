import java.util.Scanner;
class PerfectsqrtArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("enter elements:");

		for(int x=0;x<a.length;x++)
		{
		  a[x]=sc.nextInt();

		}
		PerfectsqrtArray array=new PerfectsqrtArray();
		array.isCount(a);
  		array.isPerfect(a);
		array.calPerfect(a);
		
        }
  int isCount(int arr[])
   {
	int count=0;
	for(int x=0;x<=arr.length-1;x++)
	{
		int sqrt=(int)Math.sqrt(arr[x]);
		if(sqrt*sqrt==arr[x])
		{
			count++;
		}
	}
	return count;

  }
  void isPerfect(int arr[])
  {

	int res=isCount(arr);
	int b[]=new int[res];
       	int y=0;
   	for(int x=0;x<=arr.length-1;x++)
	 {

		int sqrt=(int)Math.sqrt(arr[x]);
		if(sqrt*sqrt==arr[x])
		{
			b[y]=arr[x];
			y++;
		}			
		
	}
	System.out.println("b array elements");

	 for(int x=0;x<=b.length-1;x++)
	 
		System.out.println("b["+y+"]"+b[x]);
	   
	  		
	}


	
   
   void calPerfect(int arr[])
    {
          int res1=isCount(arr);

          int c[]=new int[arr.length-res1];
	   int z=0;
	  for(int x=0;x<=arr.length-1;x++)
	  {
		int sqrt1=(int)Math.sqrt(arr[x]);
		if(sqrt1*sqrt1!=arr[x])

            
		{ 
			c[z]=arr[x];
			z++;
		       
		}
	   }
		System.out.println("c array elements");


		for(int x=0;x<=c.length-1;x++)
	        {

		 System.out.println("c["+z+"]"+c[x]);
		}


	     
	       
	}

}