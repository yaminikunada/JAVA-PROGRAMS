class AverageArray
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		
		int sum=0,avg=0;
		for(int x=0;x<=a.length-1;x++)
		{
			sum+=a[x];
		}
		avg=sum/a.length;
		System.out.println(avg+"  average");

	}
}