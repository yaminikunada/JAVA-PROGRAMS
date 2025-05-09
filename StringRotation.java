import java.util.*;
class StringRotation
{
	public static void main(String args[])
	{

		String s1="abcd",s2="cdab";
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		int count=0;
		while(true)
		{
			char temp=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
			}
			a[0]=temp;
			count++;
			for(char ch:a)
			
				System.out.println(ch+" ");
				System.out.println("\n"+"=============== ");
			
		
			if(Arrays.equals(a,b))
			{
				System.out.println("b is rotation of a");
				break;
			}
		
			else if(count==a.length-1)
			{
				System.out.println("b is not a  rotation of a");
				break;
			}
		}
	}
}

	
		