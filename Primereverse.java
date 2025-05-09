import java.util.Scanner;
class PrimeReverse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0,temp=num;
		for(int start=2;start<=num/2;start++)
		{      
			
			if(num%start==0)
			{
			count++;
			  break;

			}
		}
	      if(count==0  && num>=2)
		{
				System.out.println("prime number");
            
		int rev=0;
		while(num!=0)
		 {
			int rem=num%10;
			rev=rev*10+rem;
                  num=num/10;
	        }
			   if(rev==temp)
				{
				 System.out.println("reverse number "+rev+" is  equal to "+ temp);
			
                         }
			   else if(rev!=temp)
			   {
			       System.out.println("reverse number "+rev+" is not equal to "+ temp);
			       for(int start=2;start<=rev/2;start++)
		             {      
			   
			         if(rev%start==0)
			         {
			            count++;
			            break;

			          }
			       }
		           if(count==0  && rev>=2)
			      
				System.out.println(rev +" is also a prime number");
			else
				System.out.println(rev +" not a prime number");
			
                       
                      }
		}
		else
			
		    System.out.println(num +" not a prime number");
		  
		  
	}
}
		