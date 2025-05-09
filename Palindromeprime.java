class Palindromeprime
{
   public static void main(String args[])
   {
	int num=11,start=1,end=num,rem=0,reverse=0,temp=num,count=0;
	while(start<=end)
	{
	  if(num%start==0)
           {
	     count++;
           }
	  start++;
	}
	if(count==2)
	{
	   while(num!=0)
	   {
	    rem=num%10;
	    reverse=reverse*10+rem;
	    num=num/10;
            }
           if(reverse==temp)
              System.out.println(temp+" number is a palindrome prime");
           else
 	      System.out.println(temp+" number is not a palindrome prime");
	 }
	 else
             System.out.println(temp+" number is a not a palindrome prime");
     }
}