import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
	     PalindromeOrNot palin1=new PalindromeOrNot();
		Scanner sc=new Scanner(System.in);
		palin1.num=sc.nextInt();
		palin1.calReverse();
		
		palin1.calPalindrome();
		
		
	}
}
class PalindromeOrNot
{
	int num, rev,temp;
	void calReverse()
	{
		temp=num;

		while(num!=0)//121 12 1
		{
			int rem=num%10;//1 2 1
			rev=rev*10+rem;//121
			num=num/10;//12 1
					}
	}
	void calPalindrome()
	{ 	
		if(rev==temp)
		
		System.out.println("palindrome");
		else
             System.out.println("not a palindrome");
		
	}
}
	
	 