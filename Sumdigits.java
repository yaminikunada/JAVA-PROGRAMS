class Sumdigits
{
  public static void main(String args[])
   {
	 int num=1234,rem=0,temp=num,sum=0,count=0,rev=0,start=1,rem1=0;
  
     while(num!=0)
     { 
       count++; 
      rem=num%10;//5
      rev=rev*10+rem;//5 4 3 2 1
       num=num/10;
     }
      num=temp;
      int mid=count/2+1;
      while(start<mid)//
     {
       
       rem1=num%10;//5 4 3
       
       int rem2=rev%10;//1 2 3
       sum=sum+(rem1*rem2);//5+8+3
       num=num/10;//5432 543
       rev=rev/10;//1234 123
       start++;
       
      }
       sum=sum+rev%10;
  
      System.out.println("sum is"+sum);
      
     }
      
  }
