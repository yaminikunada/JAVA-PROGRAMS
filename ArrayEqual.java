class ArrayEqual
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,20,30};
		int b[]=new int[]{10,40,30};
				
			for(int x=0;x<=a.length-1;x++)
			{
				if(a[x]==b[x])
					System.out.println("equal");
			}
		if(a.length==b.length)

		System.out.println("not equal");
	}
}
			
