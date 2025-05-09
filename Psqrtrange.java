class Psqrt
{
 public static void main (String args[])
 {
  int start=20,end=1;
   while(start>=end)
   {
     int sq=(int)Math.sqrt(start);
     if(sq*sq==start)
      System.out.println(sq+" perfect square");
     start--;
   }
  }
}
  