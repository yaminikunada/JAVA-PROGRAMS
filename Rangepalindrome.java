import java.util.Scanner;
class Palindromerange
{
	public static void main(String args[])
	{   
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

        	for(int x=1;x<=n;x++)
	        { 
			
			int num=x, reverse=0,temp=x;
			while(num!=0)
			{
			   int  rem=num%10;
			   reverse=reverse*10+rem;
			   num=num/10;
			}

			if(reverse==temp)
			   System.out.println(reverse+"is a palindrome");
		}
	}
}