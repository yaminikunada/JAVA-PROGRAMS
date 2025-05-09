class Nfactorial
{
 public static void main(String args[])
 { 
  int n=25;
  double start=n,end=1,product=1;
  while(start>=end)
  {//25>=1 t 24>=1 t 23>=1 t 22>=1 1>=1 t 0>=1 f
   product=product*start;//1*50=50 50*24=1200 1200*23=27600  .......
   start--;//24 23 22 .......  1 0
  }
  System.out.println(n+" factorial is"+product);
 }
}
