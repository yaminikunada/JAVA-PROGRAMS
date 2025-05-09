import java.util.Scanner;
class InavNumber
{
	public static void main(String args[])
	{
		Inav pow=new Inav();
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		pow.isInav(num);
				
               pow.calInavnum();

               pow.calInav(res);

		 String res = pow.inavN();
    System.out.println( res);

	}
}
class Inav
{

  int num, rem, count, sum, temp =num;


        void isInav(int num)
	{
			int sum=0;	
		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
			count++;
                  System.out.println(sum);
                  System.out.println(count);





		}
		
	}
		}
	void calInavnum()
        { 
			int sum1=0;
    	               while(res1>9)
			{
                        while(res!=0)
		        {
			int rem=res%10;
			sum1+=res;
			res/=10;
			
                System.out.println(sum1);

		}
	 
	            }   
						
	}
	String calInav()
	{
		
            if(res2==1)
		return "Inav number";
            else
		return "not Inav number";
}

}
			

			
		