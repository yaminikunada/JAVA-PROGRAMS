class ArrayInsertion
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,20,30,40,50,60,70,0};
		int i=23,k=9,temp=0;
		if(k>=0 && k<=a.length)
		{
			for(int x=a.length-1;x>=k;x--)
			{
				a[x]=a[x-1];
			}
		
			 a[k]=i;
		
			for(int x=0;x<=a.length-1;x++)
			{

		 		 System.out.println(a[x]);
			}
		}
		
		 System.out.println("can not insert a value beacuse it cross the index value " );

	}
}