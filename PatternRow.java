class PatternRow
{
	public static void main(String args[])
	{
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r%2==0)
					 System.out.print("$");
				else
					 System.out.print("#");
			}
			 System.out.println();
		}
	}
}

class PatternRows
{
	public static void main(String args[])
	{
		int row=5;
		for(int r=1;r<=row;r++)
		{
			int temp=1;
			for(int c=1;c<=r;c++)
			{
				if(c==1||c==r||r==row)
				{
					 System.out.print(temp+" ");
					temp++;
				}
				else
					System.out.print(" ");

				
			}
			 System.out.println();
		}
	}
}
class PatternRos
{
	public static void main(String args[])
	{
		int row=5;
		for(int r=1;r<=row;r++)
		{
			int temp=row;
			for(int c=1;c<=r;c++)
			{
			if(r==1||c==row)
			{		
			 System.out.print(temp+" ");
					
			}
			else
			{
				System.out.print(temp+" ");
				temp--;
					
			}

		
				

				
			}
			 System.out.println();
		}
	}
}

