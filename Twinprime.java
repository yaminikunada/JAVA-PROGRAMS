import java.util.Scanner;
class Twin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		
		for(int x=1;x<=num;x++)//1
		{	
			int count=0;		
		     for(int start=1;start<=x/2;start++)//2
	             {
			
			if(x%start==0)//2%1
			   count++;
			  
		     }
		
		
		   if(count==1 && x>=2)//2
		     {
			int temp=x+2;//4
				
				int count1=0;
		
			    for(int start=1;start<=temp/2;start++)
	                         {
			           if(temp%start==0)
			           count1++;
			         }     
     		         
			
		        if(count1==1 && temp>=2)

			      System.out.println(x+"and"+temp+"  are twin prime");
		
		     
			else
				
				  System.out.println(x+"and"+temp+" are not twin prime");
			

		     } 
		
		}		      		 	
	}
}
