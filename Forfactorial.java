class Forfactorial
{
 public static void main(String args[])
 {
   int n=5,start=n,end=1,product=1;
   for(;start>=end;start--)
   {
     product*=start;
    }
    System.out.println(n+" factoria is"+product);
  }
}