import java.util.Scanner;
class  Doublestrong
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int temp=num,count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
                 }
		
		if(count%2==0)
		{
		   num=temp;
		  
		  while(num!=0)//4568
		  {  
			 int res=num%100;//68
			int sum=0,res1=res;//
			while(res!=0)//68
			{
			int fact=1;
			int rem=res%10;//8
			for(int start=1;start<=rem;start++)
			{
				fact*=start;//8
			}
			sum+=fact;//8
		        res=res/10;//6
			}
			if(res1==sum)
				System.out.println(res1+"strong number");
			else
				System.out.println(res1+" not a strong number");
		       
			num=num/100;
		
		}

			
		}
		
	}
}
