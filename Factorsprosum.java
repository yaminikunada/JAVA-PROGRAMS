class Factorsprosum
{
   public static void main(String args[])
   {
	for(int x=1;x<=10;x++)//1 2 3 4
	{
	   int num=3,sum=0,product=1,start;
            
	      for( start=1;start<=3;start++)//1<=1 1<=2 2<=2 1<=3 2<=3 3<=3 1<4
	      {
		  if(num%start==0)//2%2 3%1 3%2 3%3 
		  {
		    System.out.println(start);//1 1 2 1 3 1
		
	            if(start%2==0)//2 
                    {
                     sum+=start;//2
	            }
                    else
                    {
		     product*=start;//1 1 1 3 
		    }
                  }
              }
          System.out.println("sum of even numbers"+sum);
          System.out.println("product of odd numbers"+product);
         }
    }
}