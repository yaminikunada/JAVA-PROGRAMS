import java.util.Scanner;
class Array2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b[][]=new int[3][4];
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=3;c++ )
			{
				b[r][c]=sc.nextInt();
			}
		}
		System.out.println("elements in matrix");
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=3;c++ )
			{
				System.out.println(b[r][c]+" ");
			}
			System.out.println();
		}

	}

}
class Array2Ddec
{
	public static void main(String args[])
	{
		int a[][]=new int[][]{{1,2,3,4},{4,5,6},{7,8,9},{2,3,5}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++ )
			{
				
				System.out.println(a[r][c]);
			}
			System.out.println();
			
		}
	System.out.println(a[0].length);
	System.out.println(a.length);

	}
}

