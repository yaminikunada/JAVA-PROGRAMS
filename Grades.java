class Grades
{
 public static void main(String args[])
 {
  int total=500;
  if(total>=560 &&  total<=600)
       	System.out.println(" O GRADE");
  else if(total>=450 &&  total<560)
   	System.out.println(" A GRADE");
  else if(total>=300 &&  total<450)
   	System.out.println(" B GRADE");
  else if(total>=250 && total<300)
   	System.out.println("C GRADE");
  else if(total>=150 && total<250)
   	System.out.println("D GRADE");
  else if(total>=0 && total<150)
   	System.out.println("fail");
  else
   	System.out.println(" invaid");
 }
}