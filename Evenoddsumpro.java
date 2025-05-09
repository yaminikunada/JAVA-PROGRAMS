class Evenodd
{
 public static void main(String args[])
 {
  int start=1,end=100,sum=0,product=1;
  while(start<=end)
  {
   if(start%2==0)
    {
      sum=sum+start;
     }
   else 
     {
      product=product*start;
     }
    start++;
   }
     System.out.println(" sum of even number is"+sum);
     System.out.println(" product of odd number is"+product);
 
 }
}