class Factorssum
{
 public static void main(String args[])
 {
  int num=6;
  int start=1,end=num/2,sum=0,product=1;
  while(start<=end)
  {
   if(num%start==0)
   {
     sum +=start;
     product *=start;
     System.out.println(start);
   }
   start++;
  }
  System.out.println("sum of factors of "+num+" is "+sum);
  System.out.println("product of factors of "+num+" is "+product);
  System.out.println(sum==product?num+" perfect number":num+" not a perfect number");
 }
}