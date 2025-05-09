class Powersum
{
   public static void main(String args[])
  { 
    int num=234,rem=0,temp=num,sum=0,count=0;
    while(num!=0)
    {
	count++;
        num=num/10;
    }
     while(temp!=0)
     {
      rem=temp%10;
      int power=(int)Math.pow(rem,count);
      sum+=power;
      temp=temp/10;
     }
      System.out.println("no.of digits"+count);
        System.out.println("sum is"+sum);
       int power=(int)Math.pow(4,3);
       System.out.println(power);
  }
}