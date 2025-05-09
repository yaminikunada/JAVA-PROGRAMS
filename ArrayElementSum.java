import java.util.Scanner;
class ArrayElementSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[sc.nextInt()][];
		int sum=0,sum1=0;
		for(int r=0;r<=a.length-1;r++)
		{
			System.out.println("enter rows"+r+"column size");
			a[r]=new int[sc.nextInt()];
			for(int c=0;c<=a[r].length-1;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				
				System.out.print(a[r][c]+"  ");
				sum1=sum1+a[r][c];
			}
			System.out.println();
				System.out.println("sum of rows is "+sum1);
		}
	

		
		sum=sum+sum1;
		System.out.println("sum of array is "+sum);
		
	}
}
