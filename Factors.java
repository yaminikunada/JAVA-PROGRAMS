class Factors
{
 public static void main(String args[])
 {
  int num=24;
  int start=1,end=num,count=0;
   System.out.println("factors of "+num+" are");
  while(start<=end)
  {
    if(num%start==0)
    {
     System.out.println(start);
     count++;
    }
   start++;
   }
   System.out.println("count is "+count);
  }
}
