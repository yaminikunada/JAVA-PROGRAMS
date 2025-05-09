import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int x=0;x<=arr.length-1;x++)
		{
			
			System.out.println(arr[x]);
		}

	}
}
		