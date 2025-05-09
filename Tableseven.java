class Tableseven
{
 public static void main(String args[])
 {
  int start=10,end=1,table=8;
  while(start>=end)
  {
    int product=table*start;
   if(start%2==0)
    System.out.println(table+"*"+start+"="+product);
   start--;
  }
 }
}