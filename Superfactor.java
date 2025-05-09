class Superfactor
{
 public static void main(String args[])
 {
  int num=6;
  int start=1,end=num,count=0;
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
  System.out.println(count==4?num+" super number":num+" not a super number");
 }
}