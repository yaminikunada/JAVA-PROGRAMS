class Lastdigit
{
 public static void main(String args[])
 {
   int start=100,end=1000,last=0;
   while(start<=end)
   {
    last=start%10;
    System.out.println("number "+start+" last digit is "+ last);
    start++;
  }
 }
}