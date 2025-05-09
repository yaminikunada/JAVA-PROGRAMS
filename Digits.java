class Single
{
 public static void main(String args[])
 {
  int num=25;
  if(num>0 && num<9)
     System.out.println(num+" single digit");
  else if(num>9 && num<=99)
  {
     int res=num%10;
     System.out.println(res);
  }
  else if(num>99 && num<=999)
  {
    int res=num%100;
    System.out.println(res);
  }
 }
}  