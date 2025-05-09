class RevereArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,55};
		int b[]=new int[a.length];
		System.out.println("a array elements");
		for(int x=0,y=b.length-1;x<=a.length-1;x++,y--)
		{
			b[y]=a[x];//0 
			 System.out.println(a[x]);
		    
                }

		System.out.println("a reverse elemets in b array are");

		for(int y=0;y<=a.length-1;y++)
		{
		    System.out.println(b[y]);
		}
	}
}

 