class Sumproduct
{
 public static void main(String args[])
 {
  int start=10,end=1,sum=0,product=1;
  while(start>=end)
  {
   sum=sum+start;
   product=product*start;
   start--;
  }
    System.out.println("sum of numbers is "+sum);
    System.out.println("product of numbers is "+product);
 }
}