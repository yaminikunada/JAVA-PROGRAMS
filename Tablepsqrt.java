class Tablepsqrt
{
 public static void main(String args[])
 {
  int start=10,end=1,table=8;
  while(start>=end)
  {
   int product=table*start;
   int sq=(int)Math.sqrt(product);
   if(sq*sq==product)
    System.out.println(table+"*"+start+"="+product);
   start--;
  }
 }
}