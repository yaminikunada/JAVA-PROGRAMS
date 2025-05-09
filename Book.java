



class Library
{
 public static void main(String args[])							
 {
  int days=10,pday=10;
  int bookprice=300;
  if(days>=30)
   System.out.println(bookprice+	 "paid bookprice");
  else	if(days	>15||days<30)
  {
   int r=days*pday;
   System.out.println(r+ "paid amount for extra days");
  }																																																					
  else
   System.out.println("returns before 15days	");
 }
}																																																																		