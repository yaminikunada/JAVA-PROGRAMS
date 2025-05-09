import java.util.Scanner;
class LinearArray
{
	public static void main(String args[])
	{
               // Scanner sc=new Scanner(System.in) ;

		LinearArray array=new LinearArray();
		int res=array.calSearch();
		if(res==0)
		
			System.out.println("element not found");
		else
			
	 		System.out.println("element  found");

	}
int calSearch()
{
	   Scanner sc=new Scanner(System.in) ;

	int a[]=new int[]{10,20,56,78};
	int count=0,search=sc.nextInt();
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]==search)
		{
			count++;
			break;
		}
	}
return count;
}
}