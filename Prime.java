class Prime
{
 public static void main(String args[])
 {
  int num=19;
  int start=1,end=num,count=0;
  while(start<=end)
  {
   if(num%start==0)
   
    count++;
   start++;
  }
  System.out.println("count is "+count);
   System.out.println(count==2?num+" prime number":num+" not a prime");
 }
}