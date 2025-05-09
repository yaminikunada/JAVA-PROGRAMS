class Fizzbuzz
{
 public static void main(String args[])
 {
  int num=21;
  if(num%3==0 && num%5==0)
  {
  System.out.println("FIZZBUZZ");
  }
  else if(num%7==0 || num%9==0)
  {
   int r=num%10;
   System.out.println(r+ " lastdigit");
  }
 }
}