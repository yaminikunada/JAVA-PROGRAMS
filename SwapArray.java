
class SwapArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		System.out.println("a array elements");
			

		for(int x=0;x<=a.length-1;x++)
		{
                   b[x]=a[x];
			 System.out.println(a[x]);
	

		}
		System.out.println("b array elements");

                for(int x=0;x<=a.length-1;x++)
		{

		System.out.println(b[x]);
		}
		
	}
}