import java.util.Scanner;
class ArrayDeletion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size  ");

		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("enter array elements are ");

		for(int x=0;x<=a.length-2;x++)
		
			a[x]=sc.nextInt();
		System.out.println("enter search elements : ");
		 int search=sc.nextInt();
		for(int x=0;x<=a.length-2;x++)
	        {
		   for(int y=x+1;y<=a.length-1;y++)
		   {
			if(a[x]>a[y])
			{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
			}
		  }
	       }//10 34 45 68 78 90
		int  f=0,l=a.length-1,m=0;

		for(int x=0;x<=a.length-1;x++)
		{
			//int  f=0,l=a.length-1,m=0;
			while(f<=l)
			{
				m=(f+l)/2;//3 0+2 
				if(search==a[m])//13=68  13=34 
					{
						break;
					}
				else if(search>a[m])
					f=m+1;//4
				else
					l=m-1;//3-1 2 1-1
			}				

		System.out.println("after the deletion ");

		for( x=0;x<=a.length-1;x++)
		{
			System.out.println(a[x]);
		}
	    }
		if(f>l)
		{
			a[0]=search;
		System.out.println("after the insertion ");

		for(int x=0;x<=a.length-1;x++)
		
			System.out.println(a[x]);
		}
		else
		{
			if(m==a.length-1)
							a[m]=0;
						for(int y=m;y<=a.length-2;y++)
						{
							a[y]=a[y+1];
							
							
						}
						a[a.length-1]=0;
						
		}
		
		
		
	}
}
				
					