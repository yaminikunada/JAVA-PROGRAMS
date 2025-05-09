class Convert
{
 public static void main(String args[])
 {
  int days=1000;
  int year=(int)(days/365);
  int res1=days%365;
  int month=(int)(res1/30);
  int res2=res1%30;
  System.out.println(year+" year"+month+" month"+res2+"days");
 }
}

  