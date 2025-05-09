import java.util.Scanner;
class Primerange
{
 	public static void main(String ars[])
	{
	  
	   Scanner s=new Scanner(System.in);
	   int num=s.nextInt();
           //int num=172568;
	  	 while(num!=0)
		 {
			int rem=num%10;//8
			int res=rem,count=0;//8
			for(int start=2;start<=res/2;start++)//2<=1
			{
				if(res%start==0)//8%1 5%2
				  {
					count++;//1 2 3
					break;
                                  }
                        }

		        if(count==0 && res>=2)

			        System.out.println(res+"is a prime number");
			else
			     System.out.println(res+"is  not  a prime number");
				 					
				
		       
			  
                         
			 num=num/10;	
		}
	}
}
									