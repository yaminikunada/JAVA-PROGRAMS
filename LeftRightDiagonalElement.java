import java.util.Scanner;
class LeftRightDiagonalElement
{
	public static void main(String  args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" enter row size");

		int a[][]=new int[s.nextInt()][];
		for(int r=0;r<=a.length-1;r++)
		{
			System.out.println("enter rows"+ r +"column size");
			

			a[r]=new int[s.nextInt()];
			for(int c=0;c<=a[r].length-1;c++)
			{
				a[r][c]=s.nextInt();
			}
		}
		System.out.print("left diagonal elements "+"\n");


		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				if(r==c)
				{
					System.out.print(a[r][c]+" ");
				}	
			}

			System.out.println();

		}
		System.out.print("right diagonal elements"+"\n");
		for(int r=0;r<=a.length-1;r++)//r=0;
		{
			for(int c=0;c<=a[r].length-1;c++)//c=2
			{
			    

			    System.out.print(a[r][a.length - 1 - r] + " ");
			  
			}

			System.out.println();

		}


	}
}
