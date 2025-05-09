class Input
{
 public static void main(String args[])
  {
   int num=786,rem=0,sum=0,temp=num;
   while(num!=0)
   {
    rem=num%10;
    sum+=rem;
    num=num/10;
   }
    num=temp;
   int start=1,end=sum,res=0;
   while(num!=0)
   {
     rem=num%10;//2
     res=end/rem;//6
     num=num/10;
    System.out.println(res);
    
   }
 
  
 }
}