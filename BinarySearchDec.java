class BinarySearchDec
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,20,80,40,50,12};
		BinarySearchDec binary=new BinarySearchDec();
		binary.isSearch(a);
		


	}
void isSearch(int a[])
{
	for(int x=0;x<a.length-1;x++)
	{
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]<a[y])
			{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
			}
		
		}
	}
	for(int x=0;x<a.length-1;x++)
	{

	System.out.println(a[x]);
	}
	int search=13;
	System.out.println("search element is "+search);

	int first=0,last=a.length-1,mid=0;
	while(first<=last)
	{
		mid=(first+last)/2;
		if(search==a[mid])
		{
			System.out.println("element  found");
			break;
		}
		else if(search>a[mid])
			last=mid-1;
		else
			first=mid+1;
	}
	if(first>last)
		System.out.println("element not found");

	
   }

}

		