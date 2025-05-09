class Fibanocci
{
 public static void main(String args[])
 {
   int a=2,b=3,c=0;
   int start=0,end=8;
   System.out.println(a);
   System.out.println(b);
   while(start<end)
   {
   c=a+b;
   a=b;
   b=c;
     System.out.println(c);
   start++;
   }
 }
}
