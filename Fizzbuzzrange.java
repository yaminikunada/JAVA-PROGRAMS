class Fizzbuzzrange
{
 public static void main(String arg[])
 {
  int start=1,end=100;
  while(start<=end)
  {
   if(start%3==0 && start%5==0)
      System.out.println(start+" FIZZBUZZ");
   else if(start%3==0)
      System.out.println(start+" FIZZ");
   else if(start%5==0)
      System.out.println(start+" BUZZ");
   else
      System.out.println(start);
   start++;
  }
 }
}