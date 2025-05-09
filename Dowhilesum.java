class Dowhilesum
{
 public static void main(String args[])
 {
  int num=145,rem=0,sum=0;
  do
   {
      rem=num%10;
     sum+=rem;
    
    
      num=num/10;
   
   
   }
    
   while(num!=0);
    System.out.println("sum of digits is  "+sum);
 }
}
    
   
  