class Count
{
  public static void main (String args[])	
   {
	int num=1578,rem=0,temp=num,count=0,sum=0,a=0;
	 while(num!=0)
	  {
            rem=num%10;//8
	      sum=temp+rem;//157+8
	      temp=num/10;//15
           }
           System.out.println("sum of digits"+sum);
    }
}
               