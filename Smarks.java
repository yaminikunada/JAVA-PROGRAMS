class Marks
{
  public static void main(String args[])
  {
   int m1=10,m2=5,m3=20,max=150;
   double total=m1+m2+m3;
   int p=(int)(total/max*100);
   if(m1<35||m2<35||m3<35)
    System.out.println(	 " FAIL");
   else if(p>100)
    System.out.println(p+ "  invalid marks");
  else if(p>=90)
    System.out.println(p+ " A grade");
  else if(p>=75)
    System.out.println(p+ " B grade");
  else if(p>=60)
    System.out.println(p+ " C grade");
  else if(p>=35)
    	System.out.println(p+ " D grade");
  else																																																																																																																																																																								
    System.out.println(p+ " FAIL");
}
}																																																																																																																																																				